package website.skylorbeck.minecraft.tokenablefurnaces.chests;

import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.DoubleBlockProperties;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.function.Supplier;

public abstract class AbstractExtraChestBlock<E extends BlockEntity> extends BlockWithEntity {
    protected final Supplier<BlockEntityType<? extends E>> entityTypeRetriever;

    protected AbstractExtraChestBlock(Settings settings, Supplier<BlockEntityType<? extends E>> entityTypeSupplier) {
        super(settings);
        this.entityTypeRetriever = entityTypeSupplier;
    }

    public abstract DoubleBlockProperties.PropertySource<? extends ExtraChestEntity> getBlockEntitySource(BlockState state, World world, BlockPos pos, boolean ignoreBlocked);
}