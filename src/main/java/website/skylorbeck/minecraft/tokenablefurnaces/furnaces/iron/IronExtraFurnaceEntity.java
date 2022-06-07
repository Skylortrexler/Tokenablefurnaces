package website.skylorbeck.minecraft.tokenablefurnaces.furnaces.iron;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.RecipeType;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import website.skylorbeck.minecraft.skylorlib.furnaces.AbstractExtraFurnaceBlockEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;
import website.skylorbeck.minecraft.tokenablefurnaces.Ref;

public class IronExtraFurnaceEntity extends AbstractExtraFurnaceBlockEntity {
    public IronExtraFurnaceEntity(BlockPos pos, BlockState state) {
        super(Declarer.IRONFURNACEENTITY,pos,state, RecipeType.SMELTING,0.8f);
    }
    public static <T extends BlockEntity> void tick(World world, BlockPos blockPos, BlockState state, T t) {
        AbstractExtraFurnaceBlockEntity.tick(world,blockPos,state,(IronExtraFurnaceEntity)t);
    }
    @Override
    public Text getContainerName() {
        return Text.translatable("container.furnace");
    }
    protected int getFuelTime(ItemStack fuel) {
        if (Ref.furnaceEfficiency) {
            return super.getFuelTime(fuel);
        } else {
            return (int) (super.getFuelTime(fuel) * this.getMultiplier());
        }
    }
}
