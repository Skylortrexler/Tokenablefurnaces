package website.skylorbeck.minecraft.tokenablefurnaces;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.ExtraBlastFurnaceBlockEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.ExtraFurnaceBlockEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.ExtraSmokerBlockEntity;

public class Registrar {
    public static void register(){
            Declarer.EXTRA_FURNACE_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                    Ref.MODID+":furnace",
                    FabricBlockEntityTypeBuilder.create(ExtraFurnaceBlockEntity::new,
                    ).build(null));
            Declarer.EXTRA_BLAST_FURNACE_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                    Ref.MODID+":blast_furnace",
                    FabricBlockEntityTypeBuilder.create(ExtraBlastFurnaceBlockEntity::new,
                    ).build(null));
            Declarer.EXTRA_SMOKER_FURNACE_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                    Ref.MODID+":smoker",
                    FabricBlockEntityTypeBuilder.create(ExtraSmokerBlockEntity::new,
                    ).build(null));
    }
    public static void regItem(String name, Item itemid){
        Registry.register(Registry.ITEM, new Identifier(Ref.MODID, name), itemid);
    }
    public static void regBlock(String name, Block blockid){
        Registry.register(Registry.BLOCK, new Identifier(Ref.MODID, name), blockid);
    }
}
