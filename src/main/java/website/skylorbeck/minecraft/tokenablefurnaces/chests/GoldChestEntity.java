package website.skylorbeck.minecraft.tokenablefurnaces.chests;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;

public class GoldChestEntity extends ExtraChestEntity{
    protected GoldChestEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState);
    }

    public GoldChestEntity(BlockPos pos, BlockState state) {
        super(Declarer.GOLDCHESTENTITY,pos, state);
        this.inventory = DefaultedList.ofSize(6*15, ItemStack.EMPTY);
    }
    @Override
    public int size() {
        return 6*15;
    }
    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
//        return GenericContainerScreenHandler.createGeneric9x6(syncId, playerInventory, this);
        return new GoldScreenHandler(syncId, playerInventory, this,9,9);
    }
}
