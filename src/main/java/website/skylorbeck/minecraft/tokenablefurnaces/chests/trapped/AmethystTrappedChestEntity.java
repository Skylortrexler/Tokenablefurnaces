package website.skylorbeck.minecraft.tokenablefurnaces.chests.trapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.util.math.BlockPos;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;
import website.skylorbeck.minecraft.tokenablefurnaces.Screenhandlers.AmethystScreenHandler;

public class AmethystTrappedChestEntity extends ExtraTrappedChestEntity {
    protected AmethystTrappedChestEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState,48*9,"amethyst",true);
    }

    public AmethystTrappedChestEntity(BlockPos pos, BlockState state) {
        super(Declarer.AMETHYSTTRAPPEDCHESTENTITY,pos, state,48*9,"amethyst",true);
    }
    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
//        return GenericContainerScreenHandler.createGeneric9x6(syncId, playerInventory, this);
        return new AmethystScreenHandler(syncId, playerInventory, this,48,9);
    }
}
