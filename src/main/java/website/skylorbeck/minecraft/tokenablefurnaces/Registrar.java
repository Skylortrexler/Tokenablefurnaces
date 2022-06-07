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
                Ref.MODID + ":iron_blast",
                FabricBlockEntityTypeBuilder.create(IronExtraBlastEntity::new,
                        Declarer.ironBlastBlock
                ).build(null));
        Declarer.IRONSMOKERENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":iron_smoker",
                FabricBlockEntityTypeBuilder.create(IronExtraSmokerEntity::new,
                        Declarer.ironSmokerBlock
                ).build(null));
        Declarer.IRONFURNACEENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":iron_furnace",
                FabricBlockEntityTypeBuilder.create(IronExtraFurnaceEntity::new,
                        Declarer.ironFurnaceBlock
                ).build(null));

        Declarer.GOLDBLASTENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":gold_blast",
                FabricBlockEntityTypeBuilder.create(GoldExtraBlastEntity::new,
                        Declarer.goldBlastBlock
                ).build(null));
        Declarer.GOLDSMOKERENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":gold_smoker",
                FabricBlockEntityTypeBuilder.create(GoldExtraSmokerEntity::new,
                        Declarer.goldSmokerBlock
                ).build(null));
        Declarer.GOLDFURNACEENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":gold_furnace",
                FabricBlockEntityTypeBuilder.create(GoldExtraFurnaceEntity::new,
                        Declarer.goldFurnaceBlock
                ).build(null));


        Declarer.DIAMONDBLASTENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":diamond_blast",
                FabricBlockEntityTypeBuilder.create(DiamondExtraBlastEntity::new,
                        Declarer.diamondBlastBlock,
                        Declarer.netheriteBlastBlock
                ).build(null));
        Declarer.DIAMONDSMOKERENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":diamond_smoker",
                FabricBlockEntityTypeBuilder.create(DiamondExtraSmokerEntity::new,
                        Declarer.diamondSmokerBlock,
                        Declarer.netheriteSmokerBlock
                ).build(null));
        Declarer.DIAMONDFURNACEENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":diamond_furnace",
                FabricBlockEntityTypeBuilder.create(DiamondExtraFurnaceEntity::new,
                        Declarer.diamondFurnaceBlock,
                        Declarer.netheriteFurnaceBlock
                ).build(null));

        
        Declarer.AMETHYSTBLASTENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":amethyst_blast",
                FabricBlockEntityTypeBuilder.create(AmethystExtraBlastEntity::new,
                        Declarer.amethystBlastBlock
                ).build(null));
        Declarer.AMETHYSTSMOKERENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":amethyst_smoker",
                FabricBlockEntityTypeBuilder.create(AmethystExtraSmokerEntity::new,
                        Declarer.amethystSmokerBlock
                ).build(null));
        Declarer.AMETHYSTFURNACEENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":amethyst_furnace",
                FabricBlockEntityTypeBuilder.create(AmethystExtraFurnaceEntity::new,
                        Declarer.amethystFurnaceBlock
                ).build(null));

        Declarer.IRONHOPPERENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":iron_hopper",
                FabricBlockEntityTypeBuilder.create(IronHopperEntity::new,
                        Declarer.ironHopperBlock
                ).build(null));
        Declarer.GOLDHOPPERENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":gold_hopper",
                FabricBlockEntityTypeBuilder.create(GoldHopperEntity::new,
                        Declarer.goldHopperBlock
                ).build(null));
        Declarer.DIAMONDHOPPERENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":diamond_hopper",
                FabricBlockEntityTypeBuilder.create(DiamondHopperEntity::new,
                        Declarer.diamondHopperBlock,
                        Declarer.netheriteHopperBlock
                ).build(null));
        Declarer.AMETHYSTHOPPERENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":amethyst_hopper",
                FabricBlockEntityTypeBuilder.create(AmethystHopperEntity::new,
                        Declarer.amethystHopperBlock
                ).build(null));


        Declarer.DIRTCHESTENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":dirt_chest",
                FabricBlockEntityTypeBuilder.create(DirtChestEntity::new,
                        Declarer.dirtChestBlock
                ).build(null));
        Declarer.CHRISTMASCHESTENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":christmas_chest",
                FabricBlockEntityTypeBuilder.create(ChristmasChestEntity::new,
                        Declarer.christmasChestBlock
                ).build(null));
        Declarer.PUMPKINCHESTENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":pumpkin_chest",
                FabricBlockEntityTypeBuilder.create(PumpkinChestEntity::new,
                        Declarer.pumpkinChestBlock
                ).build(null));
        Declarer.IRONCHESTENTITY =  Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":iron_chest",
                FabricBlockEntityTypeBuilder.create(IronChestEntity::new,
                        Declarer.ironChestBlock
                ).build(null));
        Declarer.GOLDCHESTENTITY =  Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":gold_chest",
                FabricBlockEntityTypeBuilder.create(GoldChestEntity::new,
                        Declarer.goldChestBlock
                ).build(null));
        Declarer.DIAMONDCHESTENTITY =  Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":diamond_chest",
                FabricBlockEntityTypeBuilder.create(DiamondChestEntity::new,
                        Declarer.diamondChestBlock
                ).build(null));
        Declarer.NETHERITECHESTENTITY =  Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":netherite_chest",
                FabricBlockEntityTypeBuilder.create(NetheriteChestEntity::new,
                        Declarer.netheriteChestBlock
                ).build(null));
        Declarer.AMETHYSTCHESTENTITY =  Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":amethyst_chest",
                FabricBlockEntityTypeBuilder.create(AmethystChestEntity::new,
                        Declarer.amethystChestBlock
                ).build(null));

        Declarer.DIRTTRAPPEDCHESTENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":dirt_trapped_chest",
                FabricBlockEntityTypeBuilder.create(DirtTrappedChestEntity::new,
                        Declarer.dirtTrappedChestBlock
                ).build(null));
        Declarer.CHRISTMASTRAPPEDCHESTENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":christmas_trapped_chest",
                FabricBlockEntityTypeBuilder.create(ChristmasTrappedChestEntity::new,
                        Declarer.christmasTrappedChestBlock
                ).build(null));
        Declarer.PUMPKINTRAPPEDCHESTENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":pumpkin_trapped_chest",
                FabricBlockEntityTypeBuilder.create(PumpkinTrappedChestEntity::new,
                        Declarer.pumpkinTrappedChestBlock
                ).build(null));
        Declarer.IRONTRAPPEDCHESTENTITY =  Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":iron_trapped_chest",
                FabricBlockEntityTypeBuilder.create(IronTrappedChestEntity::new,
                        Declarer.ironTrappedChestBlock
                ).build(null));
        Declarer.GOLDTRAPPEDCHESTENTITY =  Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":gold_trapped_chest",
                FabricBlockEntityTypeBuilder.create(GoldTrappedChestEntity::new,
                        Declarer.goldTrappedChestBlock
                ).build(null));
        Declarer.DIAMONDTRAPPEDCHESTENTITY =  Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":diamond_trapped_chest",
                FabricBlockEntityTypeBuilder.create(DiamondTrappedChestEntity::new,
                        Declarer.diamondTrappedChestBlock
                ).build(null));
        Declarer.NETHERITETRAPPEDCHESTENTITY =  Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":netherite_trapped_chest",
                FabricBlockEntityTypeBuilder.create(NetheriteTrappedChestEntity::new,
                        Declarer.netheriteTrappedChestBlock
                ).build(null));
        Declarer.AMETHYSTTRAPPEDCHESTENTITY =  Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":amethyst_trapped_chest",
                FabricBlockEntityTypeBuilder.create(AmethystTrappedChestEntity::new,
                        Declarer.amethystTrappedChestBlock
                ).build(null));


        Declarer.IRONSHULKERENTITY =  Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":iron_shulker",
                FabricBlockEntityTypeBuilder.create(IronShulkerEntity::new,
                        Declarer.ironShulkerBlock
                ).build(null));
        Declarer.GOLDSHULKERENTITY =  Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":gold_shulker",
                FabricBlockEntityTypeBuilder.create(GoldShulkerEntity::new,
                        Declarer.goldShulkerBlock
                ).build(null));
        Declarer.DIAMONDSHULKERENTITY =  Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":diamond_shulker",
                FabricBlockEntityTypeBuilder.create(DiamondShulkerEntity::new,
                        Declarer.diamondShulkerBlock
                ).build(null));
        Declarer.NETHERITESHULKERENTITY =  Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":netherite_shulker",
                FabricBlockEntityTypeBuilder.create(NetheriteShulkerEntity::new,
                        Declarer.netheriteShulkerBlock
                ).build(null));
        Declarer.AMETHYSTSHULKERENTITY =  Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":amethyst_shulker",
                FabricBlockEntityTypeBuilder.create(AmethystShulkerEntity::new,
                        Declarer.amethystShulkerBlock
                ).build(null));


        Declarer.IRONBARRELENTITY =  Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":iron_barrel",
                FabricBlockEntityTypeBuilder.create(IronBarrelEntity::new,
                        Declarer.ironBarrelBlock
                ).build(null));
        Declarer.GOLDBARRELENTITY =  Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":gold_barrel",
                FabricBlockEntityTypeBuilder.create(GoldBarrelEntity::new,
                        Declarer.goldBarrelBlock
                ).build(null));
        Declarer.DIAMONDBARRELENTITY =  Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":diamond_barrel",
                FabricBlockEntityTypeBuilder.create(DiamondBarrelEntity::new,
                        Declarer.diamondBarrelBlock
                ).build(null));
        Declarer.NETHERITEBARRELENTITY =  Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":netherite_barrel",
                FabricBlockEntityTypeBuilder.create(NetheriteBarrelEntity::new,
                        Declarer.netheriteBarrelBlock
                ).build(null));
        Declarer.AMETHYSTBARRELENTITY =  Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":amethyst_barrel",
                FabricBlockEntityTypeBuilder.create(AmethystBarrelEntity::new,
                        Declarer.amethystBarrelBlock
                ).build(null));


