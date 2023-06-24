package net.oliverrr.tutorialmod.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class ChocolateSword extends SwordItem {
    public ChocolateSword(Tier p_43269_, int p_43270_, float p_43271_, Properties p_43272_) {
        super(p_43269_, p_43270_, p_43271_, p_43272_);
    }

    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
        System.out.println("pStack = " + pStack);
        System.out.println("pTarget = " + pTarget);
        System.out.println("pAttacker = " + pAttacker);
        pTarget.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 2), pAttacker);
        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }

}
