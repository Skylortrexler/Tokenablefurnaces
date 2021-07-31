package website.skylorbeck.minecraft.tokenablefurnaces.mixins;

import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(AbstractFurnaceBlockEntity.class)
public interface FurnaceEntityAccessor {
    @Accessor
    DefaultedList<ItemStack> getInventory();
    @Accessor
    int getFuelTime();
    @Accessor
    int getBurnTime();
    @Accessor
    int getCookTime();
    @Accessor
    int getCookTimeTotal();
}