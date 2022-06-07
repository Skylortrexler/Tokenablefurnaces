package website.skylorbeck.minecraft.tokenablefurnaces;

import me.shedaniel.autoconfig.AutoConfig;
import net.fabricmc.loader.api.FabricLoader;
import website.skylorbeck.minecraft.tokenablefurnaces.config.ModConfig;

public class Ref {
    public static final String MODID = "tokenablefurnaces";
    public static ModConfig config = AutoConfig.getConfigHolder(ModConfig.class).getConfig();

    public static boolean furnaceEfficiency = false;
    public static boolean doubleLatch = false;
    public static int hopperMulti = 1;
//    public static boolean tokens = true;
//    public static boolean barrels = true;
//    public static boolean chests = true;
//    public static boolean trapped = true;
//    public static boolean furnaces = true;
//    public static boolean blasts = true;
//    public static boolean smokers = true;
//    public static boolean hoppers = true;
//    public static boolean shulkers = true;
//    public static boolean bundles = true;
//    public static boolean composters = true;
//
    public static boolean canUpgradeBarrels = true;
    public static boolean canUpgradeChests = true;
    public static boolean canUpgradeTrapped = true;
    public static boolean canUpgradeFurnaces = true;
    public static boolean canUpgradeBlast = true;
    public static boolean canUpgradeSmoker = true;
    public static boolean canUpgradeHoppers = true;
    public static boolean canUpgradeShulkers = true;

    public static boolean sentimentalityPresent = false;
    
    
    public static void getSettings() {
//        tokens = config.tokens;
//        barrels = config.blockToggles.barrels;
//        chests = config.blockToggles.chests;
//        trapped = config.blockToggles.trapped;
//        furnaces = config.blockToggles.furnaces;
//        blasts = config.blockToggles.blasts;
//        smokers = config.blockToggles.smokers;
//        hoppers = config.blockToggles.hoppers;
//        shulkers = config.blockToggles.shulkers;
//        bundles = config.blockToggles.bundles;
        sentimentalityPresent = FabricLoader.getInstance().getModContainer("sentimentality3").isPresent();
        getSomeSettings();
    }

    public static void getSomeSettings() {
        hopperMulti = config.hopperMulti;
//        doubleLatch = config.doubleLatch;
        canUpgradeBarrels = config.upgrades.canUpgradeBarrels;
        canUpgradeChests = config.upgrades.canUpgradeChests;
        canUpgradeTrapped = config.upgrades.canUpgradeTrapped;
        canUpgradeFurnaces = config.upgrades.canUpgradeFurnaces;
        canUpgradeBlast = config.upgrades.canUpgradeBlast;
        canUpgradeSmoker = config.upgrades.canUpgradeSmoker;
        canUpgradeHoppers = config.upgrades.canUpgradeHoppers;
        canUpgradeShulkers = config.upgrades.canUpgradeShulkers;
        furnaceEfficiency = config.furnaceEfficiency;
    }
}
