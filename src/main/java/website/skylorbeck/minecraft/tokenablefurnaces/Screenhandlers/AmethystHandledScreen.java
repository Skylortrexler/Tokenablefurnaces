package website.skylorbeck.minecraft.tokenablefurnaces.Screenhandlers;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class AmethystHandledScreen extends HandledScreen<ScreenHandler> {
    private static final Identifier TEXTURE = new Identifier("tokenablefurnaces", "textures/gui/amethyst.png");
    private int zOffset;

    public AmethystHandledScreen(ScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }


    @Override
    protected void drawBackground(MatrixStack matrices, float delta, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - backgroundWidth) / 2;
        int y = (height - backgroundHeight) / 2;
        drawTexture(matrices, x, y, 0, 0, backgroundWidth, backgroundHeight);
    }

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        renderBackground(matrices);
        super.render(matrices, mouseX, mouseY, delta);
        drawMouseoverTooltip(matrices, mouseX, mouseY);
    }

    @Override
    protected void init() {
        this.backgroundHeight = 438;
        this.backgroundWidth = 374;
        this.playerInventoryTitleY = this.backgroundHeight - 94;
        this.playerInventoryTitleX = 107;
        super.init();
    }

    @Override
    public void drawTexture(MatrixStack matrices, int x, int y, int u, int v, int width, int height) {
        drawTexture(matrices, x, y, this.zOffset, (float)u, (float)v, width, height, 512, 512);
    }
    @Override
    public int getZOffset() {
        return this.zOffset;
    }
    @Override
    public void setZOffset(int zOffset) {
        this.zOffset = zOffset;
    }
}
