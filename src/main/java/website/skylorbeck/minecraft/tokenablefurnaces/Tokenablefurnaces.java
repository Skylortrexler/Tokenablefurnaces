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
// backport to 1.17
//todo screenhandlers
//todo ender token
//todo ender dirt chest upgrade
//todo ender normal chest upgrade
//todo upgrade tokens