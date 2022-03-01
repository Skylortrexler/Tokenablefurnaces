package website.skylorbeck.minecraft.tokenablefurnaces;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import website.skylorbeck.minecraft.skylorlib.bundles.ExtraBundleItem;
import website.skylorbeck.minecraft.tokenablefurnaces.Screenhandlers.*;
import website.skylorbeck.minecraft.tokenablefurnaces.barrels.*;
import website.skylorbeck.minecraft.tokenablefurnaces.chests.*;
import website.skylorbeck.minecraft.tokenablefurnaces.chests.trapped.*;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.amethyst.*;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.diamond.*;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.gold.*;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.iron.*;
import website.skylorbeck.minecraft.tokenablefurnaces.hoppers.*;
import website.skylorbeck.minecraft.tokenablefurnaces.shulkers.*;

public class Declarer {
    public static final ItemGroup tokenablefurnaces = FabricItemGroupBuilder.build(
            new Identifier("tokenablefurnaces", "category"),
            () -> new ItemStack(Declarer.omniToken));


    public static BlockEntityType<IronExtraFurnaceEntity> IRONFURNACEENTITY;
    public static BlockEntityType<IronExtraBlastEntity> IRONBLASTENTITY;
    public static BlockEntityType<IronExtraSmokerEntity> IRONSMOKERENTITY;

    public static BlockEntityType<GoldExtraFurnaceEntity> GOLDFURNACEENTITY;
    public static BlockEntityType<GoldExtraBlastEntity> GOLDBLASTENTITY;
    public static BlockEntityType<GoldExtraSmokerEntity> GOLDSMOKERENTITY;

    public static BlockEntityType<DiamondExtraFurnaceEntity> DIAMONDFURNACEENTITY;
    public static BlockEntityType<DiamondExtraBlastEntity> DIAMONDBLASTENTITY;
    public static BlockEntityType<DiamondExtraSmokerEntity> DIAMONDSMOKERENTITY;
    
    public static BlockEntityType<AmethystExtraFurnaceEntity> AMETHYSTFURNACEENTITY;
    public static BlockEntityType<AmethystExtraBlastEntity> AMETHYSTBLASTENTITY;
    public static BlockEntityType<AmethystExtraSmokerEntity> AMETHYSTSMOKERENTITY;

    public static BlockEntityType<IronHopperEntity> IRONHOPPERENTITY;
    public static BlockEntityType<GoldHopperEntity> GOLDHOPPERENTITY;
    public static BlockEntityType<DiamondHopperEntity> DIAMONDHOPPERENTITY;
    public static BlockEntityType<AmethystHopperEntity> AMETHYSTHOPPERENTITY;

    public static BlockEntityType<PumpkinChestEntity> PUMPKINCHESTENTITY;
    public static BlockEntityType<ChristmasChestEntity> CHRISTMASCHESTENTITY;
    public static BlockEntityType<DirtChestEntity> DIRTCHESTENTITY;
    public static BlockEntityType<IronChestEntity> IRONCHESTENTITY;
    public static BlockEntityType<GoldChestEntity> GOLDCHESTENTITY;
    public static BlockEntityType<DiamondChestEntity> DIAMONDCHESTENTITY;
    public static BlockEntityType<NetheriteChestEntity> NETHERITECHESTENTITY;
    public static BlockEntityType<AmethystChestEntity> AMETHYSTCHESTENTITY;

    public static BlockEntityType<PumpkinTrappedChestEntity> PUMPKINTRAPPEDCHESTENTITY;
    public static BlockEntityType<ChristmasTrappedChestEntity> CHRISTMASTRAPPEDCHESTENTITY;
    public static BlockEntityType<DirtTrappedChestEntity> DIRTTRAPPEDCHESTENTITY;
    public static BlockEntityType<IronTrappedChestEntity> IRONTRAPPEDCHESTENTITY;
    public static BlockEntityType<GoldTrappedChestEntity> GOLDTRAPPEDCHESTENTITY;
    public static BlockEntityType<DiamondTrappedChestEntity> DIAMONDTRAPPEDCHESTENTITY;
    public static BlockEntityType<NetheriteTrappedChestEntity> NETHERITETRAPPEDCHESTENTITY;
    public static BlockEntityType<AmethystTrappedChestEntity> AMETHYSTTRAPPEDCHESTENTITY;

