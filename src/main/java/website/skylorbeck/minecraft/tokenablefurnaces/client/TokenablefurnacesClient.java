package website.skylorbeck.minecraft.tokenablefurnaces.client;

import me.shedaniel.autoconfig.AutoConfig;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendereregistry.v1.BlockEntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.BuiltinItemRendererRegistry;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.fabricmc.fabric.api.object.builder.v1.client.model.FabricModelPredicateProviderRegistry;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import website.skylorbeck.minecraft.skylorlib.bundles.ExtraBundleItem;
import website.skylorbeck.minecraft.skylorlib.storage.ExtraChestEntityRenderer;
import website.skylorbeck.minecraft.skylorlib.storage.ExtraShulkerEntityRenderer;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;
import website.skylorbeck.minecraft.tokenablefurnaces.Screenhandlers.*;
import website.skylorbeck.minecraft.tokenablefurnaces.chests.*;
import website.skylorbeck.minecraft.tokenablefurnaces.chests.trapped.*;
import website.skylorbeck.minecraft.tokenablefurnaces.config.ModConfig;
import website.skylorbeck.minecraft.tokenablefurnaces.shulkers.*;

@net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
public class TokenablefurnacesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        AutoConfig.getGuiRegistry(ModConfig.class);

        ScreenRegistry.register(Declarer.DIRTSCREENHANDLER, DirtHandledScreen::new);
        ScreenRegistry.register(Declarer.DIRTDOUBLESCREENHANDLER, DirtDoubleHandledScreen::new);
        ScreenRegistry.register(Declarer.IRONSCREENHANDLER, IronHandledScreen::new);
        ScreenRegistry.register(Declarer.GOLDSCREENHANDLER, GoldHandledScreen::new);
        ScreenRegistry.register(Declarer.DIAMONDSCREENHANDLER, DiamondHandledScreen::new);
        ScreenRegistry.register(Declarer.AMETHYSTSCREENHANDLER, AmethystHandledScreen::new);
        ScreenRegistry.register(Declarer.AMETHYSTDOUBLESCREENHANDLER, AmethystDoubleHandledScreen::new);

        ScreenRegistry.register(Declarer.DIRTGOLDSCREENHANDLER, DirtGoldHandledScreen::new);
        ScreenRegistry.register(Declarer.DIRTGOLDDOUBLESCREENHANDLER, DirtGoldDoubleHandledScreen::new);
        ScreenRegistry.register(Declarer.DIRTDIAMONDSCREENHANDLER, DirtDiamondHandledScreen::new);
        ScreenRegistry.register(Declarer.DIRTDIAMONDDOUBLESCREENHANDLER, DirtDiamondDoubleHandledScreen::new);
        ScreenRegistry.register(Declarer.DIRTAMETHYSTSCREENHANDLER, DirtAmethystHandledScreen::new);
        ScreenRegistry.register(Declarer.DIRTAMETHYSTDOUBLESCREENHANDLER, DirtAmethystDoubleHandledScreen::new);

        ClientSpriteRegistryCallback.event(new Identifier("textures/atlas/chest.png")).register((atlasTexture, registry) -> {
            registry.register(new Identifier("tokenablefurnaces:entity/chest/dirt"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/dirt_left"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/dirt_right"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/christmas"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/christmas_left"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/christmas_right"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/pumpkin"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/pumpkin_left"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/pumpkin_right"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/iron"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/iron_left"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/iron_right"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/gold"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/gold_left"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/gold_right"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/diamond"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/diamond_left"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/diamond_right"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/netherite"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/netherite_left"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/netherite_right"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/amethyst"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/amethyst_left"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/amethyst_right"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/trapped/dirt"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/trapped/dirt_left"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/trapped/dirt_right"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/trapped/christmas"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/trapped/christmas_left"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/trapped/christmas_right"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/trapped/pumpkin"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/trapped/pumpkin_left"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/trapped/pumpkin_right"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/trapped/iron"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/trapped/iron_left"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/trapped/iron_right"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/trapped/gold"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/trapped/gold_left"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/trapped/gold_right"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/trapped/diamond"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/trapped/diamond_left"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/trapped/diamond_right"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/trapped/netherite"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/trapped/netherite_left"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/trapped/netherite_right"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/trapped/amethyst"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/trapped/amethyst_left"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/trapped/amethyst_right"));

            registry.register(new Identifier("tokenablefurnaces:entity/chest/dirt_iron"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/dirt_iron_left"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/dirt_iron_right"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/dirt_gold"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/dirt_gold_left"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/dirt_gold_right"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/dirt_diamond"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/dirt_diamond_left"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/dirt_diamond_right"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/dirt_netherite"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/dirt_netherite_left"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/dirt_netherite_right"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/dirt_amethyst"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/dirt_amethyst_left"));
            registry.register(new Identifier("tokenablefurnaces:entity/chest/dirt_amethyst_right"));

        });
        BlockEntityRendererRegistry.INSTANCE.register(Declarer.DIRTCHESTENTITY, ExtraChestEntityRenderer::new);
        BlockEntityRendererRegistry.INSTANCE.register(Declarer.CHRISTMASCHESTENTITY, ExtraChestEntityRenderer::new);
        BlockEntityRendererRegistry.INSTANCE.register(Declarer.PUMPKINCHESTENTITY, ExtraChestEntityRenderer::new);
        BlockEntityRendererRegistry.INSTANCE.register(Declarer.IRONCHESTENTITY, ExtraChestEntityRenderer::new);
        BlockEntityRendererRegistry.INSTANCE.register(Declarer.GOLDCHESTENTITY, ExtraChestEntityRenderer::new);
        BlockEntityRendererRegistry.INSTANCE.register(Declarer.DIAMONDCHESTENTITY, ExtraChestEntityRenderer::new);
        BlockEntityRendererRegistry.INSTANCE.register(Declarer.NETHERITECHESTENTITY, ExtraChestEntityRenderer::new);
        BlockEntityRendererRegistry.INSTANCE.register(Declarer.AMETHYSTCHESTENTITY, ExtraChestEntityRenderer::new);
        BlockEntityRendererRegistry.INSTANCE.register(Declarer.DIRTTRAPPEDCHESTENTITY, ExtraChestEntityRenderer::new);
        BlockEntityRendererRegistry.INSTANCE.register(Declarer.CHRISTMASTRAPPEDCHESTENTITY, ExtraChestEntityRenderer::new);
        BlockEntityRendererRegistry.INSTANCE.register(Declarer.PUMPKINTRAPPEDCHESTENTITY, ExtraChestEntityRenderer::new);
        BlockEntityRendererRegistry.INSTANCE.register(Declarer.IRONTRAPPEDCHESTENTITY, ExtraChestEntityRenderer::new);
        BlockEntityRendererRegistry.INSTANCE.register(Declarer.GOLDTRAPPEDCHESTENTITY, ExtraChestEntityRenderer::new);
        BlockEntityRendererRegistry.INSTANCE.register(Declarer.DIAMONDTRAPPEDCHESTENTITY, ExtraChestEntityRenderer::new);
        BlockEntityRendererRegistry.INSTANCE.register(Declarer.NETHERITETRAPPEDCHESTENTITY, ExtraChestEntityRenderer::new);
        BlockEntityRendererRegistry.INSTANCE.register(Declarer.AMETHYSTTRAPPEDCHESTENTITY, ExtraChestEntityRenderer::new);

        BlockEntityRendererRegistry.INSTANCE.register(Declarer.DIRTIRONCHESTENTITY, ExtraChestEntityRenderer::new);
        BlockEntityRendererRegistry.INSTANCE.register(Declarer.DIRTGOLDCHESTENTITY, ExtraChestEntityRenderer::new);
        BlockEntityRendererRegistry.INSTANCE.register(Declarer.DIRTDIAMONDCHESTENTITY, ExtraChestEntityRenderer::new);
        BlockEntityRendererRegistry.INSTANCE.register(Declarer.DIRTNETHERITECHESTENTITY, ExtraChestEntityRenderer::new);
        BlockEntityRendererRegistry.INSTANCE.register(Declarer.DIRTAMETHYSTCHESTENTITY, ExtraChestEntityRenderer::new);

        BuiltinItemRendererRegistry.INSTANCE.register(Declarer.dirtChest, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            MinecraftClient.getInstance().getBlockEntityRenderDispatcher().renderEntity(new DirtChestEntity(BlockPos.ORIGIN, Declarer.dirtChestBlock.getDefaultState()), matrices, vertexConsumers, light, overlay);
        });
        BuiltinItemRendererRegistry.INSTANCE.register(Declarer.christmasChest, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            MinecraftClient.getInstance().getBlockEntityRenderDispatcher().renderEntity(new ChristmasChestEntity(BlockPos.ORIGIN, Declarer.christmasChestBlock.getDefaultState()), matrices, vertexConsumers, light, overlay);
        });
        BuiltinItemRendererRegistry.INSTANCE.register(Declarer.pumpkinChest, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            MinecraftClient.getInstance().getBlockEntityRenderDispatcher().renderEntity(new PumpkinChestEntity(BlockPos.ORIGIN, Declarer.pumpkinChestBlock.getDefaultState()), matrices, vertexConsumers, light, overlay);
        });
        BuiltinItemRendererRegistry.INSTANCE.register(Declarer.ironChest, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            MinecraftClient.getInstance().getBlockEntityRenderDispatcher().renderEntity(new IronChestEntity(BlockPos.ORIGIN, Declarer.ironChestBlock.getDefaultState()), matrices, vertexConsumers, light, overlay);
        });
        BuiltinItemRendererRegistry.INSTANCE.register(Declarer.goldChest, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            MinecraftClient.getInstance().getBlockEntityRenderDispatcher().renderEntity(new GoldChestEntity(BlockPos.ORIGIN, Declarer.goldChestBlock.getDefaultState()), matrices, vertexConsumers, light, overlay);
        });
        BuiltinItemRendererRegistry.INSTANCE.register(Declarer.diamondChest, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            MinecraftClient.getInstance().getBlockEntityRenderDispatcher().renderEntity(new DiamondChestEntity(BlockPos.ORIGIN, Declarer.diamondChestBlock.getDefaultState()), matrices, vertexConsumers, light, overlay);
        });
        BuiltinItemRendererRegistry.INSTANCE.register(Declarer.netheriteChest, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            MinecraftClient.getInstance().getBlockEntityRenderDispatcher().renderEntity(new NetheriteChestEntity(BlockPos.ORIGIN, Declarer.netheriteChestBlock.getDefaultState()), matrices, vertexConsumers, light, overlay);
        });
        BuiltinItemRendererRegistry.INSTANCE.register(Declarer.amethystChest, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            MinecraftClient.getInstance().getBlockEntityRenderDispatcher().renderEntity(new AmethystChestEntity(BlockPos.ORIGIN, Declarer.amethystChestBlock.getDefaultState()), matrices, vertexConsumers, light, overlay);
        });
        BuiltinItemRendererRegistry.INSTANCE.register(Declarer.dirtTrappedChest, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            MinecraftClient.getInstance().getBlockEntityRenderDispatcher().renderEntity(new DirtTrappedChestEntity(BlockPos.ORIGIN, Declarer.dirtTrappedChestBlock.getDefaultState()), matrices, vertexConsumers, light, overlay);
        });
        BuiltinItemRendererRegistry.INSTANCE.register(Declarer.christmasTrappedChest, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            MinecraftClient.getInstance().getBlockEntityRenderDispatcher().renderEntity(new ChristmasTrappedChestEntity(BlockPos.ORIGIN, Declarer.christmasTrappedChestBlock.getDefaultState()), matrices, vertexConsumers, light, overlay);
        });
        BuiltinItemRendererRegistry.INSTANCE.register(Declarer.pumpkinTrappedChest, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            MinecraftClient.getInstance().getBlockEntityRenderDispatcher().renderEntity(new PumpkinTrappedChestEntity(BlockPos.ORIGIN, Declarer.pumpkinTrappedChestBlock.getDefaultState()), matrices, vertexConsumers, light, overlay);
        });
        BuiltinItemRendererRegistry.INSTANCE.register(Declarer.ironTrappedChest, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            MinecraftClient.getInstance().getBlockEntityRenderDispatcher().renderEntity(new IronTrappedChestEntity(BlockPos.ORIGIN, Declarer.ironTrappedChestBlock.getDefaultState()), matrices, vertexConsumers, light, overlay);
        });
        BuiltinItemRendererRegistry.INSTANCE.register(Declarer.goldTrappedChest, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            MinecraftClient.getInstance().getBlockEntityRenderDispatcher().renderEntity(new GoldTrappedChestEntity(BlockPos.ORIGIN, Declarer.goldTrappedChestBlock.getDefaultState()), matrices, vertexConsumers, light, overlay);
        });
        BuiltinItemRendererRegistry.INSTANCE.register(Declarer.diamondTrappedChest, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            MinecraftClient.getInstance().getBlockEntityRenderDispatcher().renderEntity(new DiamondTrappedChestEntity(BlockPos.ORIGIN, Declarer.diamondTrappedChestBlock.getDefaultState()), matrices, vertexConsumers, light, overlay);
        });
        BuiltinItemRendererRegistry.INSTANCE.register(Declarer.netheriteTrappedChest, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            MinecraftClient.getInstance().getBlockEntityRenderDispatcher().renderEntity(new NetheriteTrappedChestEntity(BlockPos.ORIGIN, Declarer.netheriteTrappedChestBlock.getDefaultState()), matrices, vertexConsumers, light, overlay);
        });
        BuiltinItemRendererRegistry.INSTANCE.register(Declarer.amethystTrappedChest, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            MinecraftClient.getInstance().getBlockEntityRenderDispatcher().renderEntity(new AmethystTrappedChestEntity(BlockPos.ORIGIN, Declarer.amethystTrappedChestBlock.getDefaultState()), matrices, vertexConsumers, light, overlay);
        });

        BuiltinItemRendererRegistry.INSTANCE.register(Declarer.dirtIronChest, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            MinecraftClient.getInstance().getBlockEntityRenderDispatcher().renderEntity(new DirtIronChestEntity(BlockPos.ORIGIN, Declarer.dirtIronChestBlock.getDefaultState()), matrices, vertexConsumers, light, overlay);
        });
        BuiltinItemRendererRegistry.INSTANCE.register(Declarer.dirtGoldChest, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            MinecraftClient.getInstance().getBlockEntityRenderDispatcher().renderEntity(new DirtGoldChestEntity(BlockPos.ORIGIN, Declarer.dirtGoldChestBlock.getDefaultState()), matrices, vertexConsumers, light, overlay);
        });
        BuiltinItemRendererRegistry.INSTANCE.register(Declarer.dirtDiamondChest, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            MinecraftClient.getInstance().getBlockEntityRenderDispatcher().renderEntity(new DirtDiamondChestEntity(BlockPos.ORIGIN, Declarer.dirtDiamondChestBlock.getDefaultState()), matrices, vertexConsumers, light, overlay);
        });
        BuiltinItemRendererRegistry.INSTANCE.register(Declarer.dirtNetheriteChest, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            MinecraftClient.getInstance().getBlockEntityRenderDispatcher().renderEntity(new DirtNetheriteChestEntity(BlockPos.ORIGIN, Declarer.dirtNetheriteChestBlock.getDefaultState()), matrices, vertexConsumers, light, overlay);
        });
        BuiltinItemRendererRegistry.INSTANCE.register(Declarer.dirtAmethystChest, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            MinecraftClient.getInstance().getBlockEntityRenderDispatcher().renderEntity(new DirtAmethystChestEntity(BlockPos.ORIGIN, Declarer.dirtAmethystChestBlock.getDefaultState()), matrices, vertexConsumers, light, overlay);
        });

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
            MinecraftClient.getInstance().getBlockEntityRenderDispatcher().renderEntity(new IronShulkerEntity(BlockPos.ORIGIN, Declarer.ironShulkerBlock.getDefaultState()), matrices, vertexConsumers, light, overlay);
        });
        BuiltinItemRendererRegistry.INSTANCE.register(Declarer.goldShulker, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            MinecraftClient.getInstance().getBlockEntityRenderDispatcher().renderEntity(new GoldShulkerEntity(BlockPos.ORIGIN, Declarer.goldShulkerBlock.getDefaultState()), matrices, vertexConsumers, light, overlay);
        });
        BuiltinItemRendererRegistry.INSTANCE.register(Declarer.diamondShulker, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            MinecraftClient.getInstance().getBlockEntityRenderDispatcher().renderEntity(new DiamondShulkerEntity(BlockPos.ORIGIN, Declarer.diamondShulkerBlock.getDefaultState()), matrices, vertexConsumers, light, overlay);
        });
        BuiltinItemRendererRegistry.INSTANCE.register(Declarer.netheriteShulker, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            MinecraftClient.getInstance().getBlockEntityRenderDispatcher().renderEntity(new NetheriteShulkerEntity(BlockPos.ORIGIN, Declarer.netheriteShulkerBlock.getDefaultState()), matrices, vertexConsumers, light, overlay);
        });
        BuiltinItemRendererRegistry.INSTANCE.register(Declarer.amethystShulker, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            MinecraftClient.getInstance().getBlockEntityRenderDispatcher().renderEntity(new AmethystShulkerEntity(BlockPos.ORIGIN, Declarer.amethystShulkerBlock.getDefaultState()), matrices, vertexConsumers, light, overlay);
        });

        FabricModelPredicateProviderRegistry.register(Declarer.ironBundle, new Identifier("filled"), (stack, world, entity, seed) -> {
            return ExtraBundleItem.getAmountFilled(stack);
        });
        FabricModelPredicateProviderRegistry.register(Declarer.goldBundle, new Identifier("filled"), (stack, world, entity, seed) -> {
            return ExtraBundleItem.getAmountFilled(stack);
        });
        FabricModelPredicateProviderRegistry.register(Declarer.diamondBundle, new Identifier("filled"), (stack, world, entity, seed) -> {
            return ExtraBundleItem.getAmountFilled(stack);
        });
        FabricModelPredicateProviderRegistry.register(Declarer.netheriteBundle, new Identifier("filled"), (stack, world, entity, seed) -> {
            return ExtraBundleItem.getAmountFilled(stack);
        });
        FabricModelPredicateProviderRegistry.register(Declarer.amethystBundle, new Identifier("filled"), (stack, world, entity, seed) -> {
            return ExtraBundleItem.getAmountFilled(stack);
        });
    }
}
