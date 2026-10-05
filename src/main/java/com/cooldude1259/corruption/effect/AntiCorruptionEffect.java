package com.cooldude1259.corruption.effect;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class AntiCorruptionEffect extends MobEffect {
    protected AntiCorruptionEffect() {
        super(MobEffectCategory.BENEFICIAL, 0x00FF00);
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        return true;
    }

    @Override
    public boolean applyEffectTick(ServerLevel level, LivingEntity entity, int amplifier) {
        return true;
    }
}
