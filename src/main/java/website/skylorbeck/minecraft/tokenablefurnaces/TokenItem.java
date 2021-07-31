package website.skylorbeck.minecraft.tokenablefurnaces;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.block.entity.HopperBlockEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import website.skylorbeck.minecraft.tokenablefurnaces.barrels.ExtraBarrelBlock;
import website.skylorbeck.minecraft.tokenablefurnaces.barrels.ExtraBarrelEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.chests.ExtraChestBlock;
import website.skylorbeck.minecraft.tokenablefurnaces.chests.ExtraChestEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.chests.IronChestEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.chests.trapped.ExtraTrappedChestBlock;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.core.*;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.iron.IronExtraFurnaceEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.hoppers.ExtraHopperBlock;
import website.skylorbeck.minecraft.tokenablefurnaces.hoppers.ExtraHopperEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.mixins.*;
import website.skylorbeck.minecraft.tokenablefurnaces.shulkers.ExtraShulkerBlock;
import website.skylorbeck.minecraft.tokenablefurnaces.shulkers.ExtraShulkerEntity;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TokenItem extends Item {
    Tier tier;


    public TokenItem(Settings settings, Tier tier) {
        super(settings);
        this.tier = tier;
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        Boolean consume = false;
        World world = context.getWorld();
        BlockState block = world.getBlockState(context.getBlockPos());
        BlockPos blockPos = context.getBlockPos();
        if (block.isOf(Blocks.FURNACE) && (tier == Tier.Iron || tier == Tier.Omni)) {
            upgradeFurnace(world, block, blockPos, Tier.Iron);
            consume = true;
        } else if (block.isOf(Declarer.ironFurnaceBlock) && (tier == Tier.Gold || tier == Tier.Omni)) {
            upgradeFurnace(world, block, blockPos, Tier.Gold);
            consume = true;
        } else if (block.isOf(Declarer.goldFurnaceBlock) && (tier == Tier.Diamond || tier == Tier.Omni)) {
            upgradeFurnace(world, block, blockPos, Tier.Diamond);
            consume = true;
        } else if (block.isOf(Declarer.diamondFurnaceBlock) && (tier == Tier.Netherite || tier == Tier.Omni)) {
            upgradeFurnace(world, block, blockPos, Tier.Netherite);
            consume = true;
        } else if (block.isOf(Declarer.diamondFurnaceBlock) && (tier == Tier.Amethyst || tier == Tier.Omni)) {
            upgradeFurnace(world, block, blockPos, Tier.Amethyst);
            consume = true;
        } else if (block.isOf(Declarer.netheriteFurnaceBlock) && (tier == Tier.Omni)) {
            upgradeFurnace(world, block, blockPos, Tier.Amethyst);
            consume = true;
        }

        else if (block.isOf(Blocks.BLAST_FURNACE) && (tier == Tier.Iron || tier == Tier.Omni)) {
            upgradeBlastFurnace(world, block, blockPos, Tier.Iron);
            consume = true;
        } else if (block.isOf(Declarer.ironBlastBlock) && (tier == Tier.Gold || tier == Tier.Omni)) {
            upgradeBlastFurnace(world, block, blockPos, Tier.Gold);
            consume = true;
        } else if (block.isOf(Declarer.goldBlastBlock) && (tier == Tier.Diamond || tier == Tier.Omni)) {
            upgradeBlastFurnace(world, block, blockPos, Tier.Diamond);
            consume = true;
        } else if (block.isOf(Declarer.diamondBlastBlock) && (tier == Tier.Netherite || tier == Tier.Omni)) {
            upgradeBlastFurnace(world, block, blockPos, Tier.Netherite);
            consume = true;
        } else if (block.isOf(Declarer.diamondBlastBlock) && (tier == Tier.Amethyst || tier == Tier.Omni)) {
            upgradeBlastFurnace(world, block, blockPos, Tier.Amethyst);
            consume = true;
        } else if (block.isOf(Declarer.netheriteBlastBlock) && (tier == Tier.Omni)) {
            upgradeBlastFurnace(world, block, blockPos, Tier.Amethyst);
            consume = true;
        }
        
        else if (block.isOf(Blocks.SMOKER) && (tier == Tier.Iron || tier == Tier.Omni)) {
            upgradeSmoker(world, block, blockPos, Tier.Iron);
            consume = true;
        } else if (block.isOf(Declarer.ironSmokerBlock) && (tier == Tier.Gold || tier == Tier.Omni)) {
            upgradeSmoker(world, block, blockPos, Tier.Gold);
            consume = true;
        } else if (block.isOf(Declarer.goldSmokerBlock) && (tier == Tier.Diamond || tier == Tier.Omni)) {
            upgradeSmoker(world, block, blockPos, Tier.Diamond);
            consume = true;
        } else if (block.isOf(Declarer.diamondSmokerBlock) && (tier == Tier.Netherite || tier == Tier.Omni)) {
            upgradeSmoker(world, block, blockPos, Tier.Netherite);
            consume = true;
        } else if (block.isOf(Declarer.diamondSmokerBlock) && (tier == Tier.Amethyst || tier == Tier.Omni)) {
            upgradeSmoker(world, block, blockPos, Tier.Amethyst);
            consume = true;
        } else if (block.isOf(Declarer.netheriteSmokerBlock) && (tier == Tier.Omni)) {
            upgradeSmoker(world, block, blockPos, Tier.Amethyst);
            consume = true;
        }
        
        else if (block.isOf(Blocks.CHEST) && (tier == Tier.Iron || tier == Tier.Omni)) {
            upgradeChest(world, block, blockPos, Tier.Iron);
            consume = true;
        } else if (block.isOf(Declarer.ironChestBlock) && (tier == Tier.Gold || tier == Tier.Omni)) {
            upgradeChest(world, block, blockPos, Tier.Gold);
            consume = true;
        } else if (block.isOf(Declarer.goldChestBlock) && (tier == Tier.Diamond || tier == Tier.Omni)) {
            upgradeChest(world, block, blockPos, Tier.Diamond);
            consume = true;
        } else if (block.isOf(Declarer.diamondChestBlock) && (tier == Tier.Netherite || tier == Tier.Omni)) {
            upgradeChest(world, block, blockPos, Tier.Netherite);
            consume = true;
        } else if (block.isOf(Declarer.diamondChestBlock) && (tier == Tier.Amethyst || tier == Tier.Omni)) {
            upgradeChest(world, block, blockPos, Tier.Amethyst);
            consume = true;
        } else if (block.isOf(Declarer.netheriteChestBlock) && (tier == Tier.Omni)) {
            upgradeChest(world, block, blockPos, Tier.Amethyst);
            consume = true;
        }

        else if (block.isOf(Blocks.TRAPPED_CHEST) && (tier == Tier.Iron || tier == Tier.Omni)) {
            upgradeTrappedChest(world, block, blockPos, Tier.Iron);
            consume = true;
        } else if (block.isOf(Declarer.ironTrappedChestBlock) && (tier == Tier.Gold || tier == Tier.Omni)) {
            upgradeTrappedChest(world, block, blockPos, Tier.Gold);
            consume = true;
        } else if (block.isOf(Declarer.goldTrappedChestBlock) && (tier == Tier.Diamond || tier == Tier.Omni)) {
            upgradeTrappedChest(world, block, blockPos, Tier.Diamond);
            consume = true;
        } else if (block.isOf(Declarer.diamondTrappedChestBlock) && (tier == Tier.Netherite || tier == Tier.Omni)) {
            upgradeTrappedChest(world, block, blockPos, Tier.Netherite);
            consume = true;
        } else if (block.isOf(Declarer.diamondTrappedChestBlock) && (tier == Tier.Amethyst || tier == Tier.Omni)) {
            upgradeTrappedChest(world, block, blockPos, Tier.Amethyst);
            consume = true;
        } else if (block.isOf(Declarer.netheriteTrappedChestBlock) && (tier == Tier.Omni)) {
            upgradeTrappedChest(world, block, blockPos, Tier.Amethyst);
            consume = true;
        }

        else if (block.isOf(Blocks.BARREL) && (tier == Tier.Iron || tier == Tier.Omni)) {
            upgradeBarrel(world, block, blockPos, Tier.Iron);
            consume = true;
        } else if (block.isOf(Declarer.ironBarrelBlock) && (tier == Tier.Gold || tier == Tier.Omni)) {
            upgradeBarrel(world, block, blockPos, Tier.Gold);
            consume = true;
        } else if (block.isOf(Declarer.goldBarrelBlock) && (tier == Tier.Diamond || tier == Tier.Omni)) {
            upgradeBarrel(world, block, blockPos, Tier.Diamond);
            consume = true;
        } else if (block.isOf(Declarer.diamondBarrelBlock) && (tier == Tier.Netherite || tier == Tier.Omni)) {
            upgradeBarrel(world, block, blockPos, Tier.Netherite);
            consume = true;
        } else if (block.isOf(Declarer.diamondBarrelBlock) && (tier == Tier.Amethyst || tier == Tier.Omni)) {
            upgradeBarrel(world, block, blockPos, Tier.Amethyst);
            consume = true;
        } else if (block.isOf(Declarer.netheriteBarrelBlock) && (tier == Tier.Omni)) {
            upgradeBarrel(world, block, blockPos, Tier.Amethyst);
            consume = true;
        }

        else if (block.isOf(Blocks.SHULKER_BOX) && (tier == Tier.Iron || tier == Tier.Omni)) {
            upgradeShulker(world, block, blockPos, Tier.Iron);
            consume = true;
        } else if (block.isOf(Declarer.ironShulkerBlock) && (tier == Tier.Gold || tier == Tier.Omni)) {
            upgradeShulker(world, block, blockPos, Tier.Gold);
            consume = true;
        } else if (block.isOf(Declarer.goldShulkerBlock) && (tier == Tier.Diamond || tier == Tier.Omni)) {
            upgradeShulker(world, block, blockPos, Tier.Diamond);
            consume = true;
        } else if (block.isOf(Declarer.diamondShulkerBlock) && (tier == Tier.Netherite || tier == Tier.Omni)) {
            upgradeShulker(world, block, blockPos, Tier.Netherite);
            consume = true;
        } else if (block.isOf(Declarer.diamondShulkerBlock) && (tier == Tier.Amethyst || tier == Tier.Omni)) {
            upgradeShulker(world, block, blockPos, Tier.Amethyst);
            consume = true;
        } else if (block.isOf(Declarer.netheriteShulkerBlock) && (tier == Tier.Omni)) {
            upgradeShulker(world, block, blockPos, Tier.Amethyst);
            consume = true;
        }

        else if (block.isOf(Blocks.HOPPER) && (tier == Tier.Iron || tier == Tier.Omni)) {
            upgradeHopper(world, block, blockPos, Tier.Iron);
            consume = true;
        } else if (block.isOf(Declarer.ironHopperBlock) && (tier == Tier.Gold || tier == Tier.Omni)) {
            upgradeHopper(world, block, blockPos, Tier.Gold);
            consume = true;
        } else if (block.isOf(Declarer.goldHopperBlock) && (tier == Tier.Diamond || tier == Tier.Omni)) {
            upgradeHopper(world, block, blockPos, Tier.Diamond);
            consume = true;
        } else if (block.isOf(Declarer.diamondHopperBlock) && (tier == Tier.Netherite || tier == Tier.Omni)) {
            upgradeHopper(world, block, blockPos, Tier.Netherite);
            consume = true;
        } else if (block.isOf(Declarer.diamondHopperBlock) && (tier == Tier.Amethyst || tier == Tier.Omni)) {
            upgradeHopper(world, block, blockPos, Tier.Amethyst);
            consume = true;
        } else if (block.isOf(Declarer.netheriteHopperBlock) && (tier == Tier.Omni)) {
            upgradeHopper(world, block, blockPos, Tier.Amethyst);
            consume = true;
        }
        /*if (block.isOf(Blocks.FURNACE)|| block.getBlock() instanceof ExtraFurnaceBlock) {
            upgradeFurnace(world, block, blockPos, tier);
        } else if (block.isOf(Blocks.BLAST_FURNACE)|| block.getBlock() instanceof ExtraBlastFurnaceBlock) {
            upgradeBlastFurnace(world, block, blockPos, tier);
        } else if (block.isOf(Blocks.SMOKER)|| block.getBlock() instanceof ExtraSmokerBlock) {
            upgradeSmoker(world, block, blockPos, tier);
        } else if (block.isOf(Blocks.CHEST) || block.getBlock() instanceof ExtraChestBlock) {
            upgradeChest(world, block, blockPos, tier);
        } else if (block.isOf(Blocks.TRAPPED_CHEST) || block.getBlock() instanceof ExtraTrappedChestBlock){
            upgradeTrappedChest(world,block,blockPos,tier);
        } else if (block.isOf(Blocks.BARREL) || block.getBlock() instanceof ExtraBarrelBlock){
            upgradeBarrel(world,block,blockPos,tier);
        } else if (block.isOf(Blocks.SHULKER_BOX)|| block.getBlock() instanceof ExtraShulkerBlock){
            upgradeShulker(world,block,blockPos,tier);
        } else if (block.isOf(Blocks.HOPPER) || block.getBlock() instanceof ExtraHopperBlock){
            upgradeHopper(world,block,blockPos,tier);
        }*/
        if (this.tier != Tier.Omni && consume){
            context.getStack().decrement(1);
        }
        return ActionResult.CONSUME;
    }

    enum Tier {
        Iron,
        Gold,
        Diamond,
        Netherite,
        Amethyst,
        Omni
    }

    private void upgradeFurnaceType(World world, BlockState block, BlockPos blockPos, Block newBlock){
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
        } else {
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

    private void upgradeFurnace(World world, BlockState block, BlockPos blockPos,Tier tier){
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

    private void upgradeBlastFurnace(World world, BlockState block, BlockPos blockPos,Tier tier){
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

    private void upgradeSmoker(World world, BlockState block, BlockPos blockPos,Tier tier){
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

    private void upgradeChestType(World world,BlockState block,BlockPos blockPos, Block newBlock,DefaultedList<ItemStack> inventory, DefaultedList<ItemStack> newInventory){
        for (int i = 0; i <inventory.size() ; i++) {
            newInventory.set(i,inventory.get(i));
        }
        inventory.clear();
        world.setBlockState(blockPos,newBlock.getStateWithProperties(block));
        ((ExtraChestEntity)world.getBlockEntity(blockPos)).setInvStackList(newInventory);
    }

    private void upgradeChest(World world, BlockState block, BlockPos blockPos, Tier tier) {
        Block newBlock = block.getBlock();
        DefaultedList<ItemStack> inventory = ((ChestEntityAccessor)(world.getBlockEntity(blockPos))).getInventory();
        DefaultedList<ItemStack> newInventory = DefaultedList.ofSize(inventory.size());
        switch (tier){
            case Iron -> {
                newBlock = Declarer.ironChestBlock;
                newInventory = DefaultedList.ofSize(6*9,ItemStack.EMPTY);
            }
            case Gold -> {
                newBlock = Declarer.goldChestBlock;
                newInventory = DefaultedList.ofSize(6*15,ItemStack.EMPTY);
            }
            case Diamond -> {
                newBlock = Declarer.diamondChestBlock;
                newInventory = DefaultedList.ofSize(12*15,ItemStack.EMPTY);
            }
            case Netherite -> {
                newBlock = Declarer.netheriteChestBlock;
                newInventory = DefaultedList.ofSize(12*15,ItemStack.EMPTY);
            }
            case Amethyst -> {
                newBlock = Declarer.amethystChestBlock;
                newInventory = DefaultedList.ofSize(18*20,ItemStack.EMPTY);
            }
        }
        upgradeChestType(world,block,blockPos,newBlock,inventory,newInventory);
    }

    private void upgradeTrappedChest(World world, BlockState block, BlockPos blockPos, Tier tier) {
        Block newBlock = block.getBlock();
        DefaultedList<ItemStack> inventory = ((ChestEntityAccessor)(world.getBlockEntity(blockPos))).getInventory();
        DefaultedList<ItemStack> newInventory = DefaultedList.ofSize(inventory.size());
        switch (tier){
            case Iron -> {
                newBlock = Declarer.ironTrappedChestBlock;
                newInventory = DefaultedList.ofSize(6*9,ItemStack.EMPTY);
            }
            case Gold -> {
                newBlock = Declarer.goldTrappedChestBlock;
                newInventory = DefaultedList.ofSize(6*15,ItemStack.EMPTY);
            }
            case Diamond -> {
                newBlock = Declarer.diamondTrappedChestBlock;
                newInventory = DefaultedList.ofSize(12*15,ItemStack.EMPTY);
            }
            case Netherite -> {
                newBlock = Declarer.netheriteTrappedChestBlock;
                newInventory = DefaultedList.ofSize(12*15,ItemStack.EMPTY);
            }
            case Amethyst -> {
                newBlock = Declarer.amethystTrappedChestBlock;
                newInventory = DefaultedList.ofSize(18*20,ItemStack.EMPTY);
            }
        }
        upgradeChestType(world,block,blockPos,newBlock,inventory,newInventory);
    }

    private void upgradeBarrel(World world, BlockState block, BlockPos blockPos, Tier tier) {
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
                newInventory = DefaultedList.ofSize(6*15,ItemStack.EMPTY);
            }
            case Diamond -> {
                newBlock = Declarer.diamondBarrelBlock;
                newInventory = DefaultedList.ofSize(12*15,ItemStack.EMPTY);
            }
            case Netherite -> {
                newBlock = Declarer.netheriteBarrelBlock;
                newInventory = DefaultedList.ofSize(12*15,ItemStack.EMPTY);
            }
            case Amethyst -> {
                newBlock = Declarer.amethystBarrelBlock;
                newInventory = DefaultedList.ofSize(18*20,ItemStack.EMPTY);
            }
        }
        for (int i = 0; i <inventory.size() ; i++) {
            newInventory.set(i,inventory.get(i));
        }
        inventory.clear();
        world.setBlockState(blockPos,newBlock.getStateWithProperties(block));
        ((ExtraBarrelEntity)world.getBlockEntity(blockPos)).setInvStackList(newInventory);
    }
    
    private void upgradeShulker(World world, BlockState block, BlockPos blockPos, Tier tier) {
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
                newInventory = DefaultedList.ofSize(6*15,ItemStack.EMPTY);
            }
            case Diamond -> {
                newBlock = Declarer.diamondShulkerBlock;
                newInventory = DefaultedList.ofSize(12*15,ItemStack.EMPTY);
            }
            case Netherite -> {
                newBlock = Declarer.netheriteShulkerBlock;
                newInventory = DefaultedList.ofSize(12*15,ItemStack.EMPTY);
            }
            case Amethyst -> {
                newBlock = Declarer.amethystShulkerBlock;
                newInventory = DefaultedList.ofSize(18*20,ItemStack.EMPTY);
            }
        }
        for (int i = 0; i <inventory.size() ; i++) {
            newInventory.set(i,inventory.get(i));
        }
        inventory.clear();
        world.setBlockState(blockPos,newBlock.getStateWithProperties(block));
        ((ExtraShulkerEntity)world.getBlockEntity(blockPos)).setInvStackList(newInventory);
    }

    private void upgradeHopper(World world, BlockState block, BlockPos blockPos, Tier tier) {
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
