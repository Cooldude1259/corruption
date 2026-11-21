package com.cooldude1259.corruption;

import com.cooldude1259.corruption.costumable.CostumedDirtBlock;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;

public class CorruptionBlocks {

    // Wrapper blocks have no BlockItem: they only ever come into existence
    // when a CostumeItem is used on the matching vanilla block.
    private static Block register(String name, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties settings) {
        ResourceKey<Block> key = ResourceKey.create(Registries.BLOCK, Corruption.id(name));
        Block block = factory.apply(settings.setId(key));
        return Registry.register(BuiltInRegistries.BLOCK, key, block);
    }

    // One line per costumable block. Remember to also list it in CorruptionBlockEntities.COSTUME
    // and map it with CostumeMap.register(...) in Corruption.onInitialize().
    public static final Block COSTUMED_DIRT = register(
            "costumed_dirt",
            CostumedDirtBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT)
    );

    // Empty on purpose: calling it forces the class to load, which runs the static fields above
    public static void initialize() {}
}
