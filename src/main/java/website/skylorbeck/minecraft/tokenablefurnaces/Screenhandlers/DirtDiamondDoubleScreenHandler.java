package website.skylorbeck.minecraft.tokenablefurnaces.Screenhandlers;

import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import website.skylorbeck.minecraft.skylorlib.storage.AbstractScreenHandler;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;

public class DirtDiamondDoubleScreenHandler extends AbstractScreenHandler {

    public DirtDiamondDoubleScreenHandler(int syncId, PlayerInventory playerInventory, Inventory inventory, int rows, int width) {
        super(Declarer.DIRTDIAMONDDOUBLESCREENHANDLER, syncId,playerInventory,inventory,rows,width);

    }
}
