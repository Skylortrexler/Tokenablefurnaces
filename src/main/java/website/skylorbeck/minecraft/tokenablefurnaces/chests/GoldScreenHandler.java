package website.skylorbeck.minecraft.tokenablefurnaces.chests;

import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;

public class GoldScreenHandler extends AbstractScreenHandler {
    public GoldScreenHandler(int syncId, PlayerInventory playerInventory, Inventory inventory, int rows, int width) {
        super(Declarer.GOLDSCREENHANDLER,syncId, playerInventory, inventory, rows, width);
    }
}
