package website.skylorbeck.minecraft.tokenablefurnaces.shulkers;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;

import java.util.function.Supplier;

public class AmethystShulkerBlock extends ExtraShulkerBlock{

    public AmethystShulkerBlock(Settings settings, Supplier<BlockEntityType<? extends ExtraShulkerEntity>> entityTypeSupplier) {
        super(null, settings, entityTypeSupplier);
    }

    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new AmethystShulkerEntity(pos, state);
    }

}
