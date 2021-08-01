package website.skylorbeck.minecraft.tokenablefurnaces.Screenhandlers;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;
import website.skylorbeck.minecraft.tokenablefurnaces.chests.Utils;

public class AbstractScreenHandler extends ScreenHandler {
    private final Inventory inventory;
    private final PlayerInventory playerInventory;
    private final Inventory[] inventories;
    private final int rows;
    private final int width;
    public int curTab = 0;

    public AbstractScreenHandler(int syncId, PlayerInventory playerInventory, Inventory inventory, int rows, int width) {
        super(Declarer.ABSTRACTSCREENHANDLER, syncId);
        checkSize(inventory, rows*width);
        this.rows = rows;
        this.width = width;
        this.inventory = inventory;
        this.playerInventory = playerInventory;
        inventory.onOpen(playerInventory.player);
        inventories = Utils.getConvertedInventory(inventory);

        int i =36;

        int n;
        int m;
        for(n = 0; n < 6; ++n) {
            for(m = 0; m < 9; ++m) {
                this.addSlot(new Slot(inventories[curTab], m + n * 9, 8 + m * 18, 18 + n * 18));
            }
        }

        for(n = 0; n < 3; ++n) {
            for(m = 0; m < 9; ++m) {
                this.addSlot(new Slot(playerInventory, m + n * 9 + 9, 8 + m * 18, 104 + n * 18 + i));
            }
        }

        for(n = 0; n < 9; ++n) {
            this.addSlot(new Slot(playerInventory, n, 8 + n * 18, 162 + i));
        }

    }

    public boolean canUse(PlayerEntity player) {
        return this.inventory.canPlayerUse(player);
    }

    public ItemStack transferSlot(PlayerEntity player, int index) {
        ItemStack itemStack = ItemStack.EMPTY;
        Slot slot = (Slot)this.slots.get(index);
        if (slot != null && slot.hasStack()) {
            ItemStack itemStack2 = slot.getStack();
            itemStack = itemStack2.copy();
            if (index < this.rows * 9) {
                if (!this.insertItem(itemStack2, this.rows * 9, this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.insertItem(itemStack2, 0, this.rows * 9, false)) {
                return ItemStack.EMPTY;
            }

            if (itemStack2.isEmpty()) {
                slot.setStack(ItemStack.EMPTY);
            } else {
                slot.markDirty();
            }
        }

        return itemStack;
    }

    public void close(PlayerEntity player) {
        Inventory newInv = Utils.putConvertedInventory(inventories,this.inventory.size());
        for (int i = 0; i <newInv.size() ; i++) {
            inventory.setStack(i,newInv.getStack(i));
        }
        super.close(player);
        this.inventory.onClose(player);
    }

    public Inventory getInventory() {
//        return this.inventory;
        return inventories[curTab];
    }

    public int getRows() {
        return this.rows;
    }

    public void setTab(int tab){
        this.curTab = tab;
        /*int n;
        int m;
            for(n = 0; n < 6; ++n) {
                for(m = 0; m < 9; ++m) {
                    this.slots.get(m+n*9).setStack(inventories[curTab].getStack(m+n*9));
                }
            }*/

        this.slots.clear();

        int i = 36;

        int n;
        int m;
        for(n = 0; n < 6; ++n) {
            for(m = 0; m < 9; ++m) {
                this.addSlot(new Slot(inventories[curTab], m + n * 9, 8 + m * 18, 18 + n * 18));
                onSlotClick(m+n*9,0, SlotActionType.SWAP, playerInventory.player);
            }
        }

        for(n = 0; n < 3; ++n) {
            for(m = 0; m < 9; ++m) {
                this.addSlot(new Slot(playerInventory, m + n * 9 + 9, 8 + m * 18, 104 + n * 18 + i));
            }
        }

        for(n = 0; n < 9; ++n) {
            this.addSlot(new Slot(playerInventory, n, 8 + n * 18, 162 + i));
        }

    }
}
