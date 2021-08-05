package website.skylorbeck.minecraft.tokenablefurnaces.chests;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.util.math.BlockPos;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;
import website.skylorbeck.minecraft.tokenablefurnaces.Screenhandlers.IronScreenHandler;

public class IronChestEntity extends ExtraChestEntity{
    protected IronChestEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState,6*9,"iron",false);
    }

    public IronChestEntity(BlockPos pos, BlockState state) {
        super(Declarer.IRONCHESTENTITY,pos, state,6*9,"iron",false);
    }

    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new IronScreenHandler(syncId, playerInventory, this,6,9);
    }
}
