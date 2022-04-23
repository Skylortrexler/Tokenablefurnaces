package website.skylorbeck.minecraft.tokenablefurnaces.mixins;

import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.GrassColors;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;

@Mixin(BlockColors.class)
public class BlockColorsMixin {
    @Inject(at = @At(value = "RETURN"),method = "create")
    private static void createChestColors(CallbackInfoReturnable<BlockColors> cir){
        cir.getReturnValue().registerColorProvider((state, world, pos, tintIndex) -> {//only works on blocks and not entities so kind of pointless. Was worth a try.
            return world != null && pos != null ? BiomeColors.getGrassColor(world, pos) : GrassColors.getColor(0.5D, 1.0D);
        }, Declarer.dirtChestBlock,Declarer.dirtTrappedChestBlock);
    }
}
