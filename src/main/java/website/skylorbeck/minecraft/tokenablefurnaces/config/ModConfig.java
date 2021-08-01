package website.skylorbeck.minecraft.tokenablefurnaces.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = "tokenablefurnaces")
public class ModConfig implements ConfigData {
    @ConfigEntry.BoundedDiscrete(min=1,max = 8)
    public int hopperMulti = 1;
    public boolean tokens = true;
    @ConfigEntry.Gui.CollapsibleObject()
    public upgrades upgrades = new upgrades();
    @ConfigEntry.Gui.CollapsibleObject()
    public blockToggles blockToggles = new blockToggles();


    public static class upgrades {
        public boolean canUpgradeBarrels = true;
        public boolean canUpgradeChests = true;
        public boolean canUpgradeTrapped = true;
        public boolean canUpgradeFurnaces = true;
        public boolean canUpgradeBlast = true;
        public boolean canUpgradeSmoker = true;
        public boolean canUpgradeHoppers = true;
        public boolean canUpgradeShulkers = true;
    }

    public static class blockToggles {
        public boolean barrels = true;
        public boolean chests = true;
        public boolean trapped = true;
        public boolean furnaces = true;
        public boolean blasts = true;
        public boolean smokers = true;
        public boolean hoppers = true;
        public boolean shulkers = true;
        public boolean bundles = true;
    }

}
