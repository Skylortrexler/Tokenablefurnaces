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
import website.skylorbeck.minecraft.tokenablefurnaces.Screenhandlers.AmethystDoubleScreenHandler;
import website.skylorbeck.minecraft.tokenablefurnaces.Screenhandlers.AmethystScreenHandler;
import website.skylorbeck.minecraft.tokenablefurnaces.chests.trapped.AmethystTrappedChestEntity;

public class AmethystChestEntity extends ExtraChestEntity {
    protected AmethystChestEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState,48*9,"amethyst",false, Ref.MODID);
    }

    public AmethystChestEntity(BlockPos pos, BlockState state) {
        super(Declarer.AMETHYSTCHESTENTITY,pos, state,48*9,"amethyst",false, Ref.MODID);
    }
    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new AmethystScreenHandler(syncId, playerInventory, this,48,9);
    }
    protected Text getContainerName() {
        return new TranslatableText("container.amethystchest");
    }
    protected Text getDoubleContainerName(){
        return new TranslatableText("container.amethystchestdouble");
    }
    protected ScreenHandler createDoubleScreenHandler(int syncId, PlayerInventory playerInventory, Inventory inventory){
        return new AmethystDoubleScreenHandler(syncId, playerInventory, inventory,96,9);
    }
}
