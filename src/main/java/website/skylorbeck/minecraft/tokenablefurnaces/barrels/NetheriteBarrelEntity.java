package website.skylorbeck.minecraft.tokenablefurnaces.barrels;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import website.skylorbeck.minecraft.skylorlib.storage.ExtraBarrelEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;
import website.skylorbeck.minecraft.tokenablefurnaces.Screenhandlers.DiamondScreenHandler;

public class NetheriteBarrelEntity extends ExtraBarrelEntity {
    public NetheriteBarrelEntity(BlockPos pos, BlockState state) {
        super(Declarer.NETHERITEBARRELENTITY, pos, state,24*9);
    }

    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
//        return GenericContainerScreenHandler.createGeneric9x6(syncId, playerInventory, this);
        return new DiamondScreenHandler(syncId, playerInventory, this,24,9);
    }
    @Override
    protected Text getContainerName() {
        return Text.translatable("container.netherite_barrel");
    }
}
