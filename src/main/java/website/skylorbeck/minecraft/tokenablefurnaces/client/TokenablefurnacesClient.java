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
import website.skylorbeck.minecraft.tokenablefurnaces.shulkers.*;

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


        ClientSpriteRegistryCallback.event(new Identifier("textures/atlas/shulker_boxes.png")).register((atlasTexture, registry) -> {
            registry.register(new Identifier("tokenablefurnaces:entity/shulker/iron"));
            registry.register(new Identifier("tokenablefurnaces:entity/shulker/gold"));
            registry.register(new Identifier("tokenablefurnaces:entity/shulker/diamond"));
            registry.register(new Identifier("tokenablefurnaces:entity/shulker/netherite"));
            registry.register(new Identifier("tokenablefurnaces:entity/shulker/amethyst"));
        });
        BlockEntityRendererRegistry.INSTANCE.register(Declarer.IRONSHULKERENTITY, ExtraShulkerEntityRenderer::new);
        BlockEntityRendererRegistry.INSTANCE.register(Declarer.GOLDSHULKERENTITY, ExtraShulkerEntityRenderer::new);
        BlockEntityRendererRegistry.INSTANCE.register(Declarer.DIAMONDSHULKERENTITY, ExtraShulkerEntityRenderer::new);
        BlockEntityRendererRegistry.INSTANCE.register(Declarer.NETHERITESHULKERENTITY, ExtraShulkerEntityRenderer::new);
        BlockEntityRendererRegistry.INSTANCE.register(Declarer.AMETHYSTSHULKERENTITY, ExtraShulkerEntityRenderer::new);
        BuiltinItemRendererRegistry.INSTANCE.register(Declarer.ironShulker, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            MinecraftClient.getInstance().getBlockEntityRenderDispatcher().renderEntity(new IronShulkerEntity(BlockPos.ORIGIN,Declarer.ironShulkerBlock.getDefaultState()),matrices,vertexConsumers,light,overlay);});
        BuiltinItemRendererRegistry.INSTANCE.register(Declarer.goldShulker, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            MinecraftClient.getInstance().getBlockEntityRenderDispatcher().renderEntity(new GoldShulkerEntity(BlockPos.ORIGIN,Declarer.goldShulkerBlock.getDefaultState()),matrices,vertexConsumers,light,overlay);});
        BuiltinItemRendererRegistry.INSTANCE.register(Declarer.diamondShulker, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            MinecraftClient.getInstance().getBlockEntityRenderDispatcher().renderEntity(new DiamondShulkerEntity(BlockPos.ORIGIN,Declarer.diamondShulkerBlock.getDefaultState()),matrices,vertexConsumers,light,overlay);});
        BuiltinItemRendererRegistry.INSTANCE.register(Declarer.netheriteShulker, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            MinecraftClient.getInstance().getBlockEntityRenderDispatcher().renderEntity(new NetheriteShulkerEntity(BlockPos.ORIGIN,Declarer.netheriteShulkerBlock.getDefaultState()),matrices,vertexConsumers,light,overlay);});
        BuiltinItemRendererRegistry.INSTANCE.register(Declarer.amethystShulker, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            MinecraftClient.getInstance().getBlockEntityRenderDispatcher().renderEntity(new AmethystShulkerEntity(BlockPos.ORIGIN,Declarer.amethystShulkerBlock.getDefaultState()),matrices,vertexConsumers,light,overlay);});

    }
}
