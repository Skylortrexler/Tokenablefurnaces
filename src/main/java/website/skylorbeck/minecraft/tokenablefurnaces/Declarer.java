package website.skylorbeck.minecraft.tokenablefurnaces;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.amethyst.*;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.core.ExtraBlastFurnaceBlockEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.core.ExtraFurnaceBlockEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.core.ExtraSmokerBlockEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.diamond.*;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.gold.*;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.iron.*;
import website.skylorbeck.minecraft.tokenablefurnaces.hoppers.*;

public class Declarer {
    public static BlockEntityType<ExtraFurnaceBlockEntity> EXTRA_FURNACE_ENTITY;
    public static BlockEntityType<ExtraBlastFurnaceBlockEntity> EXTRA_BLAST_FURNACE_ENTITY;
    public static BlockEntityType<ExtraSmokerBlockEntity> EXTRA_SMOKER_FURNACE_ENTITY;

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

    public static BlockEntityType<ExtraHopperEntity> EXTRAHOPPERENTITY;
    public static BlockEntityType<IronHopperEntity> IRONHOPPERENTITY;
    public static BlockEntityType<GoldHopperEntity> GOLDHOPPERENTITY;
    public static BlockEntityType<DiamondHopperEntity> DIAMONDHOPPERENTITY;
    public static BlockEntityType<AmethystHopperEntity> AMETHYSTHOPPERENTITY;

