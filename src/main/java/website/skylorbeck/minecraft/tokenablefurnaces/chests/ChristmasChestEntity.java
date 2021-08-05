package website.skylorbeck.minecraft.tokenablefurnaces.chests;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;

public class ChristmasChestEntity extends ExtraChestEntity{
    protected ChristmasChestEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState,27,"christmas",false);
    }

    public ChristmasChestEntity(BlockPos pos, BlockState state) {
        super(Declarer.CHRISTMASCHESTENTITY,pos, state,27,"christmas",false);
    }

}
