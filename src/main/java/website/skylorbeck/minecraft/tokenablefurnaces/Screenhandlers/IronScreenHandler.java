package website.skylorbeck.minecraft.tokenablefurnaces.Screenhandlers;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;

public class IronScreenHandler extends AbstractScreenHandler {
    public IronScreenHandler(int syncId, PlayerInventory playerInventory, Inventory inventory, int rows, int width) {
        super(Declarer.IRONSCREENHANDLER, syncId,playerInventory,inventory,rows,width);

    }
}
