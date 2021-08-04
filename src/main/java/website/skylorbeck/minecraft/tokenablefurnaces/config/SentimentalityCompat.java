package website.skylorbeck.minecraft.tokenablefurnaces.config;

import net.minecraft.block.BlockState;

import java.util.logging.Level;
import java.util.logging.Logger;


public class SentimentalityCompat {
static Class<?> Declarer;
    {
        try {
            Declarer = Class.forName("website.skylorbeck.sentimentality3.sentimentality3.Declarer");
        } catch (ClassNotFoundException e) {
            Logger.getGlobal().log(Level.SEVERE,e.getException().toString());
        }
    }

    public static boolean furnaces(BlockState block) {
        return false; /*block.isOf(Declarer.sandstone_blast_furnaceblock)
                || block.isOf(Declarer.red_sandstone_blast_furnaceblock)
                || block.isOf(Declarer.andesite_blast_furnaceblock)
                || block.isOf(Declarer.granite_blast_furnaceblock)
                || block.isOf(Declarer.diorite_blast_furnaceblock)
                || block.isOf(Declarer.netherrack_blast_furnaceblock)
                || block.isOf(Declarer.blackstone_blast_furnaceblock)
                || block.isOf(Declarer.basalt_blast_furnaceblock)
                || block.isOf(Declarer.endstone_blast_furnaceblock)
                || block.isOf(Declarer.deepslate_blast_furnaceblock);*/
    }
    public static boolean blasts(BlockState block) {
        return false; /*block.isOf(sandstone_blast_furnaceblock)
                ||block.isOf(red_sandstone_blast_furnaceblock)
                ||block.isOf(andesite_blast_furnaceblock)
                ||block.isOf(granite_blast_furnaceblock)
                ||block.isOf(diorite_blast_furnaceblock)
                ||block.isOf(netherrack_blast_furnaceblock)
                ||block.isOf(blackstone_blast_furnaceblock)
                ||block.isOf(basalt_blast_furnaceblock)
                ||block.isOf(endstone_blast_furnaceblock)
                ||block.isOf(deepslate_blast_furnaceblock);*/
    }
    public static boolean smokers(BlockState block) {
        return false; /*block.isOf(sandstone_smokerblock)
                ||block.isOf(red_sandstone_smokerblock)
                ||block.isOf(andesite_smokerblock)
                ||block.isOf(granite_smokerblock)
                ||block.isOf(diorite_smokerblock)
                ||block.isOf(netherrack_smokerblock)
                ||block.isOf(blackstone_smokerblock)
                ||block.isOf(basalt_smokerblock)
                ||block.isOf(endstone_smokerblock)
                ||block.isOf(deepslate_smokerblock);*/
    }
}
