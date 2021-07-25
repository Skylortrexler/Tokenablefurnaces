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
        ScreenRegistry.register(Declarer.DIAMONDSCREENHANDLER, DiamondHandledScreen::new);
        ScreenRegistry.register(Declarer.AMETHYSTSCREENHANDLER, AmethystHandledScreen::new);
        ClientSpriteRegistryCallback.event(new Identifier("textures/atlas/chest.png")).register((atlasTexture, registry) -> {
            registry.register(new Identifier("tokenablefurnaces:entity/chest/iron"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/gold"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/diamond"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/netherite"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/amethyst"));

        });
        BlockEntityRendererRegistry.INSTANCE.register(Declarer.IRONCHESTENTITY, ExtraChestEntityRenderer::new);
        BlockEntityRendererRegistry.INSTANCE.register(Declarer.GOLDCHESTENTITY, ExtraChestEntityRenderer::new);
        BlockEntityRendererRegistry.INSTANCE.register(Declarer.DIAMONDCHESTENTITY, ExtraChestEntityRenderer::new);
        BlockEntityRendererRegistry.INSTANCE.register(Declarer.NETHERITECHESTENTITY, ExtraChestEntityRenderer::new);
        BlockEntityRendererRegistry.INSTANCE.register(Declarer.AMETHYSTCHESTENTITY, ExtraChestEntityRenderer::new);
        BuiltinItemRendererRegistry.INSTANCE.register(Declarer.ironChest, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            MinecraftClient.getInstance().getBlockEntityRenderDispatcher().renderEntity(new IronChestEntity(BlockPos.ORIGIN,Declarer.ironChestBlock.getDefaultState()),matrices,vertexConsumers,light,overlay);});
        BuiltinItemRendererRegistry.INSTANCE.register(Declarer.goldChest, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            MinecraftClient.getInstance().getBlockEntityRenderDispatcher().renderEntity(new GoldChestEntity(BlockPos.ORIGIN,Declarer.goldChestBlock.getDefaultState()),matrices,vertexConsumers,light,overlay);});
        BuiltinItemRendererRegistry.INSTANCE.register(Declarer.diamondChest, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            MinecraftClient.getInstance().getBlockEntityRenderDispatcher().renderEntity(new DiamondChestEntity(BlockPos.ORIGIN,Declarer.diamondChestBlock.getDefaultState()),matrices,vertexConsumers,light,overlay);});
        BuiltinItemRendererRegistry.INSTANCE.register(Declarer.netheriteChest, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            MinecraftClient.getInstance().getBlockEntityRenderDispatcher().renderEntity(new NetheriteChestEntity(BlockPos.ORIGIN,Declarer.netheriteChestBlock.getDefaultState()),matrices,vertexConsumers,light,overlay);});
        BuiltinItemRendererRegistry.INSTANCE.register(Declarer.amethystChest, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            MinecraftClient.getInstance().getBlockEntityRenderDispatcher().renderEntity(new AmethystChestEntity(BlockPos.ORIGIN,Declarer.amethystChestBlock.getDefaultState()),matrices,vertexConsumers,light,overlay);});

    }
}
