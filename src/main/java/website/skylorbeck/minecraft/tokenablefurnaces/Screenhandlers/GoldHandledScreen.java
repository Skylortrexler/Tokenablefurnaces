package website.skylorbeck.minecraft.tokenablefurnaces.Screenhandlers;

import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import website.skylorbeck.minecraft.skylorlib.storage.AbstractHandledScreen;
import website.skylorbeck.minecraft.skylorlib.storage.ChestTabWidget;

public class GoldHandledScreen extends AbstractHandledScreen {

    private int zOffset;

    public GoldHandledScreen(ScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }

    @Override
    protected void init() {
        super.init();
        super.tabWidget = new ChestTabWidget(this, (width - backgroundWidth) / 2,(height - backgroundHeight) / 2, backgroundWidth, backgroundHeight,2);
    }
}
