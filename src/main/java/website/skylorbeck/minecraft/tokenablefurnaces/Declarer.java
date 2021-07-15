package website.skylorbeck.minecraft.tokenablefurnaces;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.*;

public class Declarer {
    public static BlockEntityType<ExtraFurnaceBlockEntity> EXTRA_FURNACE_ENTITY;
    public static BlockEntityType<ExtraBlastFurnaceBlockEntity> EXTRA_BLAST_FURNACE_ENTITY;
    public static BlockEntityType<ExtraSmokerBlockEntity> EXTRA_SMOKER_FURNACE_ENTITY;

    public static Block ironFurnaceBlock = new ExtraFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE).breakByTool(FabricToolTags.PICKAXES),0);
    public static final BlockItem ironFurnace = new BlockItem(ironFurnaceBlock, new FabricItemSettings().group(ItemGroup.DECORATIONS));
    public static Block ironBlastBlock = new ExtraBlastFurnaceBlock(FabricBlockSettings.copyOf(Blocks.BLAST_FURNACE).breakByTool(FabricToolTags.PICKAXES));
    public static final BlockItem ironBlast = new BlockItem(ironBlastBlock, new FabricItemSettings().group(ItemGroup.DECORATIONS));
    public static Block ironSmokerBlock = new ExtraSmokerBlock(FabricBlockSettings.copyOf(Blocks.FURNACE).breakByTool(FabricToolTags.PICKAXES));
    public static final BlockItem ironSmoker = new BlockItem(ironSmokerBlock, new FabricItemSettings().group(ItemGroup.DECORATIONS));

}
