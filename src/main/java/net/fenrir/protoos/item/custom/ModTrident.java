package net.fenrir.protoos.item.custom;

import net.minecraft.core.Holder;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.ThrownTrident;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TridentItem;
import net.minecraft.world.item.enchantment.EnchantmentEffectComponents;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public class ModTrident extends TridentItem
{
    public ModTrident(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(@NotNull Level pLevel, Player pPlayer, @NotNull InteractionHand pHand) {
        ItemStack itemstack = pPlayer.getItemInHand(pHand);

        if (isTooDamagedToUse(itemstack)) {
            pPlayer.startUsingItem(pHand);
            return InteractionResultHolder.fail(itemstack);
        } else if (EnchantmentHelper.getTridentSpinAttackStrength(itemstack, pPlayer) > 0.0F && !pPlayer.isInWaterOrRain()) {
            return InteractionResultHolder.fail(itemstack);
        } else {
            pPlayer.startUsingItem(pHand);
            return InteractionResultHolder.consume(itemstack);
        }
    }

    @Override
    public void releaseUsing(@NotNull ItemStack pStack, @NotNull Level pLevel, @NotNull LivingEntity pEntityLiving, int pTimeLeft) {
        if (pEntityLiving instanceof Player player) {
            int i = this.getUseDuration(pStack, pEntityLiving) - pTimeLeft;
            if (i >= 10) {
                float f = EnchantmentHelper.getTridentSpinAttackStrength(pStack, player);
                if (!(f > 0.0F) || player.isInWaterOrRain()) {
                    if (isTooDamagedToUse(pStack)) {
                        Holder<SoundEvent> holder = EnchantmentHelper.pickHighestLevel(pStack, EnchantmentEffectComponents.TRIDENT_SOUND).orElse(SoundEvents.TRIDENT_THROW);
                        if (!pLevel.isClientSide) {
                            pStack.hurtAndBreak(1, player, LivingEntity.getSlotForHand(pEntityLiving.getUsedItemHand()));
                            if (f == 0.0F) {
                                ThrownTrident throwntrident = new ThrownTrident(pLevel, player, pStack);
                                throwntrident.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 2.5F, 1.0F);
                                if (player.hasInfiniteMaterials()) {
                                    throwntrident.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
                                }

                                pLevel.addFreshEntity(throwntrident);
                                pLevel.playSound(null, throwntrident, holder.value(), SoundSource.PLAYERS, 1.0F, 1.0F);
                                if (!player.hasInfiniteMaterials()) {
                                    player.getInventory().removeItem(pStack);
                                }
                            }
                        }

                        player.awardStat(Stats.ITEM_USED.get(this));
                        if (f > 0.0F) {
                            float f7 = player.getYRot();
                            float f1 = player.getXRot();
                            float f2 = -Mth.sin(f7 * (float) (Math.PI / 180.0)) * Mth.cos(f1 * (float) (Math.PI / 180.0));
                            float f3 = -Mth.sin(f1 * (float) (Math.PI / 180.0));
                            float f4 = Mth.cos(f7 * (float) (Math.PI / 180.0)) * Mth.cos(f1 * (float) (Math.PI / 180.0));
                            float f5 = Mth.sqrt(f2 * f2 + f3 * f3 + f4 * f4);
                            f2 *= f / f5;
                            f3 *= f / f5;
                            f4 *= f / f5;
                            player.push((double)f2, (double)f3, (double)f4);
                            player.startAutoSpinAttack(20, 8.0F, pStack);
                            if (player.onGround()) {
                                float f6 = 1.1999999F;
                                player.move(MoverType.SELF, new Vec3(0.0, 1.1999999F, 0.0));
                            }

                            pLevel.playSound(null, player, holder.value(), SoundSource.PLAYERS, 1.0F, 1.0F);
                        }
                    }
                }
            }
        }
    }

    private static boolean isTooDamagedToUse(ItemStack pStack) {
        return pStack.getDamageValue() == pStack.getMaxDamage();
    }
}
