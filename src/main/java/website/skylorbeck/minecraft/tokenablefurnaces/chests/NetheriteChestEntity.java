package website.skylorbeck.minecraft.tokenablefurnaces.chests;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.util.math.BlockPos;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;
import website.skylorbeck.minecraft.tokenablefurnaces.Screenhandlers.DiamondScreenHandler;

public class NetheriteChestEntity extends ExtraChestEntity{
    protected NetheriteChestEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState,24*9,"netherite",false);
    }

    public NetheriteChestEntity(BlockPos pos, BlockState state) {
        super(Declarer.NETHERITECHESTENTITY,pos, state,24*9,"netherite",false);
    }
    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new DiamondScreenHandler(syncId, playerInventory, this,24,9);
    }
}
