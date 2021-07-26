package website.skylorbeck.minecraft.tokenablefurnaces.shulkers;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;
import website.skylorbeck.minecraft.tokenablefurnaces.chests.DiamondScreenHandler;

import java.util.stream.IntStream;

public class NetheriteShulkerEntity extends ExtraShulkerEntity{
    public NetheriteShulkerEntity(BlockPos pos, BlockState state) {
        super(Declarer.NETHERITESHULKERENTITY,pos, state);
        this.inventory = DefaultedList.ofSize(12*15, ItemStack.EMPTY);
        this.AVAILABLE_SLOTS = IntStream.range(0, 12*15).toArray();
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
