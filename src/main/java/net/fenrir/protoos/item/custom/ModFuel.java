package net.fenrir.protoos.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;

import javax.annotation.Nullable;

public class ModFuel extends Item
{
    private int burnTime = 0;

    public ModFuel(Properties properties, int burnTime)
    {
        super(properties);
        this.burnTime = burnTime;
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType)
    {
        return this.burnTime;
    }
}