package com.cooldude1259.corruption.effect;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class CorruptionEffect  extends MobEffect {
    protected CorruptionEffect() {
        // category: StatusEffectCategory - describes if the effect is helpful (BENEFICIAL), harmful (HARMFUL), or neutral (NEUTRAL)
        // color: int - Color is the color assigned to the effect (in RGB)
        super(MobEffectCategory.HARMFUL, 0xFF0000);
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        // Same timing as vanilla Poison: every 25 ticks at level I, faster at higher levels
        int interval = 25 >> amplifier;
        return interval <= 0 || duration % interval == 0;
    }

    @Override
    public boolean applyEffectTick(ServerLevel level, LivingEntity entity, int amplifier) {
        entity.hurtServer(level, entity.damageSources().magic(), 1.0F);
        return true;
    }
}