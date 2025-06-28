package net.fenrir.protoos.item.custom;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TridentItem;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class ModTrident extends TridentItem
{
    public ModTrident(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(@NotNull Level pLevel, @NotNull Player pPlayer, @NotNull InteractionHand pHand) {
        ItemStack itemStack = pPlayer.getItemInHand(pHand);
        if (itemStack.getDamageValue() == itemStack.getMaxDamage()) {
            pPlayer.startUsingItem(pHand);
            return InteractionResultHolder.consume(itemStack);
        } else if (EnchantmentHelper.getTridentSpinAttackStrength(itemStack, pPlayer) > 0 && !pPlayer.isInWaterOrRain()) {
            return InteractionResultHolder.fail(itemStack);
        } else {
            pPlayer.startUsingItem(pHand);
            return InteractionResultHolder.consume(itemStack);
        }
    }
}
