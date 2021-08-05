package website.skylorbeck.minecraft.tokenablefurnaces.chests.trapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.math.BlockPos;
import website.skylorbeck.minecraft.skylorlib.storage.ExtraTrappedChestEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;
import website.skylorbeck.minecraft.tokenablefurnaces.Ref;
import website.skylorbeck.minecraft.tokenablefurnaces.Screenhandlers.AmethystDoubleScreenHandler;
import website.skylorbeck.minecraft.tokenablefurnaces.Screenhandlers.AmethystScreenHandler;

public class AmethystTrappedChestEntity extends ExtraTrappedChestEntity {
    protected AmethystTrappedChestEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState,48*9,"amethyst",true,false, Ref.MODID);
    }

    public AmethystTrappedChestEntity(BlockPos pos, BlockState state) {
        super(Declarer.AMETHYSTTRAPPEDCHESTENTITY,pos, state,48*9,"amethyst",true,false, Ref.MODID);
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
