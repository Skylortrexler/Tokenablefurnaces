package website.skylorbeck.minecraft.tokenablefurnaces;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.block.Block;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import website.skylorbeck.minecraft.tokenablefurnaces.Screenhandlers.*;
import website.skylorbeck.minecraft.tokenablefurnaces.barrels.*;
import website.skylorbeck.minecraft.tokenablefurnaces.chests.*;
import website.skylorbeck.minecraft.tokenablefurnaces.chests.trapped.*;
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


        Declarer.DIRTCHESTENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":dirtchest",
                FabricBlockEntityTypeBuilder.create(DirtChestEntity::new,
                        Declarer.dirtChestBlock
                ).build(null));
        Declarer.CHRISTMASCHESTENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":christmaschest",
                FabricBlockEntityTypeBuilder.create(ChristmasChestEntity::new,
                        Declarer.christmasChestBlock
                ).build(null));
        Declarer.PUMPKINCHESTENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":pumpkinchest",
                FabricBlockEntityTypeBuilder.create(PumpkinChestEntity::new,
                        Declarer.pumpkinChestBlock
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

        Declarer.DIRTTRAPPEDCHESTENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":dirttrappedchest",
                FabricBlockEntityTypeBuilder.create(DirtTrappedChestEntity::new,
                        Declarer.dirtTrappedChestBlock
                ).build(null));
        Declarer.CHRISTMASTRAPPEDCHESTENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":christmastrappedchest",
                FabricBlockEntityTypeBuilder.create(ChristmasTrappedChestEntity::new,
                        Declarer.christmasTrappedChestBlock
                ).build(null));
        Declarer.PUMPKINTRAPPEDCHESTENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":pumpkintrappedchest",
                FabricBlockEntityTypeBuilder.create(PumpkinTrappedChestEntity::new,
                        Declarer.pumpkinTrappedChestBlock
                ).build(null));
        Declarer.IRONTRAPPEDCHESTENTITY =  Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":irontrappedchest",
                FabricBlockEntityTypeBuilder.create(IronTrappedChestEntity::new,
                        Declarer.ironTrappedChestBlock
                ).build(null));
        Declarer.GOLDTRAPPEDCHESTENTITY =  Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":goldtrappedchest",
                FabricBlockEntityTypeBuilder.create(GoldTrappedChestEntity::new,
                        Declarer.goldTrappedChestBlock
                ).build(null));
        Declarer.DIAMONDTRAPPEDCHESTENTITY =  Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":diamondtrappedchest",
                FabricBlockEntityTypeBuilder.create(DiamondTrappedChestEntity::new,
                        Declarer.diamondTrappedChestBlock
                ).build(null));
        Declarer.NETHERITETRAPPEDCHESTENTITY =  Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":netheritetrappedchest",
                FabricBlockEntityTypeBuilder.create(NetheriteTrappedChestEntity::new,
                        Declarer.netheriteTrappedChestBlock
                ).build(null));
        Declarer.AMETHYSTTRAPPEDCHESTENTITY =  Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":amethysttrappedchest",
                FabricBlockEntityTypeBuilder.create(AmethystTrappedChestEntity::new,
                        Declarer.amethystTrappedChestBlock
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


        Declarer.IRONBARRELENTITY =  Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":ironbarrel",
                FabricBlockEntityTypeBuilder.create(IronBarrelEntity::new,
                        Declarer.ironBarrelBlock
                ).build(null));
        Declarer.GOLDBARRELENTITY =  Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":goldbarrel",
                FabricBlockEntityTypeBuilder.create(GoldBarrelEntity::new,
                        Declarer.goldBarrelBlock
                ).build(null));
        Declarer.DIAMONDBARRELENTITY =  Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":diamondbarrel",
                FabricBlockEntityTypeBuilder.create(DiamondBarrelEntity::new,
                        Declarer.diamondBarrelBlock
                ).build(null));
        Declarer.NETHERITEBARRELENTITY =  Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":netheritebarrel",
                FabricBlockEntityTypeBuilder.create(NetheriteBarrelEntity::new,
                        Declarer.netheriteBarrelBlock
                ).build(null));
        Declarer.AMETHYSTBARRELENTITY =  Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":amethystbarrel",
                FabricBlockEntityTypeBuilder.create(AmethystBarrelEntity::new,
                        Declarer.amethystBarrelBlock
                ).build(null));


