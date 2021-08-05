package website.skylorbeck.minecraft.tokenablefurnaces.chests.trapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;

public class NetheriteTrappedChestEntity extends ExtraTrappedChestEntity {
    protected NetheriteTrappedChestEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState,24*9,"netherite",false);
    }

    public NetheriteTrappedChestEntity(BlockPos pos, BlockState state) {
        super(Declarer.NETHERITETRAPPEDCHESTENTITY,pos, state,24*9,"netherite",false);
    }
}
