package com.cooldude1259.corruption;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class CorruptionBlockEntities {

    // One type serves every costumable wrapper block in this mod: add new wrapper blocks to this list.
    // (tadc-mc's own type only lists tadc-mc's blocks, which is why this mod needs its own.)
    public static final BlockEntityType<CorruptionCostumeEntity> COSTUME =
            register("costume", CorruptionCostumeEntity::new, CorruptionBlocks.COSTUMED_DIRT);

    private static <T extends BlockEntity> BlockEntityType<T> register(
            String name,
            FabricBlockEntityTypeBuilder.Factory<? extends T> factory,
            Block... blocks
    ) {
        return Registry.register(
                BuiltInRegistries.BLOCK_ENTITY_TYPE,
                Corruption.id(name),
                FabricBlockEntityTypeBuilder.<T>create(factory, blocks).build()
        );
    }

    // Empty on purpose: calling it forces the class to load, which runs the static fields above
    public static void initialize() {}
}
