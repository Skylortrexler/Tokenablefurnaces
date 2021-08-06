package website.skylorbeck.minecraft.tokenablefurnaces.chests;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.math.BlockPos;
import website.skylorbeck.minecraft.skylorlib.storage.ExtraChestEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;
import website.skylorbeck.minecraft.tokenablefurnaces.Ref;
import website.skylorbeck.minecraft.tokenablefurnaces.Screenhandlers.DiamondScreenHandler;
import website.skylorbeck.minecraft.tokenablefurnaces.Screenhandlers.GoldScreenHandler;

public class GoldChestEntity extends ExtraChestEntity {
    protected GoldChestEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState,12*9,"gold",false,false, Ref.MODID);
    }

    public GoldChestEntity(BlockPos pos, BlockState state) {
        super(Declarer.GOLDCHESTENTITY,pos, state,12*9,"gold",false,false, Ref.MODID);
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