//        Declarer.ABSTRACTSCREENHANDLER = ScreenHandlerRegistry.registerSimple(new Identifier(Ref.MODID+":extrascreen"), (syncId, inventory) -> new AbstractScreenHandler(syncId,inventory,new SimpleInventory(12*9),12,9));
        Declarer.DIRTSCREENHANDLER = ScreenHandlerRegistry.registerSimple(new Identifier(Ref.MODID+":dirt_screen"), (syncId, inventory) -> new DirtScreenHandler(syncId,inventory,new SimpleInventory(1),1,1));
        Declarer.DIRTDOUBLESCREENHANDLER = ScreenHandlerRegistry.registerSimple(new Identifier(Ref.MODID+":dirt_double_screen"), (syncId, inventory) -> new DirtDoubleScreenHandler(syncId,inventory,new SimpleInventory(2),1,2));
        Declarer.IRONSCREENHANDLER = ScreenHandlerRegistry.registerSimple(new Identifier(Ref.MODID+":iron_screen"), (syncId, inventory) -> new IronScreenHandler(syncId,inventory,new SimpleInventory(6*9),6,9));
        Declarer.GOLDSCREENHANDLER = ScreenHandlerRegistry.registerSimple(new Identifier(Ref.MODID+":gold_screen"), (syncId, inventory) -> new GoldScreenHandler(syncId,inventory,new SimpleInventory(12*9),12,9));
        Declarer.DIAMONDSCREENHANDLER = ScreenHandlerRegistry.registerSimple(new Identifier(Ref.MODID+":diamond_screen"), (syncId, inventory) -> new DiamondScreenHandler(syncId,inventory,new SimpleInventory(24*9),24,9));
        Declarer.AMETHYSTSCREENHANDLER = ScreenHandlerRegistry.registerSimple(new Identifier(Ref.MODID+":amethyst_screen"), (syncId, inventory) -> new AmethystScreenHandler(syncId,inventory,new SimpleInventory(48*9),48,9));
        Declarer.AMETHYSTDOUBLESCREENHANDLER = ScreenHandlerRegistry.registerSimple(new Identifier(Ref.MODID+":amethyst_double_screen"), (syncId, inventory) -> new AmethystDoubleScreenHandler(syncId,inventory,new SimpleInventory(96*9),96,9));

