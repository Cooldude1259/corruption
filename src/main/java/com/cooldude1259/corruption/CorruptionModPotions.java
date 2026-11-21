package com.cooldude1259.corruption;

import com.cooldude1259.corruption.effect.CorruptionModEffects;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.Potions;

public class CorruptionModPotions implements ModInitializer {
    public static final Holder<Potion> CORRUPTION_POTION =
            Registry.registerForHolder(
                    BuiltInRegistries.POTION,
                    Identifier.fromNamespaceAndPath(Corruption.MOD_ID, "corruption"),
                    new Potion("corruption",
                            new MobEffectInstance(
                                    CorruptionModEffects.CORRUPTION,
                                    3600,
                                    0
                            )));
    @Override
    public void onInitialize() {
        FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
            builder.addMix(
                    Potions.MUNDANE,
                    Items.REDSTONE,
                    CORRUPTION_POTION
            );
        });
    }
}