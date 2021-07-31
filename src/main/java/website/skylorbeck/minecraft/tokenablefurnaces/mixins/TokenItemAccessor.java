package website.skylorbeck.minecraft.tokenablefurnaces.mixins;

import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(Item.class)
public interface TokenItemAccessor {
    @Accessor("recipeRemainder")
    @Mutable
    void setRecipeRemainder(Item remainder);
}
