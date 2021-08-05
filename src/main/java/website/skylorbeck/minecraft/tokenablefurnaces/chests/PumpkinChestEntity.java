package website.skylorbeck.minecraft.tokenablefurnaces.chests;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;

public class PumpkinChestEntity extends ExtraChestEntity{
    protected PumpkinChestEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState,27,"pumpkin",false);
    }

    public PumpkinChestEntity(BlockPos pos, BlockState state) {
        super(Declarer.PUMPKINCHESTENTITY,pos, state,27,"pumpkin",false);
    }
}
