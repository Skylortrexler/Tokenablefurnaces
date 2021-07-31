package website.skylorbeck.minecraft.tokenablefurnaces.barrels;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;
import website.skylorbeck.minecraft.tokenablefurnaces.Screenhandlers.AmethystScreenHandler;

public class AmethystBarrelEntity extends ExtraBarrelEntity{
    public AmethystBarrelEntity(BlockPos pos, BlockState state) {
        super(Declarer.AMETHYSTBARRELENTITY, pos, state);
        this.inventory = DefaultedList.ofSize(18*20, ItemStack.EMPTY);
    }
    @Override
    public int size() {
        return 18*20;
    }

    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
//        return GenericContainerScreenHandler.createGeneric9x6(syncId, playerInventory, this);
        return new AmethystScreenHandler(syncId, playerInventory, this,18,20);
    }
}
