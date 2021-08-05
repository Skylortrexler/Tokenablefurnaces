package website.skylorbeck.minecraft.tokenablefurnaces.chests.trapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.util.math.BlockPos;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;
import website.skylorbeck.minecraft.tokenablefurnaces.Screenhandlers.DirtScreenHandler;
import website.skylorbeck.minecraft.tokenablefurnaces.chests.ExtraChestEntity;

public class DirtTrappedChestEntity extends ExtraChestEntity {
    protected DirtTrappedChestEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState,1,"dirt",true);
    }

    public DirtTrappedChestEntity(BlockPos pos, BlockState state) {
        super(Declarer.DIRTTRAPPEDCHESTENTITY,pos, state,1,"dirt",true);
    }

    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new DirtScreenHandler(syncId, playerInventory, this,1,1);
    }
}
