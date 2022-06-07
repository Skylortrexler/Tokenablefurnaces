package website.skylorbeck.minecraft.tokenablefurnaces.shulkers;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import website.skylorbeck.minecraft.skylorlib.storage.ExtraShulkerEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;
import website.skylorbeck.minecraft.tokenablefurnaces.Ref;
import website.skylorbeck.minecraft.tokenablefurnaces.Screenhandlers.IronScreenHandler;

public class IronShulkerEntity extends ExtraShulkerEntity {
    public IronShulkerEntity(BlockPos pos, BlockState state) {
        super(Declarer.IRONSHULKERENTITY,pos, state,6*9,"iron", Ref.MODID);
    }

    @Override
    protected Text getContainerName() {
        return Text.translatable("container.ironshulker");
    }
    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
//        return GenericContainerScreenHandler.createGeneric9x6(syncId, playerInventory, this);
        return new IronScreenHandler(syncId, playerInventory, this,6,9);
    }
}
