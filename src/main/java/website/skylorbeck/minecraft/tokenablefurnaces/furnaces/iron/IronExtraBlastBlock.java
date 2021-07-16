package website.skylorbeck.minecraft.tokenablefurnaces.furnaces.iron;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.stat.Stats;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.core.ExtraBlastFurnaceBlock;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.core.ExtraBlastFurnaceBlockEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.core.ExtraFurnaceBlockEntity;

public class IronExtraBlastBlock extends ExtraBlastFurnaceBlock {
    public IronExtraBlastBlock(Settings settings) {
        super(settings);
    }
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new IronExtraBlastEntity(pos,state);
    }
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return IronExtraBlastEntity::tick;
    }
    protected void openScreen(World world, BlockPos pos, PlayerEntity player) {
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof IronExtraBlastEntity) {
            player.openHandledScreen((NamedScreenHandlerFactory)blockEntity);
            player.incrementStat(Stats.INTERACT_WITH_BLAST_FURNACE);
        }
    }

}
