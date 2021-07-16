package website.skylorbeck.minecraft.tokenablefurnaces.furnaces.iron;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.AbstractFurnaceBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.AbstractCookingRecipe;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeType;
import net.minecraft.screen.FurnaceScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.SmokerScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.core.AbstractExtraFurnaceBlockEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.core.ExtraFurnaceBlockEntity;

public class IronExtraFurnaceEntity extends AbstractExtraFurnaceBlockEntity {
    public IronExtraFurnaceEntity(BlockPos pos, BlockState state) {
        super(Declarer.IRONFURNACEENTITY,pos,state, RecipeType.SMELTING);
    }

    @Override
    public Text getContainerName() {
        return new TranslatableText("container.furnace");
    }

    protected int getFuelTime(ItemStack fuel) {
        return (int) (super.getFuelTime(fuel)*0.8);
    }

    public static <T extends BlockEntity> void tick(World world, BlockPos blockPos, BlockState state, T t) {
        AbstractExtraFurnaceBlockEntity.tick(world,blockPos,state,(IronExtraFurnaceEntity)t);
    }
}
