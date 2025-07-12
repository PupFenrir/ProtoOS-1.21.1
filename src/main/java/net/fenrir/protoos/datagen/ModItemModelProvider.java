package net.fenrir.protoos.datagen;

import net.fenrir.protoos.ProtoOS;
import net.fenrir.protoos.item.*;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider
{

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ProtoOS.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels()
    {
        registerItemModels(ModGemstoneArrow.ITEMS, "base_arrow");
        registerItemModels(ModGemstoneAxe.ITEMS, "base_axe");
        registerItemModels(ModGemstoneBonemeal.ITEMS, "base_bonemeal");
        registerItemModels(ModGemstoneBow.ITEMS, "base_bow");
        registerItemModels(ModGemstoneBrush.ITEMS, "base_brush");
        registerItemModels(ModGemstoneBundle.ITEMS, "base_bundle");
        registerItemModels(ModGemstoneCompass.ITEMS, "base_compass");
        registerItemModels(ModGemstoneDust.ITEMS, "base_dust");
        registerItemModels(ModGemstoneElytra.ITEMS, "base_elytra");
        registerItemModels(ModGemstoneFireworkRocket.ITEMS, "base_firework_rocket");
        registerItemModels(ModGemstoneFishingRod.ITEMS, "base_fishing_rod");
        registerItemModels(ModGemstoneFlintAndSteel.ITEMS, "base_flint_and_steel");
        registerItemModels(ModGemstoneFood.ITEMS, "base_food_item");
        registerItemModels(ModGemstoneFuelSource.ITEMS, "base_fuel_source");
        registerItemModels(ModGemstoneHammer.ITEMS, "base_hammer");
        registerItemModels(ModGemstoneHoe.ITEMS, "base_hoe");
        registerItemModels(ModGemstoneMace.ITEMS, "base_mace");
        registerItemModels(ModGemstonePickaxe.ITEMS, "base_pickaxe");
        registerItemModels(ModGemstones.ITEMS, "base_gemstone");
        registerItemModels(ModGemstoneSaddle.ITEMS, "base_saddle");
        registerItemModels(ModGemstoneShears.ITEMS, "base_shears");
        registerItemModels(ModGemstoneShovel.ITEMS, "base_shovel");
        registerItemModels(ModGemstoneSpyglass.ITEMS, "base_spyglass");
        registerItemModels(ModGemstoneSword.ITEMS, "base_sword");
        registerItemModels(ModGemstoneTrident.ITEMS, "base_trident");
    }

    private void registerItemModels(DeferredRegister<Item> itemRegister, String baseModel) {
        for (RegistryObject<Item> item : itemRegister.getEntries()) {
            withExistingParent(item.getId().getPath(), modLoc("item/" + baseModel));
        }
    }
}
