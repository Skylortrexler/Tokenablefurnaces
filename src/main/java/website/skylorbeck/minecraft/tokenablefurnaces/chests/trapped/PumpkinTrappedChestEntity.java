package website.skylorbeck.minecraft.tokenablefurnaces.chests.trapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import website.skylorbeck.minecraft.skylorlib.storage.ExtraTrappedChestEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;
import website.skylorbeck.minecraft.tokenablefurnaces.Ref;

public class PumpkinTrappedChestEntity extends ExtraTrappedChestEntity {
    protected PumpkinTrappedChestEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState,27,"pumpkin",true,true, Ref.MODID);
    }

    public PumpkinTrappedChestEntity(BlockPos pos, BlockState state) {
        super(Declarer.PUMPKINTRAPPEDCHESTENTITY,pos, state,27,"pumpkin",true,true, Ref.MODID);
    }
    protected Text getContainerName() {
        return Text.translatable("container.pumpkin_chest");
    }
    protected Text getDoubleContainerName(){
        return Text.translatable("container.pumpkin_chestdouble");
    }
}
