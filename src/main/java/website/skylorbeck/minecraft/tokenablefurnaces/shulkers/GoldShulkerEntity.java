package website.skylorbeck.minecraft.tokenablefurnaces.shulkers;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import website.skylorbeck.minecraft.skylorlib.storage.ExtraShulkerEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;
import website.skylorbeck.minecraft.tokenablefurnaces.Ref;
import website.skylorbeck.minecraft.tokenablefurnaces.Screenhandlers.GoldScreenHandler;

public class GoldShulkerEntity extends ExtraShulkerEntity {
    public GoldShulkerEntity(BlockPos pos, BlockState state) {
        super(Declarer.GOLDSHULKERENTITY,pos, state,12*9,"gold", Ref.MODID);
    }

    @Override
    protected Text getContainerName() {
        return Text.translatable("container.goldshulker");
    }
    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
//        return GenericContainerScreenHandler.createGeneric9x12(syncId, playerInventory, this);
        return new GoldScreenHandler(syncId, playerInventory, this,12,9);
    }
}
