package website.skylorbeck.minecraft.tokenablefurnaces;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigHolder;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.ActionResult;
import website.skylorbeck.minecraft.tokenablefurnaces.config.ModConfig;

public class Tokenablefurnaces implements ModInitializer {
    @Override
    public void onInitialize() {
        ConfigHolder<ModConfig> configHolder = AutoConfig.register(ModConfig.class, GsonConfigSerializer::new);//register config asap to prevent errors down the line
        configHolder.getConfig();
        Ref.getSettings();//gets all settings at launch to save on file reads. Certain settings would read every frame(!) insanely bad
        Registrar.register();
        configHolder.registerSaveListener((manager, data) ->{//listen for config file changes
            Ref.getSomeSettings();//gets settings that don't need a full restart to properly do.
            return ActionResult.SUCCESS;
        });
    }
}
//todo
// known issues:

//todo
// shift click weirdness



// Amethyst Chest
//      Amethyst token
//          8 Amethyst Shards
//          Diamond Token
//              6 Glass
//              2 Diamond
//              Gold token
//                  8 Gold Ingots
//                  Iron token
//                      8 Iron Ingot
//                      1 Planks
//      Diamond Chest
//          Diamond Token
//              6 Glass
//              2 Diamond
//              Gold token
//                  8 Gold Ingots
//                  Iron token
//                      8 Iron Ingot
//                      1 Planks
//          Gold Chest
//              Gold token
//                  8 Gold Ingots
//                  Iron token
//                      8 Iron Ingot
//                      1 Planks
//              Iron Chest
//                  Iron token
//                      8 Iron Ingot
//                      1 Planks
//                  Chest
//                      8 Planks
// Total
// 12 Planks
// 32 Iron Ingot
// 24 Gold Ingot
// 4 Diamond
// 12 Glass
// 8 Amethyst Shards