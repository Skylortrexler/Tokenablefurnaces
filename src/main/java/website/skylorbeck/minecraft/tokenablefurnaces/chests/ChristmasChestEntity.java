package website.skylorbeck.minecraft.tokenablefurnaces.chests;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import website.skylorbeck.minecraft.skylorlib.storage.ExtraChestEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;
import website.skylorbeck.minecraft.tokenablefurnaces.Ref;

public class ChristmasChestEntity extends ExtraChestEntity {
    protected ChristmasChestEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState,27,"christmas",false,false, Ref.MODID);
    }

    public ChristmasChestEntity(BlockPos pos, BlockState state) {
        super(Declarer.CHRISTMASCHESTENTITY,pos, state,27,"christmas",false,false, Ref.MODID);
    }

    protected Text getContainerName() {
        return Text.translatable("container.festive_chest");
    }
    protected Text getDoubleContainerName(){
        return Text.translatable("container.festive_chestdouble");
    }
}
