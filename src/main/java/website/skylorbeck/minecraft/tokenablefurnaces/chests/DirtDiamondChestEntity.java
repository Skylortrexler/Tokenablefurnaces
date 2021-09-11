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
import website.skylorbeck.minecraft.tokenablefurnaces.Screenhandlers.DirtDiamondDoubleScreenHandler;
import website.skylorbeck.minecraft.tokenablefurnaces.Screenhandlers.DirtDiamondScreenHandler;
import website.skylorbeck.minecraft.tokenablefurnaces.Screenhandlers.DirtGoldScreenHandler;

public class DirtDiamondChestEntity extends ExtraChestEntity {
    protected DirtDiamondChestEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState,6,"dirt_diamond",false,false, Ref.MODID);
    }


    public DirtDiamondChestEntity(BlockPos pos, BlockState state) {
        super(Declarer.DIRTDIAMONDCHESTENTITY,pos, state,6,"dirt_diamond",false,false, Ref.MODID);
    }


    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new DirtDiamondScreenHandler(syncId, playerInventory, this,1,6);
    }
    protected Text getContainerName() {
        return new TranslatableText("container.dirtchest");
    }
    protected Text getDoubleContainerName(){
        return new TranslatableText("container.dirtchestdouble");
    }
    protected ScreenHandler createDoubleScreenHandler(int syncId, PlayerInventory playerInventory, Inventory inventory){
        return new DirtDiamondDoubleScreenHandler(syncId, playerInventory, inventory,1,12);
    }
}