//        if (Ref.tokens) {
            regItem("iron_token_", Declarer.ironToken);
            regItem("gold_token_", Declarer.goldToken);
            regItem("diamond_token_", Declarer.diamondToken);
            regItem("netherite_token_", Declarer.netheriteToken);
            regItem("amethyst_token_", Declarer.amethystToken);
            regItem("omnitoken_", Declarer.omniToken);
//        }
//        if (Ref.furnaces) {
            regBlock("iron_furnace_", Declarer.ironFurnaceBlock);
            regItem("iron_furnace_", Declarer.ironFurnace);
            regBlock("gold_furnace_", Declarer.goldFurnaceBlock);
            regItem("gold_furnace_", Declarer.goldFurnace);
            regBlock("diamond_furnace_", Declarer.diamondFurnaceBlock);
            regItem("diamond_furnace_", Declarer.diamondFurnace);
            regBlock("netherite_furnace_", Declarer.netheriteFurnaceBlock);
            regItem("netherite_furnace_", Declarer.netheriteFurnace);
            regBlock("amethyst_furnace_", Declarer.amethystFurnaceBlock);
            regItem("amethyst_furnace_", Declarer.amethystFurnace);
//        }
//        if (Ref.blasts){
            regBlock("iron_blast_", Declarer.ironBlastBlock);
            regItem("iron_blast_", Declarer.ironBlast);
            regBlock("gold_blast_", Declarer.goldBlastBlock);
            regItem("gold_blast_", Declarer.goldBlast);
            regBlock("diamond_blast_", Declarer.diamondBlastBlock);
            regItem("diamond_blast_", Declarer.diamondBlast);
            regBlock("netherite_blast_", Declarer.netheriteBlastBlock);
            regItem("netherite_blast_", Declarer.netheriteBlast);
            regBlock("amethyst_blast_", Declarer.amethystBlastBlock);
            regItem("amethyst_blast_", Declarer.amethystBlast);