//        Declarer.ABSTRACTSCREENHANDLER = ScreenHandlerRegistry.registerSimple(new Identifier(Ref.MODID+":extrascreen"), (syncId, inventory) -> new AbstractScreenHandler(syncId,inventory,new SimpleInventory(12*9),12,9));
        Declarer.DIRTSCREENHANDLER = ScreenHandlerRegistry.registerSimple(new Identifier(Ref.MODID+":dirtscreen"), (syncId, inventory) -> new DirtScreenHandler(syncId,inventory,new SimpleInventory(1),1,1));
        Declarer.DIRTDOUBLESCREENHANDLER = ScreenHandlerRegistry.registerSimple(new Identifier(Ref.MODID+":dirtdoublescreen"), (syncId, inventory) -> new DirtDoubleScreenHandler(syncId,inventory,new SimpleInventory(2),1,2));
        Declarer.IRONSCREENHANDLER = ScreenHandlerRegistry.registerSimple(new Identifier(Ref.MODID+":ironscreen"), (syncId, inventory) -> new IronScreenHandler(syncId,inventory,new SimpleInventory(6*9),6,9));
        Declarer.GOLDSCREENHANDLER = ScreenHandlerRegistry.registerSimple(new Identifier(Ref.MODID+":goldscreen"), (syncId, inventory) -> new GoldScreenHandler(syncId,inventory,new SimpleInventory(12*9),12,9));
        Declarer.DIAMONDSCREENHANDLER = ScreenHandlerRegistry.registerSimple(new Identifier(Ref.MODID+":diamondscreen"), (syncId, inventory) -> new DiamondScreenHandler(syncId,inventory,new SimpleInventory(24*9),24,9));
        Declarer.AMETHYSTSCREENHANDLER = ScreenHandlerRegistry.registerSimple(new Identifier(Ref.MODID+":amethystscreen"), (syncId, inventory) -> new AmethystScreenHandler(syncId,inventory,new SimpleInventory(48*9),48,9));
        Declarer.AMETHYSTDOUBLESCREENHANDLER = ScreenHandlerRegistry.registerSimple(new Identifier(Ref.MODID+":amethystdoublescreen"), (syncId, inventory) -> new AmethystDoubleScreenHandler(syncId,inventory,new SimpleInventory(96*9),96,9));

        if (Ref.tokens) {
            regItem("irontoken", Declarer.ironToken);
            regItem("goldtoken", Declarer.goldToken);
            regItem("diamondtoken", Declarer.diamondToken);
            regItem("netheritetoken", Declarer.netheriteToken);
            regItem("amethysttoken", Declarer.amethystToken);
            regItem("omnitoken", Declarer.omniToken);
        }
        if (Ref.furnaces) {
            regBlock("ironfurnace", Declarer.ironFurnaceBlock);
            regItem("ironfurnaceitem", Declarer.ironFurnace);
            regBlock("goldfurnace", Declarer.goldFurnaceBlock);
            regItem("goldfurnaceitem", Declarer.goldFurnace);
            regBlock("diamondfurnace", Declarer.diamondFurnaceBlock);
            regItem("diamondfurnaceitem", Declarer.diamondFurnace);
            regBlock("netheritefurnace", Declarer.netheriteFurnaceBlock);
            regItem("netheritefurnaceitem", Declarer.netheriteFurnace);
            regBlock("amethystfurnace", Declarer.amethystFurnaceBlock);
            regItem("amethystfurnaceitem", Declarer.amethystFurnace);
        }
        if (Ref.blasts){
            regBlock("ironblast", Declarer.ironBlastBlock);
            regItem("ironblastitem", Declarer.ironBlast);
            regBlock("goldblast", Declarer.goldBlastBlock);
            regItem("goldblastitem", Declarer.goldBlast);
            regBlock("diamondblast", Declarer.diamondBlastBlock);
            regItem("diamondblastitem", Declarer.diamondBlast);
            regBlock("netheriteblast", Declarer.netheriteBlastBlock);
            regItem("netheriteblastitem", Declarer.netheriteBlast);
            regBlock("amethystblast", Declarer.amethystBlastBlock);
            regItem("amethystblastitem", Declarer.amethystBlast);
        }
        if (Ref.smokers){
            regBlock("ironsmoker", Declarer.ironSmokerBlock);
            regItem("ironsmokeritem", Declarer.ironSmoker);
            regBlock("goldsmoker", Declarer.goldSmokerBlock);
            regItem("goldsmokeritem", Declarer.goldSmoker);
            regBlock("diamondsmoker", Declarer.diamondSmokerBlock);
            regItem("diamondsmokeritem", Declarer.diamondSmoker);
            regBlock("netheritesmoker", Declarer.netheriteSmokerBlock);
            regItem("netheritesmokeritem", Declarer.netheriteSmoker);
            regBlock("amethystsmoker", Declarer.amethystSmokerBlock);
            regItem("amethystsmokeritem", Declarer.amethystSmoker);
        }
        if (Ref.hoppers){
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
        }
        if (Ref.chests){
            regBlock("dirtchest",Declarer.dirtChestBlock);
            regItem("dirtchestitem",Declarer.dirtChest);
            regBlock("christmaschest",Declarer.christmasChestBlock);
            regItem("christmaschestitem",Declarer.christmasChest);
            regBlock("pumpkinchest",Declarer.pumpkinChestBlock);
            regItem("pumpkinchestitem",Declarer.pumpkinChest);
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
        }
        if (Ref.trapped){
            regBlock("dirttrappedchest",Declarer.dirtTrappedChestBlock);
            regItem("dirttrappedchestitem",Declarer.dirtTrappedChest);
            regBlock("christmastrappedchest",Declarer.christmasTrappedChestBlock);
            regItem("christmastrappedchestitem",Declarer.christmasTrappedChest);
            regBlock("pumpkintrappedchest",Declarer.pumpkinTrappedChestBlock);
            regItem("pumpkintrappedchestitem",Declarer.pumpkinTrappedChest);
            regBlock("irontrappedchest", Declarer.ironTrappedChestBlock);
            regItem("irontrappedchestitem", Declarer.ironTrappedChest);
            regBlock("goldtrappedchest", Declarer.goldTrappedChestBlock);
            regItem("goldtrappedchestitem", Declarer.goldTrappedChest);
            regBlock("diamondtrappedchest", Declarer.diamondTrappedChestBlock);
            regItem("diamondtrappedchestitem", Declarer.diamondTrappedChest);
            regBlock("netheritetrappedchest", Declarer.netheriteTrappedChestBlock);
            regItem("netheritetrappedchestitem", Declarer.netheriteTrappedChest);
            regBlock("amethysttrappedchest", Declarer.amethystTrappedChestBlock);
            regItem("amethysttrappedchestitem", Declarer.amethystTrappedChest);
        }
        if (Ref.shulkers){
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
        }
        if (Ref.barrels){
            regBlock("ironbarrel", Declarer.ironBarrelBlock);
            regItem("ironbarrelitem", Declarer.ironBarrel);
            regBlock("goldbarrel", Declarer.goldBarrelBlock);
            regItem("goldbarrelitem", Declarer.goldBarrel);
            regBlock("diamondbarrel", Declarer.diamondBarrelBlock);
            regItem("diamondbarrelitem", Declarer.diamondBarrel);
            regBlock("netheritebarrel", Declarer.netheriteBarrelBlock);
            regItem("netheritebarrelitem", Declarer.netheriteBarrel);
            regBlock("amethystbarrel", Declarer.amethystBarrelBlock);
            regItem("amethystbarrelitem", Declarer.amethystBarrel);
        }
        if (Ref.bundles){
            regItem("ironbundle",Declarer.ironBundle);
            regItem("goldbundle",Declarer.goldBundle);
            regItem("diamondbundle",Declarer.diamondBundle);
            regItem("netheritebundle",Declarer.netheriteBundle);
            regItem("amethystbundle",Declarer.amethystBundle);
        }

    }

    public static void regItem(String name, Item itemid) {
        Registry.register(Registry.ITEM, new Identifier(Ref.MODID, name), itemid);
    }

    public static void regBlock(String name, Block blockid) {
        Registry.register(Registry.BLOCK, new Identifier(Ref.MODID, name), blockid);
    }


}
