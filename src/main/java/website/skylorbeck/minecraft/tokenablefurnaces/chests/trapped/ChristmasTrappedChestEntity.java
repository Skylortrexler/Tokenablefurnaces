package website.skylorbeck.minecraft.tokenablefurnaces.chests.trapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import website.skylorbeck.minecraft.skylorlib.storage.ExtraTrappedChestEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;
import website.skylorbeck.minecraft.tokenablefurnaces.Ref;

public class ChristmasTrappedChestEntity extends ExtraTrappedChestEntity {
    protected ChristmasTrappedChestEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState,27,"christmas",true,false, Ref.MODID);
    }

    public ChristmasTrappedChestEntity(BlockPos pos, BlockState state) {
        super(Declarer.CHRISTMASTRAPPEDCHESTENTITY,pos, state,27,"christmas",true,false, Ref.MODID);
    }

    protected Text getContainerName() {
        return Text.translatable("container.festivechest");
    }
    protected Text getDoubleContainerName(){
        return Text.translatable("container.festivechestdouble");
    }
}