    public static Block ironFurnaceBlock = new IronExtraFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE).breakByTool(FabricToolTags.PICKAXES),0);
    public static final BlockItem ironFurnace = new BlockItem(ironFurnaceBlock, new FabricItemSettings().group(ItemGroup.DECORATIONS));
    public static Block ironBlastBlock = new IronExtraBlastBlock(FabricBlockSettings.copyOf(Blocks.BLAST_FURNACE).breakByTool(FabricToolTags.PICKAXES));
    public static final BlockItem ironBlast = new BlockItem(ironBlastBlock, new FabricItemSettings().group(ItemGroup.DECORATIONS));
    public static Block ironSmokerBlock = new IronExtraSmokerBlock(FabricBlockSettings.copyOf(Blocks.FURNACE).breakByTool(FabricToolTags.PICKAXES));
    public static final BlockItem ironSmoker = new BlockItem(ironSmokerBlock, new FabricItemSettings().group(ItemGroup.DECORATIONS));

    public static Block goldFurnaceBlock = new GoldExtraFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE).breakByTool(FabricToolTags.PICKAXES),0);
    public static final BlockItem goldFurnace = new BlockItem(goldFurnaceBlock, new FabricItemSettings().group(ItemGroup.DECORATIONS));
    public static Block goldBlastBlock = new GoldExtraBlastBlock(FabricBlockSettings.copyOf(Blocks.BLAST_FURNACE).breakByTool(FabricToolTags.PICKAXES));
    public static final BlockItem goldBlast = new BlockItem(goldBlastBlock, new FabricItemSettings().group(ItemGroup.DECORATIONS));
    public static Block goldSmokerBlock = new GoldExtraSmokerBlock(FabricBlockSettings.copyOf(Blocks.FURNACE).breakByTool(FabricToolTags.PICKAXES));
    public static final BlockItem goldSmoker = new BlockItem(goldSmokerBlock, new FabricItemSettings().group(ItemGroup.DECORATIONS));

    public static Block diamondFurnaceBlock = new DiamondExtraFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE).breakByTool(FabricToolTags.PICKAXES),0);
    public static final BlockItem diamondFurnace = new BlockItem(diamondFurnaceBlock, new FabricItemSettings().group(ItemGroup.DECORATIONS));
    public static Block diamondBlastBlock = new DiamondExtraBlastBlock(FabricBlockSettings.copyOf(Blocks.BLAST_FURNACE).breakByTool(FabricToolTags.PICKAXES));
    public static final BlockItem diamondBlast = new BlockItem(diamondBlastBlock, new FabricItemSettings().group(ItemGroup.DECORATIONS));
    public static Block diamondSmokerBlock = new DiamondExtraSmokerBlock(FabricBlockSettings.copyOf(Blocks.FURNACE).breakByTool(FabricToolTags.PICKAXES));
    public static final BlockItem diamondSmoker = new BlockItem(diamondSmokerBlock, new FabricItemSettings().group(ItemGroup.DECORATIONS));

    public static Block netheriteFurnaceBlock = new DiamondExtraFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE).breakByTool(FabricToolTags.PICKAXES).resistance(1200F),0);
    public static final BlockItem netheriteFurnace = new BlockItem(netheriteFurnaceBlock, new FabricItemSettings().group(ItemGroup.DECORATIONS).fireproof());
    public static Block netheriteBlastBlock = new DiamondExtraBlastBlock(FabricBlockSettings.copyOf(Blocks.BLAST_FURNACE).breakByTool(FabricToolTags.PICKAXES).resistance(1200F));
    public static final BlockItem netheriteBlast = new BlockItem(netheriteBlastBlock, new FabricItemSettings().group(ItemGroup.DECORATIONS).fireproof());
    public static Block netheriteSmokerBlock = new DiamondExtraSmokerBlock(FabricBlockSettings.copyOf(Blocks.FURNACE).breakByTool(FabricToolTags.PICKAXES).resistance(1200F));
    public static final BlockItem netheriteSmoker = new BlockItem(netheriteSmokerBlock, new FabricItemSettings().group(ItemGroup.DECORATIONS).fireproof());

    public static Block amethystFurnaceBlock = new AmethystExtraFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE).breakByTool(FabricToolTags.PICKAXES),0);
    public static final BlockItem amethystFurnace = new BlockItem(amethystFurnaceBlock, new FabricItemSettings().group(ItemGroup.DECORATIONS));
    public static Block amethystBlastBlock = new AmethystExtraBlastBlock(FabricBlockSettings.copyOf(Blocks.BLAST_FURNACE).breakByTool(FabricToolTags.PICKAXES));
    public static final BlockItem amethystBlast = new BlockItem(amethystBlastBlock, new FabricItemSettings().group(ItemGroup.DECORATIONS));
    public static Block amethystSmokerBlock = new AmethystExtraSmokerBlock(FabricBlockSettings.copyOf(Blocks.FURNACE).breakByTool(FabricToolTags.PICKAXES));
    public static final BlockItem amethystSmoker = new BlockItem(amethystSmokerBlock, new FabricItemSettings().group(ItemGroup.DECORATIONS));

    public static Block ironHopperBlock = new IronHopperBlock(FabricBlockSettings.copyOf(Blocks.HOPPER).breakByTool(FabricToolTags.PICKAXES));
    public static final BlockItem ironHopper = new BlockItem(ironHopperBlock, new FabricItemSettings().group(ItemGroup.REDSTONE));
    public static Block goldHopperBlock = new GoldHopperBlock(FabricBlockSettings.copyOf(Blocks.HOPPER).breakByTool(FabricToolTags.PICKAXES));
    public static final BlockItem goldHopper = new BlockItem(goldHopperBlock, new FabricItemSettings().group(ItemGroup.REDSTONE));
    public static Block diamondHopperBlock = new DiamondHopperBlock(FabricBlockSettings.copyOf(Blocks.HOPPER).breakByTool(FabricToolTags.PICKAXES));
    public static final BlockItem diamondHopper = new BlockItem(diamondHopperBlock, new FabricItemSettings().group(ItemGroup.REDSTONE));
    public static Block netheriteHopperBlock = new DiamondHopperBlock(FabricBlockSettings.copyOf(Blocks.HOPPER).breakByTool(FabricToolTags.PICKAXES).resistance(1200F));
    public static final BlockItem netheriteHopper = new BlockItem(netheriteHopperBlock, new FabricItemSettings().group(ItemGroup.REDSTONE).fireproof());
    public static Block amethystHopperBlock = new AmethystHopperBlock(FabricBlockSettings.copyOf(Blocks.HOPPER).breakByTool(FabricToolTags.PICKAXES));
    public static final BlockItem amethystHopper = new BlockItem(amethystHopperBlock, new FabricItemSettings().group(ItemGroup.REDSTONE));
}
