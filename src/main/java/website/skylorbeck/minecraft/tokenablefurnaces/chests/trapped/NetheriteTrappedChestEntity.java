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
import website.skylorbeck.minecraft.tokenablefurnaces.Screenhandlers.AmethystScreenHandler;

public class NetheriteTrappedChestEntity extends ExtraTrappedChestEntity {
    protected NetheriteTrappedChestEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState,24*9,"netherite",false,false, Ref.MODID);
    }

    public NetheriteTrappedChestEntity(BlockPos pos, BlockState state) {
        super(Declarer.NETHERITETRAPPEDCHESTENTITY,pos, state,24*9,"netherite",false,false, Ref.MODID);
    }
    protected Text getContainerName() {
        return new TranslatableText("container.netheritechest");
    }
    protected Text getDoubleContainerName(){
        return new TranslatableText("container.netheritechestdouble");
    }
    protected ScreenHandler createDoubleScreenHandler(int syncId, PlayerInventory playerInventory, Inventory inventory){
        return new AmethystScreenHandler(syncId, playerInventory, inventory,48,9);
    }
}
