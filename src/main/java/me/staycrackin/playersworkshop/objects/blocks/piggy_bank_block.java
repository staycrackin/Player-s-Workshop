package me.staycrackin.playersworkshop.objects.blocks;

import java.util.stream.Stream;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Direction;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;


public class piggy_bank_block extends Block {
    public piggy_bank_block() {
        super(Block.Properties.create(Material.GLASS)
                .harvestTool(ToolType.PICKAXE)
                .hardnessAndResistance(2.0f, 3.0f)
                .sound(SoundType.GLASS)
                .harvestLevel(3)
        );
    }

    public piggy_bank_block(Properties properties) {
        super(properties);
        this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));
    }

    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.makeCuboidShape(4, 0, 11.9, 7, 3, 14.9),
            Block.makeCuboidShape(9, 0, 11.9, 12, 3, 14.9),
            Block.makeCuboidShape(4, 0, 4, 7, 3, 7),
            Block.makeCuboidShape(9, 0, 4, 12, 3, 7),
            Block.makeCuboidShape(5, 4, 1, 11, 9, 6),
            Block.makeCuboidShape(4, 3, 4, 12, 6, 14),
            Block.makeCuboidShape(6.5, 4.5, 0.2, 9.5, 6.5, 1),
            Block.makeCuboidShape(4, 6, 4, 12, 7, 7),
            Block.makeCuboidShape(4, 6, 7, 7.6, 7, 11),
            Block.makeCuboidShape(8.4, 6, 7, 12, 7, 11),
            Block.makeCuboidShape(4, 6, 11, 12, 7, 14)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    private static final VoxelShape SHAPE_W = Stream.of(
            Block.makeCuboidShape(11.9, 0, 9, 14.899999999999999, 3, 12),
            Block.makeCuboidShape(11.9, 0, 4, 14.899999999999999, 3, 7),
            Block.makeCuboidShape(4, 0, 9, 7, 3, 12),
            Block.makeCuboidShape(4, 0, 4, 7, 3, 7),
            Block.makeCuboidShape(1, 4, 5, 6, 9, 11),
            Block.makeCuboidShape(4, 3, 4, 14, 6, 12),
            Block.makeCuboidShape(0.1999999999999993, 4.5, 6.5, 1, 6.5, 9.5),
            Block.makeCuboidShape(4, 6, 4, 7, 7, 12),
            Block.makeCuboidShape(7, 6, 8.4, 11, 7, 12),
            Block.makeCuboidShape(7, 6, 4, 11, 7, 7.6),
            Block.makeCuboidShape(11, 6, 4, 14, 7, 12)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    private static final VoxelShape SHAPE_S =Stream.of(
            Block.makeCuboidShape(9, 0, 1.0999999999999996, 12, 3, 4.1),
            Block.makeCuboidShape(4, 0, 1.0999999999999996, 7, 3, 4.1),
            Block.makeCuboidShape(9, 0, 9, 12, 3, 12),
            Block.makeCuboidShape(4, 0, 9, 7, 3, 12),
            Block.makeCuboidShape(5, 4, 10, 11, 9, 15),
            Block.makeCuboidShape(4, 3, 2, 12, 6, 12),
            Block.makeCuboidShape(6.5, 4.5, 15, 9.5, 6.5, 15.8),
            Block.makeCuboidShape(4, 6, 9, 12, 7, 12),
            Block.makeCuboidShape(8.4, 6, 5, 12, 7, 9),
            Block.makeCuboidShape(4, 6, 5, 7.6, 7, 9),
            Block.makeCuboidShape(4, 6, 2, 12, 7, 5)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    private static final VoxelShape SHAPE_E =Stream.of(
            Block.makeCuboidShape(1.1000000000000014, 0, 4, 4.1, 3, 7),
            Block.makeCuboidShape(1.1000000000000014, 0, 9, 4.1, 3, 12),
            Block.makeCuboidShape(9, 0, 4, 12, 3, 7),
            Block.makeCuboidShape(9, 0, 9, 12, 3, 12),
            Block.makeCuboidShape(10, 4, 5, 15, 9, 11),
            Block.makeCuboidShape(2, 3, 4, 12, 6, 12),
            Block.makeCuboidShape(15, 4.5, 6.5, 15.8, 6.5, 9.5),
            Block.makeCuboidShape(9, 6, 4, 12, 7, 12),
            Block.makeCuboidShape(5, 6, 4, 9, 7, 7.6),
            Block.makeCuboidShape(5, 6, 8.4, 9, 7, 12),
            Block.makeCuboidShape(2, 6, 4, 5, 7, 12)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();


    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        switch (state.get(FACING)) {
            case NORTH:
                return SHAPE_N;
            case SOUTH:
                return SHAPE_S;
            case EAST:
                return SHAPE_E;
            case WEST:
                return SHAPE_W;
            default:
                return SHAPE_N;
        }
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rot) {
        return state.with(FACING, rot.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.toRotation(state.get(FACING)));
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

}



