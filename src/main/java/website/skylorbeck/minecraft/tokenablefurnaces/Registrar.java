package website.skylorbeck.minecraft.tokenablefurnaces;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.core.ExtraBlastFurnaceBlockEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.core.ExtraFurnaceBlockEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.core.ExtraSmokerBlockEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.iron.IronExtraBlastEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.iron.IronExtraFurnaceEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.iron.IronExtraSmokerBlock;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.iron.IronExtraSmokerEntity;

public class Registrar {
    public static void register(){
            Declarer.IRONBLASTENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                    Ref.MODID+":blast_furnace",
                    FabricBlockEntityTypeBuilder.create(IronExtraBlastEntity::new,
                            Declarer.ironBlastBlock
                    ).build(null));
            Declarer.IRONSMOKERENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                    Ref.MODID+":smoker",
                    FabricBlockEntityTypeBuilder.create(IronExtraSmokerEntity::new,
                            Declarer.ironSmokerBlock
                    ).build(null));

            Declarer.IRONFURNACEENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID+":furnace",
                FabricBlockEntityTypeBuilder.create(IronExtraFurnaceEntity::new,
                        Declarer.ironFurnaceBlock
                ).build(null));

            regBlock("ironfurnace",Declarer.ironFurnaceBlock);
            regItem("ironfurnaceitem", Declarer.ironFurnace);
            regBlock("ironblast",Declarer.ironBlastBlock);
            regItem("ironblastitem", Declarer.ironBlast);
            regBlock("ironsmoker",Declarer.ironSmokerBlock);
            regItem("ironsmokeritem",Declarer.ironSmoker);
    }
    public static void regItem(String name, Item itemid){
        Registry.register(Registry.ITEM, new Identifier(Ref.MODID, name), itemid);
    }
    public static void regBlock(String name, Block blockid){
        Registry.register(Registry.BLOCK, new Identifier(Ref.MODID, name), blockid);
    }
}
