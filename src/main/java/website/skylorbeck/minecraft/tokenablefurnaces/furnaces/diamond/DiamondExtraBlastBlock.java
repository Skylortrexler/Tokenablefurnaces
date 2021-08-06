package website.skylorbeck.minecraft.tokenablefurnaces.furnaces.diamond;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import website.skylorbeck.minecraft.skylorlib.furnaces.ExtraBlastFurnaceBlock;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;

import java.util.List;

public class DiamondExtraBlastBlock extends ExtraBlastFurnaceBlock {
    public DiamondExtraBlastBlock(Settings settings) {
        super(settings);
    }
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new DiamondExtraBlastEntity(pos,state);
    }
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return DiamondExtraBlastEntity::tick;
    }
    protected void openScreen(World world, BlockPos pos, PlayerEntity player) {
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof DiamondExtraBlastEntity) {
            player.openHandledScreen((NamedScreenHandlerFactory)blockEntity);
            player.incrementStat(Stats.INTERACT_WITH_BLAST_FURNACE);
        }
    }
    @Override
    public void appendTooltip(ItemStack stack, @Nullable BlockView world, List<Text> tooltip, TooltipContext options) {
        tooltip.add(Text.of("60% Faster"));
        if (stack.getItem() == Declarer.netheriteFurnace || stack.getItem() == Declarer.netheriteBlast || stack.getItem() == Declarer.netheriteSmoker) {
            tooltip.add(Text.of("Blast Resistant"));
            tooltip.add(Text.of("Lava/fireproof"));
        }
        super.appendTooltip(stack, world, tooltip, options);
    }
}
