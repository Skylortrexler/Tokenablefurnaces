package website.skylorbeck.minecraft.tokenablefurnaces;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.HopperBlockEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import website.skylorbeck.minecraft.skylorlib.furnaces.AbstractExtraFurnaceBlockEntity;
import website.skylorbeck.minecraft.skylorlib.hoppers.ExtraHopperEntity;
import website.skylorbeck.minecraft.skylorlib.storage.ExtraBarrelEntity;
import website.skylorbeck.minecraft.skylorlib.storage.ExtraChestEntity;
import website.skylorbeck.minecraft.skylorlib.storage.ExtraShulkerEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.mixins.BarrelEntityAccessor;
import website.skylorbeck.minecraft.tokenablefurnaces.mixins.ChestEntityAccessor;
import website.skylorbeck.minecraft.tokenablefurnaces.mixins.FurnaceEntityAccessor;
import website.skylorbeck.minecraft.tokenablefurnaces.mixins.ShulkerEntityAccessor;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TierHelper {
    public enum Tier {
        Iron,
        Gold,
        Diamond,
        Netherite,
        Amethyst,
        Omni
    }

    public static void upgradeFurnaceType(World world, BlockState block, BlockPos blockPos, Block newBlock){
        BlockEntity furnaceEntity;
        DefaultedList<ItemStack> inventory;
        int burnTime;
        int fuelTime;
        int cookTime;
        int cookTimeTotal;
        if (block.isOf(Blocks.FURNACE) || block.isOf(Blocks.BLAST_FURNACE) || block.isOf(Blocks.SMOKER) ) {
            furnaceEntity = ((AbstractFurnaceBlockEntity) world.getBlockEntity(blockPos));
            inventory = ((FurnaceEntityAccessor) furnaceEntity).getInventory();
            burnTime = ((FurnaceEntityAccessor) furnaceEntity).getBurnTime();
            fuelTime = ((FurnaceEntityAccessor) furnaceEntity).getFuelTime();
            cookTime = ((FurnaceEntityAccessor) furnaceEntity).getCookTime();
            cookTimeTotal = ((FurnaceEntityAccessor) furnaceEntity).getCookTimeTotal();
        }
        else {
            furnaceEntity = ((AbstractExtraFurnaceBlockEntity) world.getBlockEntity(blockPos));
            inventory = ((AbstractExtraFurnaceBlockEntity) furnaceEntity).inventory;
            burnTime = ((AbstractExtraFurnaceBlockEntity) furnaceEntity).burnTime;
            fuelTime = ((AbstractExtraFurnaceBlockEntity) furnaceEntity).fuelTime;
            cookTime = ((AbstractExtraFurnaceBlockEntity) furnaceEntity).cookTime;
            cookTimeTotal = ((AbstractExtraFurnaceBlockEntity) furnaceEntity).cookTimeTotal;
        }



        DefaultedList<ItemStack> newInventory = DefaultedList.ofSize(3,ItemStack.EMPTY);
        for (int i = 0; i <inventory.size() ; i++) {
            newInventory.set(i,inventory.get(i));
        }
        inventory.clear();
        world.setBlockState(blockPos,newBlock.getStateWithProperties(block));

        AbstractExtraFurnaceBlockEntity extraFurnaceBlockEntity = ((AbstractExtraFurnaceBlockEntity)world.getBlockEntity(blockPos));
        extraFurnaceBlockEntity.setInvStackList(newInventory);
        extraFurnaceBlockEntity.burnTime = burnTime;
        extraFurnaceBlockEntity.fuelTime = fuelTime;
        extraFurnaceBlockEntity.cookTime = cookTime;
        extraFurnaceBlockEntity.cookTimeTotal = cookTimeTotal;
    }

    public static void upgradeFurnace(World world, BlockState block, BlockPos blockPos,Tier tier){
        Block newBlock = block.getBlock();
        switch (tier){
            case Iron -> newBlock = Declarer.ironFurnaceBlock;
            case Gold -> newBlock = Declarer.goldFurnaceBlock;
            case Diamond -> newBlock = Declarer.diamondFurnaceBlock;
            case Netherite -> newBlock = Declarer.netheriteFurnaceBlock;
            case Amethyst -> newBlock = Declarer.amethystFurnaceBlock;
        }
        upgradeFurnaceType(world,block,blockPos,newBlock);
    }

    public static void upgradeBlastFurnace(World world, BlockState block, BlockPos blockPos,Tier tier){
        Block newBlock = block.getBlock();
        switch (tier){
            case Iron -> newBlock = Declarer.ironBlastBlock;
            case Gold -> newBlock = Declarer.goldBlastBlock;
            case Diamond -> newBlock = Declarer.diamondBlastBlock;
            case Netherite -> newBlock = Declarer.netheriteBlastBlock;
            case Amethyst -> newBlock = Declarer.amethystBlastBlock;
        }
        upgradeFurnaceType(world,block,blockPos,newBlock);
    }

    public static void upgradeSmoker(World world, BlockState block, BlockPos blockPos,Tier tier){
        Block newBlock = block.getBlock();
        switch (tier){
            case Iron -> newBlock = Declarer.ironSmokerBlock;
            case Gold -> newBlock = Declarer.goldSmokerBlock;
            case Diamond -> newBlock = Declarer.diamondSmokerBlock;
            case Netherite -> newBlock = Declarer.netheriteSmokerBlock;
            case Amethyst -> newBlock = Declarer.amethystSmokerBlock;
        }
        upgradeFurnaceType(world,block,blockPos,newBlock);
    }

    public static void upgradeChestType(World world,BlockState block,BlockPos blockPos, Block newBlock,DefaultedList<ItemStack> inventory, DefaultedList<ItemStack> newInventory){
        for (int i = 0; i <inventory.size() ; i++) {
            newInventory.set(i,inventory.get(i));
        }
        inventory.clear();
        world.setBlockState(blockPos,newBlock.getStateWithProperties(block));
        ((ExtraChestEntity)world.getBlockEntity(blockPos)).setInvStackList(newInventory);
    }

    public static void upgradeChest(World world, BlockState block, BlockPos blockPos, Tier tier) {
        Block newBlock = block.getBlock();
        DefaultedList<ItemStack> inventory;
        if (world.getBlockEntity(blockPos) instanceof ExtraChestEntity){
            inventory = ((ExtraChestEntity)world.getBlockEntity(blockPos)).inventory;
        } else {
            inventory =((ChestEntityAccessor) (world.getBlockEntity(blockPos))).getInventory();
        }
        DefaultedList<ItemStack> newInventory = DefaultedList.ofSize(inventory.size());
        switch (tier){
            case Iron -> {
                newBlock = Declarer.ironChestBlock;
                newInventory = DefaultedList.ofSize(6*9,ItemStack.EMPTY);
            }
            case Gold -> {
                newBlock = Declarer.goldChestBlock;
                newInventory = DefaultedList.ofSize(12*9,ItemStack.EMPTY);
            }
            case Diamond -> {
                newBlock = Declarer.diamondChestBlock;
                newInventory = DefaultedList.ofSize(24*9,ItemStack.EMPTY);
            }
            case Netherite -> {
                newBlock = Declarer.netheriteChestBlock;
                newInventory = DefaultedList.ofSize(24*9,ItemStack.EMPTY);
            }
            case Amethyst -> {
                newBlock = Declarer.amethystChestBlock;
                newInventory = DefaultedList.ofSize(48*9,ItemStack.EMPTY);
            }
        }
        upgradeChestType(world,block,blockPos,newBlock,inventory,newInventory);
    }

    public static void upgradeTrappedChest(World world, BlockState block, BlockPos blockPos, Tier tier) {
        Block newBlock = block.getBlock();
        DefaultedList<ItemStack> inventory ;
        if (world.getBlockEntity(blockPos) instanceof ExtraChestEntity){
            inventory = ((ExtraChestEntity)world.getBlockEntity(blockPos)).inventory;
        } else {
            inventory =((ChestEntityAccessor) (world.getBlockEntity(blockPos))).getInventory();
        }
        DefaultedList<ItemStack> newInventory = DefaultedList.ofSize(inventory.size());
        switch (tier){
            case Iron -> {
                newBlock = Declarer.ironTrappedChestBlock;
                newInventory = DefaultedList.ofSize(6*9,ItemStack.EMPTY);
            }
            case Gold -> {
                newBlock = Declarer.goldTrappedChestBlock;
                newInventory = DefaultedList.ofSize(12*9,ItemStack.EMPTY);
            }
            case Diamond -> {
                newBlock = Declarer.diamondTrappedChestBlock;
                newInventory = DefaultedList.ofSize(24*9,ItemStack.EMPTY);
            }
            case Netherite -> {
                newBlock = Declarer.netheriteTrappedChestBlock;
                newInventory = DefaultedList.ofSize(24*9,ItemStack.EMPTY);
            }
            case Amethyst -> {
                newBlock = Declarer.amethystTrappedChestBlock;
                newInventory = DefaultedList.ofSize(48*9,ItemStack.EMPTY);
            }
        }
        upgradeChestType(world,block,blockPos,newBlock,inventory,newInventory);
    }

    public static void upgradeBarrel(World world, BlockState block, BlockPos blockPos, Tier tier) {
        Block newBlock = block.getBlock();
        DefaultedList<ItemStack> inventory;
        if (block.isOf(Blocks.BARREL)){
            inventory = ((BarrelEntityAccessor)(world.getBlockEntity(blockPos))).getInventory();
        } else {
            inventory = ((ExtraBarrelEntity)(world.getBlockEntity(blockPos))).inventory;
        }
        DefaultedList<ItemStack> newInventory = DefaultedList.ofSize(inventory.size());
        switch (tier){
            case Iron -> {
                newBlock = Declarer.ironBarrelBlock;
                newInventory = DefaultedList.ofSize(6*9,ItemStack.EMPTY);
            }
            case Gold -> {
                newBlock = Declarer.goldBarrelBlock;
                newInventory = DefaultedList.ofSize(12*9,ItemStack.EMPTY);
            }
            case Diamond -> {
                newBlock = Declarer.diamondBarrelBlock;
                newInventory = DefaultedList.ofSize(24*9,ItemStack.EMPTY);
            }
            case Netherite -> {
                newBlock = Declarer.netheriteBarrelBlock;
                newInventory = DefaultedList.ofSize(24*9,ItemStack.EMPTY);
            }
            case Amethyst -> {
                newBlock = Declarer.amethystBarrelBlock;
                newInventory = DefaultedList.ofSize(48*9,ItemStack.EMPTY);
            }
        }
        for (int i = 0; i <inventory.size() ; i++) {
            newInventory.set(i,inventory.get(i));
        }
        inventory.clear();
        world.setBlockState(blockPos,newBlock.getStateWithProperties(block));
        ((ExtraBarrelEntity)world.getBlockEntity(blockPos)).setInvStackList(newInventory);
    }

    public static void upgradeShulker(World world, BlockState block, BlockPos blockPos, Tier tier) {
        Block newBlock = block.getBlock();
        DefaultedList<ItemStack> inventory;
        if (block.isOf(Blocks.SHULKER_BOX)){
            inventory = ((ShulkerEntityAccessor)(world.getBlockEntity(blockPos))).getInventory();
        } else {
            inventory = ((ExtraShulkerEntity)(world.getBlockEntity(blockPos))).inventory;
        }
        DefaultedList<ItemStack> newInventory = DefaultedList.ofSize(inventory.size());
        switch (tier){
            case Iron -> {
                newBlock = Declarer.ironShulkerBlock;
                newInventory = DefaultedList.ofSize(6*9,ItemStack.EMPTY);
            }
            case Gold -> {
                newBlock = Declarer.goldShulkerBlock;
                newInventory = DefaultedList.ofSize(12*9,ItemStack.EMPTY);
            }
            case Diamond -> {
                newBlock = Declarer.diamondShulkerBlock;
                newInventory = DefaultedList.ofSize(24*9,ItemStack.EMPTY);
            }
            case Netherite -> {
                newBlock = Declarer.netheriteShulkerBlock;
                newInventory = DefaultedList.ofSize(24*9,ItemStack.EMPTY);
            }
            case Amethyst -> {
                newBlock = Declarer.amethystShulkerBlock;
                newInventory = DefaultedList.ofSize(48*9,ItemStack.EMPTY);
            }
        }
        for (int i = 0; i <inventory.size() ; i++) {
            newInventory.set(i,inventory.get(i));
        }
        inventory.clear();
        world.setBlockState(blockPos,newBlock.getStateWithProperties(block));
        ((ExtraShulkerEntity)world.getBlockEntity(blockPos)).setInvStackList(newInventory);
    }

    public static void upgradeHopper(World world, BlockState block, BlockPos blockPos, Tier tier) {
        Block newBlock = block.getBlock();
        switch (tier){
            case Iron -> newBlock = Declarer.ironHopperBlock;
            case Gold -> newBlock = Declarer.goldHopperBlock;
            case Diamond -> newBlock = Declarer.diamondHopperBlock;
            case Netherite -> newBlock = Declarer.netheriteHopperBlock;
            case Amethyst -> newBlock = Declarer.amethystHopperBlock;
        }
        Inventory inventory = HopperBlockEntity.getInventoryAt(world,blockPos);
        DefaultedList<ItemStack> newInventory = DefaultedList.ofSize(5,ItemStack.EMPTY);
        for (int i = 0; i <5 ; i++) {
            newInventory.set(i,inventory.getStack(i).copy());
            Logger.getGlobal().log(Level.SEVERE,newInventory.get(i).toString());
        }
        inventory.clear();
        world.setBlockState(blockPos,newBlock.getStateWithProperties(block));
        for (int i = 0; i <5 ; i++) {
            ExtraHopperEntity.getInventoryAt(world,blockPos).setStack(i,newInventory.get(i));
        }
    }
}
