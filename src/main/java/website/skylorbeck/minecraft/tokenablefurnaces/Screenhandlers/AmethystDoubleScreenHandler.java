package website.skylorbeck.minecraft.tokenablefurnaces.Screenhandlers;

import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;

public class AmethystDoubleScreenHandler extends AbstractScreenHandler {
    public AmethystDoubleScreenHandler(int syncId, PlayerInventory playerInventory, Inventory inventory, int rows, int width) {
        super(Declarer.AMETHYSTDOUBLESCREENHANDLER, syncId,playerInventory,inventory,rows,width);
    }
}