//        }
//        if (Ref.smokers){
            regBlock("iron_smoker_", Declarer.ironSmokerBlock);
            regItem("iron_smoker_", Declarer.ironSmoker);
            regBlock("gold_smoker_", Declarer.goldSmokerBlock);
            regItem("gold_smoker_", Declarer.goldSmoker);
            regBlock("diamond_smoker_", Declarer.diamondSmokerBlock);
            regItem("diamond_smoker_", Declarer.diamondSmoker);
            regBlock("netherite_smoker_", Declarer.netheriteSmokerBlock);
            regItem("netherite_smoker_", Declarer.netheriteSmoker);
            regBlock("amethyst_smoker_", Declarer.amethystSmokerBlock);
            regItem("amethyst_smoker_", Declarer.amethystSmoker);
//        }
//        if (Ref.hoppers){
            regBlock("iron_hopper_", Declarer.ironHopperBlock);
            regItem("iron_hopper_",Declarer.ironHopper);
            regBlock("gold_hopper_", Declarer.goldHopperBlock);
            regItem("gold_hopper_",Declarer.goldHopper);
            regBlock("diamond_hopper_", Declarer.diamondHopperBlock);
            regItem("diamond_hopper_",Declarer.diamondHopper);
            regBlock("netherite_hopper_", Declarer.netheriteHopperBlock);
            regItem("netherite_hopper_",Declarer.netheriteHopper);
            regBlock("amethyst_hopper_", Declarer.amethystHopperBlock);
            regItem("amethyst_hopper_",Declarer.amethystHopper);
//        }
//        if (Ref.chests){
            regBlock("dirt_chest_",Declarer.dirtChestBlock);
            regItem("dirt_chest_",Declarer.dirtChest);
            regBlock("christmas_chest_",Declarer.christmasChestBlock);
            regItem("christmas_chest_",Declarer.christmasChest);
            regBlock("pumpkin_chest_",Declarer.pumpkinChestBlock);
            regItem("pumpkin_chest_",Declarer.pumpkinChest);
            regBlock("iron_chest_", Declarer.ironChestBlock);
            regItem("iron_chest_", Declarer.ironChest);
            regBlock("gold_chest_", Declarer.goldChestBlock);
            regItem("gold_chest_", Declarer.goldChest);
            regBlock("diamond_chest_", Declarer.diamondChestBlock);
            regItem("diamond_chest_", Declarer.diamondChest);
            regBlock("netherite_chest_", Declarer.netheriteChestBlock);
            regItem("netherite_chest_", Declarer.netheriteChest);
            regBlock("amethyst_chest_", Declarer.amethystChestBlock);
            regItem("amethyst_chest_", Declarer.amethystChest);
