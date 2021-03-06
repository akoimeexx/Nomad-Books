package ladysnake.nomadbooks.common.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.MushroomBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class NomadMushroomStemBlock extends NomadMushroomBlock {
    public NomadMushroomStemBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(NORTH, true).with(EAST, true).with(SOUTH, true).with(WEST, true).with(UP, true).with(DOWN, true));
    }

    @Override
    public boolean isTranslucent(BlockState state, BlockView view, BlockPos pos) {
        return true;
    }
}
