package website.skylorbeck.minecraft.tokenablefurnaces.chests;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;

public class ChristmasChestEntity extends ExtraChestEntity{
    protected ChristmasChestEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState);
    }

    public ChristmasChestEntity(BlockPos pos, BlockState state) {
        super(Declarer.CHRISTMASCHESTENTITY,pos, state);
//        this.inventory = DefaultedList.ofSize(3*9, ItemStack.EMPTY);
    }
//    @Override
//    public int size() {
//        return 3*9;
//    }

//    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
//        return GenericContainerScreenHandler.createGeneric9x3(syncId, playerInventory, this);
//    }
}
