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
import website.skylorbeck.minecraft.tokenablefurnaces.Screenhandlers.GoldScreenHandler;
import website.skylorbeck.minecraft.tokenablefurnaces.Screenhandlers.IronScreenHandler;

public class IronTrappedChestEntity extends ExtraTrappedChestEntity {
    protected IronTrappedChestEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState,6*9,"iron",true,false, Ref.MODID);
    }

    public IronTrappedChestEntity(BlockPos pos, BlockState state) {
        super(Declarer.IRONTRAPPEDCHESTENTITY,pos, state,6*9,"iron",true,false, Ref.MODID);
    }

    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new IronScreenHandler(syncId, playerInventory, this,6,9);
    }
    protected Text getContainerName() {
        return Text.translatable("container.ironchest");
    }
    protected Text getDoubleContainerName(){
        return Text.translatable("container.ironchestdouble");
    }
    protected ScreenHandler createDoubleScreenHandler(int syncId, PlayerInventory playerInventory, Inventory inventory){
        return new GoldScreenHandler(syncId, playerInventory, inventory,12,9);
    }
}
