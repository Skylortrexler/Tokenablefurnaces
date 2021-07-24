package website.skylorbeck.minecraft.tokenablefurnaces.chests;

import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.screen.ScreenHandlerType;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;

public class IronScreenHandler extends AbstractScreenHandler{
    public IronScreenHandler( int syncId, PlayerInventory playerInventory, Inventory inventory, int rows, int width) {
        super(Declarer.IRONSCREENHANDLER, syncId, playerInventory, inventory, rows, width);
    }
}
