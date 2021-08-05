package website.skylorbeck.minecraft.tokenablefurnaces.chests.trapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.math.BlockPos;
import website.skylorbeck.minecraft.skylorlib.storage.ExtraTrappedChestEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;
import website.skylorbeck.minecraft.tokenablefurnaces.Ref;
import website.skylorbeck.minecraft.tokenablefurnaces.Screenhandlers.DiamondScreenHandler;
import website.skylorbeck.minecraft.tokenablefurnaces.Screenhandlers.GoldScreenHandler;

public class GoldTrappedChestEntity extends ExtraTrappedChestEntity {
    protected GoldTrappedChestEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState,12*9,"gold",true, Ref.MODID);
    }

    public GoldTrappedChestEntity(BlockPos pos, BlockState state) {
        super(Declarer.GOLDTRAPPEDCHESTENTITY,pos, state,12*9,"gold",true, Ref.MODID);
    }
    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new GoldScreenHandler(syncId, playerInventory, this,12,9);
    }
    protected Text getContainerName() {
        return new TranslatableText("container.goldchest");
    }
    protected Text getDoubleContainerName(){
        return new TranslatableText("container.goldchestdouble");
    }
    protected ScreenHandler createDoubleScreenHandler(int syncId, PlayerInventory playerInventory, Inventory inventory){
        return new DiamondScreenHandler(syncId, playerInventory, inventory,24,9);
    }
}
