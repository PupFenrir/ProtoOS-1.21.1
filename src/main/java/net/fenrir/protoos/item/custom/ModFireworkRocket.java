package net.fenrir.protoos.item.custom;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.FireworkRocketEntity;
import net.minecraft.world.item.FireworkRocketItem;
import net.minecraft.world.item.ItemStack;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class ModFireworkRocket extends FireworkRocketItem
{
    public ModFireworkRocket(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public @NotNull InteractionResult useOn(@NotNull UseOnContext pContext) {
        // Prevent placing fireworks on blocks entirely
        return InteractionResult.PASS;
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(@NotNull Level pLevel, Player pPlayer, @NotNull InteractionHand pHand) {
        if (pPlayer.isFallFlying()) {
            ItemStack itemstack = pPlayer.getItemInHand(pHand);
            if (!pLevel.isClientSide) {
                FireworkRocketEntity fireworkrocketentity = new FireworkRocketEntity(pLevel, itemstack, pPlayer);
                pLevel.addFreshEntity(fireworkrocketentity);
            }

            return InteractionResultHolder.sidedSuccess(pPlayer.getItemInHand(pHand), pLevel.isClientSide());
        } else {
            return InteractionResultHolder.pass(pPlayer.getItemInHand(pHand));
        }
    }
}
