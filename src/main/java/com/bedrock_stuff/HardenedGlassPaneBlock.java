package com.bedrock_stuff;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.PaneBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

/**
 * Hardened Glass Pane - transparent glass pane that drops itself when broken.
 * Similar to vanilla glass pane but harder and doesn't shatter.
 * Includes face culling to hide internal faces between adjacent hardened glass panes of the same type.
 */
public class HardenedGlassPaneBlock extends PaneBlock {

    public HardenedGlassPaneBlock(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getCameraCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return VoxelShapes.empty();
    }

    @Override
    public float getAmbientOcclusionLightLevel(BlockState state, BlockView world, BlockPos pos) {
        return 1.0F;
    }

    /**
     * Controls face culling between adjacent blocks.
     * Only hides the face when the adjacent block is exactly the same type of hardened glass pane.
     */
    @Override
    public boolean isSideInvisible(BlockState state, BlockState stateFrom, Direction direction) {
        // Only hide face if the adjacent block is exactly the same block type
        if (stateFrom.getBlock() == state.getBlock()) {
            return true;
        }
        return super.isSideInvisible(state, stateFrom, direction);
    }
}
