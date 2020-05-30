package mod.ethane.norsemodology.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.GravelBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;

public class BaseGravelOre extends GravelBlock {

    public BaseGravelOre(Properties properties) {
        super(properties);
    }



    @Override
    public int getExpDrop(BlockState state, IWorldReader world, BlockPos pos, int fortune, int silktouch) {
        return silktouch == 0 ? 7 : 0;
    }
}
