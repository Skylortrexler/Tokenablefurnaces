package website.skylorbeck.minecraft.tokenablefurnaces.hoppers;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import website.skylorbeck.minecraft.skylorlib.hoppers.ExtraHopperEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;
import website.skylorbeck.minecraft.tokenablefurnaces.Ref;

public class AmethystHopperEntity extends ExtraHopperEntity {
    public AmethystHopperEntity(BlockPos pos, BlockState state) {
        super(Declarer.AMETHYSTHOPPERENTITY,pos, state,8 * Ref.hopperMulti);
    }

    public static <T extends BlockEntity> void serverTick(World world, BlockPos blockPos, BlockState state, T t) {
   ExtraHopperEntity.serverTick(world,blockPos,state,(ExtraHopperEntity)t);
    }
}
