package com.cooldude1259.corruption.costumable;

import com.cooldude1259.corruption.CorruptionCostumeEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class CostumedDirtBlock extends Block implements EntityBlock {
    public CostumedDirtBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new CorruptionCostumeEntity(pos, state);
    }
}
