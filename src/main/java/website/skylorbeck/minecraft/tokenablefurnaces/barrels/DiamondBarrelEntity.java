package website.skylorbeck.minecraft.tokenablefurnaces.barrels;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;
import website.skylorbeck.minecraft.tokenablefurnaces.Screenhandlers.DiamondScreenHandler;

public class DiamondBarrelEntity extends ExtraBarrelEntity{
    public DiamondBarrelEntity(BlockPos pos, BlockState state) {
        super(Declarer.DIAMONDBARRELENTITY, pos, state);
        this.inventory = DefaultedList.ofSize(12*15, ItemStack.EMPTY);
    }
    @Override
    public int size() {
        return 12*15;
    }

    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
//        return GenericContainerScreenHandler.createGeneric9x6(syncId, playerInventory, this);
        return new DiamondScreenHandler(syncId, playerInventory, this,12,15);
    }
}