    public static ScreenHandlerType<DirtScreenHandler> DIRTSCREENHANDLER;
    public static ScreenHandlerType<DirtDoubleScreenHandler> DIRTDOUBLESCREENHANDLER;
    public static ScreenHandlerType<IronScreenHandler> IRONSCREENHANDLER;
    public static ScreenHandlerType<GoldScreenHandler> GOLDSCREENHANDLER;
    public static ScreenHandlerType<DiamondScreenHandler> DIAMONDSCREENHANDLER;
    public static ScreenHandlerType<AmethystScreenHandler> AMETHYSTSCREENHANDLER;
    public static ScreenHandlerType<AmethystDoubleScreenHandler> AMETHYSTDOUBLESCREENHANDLER;

    public static BlockEntityType<IronShulkerEntity> IRONSHULKERENTITY;
    public static BlockEntityType<GoldShulkerEntity> GOLDSHULKERENTITY;
    public static BlockEntityType<DiamondShulkerEntity> DIAMONDSHULKERENTITY;
    public static BlockEntityType<NetheriteShulkerEntity> NETHERITESHULKERENTITY;
    public static BlockEntityType<AmethystShulkerEntity> AMETHYSTSHULKERENTITY;

    public static BlockEntityType<IronBarrelEntity> IRONBARRELENTITY;
    public static BlockEntityType<GoldBarrelEntity> GOLDBARRELENTITY;
    public static BlockEntityType<DiamondBarrelEntity> DIAMONDBARRELENTITY;
    public static BlockEntityType<NetheriteBarrelEntity> NETHERITEBARRELENTITY;
    public static BlockEntityType<AmethystBarrelEntity> AMETHYSTBARRELENTITY;

    public static Item ironToken = new TokenItem(new FabricItemSettings().rarity(Rarity.COMMON).group(tokenablefurnaces), TierHelper.Tier.Iron);
    public static Item goldToken = new TokenItem(new FabricItemSettings().rarity(Rarity.UNCOMMON).group(tokenablefurnaces), TierHelper.Tier.Gold);
    public static Item diamondToken = new TokenItem(new FabricItemSettings().rarity(Rarity.RARE).group(tokenablefurnaces), TierHelper.Tier.Diamond);
    public static Item netheriteToken = new TokenItem(new FabricItemSettings().rarity(Rarity.EPIC).group(tokenablefurnaces), TierHelper.Tier.Netherite);
    public static Item amethystToken = new TokenItem(new FabricItemSettings().rarity(Rarity.EPIC).group(tokenablefurnaces), TierHelper.Tier.Amethyst);
    public static Item omniToken = new TokenItem(new FabricItemSettings().rarity(Rarity.EPIC).group(tokenablefurnaces), TierHelper.Tier.Omni);

