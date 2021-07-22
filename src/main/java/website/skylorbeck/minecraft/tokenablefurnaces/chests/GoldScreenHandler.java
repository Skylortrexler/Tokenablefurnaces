package website.skylorbeck.minecraft.tokenablefurnaces.chests;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;

public class GoldScreenHandler extends ScreenHandler {
    private final Inventory inventory;
    private final int rows;
    private final int width;
    public GoldScreenHandler(int syncId, PlayerInventory playerInventory, Inventory inventory, int rows, int width) {
        super(Declarer.GOLDSCREENHANDLER, syncId);
        checkSize(inventory, rows*width);
        this.inventory = inventory;
        this.rows = rows;
        this.width = width;
        inventory.onOpen(playerInventory.player);
        int i = (this.rows - 4) * 18;

        int n;
        int m;
        for(n = 0; n < this.rows; ++n) {
            for(m = 0; m < this.width; ++m) {
                this.addSlot(new Slot(inventory, m + n * this.width, 8 + m * 18, -9 + n * 18));
            }
        }

        for(n = 0; n < 3; ++n) {
            for(m = 0; m < 9; ++m) {
                this.addSlot(new Slot(playerInventory, m + n * 9 + 9, 8 + m * 18, 77 + n * 18 + i));
            }
        }

        for(n = 0; n < 9; ++n) {
            this.addSlot(new Slot(playerInventory, n, 8 + n * 18, 135 + i));
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
            if (index < this.rows * this.width) {
                if (!this.insertItem(itemStack2, this.rows * this.width, this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.insertItem(itemStack2, 0, this.rows * this.width, false)) {
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
        super.close(player);
        this.inventory.onClose(player);
    }

    public Inventory getInventory() {
        return this.inventory;
    }

    public int getRows() {
        return this.rows;
    }
}
