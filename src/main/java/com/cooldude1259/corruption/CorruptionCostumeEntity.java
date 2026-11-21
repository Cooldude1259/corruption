package com.cooldude1259.corruption;

import com.cooldude12.unnoficialtadc.CostumeBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class CorruptionCostumeEntity extends CostumeBlockEntity {
    public CorruptionCostumeEntity(BlockPos pos, BlockState state) {
        super(CorruptionBlockEntities.COSTUME, pos, state);
    }
}