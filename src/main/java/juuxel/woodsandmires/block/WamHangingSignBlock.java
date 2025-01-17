package juuxel.woodsandmires.block;

import juuxel.woodsandmires.block.entity.WamHangingSignBlockEntity;
import net.minecraft.block.BlockState;
import net.minecraft.block.HangingSignBlock;
import net.minecraft.block.WoodType;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class WamHangingSignBlock extends HangingSignBlock {
    public WamHangingSignBlock(Settings settings, WoodType woodType) {
        super(woodType, settings);
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new WamHangingSignBlockEntity(pos, state);
    }
}