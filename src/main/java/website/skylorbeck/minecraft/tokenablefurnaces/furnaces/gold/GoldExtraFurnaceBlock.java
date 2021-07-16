package website.skylorbeck.minecraft.tokenablefurnaces.furnaces.gold;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.stat.Stats;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.core.ExtraFurnaceBlock;

public class GoldExtraFurnaceBlock extends ExtraFurnaceBlock {
    public GoldExtraFurnaceBlock(Settings settings, int dimension) {
        super(settings, dimension);
    }
    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new GoldExtraFurnaceEntity(pos,state);
    }
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return GoldExtraFurnaceEntity::tick;
    }
    @Override
    protected void openScreen(World world, BlockPos pos, PlayerEntity player) {
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof GoldExtraFurnaceEntity) {
            player.openHandledScreen((NamedScreenHandlerFactory)blockEntity);
            player.incrementStat(Stats.INTERACT_WITH_FURNACE);
        }
    }
}
