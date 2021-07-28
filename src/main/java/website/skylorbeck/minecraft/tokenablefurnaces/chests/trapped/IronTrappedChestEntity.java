package website.skylorbeck.minecraft.tokenablefurnaces.chests.trapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;
import website.skylorbeck.minecraft.tokenablefurnaces.chests.ExtraChestEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.chests.IronScreenHandler;

public class IronTrappedChestEntity extends ExtraTrappedChestEntity {
    protected IronTrappedChestEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState);
    }

    public IronTrappedChestEntity(BlockPos pos, BlockState state) {
        super(Declarer.IRONTRAPPEDCHESTENTITY,pos, state);
        this.inventory = DefaultedList.ofSize(6*9, ItemStack.EMPTY);
    }
    @Override
    public int size() {
        return 6*9;
    }

    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
//        return GenericContainerScreenHandler.createGeneric9x6(syncId, playerInventory, this);
        return new IronScreenHandler(syncId, playerInventory, this,6,9);
    }
}
