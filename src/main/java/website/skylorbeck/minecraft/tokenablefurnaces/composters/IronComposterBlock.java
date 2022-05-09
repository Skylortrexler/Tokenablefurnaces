package website.skylorbeck.minecraft.tokenablefurnaces.composters;

import net.minecraft.block.BlockState;
import net.minecraft.block.ComposterBlock;
import net.minecraft.inventory.SidedInventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldEvents;
import org.jetbrains.annotations.Nullable;
import website.skylorbeck.minecraft.tokenablefurnaces.mixins.ComposterBlockInvoker;

public class IronComposterBlock extends ComposterBlock {
    public IronComposterBlock(Settings settings) {
        super(settings);
    }
    @Override
    public SidedInventory getInventory(BlockState state, WorldAccess world, BlockPos pos) {
        int i = state.get(LEVEL);
        if (i == 8) {
            ItemStack bonemeal = new ItemStack(Items.BONE_MEAL);
            bonemeal.setCount(2);
            return new FullComposterInventory(state, world, pos,bonemeal);
        }
        if (i < 7) {
            return new ComposterInventory(state, world, pos);
        }
        return new DummyInventory();
    }

    static class FullComposterInventory
            extends SimpleInventory
            implements SidedInventory {
        private final BlockState state;
        private final WorldAccess world;
        private final BlockPos pos;
        private boolean dirty;

        public FullComposterInventory(BlockState state, WorldAccess world, BlockPos pos, ItemStack outputItem) {
            super(outputItem);
            this.state = state;
            this.world = world;
            this.pos = pos;
        }

        @Override
        public int getMaxCountPerStack() {
            return 64;
        }

        @Override
        public int[] getAvailableSlots(Direction side) {
            int[] nArray;
            if (side == Direction.DOWN) {
                int[] nArray2 = new int[1];
                nArray = nArray2;
                nArray2[0] = 0;
            } else {
                nArray = new int[]{};
            }
            return nArray;
        }

        @Override
        public boolean canInsert(int slot, ItemStack stack, @Nullable Direction dir) {
            return false;
        }

        @Override
        public boolean canExtract(int slot, ItemStack stack, Direction dir) {
            return !this.dirty && dir == Direction.DOWN && stack.isOf(Items.BONE_MEAL);
        }

        @Override
        public void markDirty() {
            ComposterBlockInvoker.invokeEmptyComposter(this.state, this.world, this.pos);
            this.dirty = true;
        }
    }

    static class ComposterInventory
            extends SimpleInventory
            implements SidedInventory {
        private final BlockState state;
        private final WorldAccess world;
        private final BlockPos pos;
        private boolean dirty;

        public ComposterInventory(BlockState state, WorldAccess world, BlockPos pos) {
            super(1);
            this.state = state;
            this.world = world;
            this.pos = pos;
        }

        @Override
        public int getMaxCountPerStack() {
            return 1;
        }

        @Override
        public int[] getAvailableSlots(Direction side) {
            int[] nArray;
            if (side == Direction.UP) {
                int[] nArray2 = new int[1];
                nArray = nArray2;
                nArray2[0] = 0;
            } else {
                nArray = new int[]{};
            }
            return nArray;
        }

        @Override
        public boolean canInsert(int slot, ItemStack stack, @Nullable Direction dir) {
            return !this.dirty && dir == Direction.UP && ITEM_TO_LEVEL_INCREASE_CHANCE.containsKey(stack.getItem());
        }

        @Override
        public boolean canExtract(int slot, ItemStack stack, Direction dir) {
            return false;
        }

        @Override
        public void markDirty() {
            ItemStack itemStack = this.getStack(0);
            if (!itemStack.isEmpty()) {
                this.dirty = true;
                BlockState blockState = ComposterBlockInvoker.invokeAddToComposter(this.state, this.world, this.pos, itemStack);
                this.world.syncWorldEvent(WorldEvents.COMPOSTER_USED, this.pos, blockState != this.state ? 1 : 0);
                this.removeStack(0);
            }
        }
    }

    static class DummyInventory
            extends SimpleInventory
            implements SidedInventory {
        public DummyInventory() {
            super(0);
        }

        @Override
        public int[] getAvailableSlots(Direction side) {
            return new int[0];
        }

        @Override
        public boolean canInsert(int slot, ItemStack stack, @Nullable Direction dir) {
            return false;
        }

        @Override
        public boolean canExtract(int slot, ItemStack stack, Direction dir) {
            return false;
        }
    }
}
