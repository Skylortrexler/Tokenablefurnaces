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
import website.skylorbeck.minecraft.tokenablefurnaces.Screenhandlers.GoldScreenHandler;
import website.skylorbeck.minecraft.tokenablefurnaces.Screenhandlers.IronScreenHandler;

public class IronChestEntity extends ExtraChestEntity {
    protected IronChestEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState,6*9,"iron",false,false, Ref.MODID);
    }

    public IronChestEntity(BlockPos pos, BlockState state) {
        super(Declarer.IRONCHESTENTITY,pos, state,6*9,"iron",false,false, Ref.MODID);
    }

    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new IronScreenHandler(syncId, playerInventory, this,6,9);
    }
    protected Text getContainerName() {
        return new TranslatableText("container.ironchest");
    }
    protected Text getDoubleContainerName(){
        return new TranslatableText("container.ironchestdouble");
    }
    protected ScreenHandler createDoubleScreenHandler(int syncId, PlayerInventory playerInventory, Inventory inventory){
        return new GoldScreenHandler(syncId, playerInventory, inventory,12,9);
    }
}
