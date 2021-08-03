package website.skylorbeck.minecraft.tokenablefurnaces.chests;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;

import java.util.function.Supplier;

public class DirtChestBlock extends ExtraChestBlock{
    public DirtChestBlock(Settings settings, Supplier<BlockEntityType<? extends ExtraChestEntity>> supplier) {
        super(settings, supplier);
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new DirtChestEntity(pos, state);
    }
}