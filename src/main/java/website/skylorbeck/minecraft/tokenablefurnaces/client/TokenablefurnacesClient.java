package website.skylorbeck.minecraft.tokenablefurnaces.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendereregistry.v1.BlockEntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.BuiltinItemRendererRegistry;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;
import website.skylorbeck.minecraft.tokenablefurnaces.chests.*;

@net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
public class TokenablefurnacesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ScreenRegistry.register(Declarer.IRONSCREENHANDLER, IronHandledScreen::new);
        ScreenRegistry.register(Declarer.GOLDSCREENHANDLER, GoldHandledScreen::new);
        ClientSpriteRegistryCallback.event(new Identifier("textures/atlas/chest.png")).register((atlasTexture, registry) -> {
            registry.register(new Identifier("tokenablefurnaces:entity/chest/iron"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/gold"));

        });
        BlockEntityRendererRegistry.INSTANCE.register(Declarer.IRONCHESTENTITY, ExtraChestEntityRenderer::new);
        BlockEntityRendererRegistry.INSTANCE.register(Declarer.GOLDCHESTENTITY, ExtraChestEntityRenderer::new);
        BuiltinItemRendererRegistry.INSTANCE.register(Declarer.ironChest, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            MinecraftClient.getInstance().getBlockEntityRenderDispatcher().renderEntity(new IronChestEntity(BlockPos.ORIGIN,Declarer.ironChestBlock.getDefaultState()),matrices,vertexConsumers,light,overlay);});
        BuiltinItemRendererRegistry.INSTANCE.register(Declarer.goldChest, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            MinecraftClient.getInstance().getBlockEntityRenderDispatcher().renderEntity(new GoldChestEntity(BlockPos.ORIGIN,Declarer.goldChestBlock.getDefaultState()),matrices,vertexConsumers,light,overlay);});

    }
}
