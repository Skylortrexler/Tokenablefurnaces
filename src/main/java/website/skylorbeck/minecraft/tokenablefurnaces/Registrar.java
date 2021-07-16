package website.skylorbeck.minecraft.tokenablefurnaces;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.amethyst.AmethystExtraBlastEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.amethyst.AmethystExtraFurnaceEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.amethyst.AmethystExtraSmokerEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.diamond.DiamondExtraBlastEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.diamond.DiamondExtraFurnaceEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.diamond.DiamondExtraSmokerEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.gold.GoldExtraBlastEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.gold.GoldExtraFurnaceEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.gold.GoldExtraSmokerEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.iron.IronExtraBlastEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.iron.IronExtraFurnaceEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.iron.IronExtraSmokerEntity;

public class Registrar {
    public static void register() {
        Declarer.IRONBLASTENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":ironblast",
                FabricBlockEntityTypeBuilder.create(IronExtraBlastEntity::new,
                        Declarer.ironBlastBlock
                ).build(null));
        Declarer.IRONSMOKERENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":ironsmoker",
                FabricBlockEntityTypeBuilder.create(IronExtraSmokerEntity::new,
                        Declarer.ironSmokerBlock
                ).build(null));
        Declarer.IRONFURNACEENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":ironfurnace",
                FabricBlockEntityTypeBuilder.create(IronExtraFurnaceEntity::new,
                        Declarer.ironFurnaceBlock
                )
                        .build(null));

        Declarer.GOLDBLASTENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":goldblast",
                FabricBlockEntityTypeBuilder.create(GoldExtraBlastEntity::new,
                        Declarer.goldBlastBlock
                ).build(null));
        Declarer.GOLDSMOKERENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":goldsmoker",
                FabricBlockEntityTypeBuilder.create(GoldExtraSmokerEntity::new,
                        Declarer.goldSmokerBlock
                ).build(null));
        Declarer.GOLDFURNACEENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":goldfurnace",
                FabricBlockEntityTypeBuilder.create(GoldExtraFurnaceEntity::new,
                        Declarer.goldFurnaceBlock
                ).build(null));


        Declarer.DIAMONDBLASTENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":diamondblast",
                FabricBlockEntityTypeBuilder.create(DiamondExtraBlastEntity::new,
                        Declarer.diamondBlastBlock,
                        Declarer.netheriteBlastBlock
                ).build(null));
        Declarer.DIAMONDSMOKERENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":diamondsmoker",
                FabricBlockEntityTypeBuilder.create(DiamondExtraSmokerEntity::new,
                        Declarer.diamondSmokerBlock,
                        Declarer.netheriteSmokerBlock
                ).build(null));
        Declarer.DIAMONDFURNACEENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":diamondfurnace",
                FabricBlockEntityTypeBuilder.create(DiamondExtraFurnaceEntity::new,
                        Declarer.diamondFurnaceBlock,
                        Declarer.netheriteFurnaceBlock
                ).build(null));

        
        Declarer.AMETHYSTBLASTENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":amethystblast",
                FabricBlockEntityTypeBuilder.create(AmethystExtraBlastEntity::new,
                        Declarer.amethystBlastBlock
                ).build(null));
        Declarer.AMETHYSTSMOKERENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":amethystsmoker",
                FabricBlockEntityTypeBuilder.create(AmethystExtraSmokerEntity::new,
                        Declarer.amethystSmokerBlock
                ).build(null));
        Declarer.AMETHYSTFURNACEENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":amethystfurnace",
                FabricBlockEntityTypeBuilder.create(AmethystExtraFurnaceEntity::new,
                        Declarer.amethystFurnaceBlock
                ).build(null));


        regBlock("ironfurnace", Declarer.ironFurnaceBlock);
        regItem("ironfurnaceitem", Declarer.ironFurnace);
        regBlock("ironblast", Declarer.ironBlastBlock);
        regItem("ironblastitem", Declarer.ironBlast);
        regBlock("ironsmoker", Declarer.ironSmokerBlock);
        regItem("ironsmokeritem", Declarer.ironSmoker);

        regBlock("goldfurnace", Declarer.goldFurnaceBlock);
        regItem("goldfurnaceitem", Declarer.goldFurnace);
        regBlock("goldblast", Declarer.goldBlastBlock);
        regItem("goldblastitem", Declarer.goldBlast);
        regBlock("goldsmoker", Declarer.goldSmokerBlock);
        regItem("goldsmokeritem", Declarer.goldSmoker);

        regBlock("diamondfurnace", Declarer.diamondFurnaceBlock);
        regItem("diamondfurnaceitem", Declarer.diamondFurnace);
        regBlock("diamondblast", Declarer.diamondBlastBlock);
        regItem("diamondblastitem", Declarer.diamondBlast);
        regBlock("diamondsmoker", Declarer.diamondSmokerBlock);
        regItem("diamondsmokeritem", Declarer.diamondSmoker);
        
        regBlock("netheritefurnace", Declarer.netheriteFurnaceBlock);
        regItem("netheritefurnaceitem", Declarer.netheriteFurnace);
        regBlock("netheriteblast", Declarer.netheriteBlastBlock);
        regItem("netheriteblastitem", Declarer.netheriteBlast);
        regBlock("netheritesmoker", Declarer.netheriteSmokerBlock);
        regItem("netheritesmokeritem", Declarer.netheriteSmoker);

        regBlock("amethystfurnace", Declarer.amethystFurnaceBlock);
        regItem("amethystfurnaceitem", Declarer.amethystFurnace);
        regBlock("amethystblast", Declarer.amethystBlastBlock);
        regItem("amethystblastitem", Declarer.amethystBlast);
        regBlock("amethystsmoker", Declarer.amethystSmokerBlock);
        regItem("amethystsmokeritem", Declarer.amethystSmoker);
    }

    public static void regItem(String name, Item itemid) {
        Registry.register(Registry.ITEM, new Identifier(Ref.MODID, name), itemid);
    }

    public static void regBlock(String name, Block blockid) {
        Registry.register(Registry.BLOCK, new Identifier(Ref.MODID, name), blockid);
    }
}
