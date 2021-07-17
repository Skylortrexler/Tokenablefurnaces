package website.skylorbeck.minecraft.tokenablefurnaces.chests;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;

public class IronChestEntity extends ExtraChestEntity{
    protected IronChestEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState);
    }

    public IronChestEntity(BlockPos pos, BlockState state) {
        super(Declarer.IRONCHESTENTITY,pos, state);
        this.inventory = DefaultedList.ofSize(6*9, ItemStack.EMPTY);
    }
    @Override
    public int size() {
        return 6*9;
    }
    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
//        return GenericContainerScreenHandler.createGeneric9x6(syncId, playerInventory, this);
        return new ExtraScreenHandler(syncId, playerInventory, this,6,9);
    }
}
