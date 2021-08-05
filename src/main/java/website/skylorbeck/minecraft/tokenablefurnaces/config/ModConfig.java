package website.skylorbeck.minecraft.tokenablefurnaces.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = "tokenablefurnaces")
public class ModConfig implements ConfigData {
    @ConfigEntry.BoundedDiscrete(min=1,max = 8)
    @ConfigEntry.Gui.Tooltip
    public int hopperMulti = 1;
    @ConfigEntry.Gui.RequiresRestart
    public boolean tokens = true;
    @ConfigEntry.Gui.Tooltip
    public boolean furnaceEfficiency = false;
//    @ConfigEntry.Gui.Tooltip
//    public boolean doubleLatch = false;
    @ConfigEntry.Gui.CollapsibleObject()
    @ConfigEntry.Gui.Tooltip
    public upgrades upgrades = new upgrades();
    @ConfigEntry.Gui.CollapsibleObject()
    @ConfigEntry.Gui.Tooltip
    public blockToggles blockToggles = new blockToggles();


    public static class upgrades {
        @ConfigEntry.Gui.RequiresRestart
        public boolean canUpgradeBarrels = true;
        @ConfigEntry.Gui.RequiresRestart
        public boolean canUpgradeChests = true;
        @ConfigEntry.Gui.RequiresRestart
        public boolean canUpgradeTrapped = true;
        @ConfigEntry.Gui.RequiresRestart
        public boolean canUpgradeFurnaces = true;
        @ConfigEntry.Gui.RequiresRestart
        public boolean canUpgradeBlast = true;
        @ConfigEntry.Gui.RequiresRestart
        public boolean canUpgradeSmoker = true;
        @ConfigEntry.Gui.RequiresRestart
        public boolean canUpgradeHoppers = true;
        @ConfigEntry.Gui.RequiresRestart
        public boolean canUpgradeShulkers = true;
    }

    public static class blockToggles {
        @ConfigEntry.Gui.RequiresRestart
        public boolean barrels = true;
        @ConfigEntry.Gui.RequiresRestart
        public boolean chests = true;
        @ConfigEntry.Gui.RequiresRestart
        public boolean trapped = true;
        @ConfigEntry.Gui.RequiresRestart
        public boolean furnaces = true;
        @ConfigEntry.Gui.RequiresRestart
        public boolean blasts = true;
        @ConfigEntry.Gui.RequiresRestart
        public boolean smokers = true;
        @ConfigEntry.Gui.RequiresRestart
        public boolean hoppers = true;
        @ConfigEntry.Gui.RequiresRestart
        public boolean shulkers = true;
        @ConfigEntry.Gui.RequiresRestart
        public boolean bundles = true;
    }

}
