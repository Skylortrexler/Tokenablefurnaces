package website.skylorbeck.minecraft.tokenablefurnaces.furnaces.iron;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.stat.Stats;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.core.AbstractExtraFurnaceBlock;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.core.ExtraFurnaceBlock;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.core.ExtraFurnaceBlockEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.core.ExtraSmokerBlockEntity;

public class IronExtraFurnaceBlock extends ExtraFurnaceBlock {


    public IronExtraFurnaceBlock(Settings settings, int dimension) {
        super(settings, dimension);
    }

    @Override
    protected void openScreen(World world, BlockPos pos, PlayerEntity player) {
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof IronExtraFurnaceEntity) {
            player.openHandledScreen((NamedScreenHandlerFactory)blockEntity);
            player.incrementStat(Stats.INTERACT_WITH_FURNACE);
        }
    }

    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return IronExtraFurnaceEntity::tick;
    }
    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new IronExtraFurnaceEntity(pos,state);
    }
}
