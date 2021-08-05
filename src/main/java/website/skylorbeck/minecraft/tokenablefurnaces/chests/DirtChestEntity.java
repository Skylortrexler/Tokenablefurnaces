package website.skylorbeck.minecraft.tokenablefurnaces.chests;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.util.math.BlockPos;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;
import website.skylorbeck.minecraft.tokenablefurnaces.Screenhandlers.DirtScreenHandler;

public class DirtChestEntity extends ExtraChestEntity{
    protected DirtChestEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState,1,"dirt",false);
    }


    public DirtChestEntity(BlockPos pos, BlockState state) {
        super(Declarer.DIRTCHESTENTITY,pos, state,1,"dirt",false);
    }


    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new DirtScreenHandler(syncId, playerInventory, this,1,1);
    }
}
