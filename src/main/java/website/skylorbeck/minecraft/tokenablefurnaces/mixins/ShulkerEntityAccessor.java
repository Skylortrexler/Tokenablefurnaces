package website.skylorbeck.minecraft.tokenablefurnaces.mixins;

import net.minecraft.block.entity.BarrelBlockEntity;
import net.minecraft.block.entity.ShulkerBoxBlockEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(ShulkerBoxBlockEntity.class)
public interface ShulkerEntityAccessor {
    @Accessor
    DefaultedList<ItemStack> getInventory();
}