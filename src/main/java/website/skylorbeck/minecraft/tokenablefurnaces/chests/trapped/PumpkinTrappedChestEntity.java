package website.skylorbeck.minecraft.tokenablefurnaces.chests.trapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.math.BlockPos;
import website.skylorbeck.minecraft.skylorlib.storage.ExtraChestEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;
import website.skylorbeck.minecraft.tokenablefurnaces.Ref;

public class PumpkinTrappedChestEntity extends ExtraChestEntity {
    protected PumpkinTrappedChestEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState,27,"pumpkin",true,true, Ref.MODID);
    }

    public PumpkinTrappedChestEntity(BlockPos pos, BlockState state) {
        super(Declarer.PUMPKINTRAPPEDCHESTENTITY,pos, state,27,"pumpkin",true,true, Ref.MODID);
    }
    protected Text getContainerName() {
        return new TranslatableText("container.pumpkinchest");
    }
    protected Text getDoubleContainerName(){
        return new TranslatableText("container.pumpkinchestdouble");
    }
}
