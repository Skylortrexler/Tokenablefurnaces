package website.skylorbeck.minecraft.tokenablefurnaces.chests;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;
import website.skylorbeck.minecraft.tokenablefurnaces.Screenhandlers.IronScreenHandler;

public class PumpkinChestEntity extends ExtraChestEntity{
    protected PumpkinChestEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState);
    }

    public PumpkinChestEntity(BlockPos pos, BlockState state) {
        super(Declarer.PUMPKINCHESTENTITY,pos, state);
//        this.inventory = DefaultedList.ofSize(3*9, ItemStack.EMPTY);
    }
//    @Override
//    public int size() {
//        return 3*9;
//    }

//    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
//        return GenericContainerScreenHandler.createGeneric9x3(syncId, playerInventory, this);
//    }
}
