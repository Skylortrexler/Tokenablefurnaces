package website.skylorbeck.minecraft.tokenablefurnaces.Screenhandlers;

import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import website.skylorbeck.minecraft.skylorlib.storage.AbstractScreenHandler;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;

public class DirtDiamondScreenHandler extends AbstractScreenHandler {

    public DirtDiamondScreenHandler(int syncId, PlayerInventory playerInventory, Inventory inventory, int rows, int width) {
        super(Declarer.DIRTDIAMONDSCREENHANDLER, syncId,playerInventory,inventory,rows,width);

    }
}
