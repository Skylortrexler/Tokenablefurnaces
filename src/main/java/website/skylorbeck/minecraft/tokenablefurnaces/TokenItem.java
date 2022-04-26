package website.skylorbeck.minecraft.tokenablefurnaces;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import website.skylorbeck.minecraft.skylorlib.furnaces.ExtraBlastFurnaceBlock;
import website.skylorbeck.minecraft.skylorlib.furnaces.ExtraFurnaceBlock;
import website.skylorbeck.minecraft.skylorlib.furnaces.ExtraSmokerBlock;
import website.skylorbeck.minecraft.tokenablefurnaces.mixins.TokenItemAccessor;

import java.util.List;

import static website.skylorbeck.minecraft.tokenablefurnaces.TierHelper.*;


public class TokenItem extends Item {
    Tier tier;
    boolean furn = false;


    public TokenItem(Settings settings, Tier tier) {
        super(settings);
        this.tier = tier;
        if (this.tier == Tier.Omni){
            ((TokenItemAccessor)this).setRecipeRemainder(this);
        }
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        furn = false;
        boolean consume = false;
        World world = context.getWorld();
        BlockState block = world.getBlockState(context.getBlockPos());
        BlockPos blockPos = context.getBlockPos();
        if (Ref.canUpgradeFurnaces) {
            furn = block.getBlock() instanceof ExtraFurnaceBlock && (!block.isOf(Declarer.ironFurnaceBlock)
                    &&!block.isOf(Declarer.goldFurnaceBlock)
                    &&!block.isOf(Declarer.diamondFurnaceBlock)
                    &&!block.isOf(Declarer.netheriteFurnaceBlock)
                    &&!block.isOf(Declarer.amethystFurnaceBlock));
            if ((block.isOf(Blocks.FURNACE) || furn) && (tier == Tier.Iron || tier == Tier.Omni)) {
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
            if (this.tier != Tier.Omni && consume) {
                context.getStack().decrement(1);
                return ActionResult.CONSUME;
            }
        }
        if (Ref.canUpgradeBlast) {
            furn = block.getBlock() instanceof ExtraBlastFurnaceBlock && (!block.isOf(Declarer.ironBlastBlock)
                    &&!block.isOf(Declarer.goldBlastBlock)
                    &&!block.isOf(Declarer.diamondBlastBlock)
                    &&!block.isOf(Declarer.netheriteBlastBlock)
                    &&!block.isOf(Declarer.amethystBlastBlock));
            if ((block.isOf(Blocks.BLAST_FURNACE) || furn)&& (tier == Tier.Iron || tier == Tier.Omni)) {
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
            if (this.tier != Tier.Omni && consume) {
                context.getStack().decrement(1);
                return ActionResult.CONSUME;
            }
        }
        if (Ref.canUpgradeSmoker) {
            furn = block.getBlock() instanceof ExtraSmokerBlock && (!block.isOf(Declarer.ironSmokerBlock)
                    &&!block.isOf(Declarer.goldSmokerBlock)
                    &&!block.isOf(Declarer.diamondSmokerBlock)
                    &&!block.isOf(Declarer.netheriteSmokerBlock)
                    &&!block.isOf(Declarer.amethystSmokerBlock));
            if ((block.isOf(Blocks.SMOKER) || furn) && (tier == Tier.Iron || tier == Tier.Omni)) {
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
            if (this.tier != Tier.Omni && consume) {
                context.getStack().decrement(1);
                return ActionResult.CONSUME;
            }
        }
        if (Ref.canUpgradeChests) {
            if (block.isOf(Blocks.CHEST) && (tier == Tier.Iron || tier == Tier.Omni)) {
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
            if (this.tier != Tier.Omni && consume) {
                context.getStack().decrement(1);
                return ActionResult.CONSUME;
            }
        }
        if (Ref.canUpgradeTrapped) {
            if (block.isOf(Blocks.TRAPPED_CHEST) && (tier == Tier.Iron || tier == Tier.Omni)) {
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
            if (this.tier != Tier.Omni && consume) {
                context.getStack().decrement(1);
                return ActionResult.CONSUME;
            }
        }
        if (Ref.canUpgradeBarrels) {
            if (block.isOf(Blocks.BARREL) && (tier == Tier.Iron || tier == Tier.Omni)) {
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
            if (this.tier != Tier.Omni && consume) {
                context.getStack().decrement(1);
                return ActionResult.CONSUME;
            }
        }
        if (Ref.canUpgradeShulkers) {
            if (block.isOf(Blocks.SHULKER_BOX) && (tier == Tier.Iron || tier == Tier.Omni)) {
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
            if (this.tier != Tier.Omni && consume) {
                context.getStack().decrement(1);
                return ActionResult.CONSUME;
            }
        }
        if (Ref.canUpgradeHoppers) {
            if (block.isOf(Blocks.HOPPER) && (tier == Tier.Iron || tier == Tier.Omni)) {
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
            if (this.tier != Tier.Omni && consume) {
                context.getStack().decrement(1);
                return ActionResult.CONSUME;
            }
        }
        return ActionResult.CONSUME;
    }



    @Override
    public boolean hasGlint(ItemStack stack) {
        return this.tier == Tier.Omni;
    }

    @Override
    public boolean hasRecipeRemainder() {
        return this.tier == Tier.Omni;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.of("Right click on"));
        tooltip.add(Text.of("Furnaces or Storage"));
        tooltip.add(Text.of("to upgrade them"));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
