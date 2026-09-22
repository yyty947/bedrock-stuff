package com.bedrock_stuff;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

/**
 * Hardened Glass - transparent glass that drops itself when broken.
 * Similar to normal glass but harder and doesn't shatter.
 * Includes face culling to hide internal faces between adjacent hardened glass blocks OF THE SAME TYPE.
 */
public class HardenedGlassBlock extends Block {

    public HardenedGlassBlock(Settings settings) {
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
     * Only hides the face when the adjacent block is the EXACT same type of hardened glass.
     *
     * Examples:
     * - hard_white_stained_glass + hard_white_stained_glass → hide face
     * - hard_white_stained_glass + hard_blue_stained_glass → show face (different colors)
     * - hard_glass + hard_white_stained_glass → show face (different types)
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