//        }
//        if (Ref.trapped){
            regBlock("dirt_trapped_chest_",Declarer.dirtTrappedChestBlock);
            regItem("dirt_trapped_chest_",Declarer.dirtTrappedChest);
            regBlock("christmas_trapped_chest_",Declarer.christmasTrappedChestBlock);
            regItem("christmas_trapped_chest_",Declarer.christmasTrappedChest);
            regBlock("pumpkin_trapped_chest_",Declarer.pumpkinTrappedChestBlock);
            regItem("pumpkin_trapped_chest_",Declarer.pumpkinTrappedChest);
            regBlock("iron_trapped_chest_", Declarer.ironTrappedChestBlock);
            regItem("iron_trapped_chest_", Declarer.ironTrappedChest);
            regBlock("gold_trapped_chest_", Declarer.goldTrappedChestBlock);
            regItem("gold_trapped_chest_", Declarer.goldTrappedChest);
            regBlock("diamond_trapped_chest_", Declarer.diamondTrappedChestBlock);
            regItem("diamond_trapped_chest_", Declarer.diamondTrappedChest);
            regBlock("netherite_trapped_chest_", Declarer.netheriteTrappedChestBlock);
            regItem("netherite_trapped_chest_", Declarer.netheriteTrappedChest);
            regBlock("amethyst_trapped_chest_", Declarer.amethystTrappedChestBlock);
            regItem("amethyst_trapped_chest_", Declarer.amethystTrappedChest);
//        }
//        if (Ref.shulkers){
            regBlock("iron_shulker_", Declarer.ironShulkerBlock);
            regItem("iron_shulker_", Declarer.ironShulker);
            regBlock("gold_shulker_", Declarer.goldShulkerBlock);
            regItem("gold_shulker_", Declarer.goldShulker);
            regBlock("diamond_shulker_", Declarer.diamondShulkerBlock);
            regItem("diamond_shulker_", Declarer.diamondShulker);
            regBlock("netherite_shulker_", Declarer.netheriteShulkerBlock);
            regItem("netherite_shulker_", Declarer.netheriteShulker);
            regBlock("amethyst_shulker_", Declarer.amethystShulkerBlock);
            regItem("amethyst_shulker_", Declarer.amethystShulker);
//        }
//        if (Ref.barrels){
            regBlock("iron_barrel_", Declarer.ironBarrelBlock);
            regItem("iron_barrel_", Declarer.ironBarrel);
            regBlock("gold_barrel_", Declarer.goldBarrelBlock);
            regItem("gold_barrel_", Declarer.goldBarrel);
            regBlock("diamond_barrel_", Declarer.diamondBarrelBlock);
            regItem("diamond_barrel_", Declarer.diamondBarrel);
            regBlock("netherite_barrel_", Declarer.netheriteBarrelBlock);
            regItem("netherite_barrel_", Declarer.netheriteBarrel);
            regBlock("amethyst_barrel_", Declarer.amethystBarrelBlock);
            regItem("amethyst_barrel_", Declarer.amethystBarrel);
//        }
//        if (Ref.bundles){
            regItem("iron_bundle_",Declarer.ironBundle);
            regItem("gold_bundle_",Declarer.goldBundle);
            regItem("diamond_bundle_",Declarer.diamondBundle);
            regItem("netherite_bundle_",Declarer.netheriteBundle);
            regItem("amethyst_bundle_",Declarer.amethystBundle);
//        }
//        if (Ref.composters){
//        }

    }

    public static void regItem(String name, Item itemid) {
        website.skylorbeck.minecraft.skylorlib.Registrar.regItem(name,itemid,Ref.MODID);
    }

    public static void regBlock(String name, Block blockid) {
        website.skylorbeck.minecraft.skylorlib.Registrar.regBlock(name,blockid,Ref.MODID);
    }


}
