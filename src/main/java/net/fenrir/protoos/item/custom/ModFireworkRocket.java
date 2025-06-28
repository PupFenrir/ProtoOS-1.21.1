package net.fenrir.protoos.item.custom;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.FireworkRocketEntity;
import net.minecraft.world.item.FireworkRocketItem;
import net.minecraft.world.item.ItemStack;

import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class ModFireworkRocket extends FireworkRocketItem
{
    public ModFireworkRocket(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use (@NotNull Level level, Player player, @NotNull InteractionHand hand)
    {
        ItemStack stack = player.getItemInHand(hand);

        if (player.isFallFlying())
        {
            if (!level.isClientSide)
            {
                FireworkRocketEntity rocket = new FireworkRocketEntity(level, stack, player);
                level.addFreshEntity(rocket);
                stack.shrink(0);
            }
            return InteractionResultHolder.sidedSuccess(stack, level.isClientSide());
        }
        return InteractionResultHolder.pass(stack);
    }
}
