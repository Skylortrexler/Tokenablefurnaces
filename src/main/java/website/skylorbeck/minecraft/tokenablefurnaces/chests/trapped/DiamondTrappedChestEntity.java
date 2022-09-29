package website.skylorbeck.minecraft.tokenablefurnaces.chests.trapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import website.skylorbeck.minecraft.skylorlib.storage.ExtraTrappedChestEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;
import website.skylorbeck.minecraft.tokenablefurnaces.Ref;
import website.skylorbeck.minecraft.tokenablefurnaces.Screenhandlers.AmethystScreenHandler;
import website.skylorbeck.minecraft.tokenablefurnaces.Screenhandlers.DiamondScreenHandler;

public class DiamondTrappedChestEntity extends ExtraTrappedChestEntity {
    protected DiamondTrappedChestEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState,24*9,"diamond",true,false, Ref.MODID);
    }

    public DiamondTrappedChestEntity(BlockPos pos, BlockState state) {
        super(Declarer.DIAMONDTRAPPEDCHESTENTITY,pos, state,24*9,"diamond",true,false, Ref.MODID);
    }
    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new DiamondScreenHandler(syncId, playerInventory, this,24,9);
    }

    protected Text getContainerName() {
        return Text.translatable("container.diamond_chest");
    }
    protected Text getDoubleContainerName(){
        return Text.translatable("container.diamond_chestdouble");
    }
    protected ScreenHandler createDoubleScreenHandler(int syncId, PlayerInventory playerInventory, Inventory inventory){
        return new AmethystScreenHandler(syncId, playerInventory, inventory,48,9);
    }
}
