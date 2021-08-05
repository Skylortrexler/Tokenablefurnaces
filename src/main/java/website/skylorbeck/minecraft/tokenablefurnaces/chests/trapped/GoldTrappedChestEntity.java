package website.skylorbeck.minecraft.tokenablefurnaces.chests.trapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.util.math.BlockPos;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;
import website.skylorbeck.minecraft.tokenablefurnaces.Screenhandlers.GoldScreenHandler;

public class GoldTrappedChestEntity extends ExtraTrappedChestEntity {
    protected GoldTrappedChestEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState,12*9,"gold",true);
    }

    public GoldTrappedChestEntity(BlockPos pos, BlockState state) {
        super(Declarer.GOLDTRAPPEDCHESTENTITY,pos, state,12*9,"gold",true);
    }
    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new GoldScreenHandler(syncId, playerInventory, this,12,9);
    }
}
