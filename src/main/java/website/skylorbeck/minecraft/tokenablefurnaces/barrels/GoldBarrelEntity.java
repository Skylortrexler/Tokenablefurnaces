package website.skylorbeck.minecraft.tokenablefurnaces.barrels;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;
import website.skylorbeck.minecraft.tokenablefurnaces.Screenhandlers.GoldScreenHandler;

public class GoldBarrelEntity extends ExtraBarrelEntity{
    public GoldBarrelEntity(BlockPos pos, BlockState state) {
        super(Declarer.GOLDBARRELENTITY, pos, state);
        this.inventory = DefaultedList.ofSize(12*9, ItemStack.EMPTY);
    }
    @Override
    public int size() {
        return 12*9;
    }

    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new GoldScreenHandler(syncId, playerInventory, this,12,9);
    }
}
