package website.skylorbeck.minecraft.tokenablefurnaces.chests;

import net.minecraft.client.gui.Drawable;
import net.minecraft.client.gui.DrawableHelper;
import net.minecraft.client.gui.Element;
import net.minecraft.client.gui.Selectable;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.screen.narration.NarrationMessageBuilder;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;
import website.skylorbeck.minecraft.tokenablefurnaces.Screenhandlers.AbstractScreenHandler;

public class ChestTabWidget extends DrawableHelper implements Drawable, Element, Selectable {
    protected ChestTabClickable tab1;
    protected ChestTabClickable tab2;
    protected ChestTabClickable tab3;
    protected ChestTabClickable tab4;
    protected ChestTabClickable tab5;
    protected ChestTabClickable tab6;
    protected ChestTabClickable tab7;
    protected ChestTabClickable tab8;
    private HandledScreen<?> screen;
    private int x;
    private int y;
    private int w;
    private int h;
    private int tabCount;

    public ChestTabWidget(HandledScreen<?> screen, int x, int y, int w, int h,int tabCount) {
    this.screen = screen;
    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
    this.tabCount = tabCount;
    this.init();
    }

    public void init() {
        tab1 = new ChestTabClickable(this.x, this.y + 8, Text.of("Tab 1"));
        tab1.setToggled(true);
        tab2 = new ChestTabClickable(this.x, this.y + 24, Text.of("Tab 2"));
        tab3 = new ChestTabClickable(this.x, this.y + 40, Text.of("Tab 3"));
        tab4 = new ChestTabClickable(this.x, this.y + 56, Text.of("Tab 4"));
        tab5 = new ChestTabClickable(this.x, this.y + 72, Text.of("Tab 5"));
        tab6 = new ChestTabClickable(this.x, this.y + 88, Text.of("Tab 6"));
        tab7 = new ChestTabClickable(this.x, this.y + 104, Text.of("Tab 7"));
        tab8 = new ChestTabClickable(this.x, this.y + 120, Text.of("Tab 8"));
    }
    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        switch (tabCount){
            case 8:
                tab8.render(matrices,mouseX,mouseY,delta);
            case 7:
                tab7.render(matrices,mouseX,mouseY,delta);
            case 6:
                tab6.render(matrices,mouseX,mouseY,delta);
            case 5:
                tab5.render(matrices,mouseX,mouseY,delta);
            case 4:
                tab4.render(matrices,mouseX,mouseY,delta);
            case 3:
                tab3.render(matrices,mouseX,mouseY,delta);
            case 2:
                tab2.render(matrices,mouseX,mouseY,delta);
            case 1:
                tab1.render(matrices,mouseX,mouseY,delta);
            case 0:
                break;
        }
    }

    @Override
    public SelectionType getType() {
        return null;
    }

    @Override
    public boolean isNarratable() {
        return Selectable.super.isNarratable();
    }

    @Override
    public void appendNarrations(NarrationMessageBuilder builder) {

    }

    @Override
    public void mouseMoved(double mouseX, double mouseY) {
        Element.super.mouseMoved(mouseX, mouseY);
    }

    @Override
    public boolean mouseClicked(double mouseX, double mouseY, int button) {
        if (tabCount > 0 && tab1.mouseClicked(mouseX,mouseY,button)){
            tab1.setToggled(true);
            tab2.setToggled(false);
            tab3.setToggled(false);
            tab4.setToggled(false);
            tab5.setToggled(false);
            tab6.setToggled(false);
            tab7.setToggled(false);
            tab8.setToggled(false);
            ((AbstractScreenHandler)screen.getScreenHandler()).setTab(0);
        } else if (tabCount > 1 && tab2.mouseClicked(mouseX,mouseY,button)){
            tab1.setToggled(false);
            tab2.setToggled(true);
            tab3.setToggled(false);
            tab4.setToggled(false);
            tab5.setToggled(false);
            tab6.setToggled(false);
            tab7.setToggled(false);
            tab8.setToggled(false);
            ((AbstractScreenHandler)screen.getScreenHandler()).setTab(1);
        } else if (tabCount > 2 && tab3.mouseClicked(mouseX,mouseY,button)){
            tab1.setToggled(false);
            tab2.setToggled(false);
            tab3.setToggled(true);
            tab4.setToggled(false);
            tab5.setToggled(false);
            tab6.setToggled(false);
            tab7.setToggled(false);
            tab8.setToggled(false);
            ((AbstractScreenHandler)screen.getScreenHandler()).setTab(2);
        } else if (tabCount > 3 && tab4.mouseClicked(mouseX,mouseY,button)){
            tab1.setToggled(false);
            tab2.setToggled(false);
            tab3.setToggled(false);
            tab4.setToggled(true);
            tab5.setToggled(false);
            tab6.setToggled(false);
            tab7.setToggled(false);
            tab8.setToggled(false);
            ((AbstractScreenHandler)screen.getScreenHandler()).setTab(3);
        } else if (tabCount > 4 && tab5.mouseClicked(mouseX,mouseY,button)){
            tab1.setToggled(false);
            tab2.setToggled(false);
            tab3.setToggled(false);
            tab4.setToggled(false);
            tab5.setToggled(true);
            tab6.setToggled(false);
            tab7.setToggled(false);
            tab8.setToggled(false);
            ((AbstractScreenHandler)screen.getScreenHandler()).setTab(4);
        } else if (tabCount > 5 && tab6.mouseClicked(mouseX,mouseY,button)){
            tab1.setToggled(false);
            tab2.setToggled(false);
            tab3.setToggled(false);
            tab4.setToggled(false);
            tab5.setToggled(false);
            tab6.setToggled(true);
            tab7.setToggled(false);
            tab8.setToggled(false);
            ((AbstractScreenHandler)screen.getScreenHandler()).setTab(5);
        } else if (tabCount > 6 && tab7.mouseClicked(mouseX,mouseY,button)){
            tab1.setToggled(false);
            tab2.setToggled(false);
            tab3.setToggled(false);
            tab4.setToggled(false);
            tab5.setToggled(false);
            tab6.setToggled(false);
            tab7.setToggled(true);
            tab8.setToggled(false);
            ((AbstractScreenHandler)screen.getScreenHandler()).setTab(6);
        } else if (tabCount > 7 && tab8.mouseClicked(mouseX,mouseY,button)){
            tab1.setToggled(false);
            tab2.setToggled(false);
            tab3.setToggled(false);
            tab4.setToggled(false);
            tab5.setToggled(false);
            tab6.setToggled(false);
            tab7.setToggled(false);
            tab8.setToggled(true);
            ((AbstractScreenHandler)screen.getScreenHandler()).setTab(7);
        }
        return Element.super.mouseClicked(mouseX, mouseY, button);
    }

    @Override
    public boolean mouseReleased(double mouseX, double mouseY, int button) {
        return Element.super.mouseReleased(mouseX, mouseY, button);
    }

    @Override
    public boolean mouseDragged(double mouseX, double mouseY, int button, double deltaX, double deltaY) {
        return Element.super.mouseDragged(mouseX, mouseY, button, deltaX, deltaY);
    }

    @Override
    public boolean mouseScrolled(double mouseX, double mouseY, double amount) {
        return Element.super.mouseScrolled(mouseX, mouseY, amount);
    }

    @Override
    public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
        return Element.super.keyPressed(keyCode, scanCode, modifiers);
    }

    @Override
    public boolean keyReleased(int keyCode, int scanCode, int modifiers) {
        return Element.super.keyReleased(keyCode, scanCode, modifiers);
    }

    @Override
    public boolean charTyped(char chr, int modifiers) {
        return Element.super.charTyped(chr, modifiers);
    }

    @Override
    public boolean changeFocus(boolean lookForwards) {
        return Element.super.changeFocus(lookForwards);
    }

    @Override
    public boolean isMouseOver(double mouseX, double mouseY) {
        return Element.super.isMouseOver(mouseX, mouseY);
    }
}
