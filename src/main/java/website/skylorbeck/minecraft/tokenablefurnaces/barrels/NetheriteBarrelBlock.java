package website.skylorbeck.minecraft.tokenablefurnaces.barrels;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;
import website.skylorbeck.minecraft.skylorlib.storage.ExtraBarrelBlock;

import java.util.List;

public class NetheriteBarrelBlock extends ExtraBarrelBlock {
    public NetheriteBarrelBlock(Settings settings) {
        super(settings);
    }
    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new NetheriteBarrelEntity(pos,state);
    }
    @Override
    public void appendTooltip(ItemStack stack, @Nullable BlockView world, List<Text> tooltip, TooltipContext options) {
        tooltip.add(Text.of("4 Double Chests"));
        tooltip.add(Text.of("Blast Resistant"));
        tooltip.add(Text.of("Lava/fireproof"));
        super.appendTooltip(stack, world, tooltip, options);
    }
}
