package com.cooldude1259.corruption.effect;

import com.cooldude1259.corruption.Corruption;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffect;

public class CorruptionModEffects {
    public static final Holder<MobEffect> CORRUPTION =
            Registry.registerForHolder(BuiltInRegistries.MOB_EFFECT, Corruption.id("corruption"), new CorruptionEffect());

    public static final Holder<MobEffect> ANTI_CORRUPTION =
            Registry.registerForHolder(BuiltInRegistries.MOB_EFFECT, Corruption.id("anti_corruption"), new AntiCorruptionEffect());

    // Empty on purpose: calling it forces the class to load, which runs the static field above
    public static void initialize() {
        Corruption.LOGGER.info("Corruption Mod Effects initialized!");
    }
}
