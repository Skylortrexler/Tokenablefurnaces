package website.skylorbeck.minecraft.tokenablefurnaces.Screenhandlers;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import website.skylorbeck.minecraft.tokenablefurnaces.chests.ChestTabWidget;

public class AmethystHandledScreen extends AbstractHandledScreen {

    public AmethystHandledScreen(ScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }
    @Override
    protected void init() {
        super.init();
        super.tabWidget = new ChestTabWidget(this, (width - backgroundWidth) / 2,(height - backgroundHeight) / 2, backgroundWidth, backgroundHeight,8);
    }
}
