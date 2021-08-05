package website.skylorbeck.minecraft.tokenablefurnaces.chests;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.util.math.BlockPos;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;
import website.skylorbeck.minecraft.tokenablefurnaces.Screenhandlers.GoldScreenHandler;

public class GoldChestEntity extends ExtraChestEntity{
    protected GoldChestEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState,12*9,"gold",false);
    }

    public GoldChestEntity(BlockPos pos, BlockState state) {
        super(Declarer.GOLDCHESTENTITY,pos, state,12*9,"gold",false);
    }
    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new GoldScreenHandler(syncId, playerInventory, this,12,9);
    }
}
