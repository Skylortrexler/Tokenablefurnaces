package website.skylorbeck.minecraft.tokenablefurnaces.furnaces.gold;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.RecipeType;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.core.AbstractExtraFurnaceBlockEntity;

public class GoldExtraFurnaceEntity extends AbstractExtraFurnaceBlockEntity {
    public GoldExtraFurnaceEntity(BlockPos pos, BlockState state) {
        super(Declarer.GOLDFURNACEENTITY,pos,state, RecipeType.SMELTING);
    }
    public static <T extends BlockEntity> void tick(World world, BlockPos blockPos, BlockState state, T t) {
        AbstractExtraFurnaceBlockEntity.tick(world,blockPos,state,(GoldExtraFurnaceEntity)t);
    }
    @Override
    public Text getContainerName() {
        return new TranslatableText("container.furnace");
    }
    protected int getFuelTime(ItemStack fuel) {
        return (int) (super.getFuelTime(fuel)*0.6);
    }
}
