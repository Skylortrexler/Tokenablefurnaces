package website.skylorbeck.minecraft.tokenablefurnaces.mixins;

import net.minecraft.block.entity.HopperBlockEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(HopperBlockEntity.class)
public interface HopperEntityAccessor {
    @Accessor
    DefaultedList<ItemStack> getInventory();
}