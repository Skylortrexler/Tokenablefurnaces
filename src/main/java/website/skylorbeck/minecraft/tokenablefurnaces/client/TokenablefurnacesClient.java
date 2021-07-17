package website.skylorbeck.minecraft.tokenablefurnaces.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;
import website.skylorbeck.minecraft.tokenablefurnaces.chests.ExtraHandledScreen;
import website.skylorbeck.minecraft.tokenablefurnaces.chests.ExtraScreenHandler;

@net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
public class TokenablefurnacesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ScreenRegistry.register(Declarer.EXTRASCREENHANDLER, ExtraHandledScreen::new);
    }
}
