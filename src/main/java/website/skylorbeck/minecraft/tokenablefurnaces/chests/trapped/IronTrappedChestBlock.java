package website.skylorbeck.minecraft.tokenablefurnaces.chests.trapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;
import website.skylorbeck.minecraft.tokenablefurnaces.chests.ExtraChestBlock;
import website.skylorbeck.minecraft.tokenablefurnaces.chests.ExtraChestEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.chests.IronChestEntity;

import java.util.function.Supplier;

public class IronTrappedChestBlock extends ExtraChestBlock {
    public IronTrappedChestBlock(Settings settings, Supplier<BlockEntityType<? extends ExtraChestEntity>> supplier) {
        super(settings, supplier);
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new IronTrappedChestEntity(pos, state);
    }
}