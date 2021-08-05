package website.skylorbeck.minecraft.tokenablefurnaces.chests;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.util.math.BlockPos;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;
import website.skylorbeck.minecraft.tokenablefurnaces.Screenhandlers.AmethystScreenHandler;

public class AmethystChestEntity extends ExtraChestEntity{
    protected AmethystChestEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState,48*9,"amethyst",false);
    }

    public AmethystChestEntity(BlockPos pos, BlockState state) {
        super(Declarer.AMETHYSTCHESTENTITY,pos, state,48*9,"amethyst",false);
    }
    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
//        return GenericContainerScreenHandler.createGeneric9x6(syncId, playerInventory, this);
        return new AmethystScreenHandler(syncId, playerInventory, this,48,9);
    }
}