    public static Block ironFurnaceBlock = new IronExtraFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE),0);
    public static final BlockItem ironFurnace = new BlockItem(ironFurnaceBlock, new FabricItemSettings().group(tokenablefurnaces).rarity(Rarity.COMMON));
    public static Block ironBlastBlock = new IronExtraBlastBlock(FabricBlockSettings.copyOf(Blocks.BLAST_FURNACE));
    public static final BlockItem ironBlast = new BlockItem(ironBlastBlock, new FabricItemSettings().group(tokenablefurnaces).rarity(Rarity.COMMON));
    public static Block ironSmokerBlock = new IronExtraSmokerBlock(FabricBlockSettings.copyOf(Blocks.FURNACE));
    public static final BlockItem ironSmoker = new BlockItem(ironSmokerBlock, new FabricItemSettings().group(tokenablefurnaces).rarity(Rarity.COMMON));

    public static Block goldFurnaceBlock = new GoldExtraFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE),0);
    public static final BlockItem goldFurnace = new BlockItem(goldFurnaceBlock, new FabricItemSettings().group(tokenablefurnaces).rarity(Rarity.UNCOMMON));
    public static Block goldBlastBlock = new GoldExtraBlastBlock(FabricBlockSettings.copyOf(Blocks.BLAST_FURNACE));
    public static final BlockItem goldBlast = new BlockItem(goldBlastBlock, new FabricItemSettings().group(tokenablefurnaces).rarity(Rarity.UNCOMMON));
    public static Block goldSmokerBlock = new GoldExtraSmokerBlock(FabricBlockSettings.copyOf(Blocks.FURNACE));
    public static final BlockItem goldSmoker = new BlockItem(goldSmokerBlock, new FabricItemSettings().group(tokenablefurnaces).rarity(Rarity.UNCOMMON));

    public static Block diamondFurnaceBlock = new DiamondExtraFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE),0);
    public static final BlockItem diamondFurnace = new BlockItem(diamondFurnaceBlock, new FabricItemSettings().group(tokenablefurnaces).rarity(Rarity.RARE));
    public static Block diamondBlastBlock = new DiamondExtraBlastBlock(FabricBlockSettings.copyOf(Blocks.BLAST_FURNACE));
    public static final BlockItem diamondBlast = new BlockItem(diamondBlastBlock, new FabricItemSettings().group(tokenablefurnaces).rarity(Rarity.RARE));
    public static Block diamondSmokerBlock = new DiamondExtraSmokerBlock(FabricBlockSettings.copyOf(Blocks.FURNACE));
    public static final BlockItem diamondSmoker = new BlockItem(diamondSmokerBlock, new FabricItemSettings().group(tokenablefurnaces).rarity(Rarity.RARE));

    public static Block netheriteFurnaceBlock = new DiamondExtraFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE).resistance(1200F),0);
    public static final BlockItem netheriteFurnace = new BlockItem(netheriteFurnaceBlock, new FabricItemSettings().group(tokenablefurnaces).fireproof().rarity(Rarity.EPIC));
    public static Block netheriteBlastBlock = new DiamondExtraBlastBlock(FabricBlockSettings.copyOf(Blocks.BLAST_FURNACE).resistance(1200F));
    public static final BlockItem netheriteBlast = new BlockItem(netheriteBlastBlock, new FabricItemSettings().group(tokenablefurnaces).fireproof().rarity(Rarity.EPIC));
    public static Block netheriteSmokerBlock = new DiamondExtraSmokerBlock(FabricBlockSettings.copyOf(Blocks.FURNACE).resistance(1200F));
    public static final BlockItem netheriteSmoker = new BlockItem(netheriteSmokerBlock, new FabricItemSettings().group(tokenablefurnaces).fireproof().rarity(Rarity.EPIC));

    public static Block amethystFurnaceBlock = new AmethystExtraFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE),0);
    public static final BlockItem amethystFurnace = new BlockItem(amethystFurnaceBlock, new FabricItemSettings().group(tokenablefurnaces).rarity(Rarity.EPIC));
    public static Block amethystBlastBlock = new AmethystExtraBlastBlock(FabricBlockSettings.copyOf(Blocks.BLAST_FURNACE));
    public static final BlockItem amethystBlast = new BlockItem(amethystBlastBlock, new FabricItemSettings().group(tokenablefurnaces).rarity(Rarity.EPIC));
    public static Block amethystSmokerBlock = new AmethystExtraSmokerBlock(FabricBlockSettings.copyOf(Blocks.FURNACE));
    public static final BlockItem amethystSmoker = new BlockItem(amethystSmokerBlock, new FabricItemSettings().group(tokenablefurnaces).rarity(Rarity.EPIC));

    public static Block ironHopperBlock = new IronHopperBlock(FabricBlockSettings.copyOf(Blocks.HOPPER));
    public static final BlockItem ironHopper = new BlockItem(ironHopperBlock, new FabricItemSettings().group(tokenablefurnaces).rarity(Rarity.COMMON));
    public static Block goldHopperBlock = new GoldHopperBlock(FabricBlockSettings.copyOf(Blocks.HOPPER));
    public static final BlockItem goldHopper = new BlockItem(goldHopperBlock, new FabricItemSettings().group(tokenablefurnaces).rarity(Rarity.UNCOMMON));
    public static Block diamondHopperBlock = new DiamondHopperBlock(FabricBlockSettings.copyOf(Blocks.HOPPER));
    public static final BlockItem diamondHopper = new BlockItem(diamondHopperBlock, new FabricItemSettings().group(tokenablefurnaces).rarity(Rarity.RARE));
    public static Block netheriteHopperBlock = new DiamondHopperBlock(FabricBlockSettings.copyOf(Blocks.HOPPER).resistance(1200F));
    public static final BlockItem netheriteHopper = new BlockItem(netheriteHopperBlock, new FabricItemSettings().group(tokenablefurnaces).fireproof().rarity(Rarity.EPIC));
    public static Block amethystHopperBlock = new AmethystHopperBlock(FabricBlockSettings.copyOf(Blocks.HOPPER));
    public static final BlockItem amethystHopper = new BlockItem(amethystHopperBlock, new FabricItemSettings().group(tokenablefurnaces).rarity(Rarity.EPIC));


    public static Block dirtChestBlock = new DirtChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), () -> Declarer.DIRTCHESTENTITY);
    public static BlockItem dirtChest = new BlockItem(dirtChestBlock,new FabricItemSettings().group(tokenablefurnaces).rarity(Rarity.COMMON));
    public static Block christmasChestBlock = new ChristmasChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), () -> Declarer.CHRISTMASCHESTENTITY);
    public static BlockItem christmasChest = new BlockItem(christmasChestBlock,new FabricItemSettings().group(tokenablefurnaces).rarity(Rarity.COMMON));
    public static Block pumpkinChestBlock = new PumpkinChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), () -> Declarer.PUMPKINCHESTENTITY);
    public static BlockItem pumpkinChest = new BlockItem(pumpkinChestBlock,new FabricItemSettings().group(tokenablefurnaces).rarity(Rarity.COMMON));
    public static Block ironChestBlock = new IronChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), () -> Declarer.IRONCHESTENTITY);
    public static BlockItem ironChest = new BlockItem(ironChestBlock,new FabricItemSettings().group(tokenablefurnaces).rarity(Rarity.COMMON));
    public static Block goldChestBlock = new GoldChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), () -> Declarer.GOLDCHESTENTITY);
    public static BlockItem goldChest = new BlockItem(goldChestBlock,new FabricItemSettings().group(tokenablefurnaces).rarity(Rarity.UNCOMMON));
    public static Block diamondChestBlock = new DiamondChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), () -> Declarer.DIAMONDCHESTENTITY);
    public static BlockItem diamondChest = new BlockItem(diamondChestBlock,new FabricItemSettings().group(tokenablefurnaces).rarity(Rarity.RARE));
    public static Block netheriteChestBlock = new NetheriteChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST).resistance(1200F), () -> Declarer.NETHERITECHESTENTITY);
    public static BlockItem netheriteChest = new BlockItem(netheriteChestBlock,new FabricItemSettings().group(tokenablefurnaces).fireproof().rarity(Rarity.EPIC));
    public static Block amethystChestBlock = new AmethystChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), () -> Declarer.AMETHYSTCHESTENTITY);
    public static BlockItem amethystChest = new BlockItem(amethystChestBlock,new FabricItemSettings().group(tokenablefurnaces).rarity(Rarity.EPIC));

    public static Block dirtTrappedChestBlock = new DirtTrappedChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), () -> Declarer.DIRTTRAPPEDCHESTENTITY);
    public static BlockItem dirtTrappedChest = new BlockItem(dirtTrappedChestBlock,new FabricItemSettings().group(tokenablefurnaces).rarity(Rarity.COMMON));
    public static Block christmasTrappedChestBlock = new ChristmasTrappedChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), () -> Declarer.CHRISTMASTRAPPEDCHESTENTITY);
    public static BlockItem christmasTrappedChest = new BlockItem(christmasTrappedChestBlock,new FabricItemSettings().group(tokenablefurnaces).rarity(Rarity.COMMON));
    public static Block pumpkinTrappedChestBlock = new PumpkinTrappedChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), () -> Declarer.PUMPKINTRAPPEDCHESTENTITY);
    public static BlockItem pumpkinTrappedChest = new BlockItem(pumpkinTrappedChestBlock,new FabricItemSettings().group(tokenablefurnaces).rarity(Rarity.COMMON));
    public static Block ironTrappedChestBlock = new IronTrappedChestBlock(FabricBlockSettings.copyOf(Blocks.TRAPPED_CHEST), () -> Declarer.IRONTRAPPEDCHESTENTITY);
    public static BlockItem ironTrappedChest = new BlockItem(ironTrappedChestBlock,new FabricItemSettings().group(tokenablefurnaces).rarity(Rarity.COMMON));
    public static Block goldTrappedChestBlock = new GoldTrappedChestBlock(FabricBlockSettings.copyOf(Blocks.TRAPPED_CHEST), () -> Declarer.GOLDTRAPPEDCHESTENTITY);
    public static BlockItem goldTrappedChest = new BlockItem(goldTrappedChestBlock,new FabricItemSettings().group(tokenablefurnaces).rarity(Rarity.UNCOMMON));
    public static Block diamondTrappedChestBlock = new DiamondTrappedChestBlock(FabricBlockSettings.copyOf(Blocks.TRAPPED_CHEST), () -> Declarer.DIAMONDTRAPPEDCHESTENTITY);
    public static BlockItem diamondTrappedChest = new BlockItem(diamondTrappedChestBlock,new FabricItemSettings().group(tokenablefurnaces).rarity(Rarity.RARE));
    public static Block netheriteTrappedChestBlock = new NetheriteTrappedChestBlock(FabricBlockSettings.copyOf(Blocks.TRAPPED_CHEST).resistance(1200F), () -> Declarer.NETHERITETRAPPEDCHESTENTITY);
    public static BlockItem netheriteTrappedChest = new BlockItem(netheriteTrappedChestBlock,new FabricItemSettings().group(tokenablefurnaces).fireproof().rarity(Rarity.EPIC));
    public static Block amethystTrappedChestBlock = new AmethystTrappedChestBlock(FabricBlockSettings.copyOf(Blocks.TRAPPED_CHEST), () -> Declarer.AMETHYSTTRAPPEDCHESTENTITY);
    public static BlockItem amethystTrappedChest = new BlockItem(amethystTrappedChestBlock,new FabricItemSettings().group(tokenablefurnaces).rarity(Rarity.EPIC));
    
    public static Block ironShulkerBlock = new IronShulkerBlock(FabricBlockSettings.copyOf(Blocks.SHULKER_BOX), () -> Declarer.IRONSHULKERENTITY);
    public static BlockItem ironShulker = new BlockItem(ironShulkerBlock,new FabricItemSettings().group(tokenablefurnaces).rarity(Rarity.COMMON));
    public static Block goldShulkerBlock = new GoldShulkerBlock(FabricBlockSettings.copyOf(Blocks.SHULKER_BOX), () -> Declarer.GOLDSHULKERENTITY);
    public static BlockItem goldShulker = new BlockItem(goldShulkerBlock,new FabricItemSettings().group(tokenablefurnaces).rarity(Rarity.UNCOMMON));
    public static Block diamondShulkerBlock = new DiamondShulkerBlock(FabricBlockSettings.copyOf(Blocks.SHULKER_BOX), () -> Declarer.DIAMONDSHULKERENTITY);
    public static BlockItem diamondShulker = new BlockItem(diamondShulkerBlock,new FabricItemSettings().group(tokenablefurnaces).rarity(Rarity.RARE));
    public static Block netheriteShulkerBlock = new NetheriteShulkerBlock(FabricBlockSettings.copyOf(Blocks.SHULKER_BOX).resistance(1200F), () -> Declarer.NETHERITESHULKERENTITY);
    public static BlockItem netheriteShulker = new BlockItem(netheriteShulkerBlock,new FabricItemSettings().group(tokenablefurnaces).fireproof().rarity(Rarity.EPIC));
    public static Block amethystShulkerBlock = new AmethystShulkerBlock(FabricBlockSettings.copyOf(Blocks.SHULKER_BOX), () -> Declarer.AMETHYSTSHULKERENTITY);
    public static BlockItem amethystShulker = new BlockItem(amethystShulkerBlock,new FabricItemSettings().group(tokenablefurnaces).rarity(Rarity.EPIC));

    public static Block ironBarrelBlock = new IronBarrelBlock(FabricBlockSettings.copyOf(Blocks.BARREL));
    public static BlockItem ironBarrel = new BlockItem(ironBarrelBlock,new FabricItemSettings().group(tokenablefurnaces).rarity(Rarity.COMMON));
    public static Block goldBarrelBlock = new GoldBarrelBlock(FabricBlockSettings.copyOf(Blocks.BARREL));
    public static BlockItem goldBarrel = new BlockItem(goldBarrelBlock,new FabricItemSettings().group(tokenablefurnaces).rarity(Rarity.UNCOMMON));
    public static Block diamondBarrelBlock = new DiamondBarrelBlock(FabricBlockSettings.copyOf(Blocks.BARREL));
    public static BlockItem diamondBarrel = new BlockItem(diamondBarrelBlock,new FabricItemSettings().group(tokenablefurnaces).rarity(Rarity.RARE));
    public static Block netheriteBarrelBlock = new NetheriteBarrelBlock(FabricBlockSettings.copyOf(Blocks.BARREL).resistance(1200F));
    public static BlockItem netheriteBarrel = new BlockItem(netheriteBarrelBlock,new FabricItemSettings().group(tokenablefurnaces).fireproof().rarity(Rarity.EPIC));
    public static Block amethystBarrelBlock = new AmethystBarrelBlock(FabricBlockSettings.copyOf(Blocks.BARREL));
    public static BlockItem amethystBarrel = new BlockItem(amethystBarrelBlock,new FabricItemSettings().group(tokenablefurnaces).rarity(Rarity.EPIC));

    public static Item ironBundle = new ExtraBundleItem(new FabricItemSettings().group(tokenablefurnaces).rarity(Rarity.COMMON).maxCount(1),128);
    public static Item goldBundle = new ExtraBundleItem(new FabricItemSettings().group(tokenablefurnaces).rarity(Rarity.UNCOMMON).maxCount(1),192);
    public static Item diamondBundle = new ExtraBundleItem(new FabricItemSettings().group(tokenablefurnaces).rarity(Rarity.RARE).maxCount(1),256);
    public static Item netheriteBundle = new ExtraBundleItem(new FabricItemSettings().group(tokenablefurnaces).rarity(Rarity.EPIC).maxCount(1).fireproof(),256);
    public static Item amethystBundle = new ExtraBundleItem(new FabricItemSettings().group(tokenablefurnaces).rarity(Rarity.EPIC).maxCount(1),320);
}
