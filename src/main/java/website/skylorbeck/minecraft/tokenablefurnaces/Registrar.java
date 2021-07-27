package website.skylorbeck.minecraft.tokenablefurnaces;

import com.google.common.collect.Maps;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.item.ModelPredicateProvider;
import net.minecraft.client.item.UnclampedModelPredicateProvider;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.BundleItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import website.skylorbeck.minecraft.tokenablefurnaces.bundles.ExtraBundleItem;
import website.skylorbeck.minecraft.tokenablefurnaces.chests.*;
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
import website.skylorbeck.minecraft.tokenablefurnaces.hoppers.AmethystHopperEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.hoppers.DiamondHopperEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.hoppers.GoldHopperEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.hoppers.IronHopperEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.shulkers.*;

import java.util.Map;

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
                ).build(null));

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

        Declarer.IRONHOPPERENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":ironhopper",
                FabricBlockEntityTypeBuilder.create(IronHopperEntity::new,
                        Declarer.ironHopperBlock
                ).build(null));
        Declarer.GOLDHOPPERENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":goldhopper",
                FabricBlockEntityTypeBuilder.create(GoldHopperEntity::new,
                        Declarer.goldHopperBlock
                ).build(null));
        Declarer.DIAMONDHOPPERENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":diamondhopper",
                FabricBlockEntityTypeBuilder.create(DiamondHopperEntity::new,
                        Declarer.diamondHopperBlock,
                        Declarer.netheriteHopperBlock
                ).build(null));
        Declarer.AMETHYSTHOPPERENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":amethysthopper",
                FabricBlockEntityTypeBuilder.create(AmethystHopperEntity::new,
                        Declarer.amethystHopperBlock
                ).build(null));


        Declarer.IRONCHESTENTITY =  Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":ironchest",
                FabricBlockEntityTypeBuilder.create(IronChestEntity::new,
                        Declarer.ironChestBlock
                ).build(null));

        Declarer.GOLDCHESTENTITY =  Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":goldchest",
                FabricBlockEntityTypeBuilder.create(GoldChestEntity::new,
                        Declarer.goldChestBlock
                ).build(null));
        Declarer.DIAMONDCHESTENTITY =  Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":diamondchest",
                FabricBlockEntityTypeBuilder.create(DiamondChestEntity::new,
                        Declarer.diamondChestBlock
                ).build(null));
        Declarer.NETHERITECHESTENTITY =  Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":netheritechest",
                FabricBlockEntityTypeBuilder.create(NetheriteChestEntity::new,
                        Declarer.netheriteChestBlock
                ).build(null));
        Declarer.AMETHYSTCHESTENTITY =  Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":amethystchest",
                FabricBlockEntityTypeBuilder.create(AmethystChestEntity::new,
                        Declarer.amethystChestBlock
                ).build(null));


        Declarer.IRONSHULKERENTITY =  Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":ironshulker",
                FabricBlockEntityTypeBuilder.create(IronShulkerEntity::new,
                        Declarer.ironShulkerBlock
                ).build(null));
        Declarer.GOLDSHULKERENTITY =  Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":goldshulker",
                FabricBlockEntityTypeBuilder.create(GoldShulkerEntity::new,
                        Declarer.goldShulkerBlock
                ).build(null));
        Declarer.DIAMONDSHULKERENTITY =  Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":diamondshulker",
                FabricBlockEntityTypeBuilder.create(DiamondShulkerEntity::new,
                        Declarer.diamondShulkerBlock
                ).build(null));
        Declarer.NETHERITESHULKERENTITY =  Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":netheriteshulker",
                FabricBlockEntityTypeBuilder.create(NetheriteShulkerEntity::new,
                        Declarer.netheriteShulkerBlock
                ).build(null));
        Declarer.AMETHYSTSHULKERENTITY =  Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":amethystshulker",
                FabricBlockEntityTypeBuilder.create(AmethystShulkerEntity::new,
                        Declarer.amethystShulkerBlock
                ).build(null));

        Declarer.IRONSCREENHANDLER = ScreenHandlerRegistry.registerSimple(new Identifier(Ref.MODID+":ironscreen"), (syncId, inventory) -> new IronScreenHandler(syncId,inventory,new SimpleInventory(6*9),6,9));
        Declarer.GOLDSCREENHANDLER = ScreenHandlerRegistry.registerSimple(new Identifier(Ref.MODID+":goldscreen"), (syncId, inventory) -> new GoldScreenHandler(syncId,inventory,new SimpleInventory(6*15),6,15));
        Declarer.DIAMONDSCREENHANDLER = ScreenHandlerRegistry.registerSimple(new Identifier(Ref.MODID+":diamondscreen"), (syncId, inventory) -> new DiamondScreenHandler(syncId,inventory,new SimpleInventory(12*15),12,15));
        Declarer.AMETHYSTSCREENHANDLER = ScreenHandlerRegistry.registerSimple(new Identifier(Ref.MODID+":amethystscreen"), (syncId, inventory) -> new AmethystScreenHandler(syncId,inventory,new SimpleInventory(18*20),18,20));

        regItem("irontoken", Declarer.ironToken);
        regItem("goldtoken", Declarer.goldToken);
        regItem("diamondtoken", Declarer.diamondToken);
        regItem("netheritetoken", Declarer.netheriteToken);
        regItem("amethysttoken", Declarer.amethystToken);
        regItem("omnitoken", Declarer.omniToken);

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

        regBlock("ironhopper", Declarer.ironHopperBlock);
        regItem("ironhopperitem",Declarer.ironHopper);
        regBlock("goldhopper", Declarer.goldHopperBlock);
        regItem("goldhopperitem",Declarer.goldHopper);
        regBlock("diamondhopper", Declarer.diamondHopperBlock);
        regItem("diamondhopperitem",Declarer.diamondHopper);
        regBlock("netheritehopper", Declarer.netheriteHopperBlock);
        regItem("netheritehopperitem",Declarer.netheriteHopper);
        regBlock("amethysthopper", Declarer.amethystHopperBlock);
        regItem("amethysthopperitem",Declarer.amethystHopper);

        regBlock("ironchest", Declarer.ironChestBlock);
        regItem("ironchestitem", Declarer.ironChest);
        regBlock("goldchest", Declarer.goldChestBlock);
        regItem("goldchestitem", Declarer.goldChest);
        regBlock("diamondchest", Declarer.diamondChestBlock);
        regItem("diamondchestitem", Declarer.diamondChest);
        regBlock("netheritechest", Declarer.netheriteChestBlock);
        regItem("netheritechestitem", Declarer.netheriteChest);
        regBlock("amethystchest", Declarer.amethystChestBlock);
        regItem("amethystchestitem", Declarer.amethystChest);

        regBlock("ironshulker", Declarer.ironShulkerBlock);
        regItem("ironshulkeritem", Declarer.ironShulker);
        regBlock("goldshulker", Declarer.goldShulkerBlock);
        regItem("goldshulkeritem", Declarer.goldShulker);
        regBlock("diamondshulker", Declarer.diamondShulkerBlock);
        regItem("diamondshulkeritem", Declarer.diamondShulker);
        regBlock("netheriteshulker", Declarer.netheriteShulkerBlock);
        regItem("netheriteshulkeritem", Declarer.netheriteShulker);
        regBlock("amethystshulker", Declarer.amethystShulkerBlock);
        regItem("amethystshulkeritem", Declarer.amethystShulker);
        
        regItem("ironbundle",Declarer.ironBundle);
        regItem("goldbundle",Declarer.goldBundle);
        regItem("diamondbundle",Declarer.diamondBundle);
        regItem("netheritebundle",Declarer.netheriteBundle);
        regItem("amethystbundle",Declarer.amethystBundle);


    }

    public static void regItem(String name, Item itemid) {
        Registry.register(Registry.ITEM, new Identifier(Ref.MODID, name), itemid);
    }

    public static void regBlock(String name, Block blockid) {
        Registry.register(Registry.BLOCK, new Identifier(Ref.MODID, name), blockid);
    }


}
