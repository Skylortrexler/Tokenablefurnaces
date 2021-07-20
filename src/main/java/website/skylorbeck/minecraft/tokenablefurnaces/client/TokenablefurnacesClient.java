package website.skylorbeck.minecraft.tokenablefurnaces.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendereregistry.v1.BlockEntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.BuiltinItemRendererRegistry;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.fabricmc.fabric.impl.client.rendering.BuiltinItemRendererRegistryImpl;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.item.BuiltinModelItemRenderer;
import net.minecraft.client.render.model.json.ModelTransformation;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;
import website.skylorbeck.minecraft.tokenablefurnaces.chests.ExtraChestEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.chests.ExtraChestEntityRenderer;
import website.skylorbeck.minecraft.tokenablefurnaces.chests.IronChestEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.chests.IronHandledScreen;

@net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
public class TokenablefurnacesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ScreenRegistry.register(Declarer.EXTRASCREENHANDLER, IronHandledScreen::new);
        ClientSpriteRegistryCallback.event(new Identifier("textures/atlas/chest.png")).register((atlasTexture, registry) -> {
            registry.register(new Identifier("tokenablefurnaces:entity/chest/iron"));
        });
        BlockEntityRendererRegistry.INSTANCE.register(Declarer.IRONCHESTENTITY, ExtraChestEntityRenderer::new);
        BlockItem item = Declarer.ironChest;
        ChestBlockEntity ironChestEntity = new IronChestEntity(BlockPos.ORIGIN,Declarer.ironChestBlock.getDefaultState());
        BuiltinItemRendererRegistry.INSTANCE.register(item, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            MinecraftClient.getInstance().getBlockEntityRenderDispatcher().renderEntity(ironChestEntity,matrices,vertexConsumers,light,overlay);});
    }
}
