package website.skylorbeck.minecraft.tokenablefurnaces.hoppers;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import website.skylorbeck.minecraft.skylorlib.hoppers.ExtraHopperBlock;
import website.skylorbeck.minecraft.tokenablefurnaces.Ref;

import java.util.List;

public class IronHopperBlock extends ExtraHopperBlock {
    public IronHopperBlock(Settings settings) {
        super(settings);
    }
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new IronHopperEntity(pos, state);
    }
    @Nullable
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return world.isClient ? null : IronHopperEntity::serverTick;
    }

    public void onPlaced(World world, BlockPos pos, BlockState state, LivingEntity placer, ItemStack itemStack) {
        if (itemStack.hasCustomName()) {
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if (blockEntity instanceof IronHopperEntity) {
                ((IronHopperEntity)blockEntity).setCustomName(itemStack.getName());
            }
        }
    }
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (world.isClient) {
            return ActionResult.SUCCESS;
        } else {
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if (blockEntity instanceof IronHopperEntity) {
                player.openHandledScreen((IronHopperEntity)blockEntity);
                player.incrementStat(Stats.INSPECT_HOPPER);
            }
            return ActionResult.CONSUME;
        }
    }
    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if (!state.isOf(newState.getBlock())) {
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if (blockEntity instanceof IronHopperEntity) {
                ItemScatterer.spawn(world, pos, (IronHopperEntity)blockEntity);
                world.updateComparators(pos, this);
            }
            super.onStateReplaced(state, world, pos, newState, moved);
        }
    }
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof IronHopperEntity) {
            IronHopperEntity.onEntityCollided(world, pos, state, entity, (IronHopperEntity)blockEntity);
        }

    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable BlockView world, List<Text> tooltip, TooltipContext options) {
        tooltip.add(Text.of(2* Ref.hopperMulti + " Items per tick"));
        super.appendTooltip(stack, world, tooltip, options);
    }
}
