package net.fenrir.protoos.item;

import net.fenrir.protoos.ProtoOS;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmourMaterials
{
    public static final Holder<ArmorMaterial> ACTINOLITE_ARMOUR_MATERIAL = register("actinolite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
        attribute.put(ArmorItem.Type.HELMET, 5);
        attribute.put(ArmorItem.Type.CHESTPLATE, 9);
        attribute.put(ArmorItem.Type.LEGGINGS, 7);
        attribute.put(ArmorItem.Type.BOOTS, 5);
        attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.ACTINOLITE.get());

    public static final Holder<ArmorMaterial> ADAMITE_ARMOUR_MATERIAL = register("adamite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.ADAMITE.get());

    public static final Holder<ArmorMaterial> AGATE_ARMOUR_MATERIAL = register("agate", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.AGATE.get());

    public static final Holder<ArmorMaterial> ALBITE_ARMOUR_MATERIAL = register("albite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.ALBITE.get());

    public static final Holder<ArmorMaterial> ALEXANDRITE_ARMOUR_MATERIAL = register("alexandrite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.ALEXANDRITE.get());

    public static final Holder<ArmorMaterial> ALGODONITE_ARMOUR_MATERIAL = register("algodonite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.ALGODONITE.get());

    public static final Holder<ArmorMaterial> ALMANDINE_GARNET_ARMOUR_MATERIAL = register("almandine_garnet", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.ALMANDINE_GARNET.get());

    public static final Holder<ArmorMaterial> AMAZONITE_ARMOUR_MATERIAL = register("amazonite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.AMAZONITE.get());

    public static final Holder<ArmorMaterial> AMBER_ARMOUR_MATERIAL = register("amber", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.AMBER.get());

    public static final Holder<ArmorMaterial> AMBLYGONITE_ARMOUR_MATERIAL = register("amblygonite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.AMBLYGONITE.get());

    public static final Holder<ArmorMaterial> AMETHYST_ARMOUR_MATERIAL = register("amethyst", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.AMETHYST.get());

    public static final Holder<ArmorMaterial> AMETRINE_ARMOUR_MATERIAL = register("ametrine", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.AMETRINE.get());

    public static final Holder<ArmorMaterial> AMMOLITE_ARMOUR_MATERIAL = register("ammolite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.AMMOLITE.get());

    public static final Holder<ArmorMaterial> ANALCIME_ARMOUR_MATERIAL = register("analcime", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.ANALCIME.get());

    public static final Holder<ArmorMaterial> ANATASE_ARMOUR_MATERIAL = register("anatase", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.ANATASE.get());

    public static final Holder<ArmorMaterial> ANDALUSITE_ARMOUR_MATERIAL = register("andalusite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.ANDALUSITE.get());

    public static final Holder<ArmorMaterial> ANDESINE_ARMOUR_MATERIAL = register("andesine", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.ANDESINE.get());

    public static final Holder<ArmorMaterial> ANDRADITE_ARMOUR_MATERIAL = register("andradite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.ANDRADITE.get());

    public static final Holder<ArmorMaterial> ANGLESITE_ARMOUR_MATERIAL = register("anglesite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.ANGLESITE.get());

    public static final Holder<ArmorMaterial> ANHYDRITE_ARMOUR_MATERIAL = register("anhydrite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.ANHYDRITE.get());

    public static final Holder<ArmorMaterial> ANORTHITE_ARMOUR_MATERIAL = register("anorthite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.ANORTHITE.get());

    public static final Holder<ArmorMaterial> APATITE_ARMOUR_MATERIAL = register("apatite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.APATITE.get());

    public static final Holder<ArmorMaterial> APOPHYLLITE_ARMOUR_MATERIAL = register("apophyllite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.APOPHYLLITE.get());

    public static final Holder<ArmorMaterial> AQUAMARINE_ARMOUR_MATERIAL = register("aquamarine", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.AQUAMARINE.get());

    public static final Holder<ArmorMaterial> ARAGONITE_ARMOUR_MATERIAL = register("aragonite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.ARAGONITE.get());

    public static final Holder<ArmorMaterial> ARTISANAL_GLASS_ARMOUR_MATERIAL = register("artisanal_glass", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.ARTISANAL_GLASS.get());

    public static final Holder<ArmorMaterial> AUGELITE_ARMOUR_MATERIAL = register("augelite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.AUGELITE.get());

    public static final Holder<ArmorMaterial> AXINITE_ARMOUR_MATERIAL = register("axinite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.AXINITE.get());

    public static final Holder<ArmorMaterial> AZURITE_ARMOUR_MATERIAL = register("azurite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.AZURITE.get());

    public static final Holder<ArmorMaterial> BARITE_ARMOUR_MATERIAL = register("barite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.BARITE.get());

    public static final Holder<ArmorMaterial> BAYLDONITE_ARMOUR_MATERIAL = register("bayldonite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.BAYLDONITE.get());

    public static final Holder<ArmorMaterial> BENITOITE_ARMOUR_MATERIAL = register("benitoite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.BENITOITE.get());

    public static final Holder<ArmorMaterial> BERYL_ARMOUR_MATERIAL = register("beryl", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.BERYL.get());

    public static final Holder<ArmorMaterial> BERYLLONITE_ARMOUR_MATERIAL = register("beryllonite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.BERYLLONITE.get());

    public static final Holder<ArmorMaterial> BISMUTOTANTALITE_ARMOUR_MATERIAL = register("bismutotantalite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.BISMUTOTANTALITE.get());

    public static final Holder<ArmorMaterial> BLACK_DIAMOND_ARMOUR_MATERIAL = register("black_diamond", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.BLACK_DIAMOND.get());

    public static final Holder<ArmorMaterial> BLOODSTONE_ARMOUR_MATERIAL = register("bloodstone", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.BLOODSTONE.get());

    public static final Holder<ArmorMaterial> BLUE_DIAMOND_ARMOUR_MATERIAL = register("blue_diamond", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.BLUE_DIAMOND.get());

    public static final Holder<ArmorMaterial> BOLEITE_ARMOUR_MATERIAL = register("boleite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.BOLEITE.get());

    public static final Holder<ArmorMaterial> BORACITE_ARMOUR_MATERIAL = register("boracite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.BORACITE.get());

    public static final Holder<ArmorMaterial> BORNITE_ARMOUR_MATERIAL = register("bornite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.BORNITE.get());

    public static final Holder<ArmorMaterial> BRAZILIANITE_ARMOUR_MATERIAL = register("brazilianite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.BRAZILIANITE.get());

    public static final Holder<ArmorMaterial> BREITHAUPTITE_ARMOUR_MATERIAL = register("breithauptite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.BREITHAUPTITE.get());

    public static final Holder<ArmorMaterial> BROOKITE_ARMOUR_MATERIAL = register("brookite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.BROOKITE.get());

    public static final Holder<ArmorMaterial> BROWN_DIAMOND_ARMOUR_MATERIAL = register("brown_diamond", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.BROWN_DIAMOND.get());

    public static final Holder<ArmorMaterial> BRUCITE_ARMOUR_MATERIAL = register("brucite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.BRUCITE.get());

    public static final Holder<ArmorMaterial> BUSTAMITE_ARMOUR_MATERIAL = register("bustamite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.BUSTAMITE.get());

    public static final Holder<ArmorMaterial> BYTOWNITE_ARMOUR_MATERIAL = register("bytownite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.BYTOWNITE.get());

    public static final Holder<ArmorMaterial> CALCAREOUS_CONCRETIONS_ARMOUR_MATERIAL = register("calcareous_concretions", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.CALCAREOUS_CONCRETIONS.get());

    public static final Holder<ArmorMaterial> CALCITE_ARMOUR_MATERIAL = register("calcite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.CALCITE.get());

    public static final Holder<ArmorMaterial> CANASITE_ARMOUR_MATERIAL = register("canasite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.CANASITE.get());

    public static final Holder<ArmorMaterial> CANCRINITE_ARMOUR_MATERIAL = register("cancrinite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.CANCRINITE.get());

    public static final Holder<ArmorMaterial> CARNELIAN_ARMOUR_MATERIAL = register("carnelian", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.CARNELIAN.get());

    public static final Holder<ArmorMaterial> CASSITERITE_ARMOUR_MATERIAL = register("cassiterite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.CASSITERITE.get());

    public static final Holder<ArmorMaterial> CATAPLEIITE_ARMOUR_MATERIAL = register("catapleiite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.CATAPLEIITE.get());

    public static final Holder<ArmorMaterial> CELESTITE_ARMOUR_MATERIAL = register("celestite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.CELESTITE.get());

    public static final Holder<ArmorMaterial> CERULEITE_ARMOUR_MATERIAL = register("ceruleite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.CERULEITE.get());

    public static final Holder<ArmorMaterial> CERUSSITE_ARMOUR_MATERIAL = register("cerussite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.CERUSSITE.get());

    public static final Holder<ArmorMaterial> CHABAZITE_ARMOUR_MATERIAL = register("chabazite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.CHABAZITE.get());

    public static final Holder<ArmorMaterial> CHALCEDONY_ARMOUR_MATERIAL = register("chalcedony", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.CHALCEDONY.get());

    public static final Holder<ArmorMaterial> CHAMBERSITE_ARMOUR_MATERIAL = register("chambersite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.CHAMBERSITE.get());

    public static final Holder<ArmorMaterial> CHAMAELEON_DIAMOND_ARMOUR_MATERIAL = register("chamaeleon_diamond", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.CHAMAELEON_DIAMOND.get());

    public static final Holder<ArmorMaterial> CHAROITE_ARMOUR_MATERIAL = register("charoite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.CHAROITE.get());

    public static final Holder<ArmorMaterial> CHICKEN_BLOOD_STONE_ARMOUR_MATERIAL = register("chicken_blood_stone", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.CHICKEN_BLOOD_STONE.get());

    public static final Holder<ArmorMaterial> CHILDRENITE_ARMOUR_MATERIAL = register("childrenite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.CHILDRENITE.get());

    public static final Holder<ArmorMaterial> CHIOLITE_ARMOUR_MATERIAL = register("chiolite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.CHIOLITE.get());

    public static final Holder<ArmorMaterial> CHROMITE_ARMOUR_MATERIAL = register("chromite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.CHROMITE.get());

    public static final Holder<ArmorMaterial> CHRYSOBERYL_ARMOUR_MATERIAL = register("chrysoberyl", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.CHRYSOBERYL.get());

    public static final Holder<ArmorMaterial> CHRYSOCOLLA_ARMOUR_MATERIAL = register("chrysocolla", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.CHRYSOCOLLA.get());

    public static final Holder<ArmorMaterial> CHRYSOCOLLA_CHALCEDONY_ARMOUR_MATERIAL = register("chrysocolla_chalcedony", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.CHRYSOCOLLA_CHALCEDONY.get());

    public static final Holder<ArmorMaterial> CHRYSOPRASE_ARMOUR_MATERIAL = register("chrysoprase", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.CHRYSOPRASE.get());

    public static final Holder<ArmorMaterial> CINNABAR_ARMOUR_MATERIAL = register("cinnabar", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.CINNABAR.get());

    public static final Holder<ArmorMaterial> CITRINE_ARMOUR_MATERIAL = register("citrine", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.CITRINE.get());

    public static final Holder<ArmorMaterial> CLINOCHLORE_ARMOUR_MATERIAL = register("clinochlore", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.CLINOCHLORE.get());

    public static final Holder<ArmorMaterial> COBALTITE_ARMOUR_MATERIAL = register("cobaltite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.COBALTITE.get());

    public static final Holder<ArmorMaterial> COLEMANITE_ARMOUR_MATERIAL = register("colemanite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.COLEMANITE.get());

    public static final Holder<ArmorMaterial> COLOR_CHANGE_GARNET_ARMOUR_MATERIAL = register("color_change_garnet", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.COLOR_CHANGE_GARNET.get());

    public static final Holder<ArmorMaterial> COLOR_CHANGE_SAPPHIRE_ARMOUR_MATERIAL = register("color_change_sapphire", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.COLOR_CHANGE_SAPPHIRE.get());

    public static final Holder<ArmorMaterial> CORAL_ARMOUR_MATERIAL = register("coral", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.CORAL.get());

    public static final Holder<ArmorMaterial> CORDIERITE_ARMOUR_MATERIAL = register("cordierite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.CORDIERITE.get());

    public static final Holder<ArmorMaterial> CORUNDUM_ARMOUR_MATERIAL = register("corundum", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.CORUNDUM.get());

    public static final Holder<ArmorMaterial> COVELLITE_ARMOUR_MATERIAL = register("covellite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.COVELLITE.get());

    public static final Holder<ArmorMaterial> CREEDITE_ARMOUR_MATERIAL = register("creedite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.CREEDITE.get());

    public static final Holder<ArmorMaterial> CROCOITE_ARMOUR_MATERIAL = register("crocoite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.CROCOITE.get());

    public static final Holder<ArmorMaterial> CRYOLITE_ARMOUR_MATERIAL = register("cryolite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.CRYOLITE.get());

    public static final Holder<ArmorMaterial> CUPRITE_ARMOUR_MATERIAL = register("cuprite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.CUPRITE.get());

    public static final Holder<ArmorMaterial> DANBURITE_ARMOUR_MATERIAL = register("danburite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.DANBURITE.get());

    public static final Holder<ArmorMaterial> DATOLITE_ARMOUR_MATERIAL = register("datolite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.DATOLITE.get());

    public static final Holder<ArmorMaterial> DEMANTOID_GARNET_ARMOUR_MATERIAL = register("demantoid_garnet", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.DEMANTOID_GARNET.get());

    public static final Holder<ArmorMaterial> DIAMOND_ARMOUR_MATERIAL = register("diamond", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.DIAMOND.get());

    public static final Holder<ArmorMaterial> DIASPORE_ARMOUR_MATERIAL = register("diaspore", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.DIASPORE.get());

    public static final Holder<ArmorMaterial> DICKINSONITE_ARMOUR_MATERIAL = register("dickinsonite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.DICKINSONITE.get());

    public static final Holder<ArmorMaterial> DIOPSIDE_ARMOUR_MATERIAL = register("diopside", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.DIOPSIDE.get());

    public static final Holder<ArmorMaterial> DIOPTASE_ARMOUR_MATERIAL = register("dioptase", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.DIOPTASE.get());

    public static final Holder<ArmorMaterial> DOLOMITE_ARMOUR_MATERIAL = register("dolomite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.DOLOMITE.get());

    public static final Holder<ArmorMaterial> DUMORTIERITE_ARMOUR_MATERIAL = register("dumortierite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.DUMORTIERITE.get());

    public static final Holder<ArmorMaterial> EKANITE_ARMOUR_MATERIAL = register("ekanite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.EKANITE.get());

    public static final Holder<ArmorMaterial> EMERALD_ARMOUR_MATERIAL = register("emerald", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.EMERALD.get());

    public static final Holder<ArmorMaterial> ENSTATITE_ARMOUR_MATERIAL = register("enstatite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.ENSTATITE.get());

    public static final Holder<ArmorMaterial> EOSPHORITE_ARMOUR_MATERIAL = register("eosphorite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.EOSPHORITE.get());

    public static final Holder<ArmorMaterial> EPIDOTE_ARMOUR_MATERIAL = register("epidote", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.EPIDOTE.get());

    public static final Holder<ArmorMaterial> ETTRINGITE_ARMOUR_MATERIAL = register("ettringite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.ETTRINGITE.get());

    public static final Holder<ArmorMaterial> EUCLASE_ARMOUR_MATERIAL = register("euclase", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.EUCLASE.get());

    public static final Holder<ArmorMaterial> EUDIALYTE_ARMOUR_MATERIAL = register("eudialyte", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.EUDIALYTE.get());

    public static final Holder<ArmorMaterial> EUXENITE_ARMOUR_MATERIAL = register("euxenite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.EUXENITE.get());

    public static final Holder<ArmorMaterial> FELDSPAR_ARMOUR_MATERIAL = register("feldspar", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.FELDSPAR.get());

    public static final Holder<ArmorMaterial> FERGUSONITE_ARMOUR_MATERIAL = register("fergusonite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.FERGUSONITE.get());

    public static final Holder<ArmorMaterial> FLUORITE_ARMOUR_MATERIAL = register("fluorite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.FLUORITE.get());

    public static final Holder<ArmorMaterial> FRESHWATER_PEARL_ARMOUR_MATERIAL = register("freshwater_pearl", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.FRESHWATER_PEARL.get());

    public static final Holder<ArmorMaterial> FRIEDELITE_ARMOUR_MATERIAL = register("friedelite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.FRIEDELITE.get());

    public static final Holder<ArmorMaterial> GADOLINITE_ARMOUR_MATERIAL = register("gadolinite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.GADOLINITE.get());

    public static final Holder<ArmorMaterial> GAHNOSPINEL_ARMOUR_MATERIAL = register("gahnospinel", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.GAHNOSPINEL.get());

    public static final Holder<ArmorMaterial> GARNET_ARMOUR_MATERIAL = register("garnet", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.GARNET.get());

    public static final Holder<ArmorMaterial> GRANDIDIERITE_ARMOUR_MATERIAL = register("grandidierite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.GRANDIDIERITE.get());

    public static final Holder<ArmorMaterial> GRAY_DIAMOND_ARMOUR_MATERIAL = register("gray_diamond", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.GRAY_DIAMOND.get());

    public static final Holder<ArmorMaterial> GREEN_DIAMOND_ARMOUR_MATERIAL = register("green_diamond", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.GREEN_DIAMOND.get());

    public static final Holder<ArmorMaterial> GROSSULAR_GARNET_ARMOUR_MATERIAL = register("grossular_garnet", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.GROSSULAR_GARNET.get());

    public static final Holder<ArmorMaterial> GYPSUM_ARMOUR_MATERIAL = register("gypsum", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.GYPSUM.get());

    public static final Holder<ArmorMaterial> HAMBERGITE_ARMOUR_MATERIAL = register("hambergite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.HAMBERGITE.get());

    public static final Holder<ArmorMaterial> HUAYNE_ARMOUR_MATERIAL = register("huayne", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.HUAYNE.get());

    public static final Holder<ArmorMaterial> HELIODOR_ARMOUR_MATERIAL = register("heliodor", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.HELIODOR.get());

    public static final Holder<ArmorMaterial> HEMATITE_ARMOUR_MATERIAL = register("hematite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.HEMATITE.get());

    public static final Holder<ArmorMaterial> HEMIMORPHITE_ARMOUR_MATERIAL = register("hemimorphite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.HEMIMORPHITE.get());

    public static final Holder<ArmorMaterial> HERDERITE_ARMOUR_MATERIAL = register("herderite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.HERDERITE.get());

    public static final Holder<ArmorMaterial> HESSONITE_ARMOUR_MATERIAL = register("hessonite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.HESSONITE.get());

    public static final Holder<ArmorMaterial> HODGKINSONITE_ARMOUR_MATERIAL = register("hodgkinsonite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.HODGKINSONITE.get());

    public static final Holder<ArmorMaterial> HOLTITE_ARMOUR_MATERIAL = register("holtite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.HOLTITE.get());

    public static final Holder<ArmorMaterial> HOWLITE_ARMOUR_MATERIAL = register("howlite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.HOWLITE.get());

    public static final Holder<ArmorMaterial> HUEBNERITE_ARMOUR_MATERIAL = register("huebnerite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.HUEBNERITE.get());

    public static final Holder<ArmorMaterial> HUMITE_ARMOUR_MATERIAL = register("humite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.HUMITE.get());

    public static final Holder<ArmorMaterial> HUREAULITE_ARMOUR_MATERIAL = register("hureaulite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.HUREAULITE.get());

    public static final Holder<ArmorMaterial> HURLBUTITE_ARMOUR_MATERIAL = register("hurlbutite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.HURLBUTITE.get());

    public static final Holder<ArmorMaterial> HYDROGROSSULAR_GARNET_ARMOUR_MATERIAL = register("hydrogrossular_garnet", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.HYDROGROSSULAR_GARNET.get());

    public static final Holder<ArmorMaterial> HYPERITDIABAS_ARMOUR_MATERIAL = register("hyperitdiabas", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.HYPERITDIABAS.get());

    public static final Holder<ArmorMaterial> IDOCRASE_ARMOUR_MATERIAL = register("idocrase", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.IDOCRASE.get());

    public static final Holder<ArmorMaterial> INDERITE_ARMOUR_MATERIAL = register("inderite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.INDERITE.get());

    public static final Holder<ArmorMaterial> IOLITE_ARMOUR_MATERIAL = register("iolite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.IOLITE.get());

    public static final Holder<ArmorMaterial> JADEITE_ARMOUR_MATERIAL = register("jadeite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.JADEITE.get());

    public static final Holder<ArmorMaterial> JASPER_ARMOUR_MATERIAL = register("jasper", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.JASPER.get());

    public static final Holder<ArmorMaterial> JEREMEJEVITE_ARMOUR_MATERIAL = register("jeremejevite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.JEREMEJEVITE.get());

    public static final Holder<ArmorMaterial> JET_ARMOUR_MATERIAL = register("jet", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.JET.get());

    public static final Holder<ArmorMaterial> KORNERUPINE_ARMOUR_MATERIAL = register("kornerupine", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.KORNERUPINE.get());

    public static final Holder<ArmorMaterial> KURNAKOVITE_ARMOUR_MATERIAL = register("kurnakovite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.KURNAKOVITE.get());

    public static final Holder<ArmorMaterial> KYANITE_ARMOUR_MATERIAL = register("kyanite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.KYANITE.get());

    public static final Holder<ArmorMaterial> KAMMEREREITE_ARMOUR_MATERIAL = register("kammererite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.KAMMEREREITE.get());

    public static final Holder<ArmorMaterial> LABRADORITE_ARMOUR_MATERIAL = register("labradorite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.LABRADORITE.get());

    public static final Holder<ArmorMaterial> LANGBEINITE_ARMOUR_MATERIAL = register("langbeinite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.LANGBEINITE.get());

    public static final Holder<ArmorMaterial> LAPIS_LAZULI_ARMOUR_MATERIAL = register("lapis_lazuli", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.LAPIS_LAZULI.get());

    public static final Holder<ArmorMaterial> LASERBLUE_ARMOUR_MATERIAL = register("laserblue", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.LASERBLUE.get());

    public static final Holder<ArmorMaterial> LAWSONITE_ARMOUR_MATERIAL = register("lawsonite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.LAWSONITE.get());

    public static final Holder<ArmorMaterial> LAZULITE_ARMOUR_MATERIAL = register("lazulite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.LAZULITE.get());

    public static final Holder<ArmorMaterial> LEGRANDITE_ARMOUR_MATERIAL = register("legrandite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.LEGRANDITE.get());

    public static final Holder<ArmorMaterial> LEPIDOLITE_ARMOUR_MATERIAL = register("lepidolite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.LEPIDOLITE.get());

    public static final Holder<ArmorMaterial> LEUCITE_ARMOUR_MATERIAL = register("leucite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.LEUCITE.get());

    public static final Holder<ArmorMaterial> LINARITE_ARMOUR_MATERIAL = register("linarite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.LINARITE.get());

    public static final Holder<ArmorMaterial> LUDLAMITE_ARMOUR_MATERIAL = register("ludlamite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.LUDLAMITE.get());

    public static final Holder<ArmorMaterial> MAGNESITE_ARMOUR_MATERIAL = register("magnesite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.MAGNESITE.get());

    public static final Holder<ArmorMaterial> MALACHITE_ARMOUR_MATERIAL = register("malachite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.MALACHITE.get());

    public static final Holder<ArmorMaterial> MALAIA_GARNET_ARMOUR_MATERIAL = register("malaia_garnet", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.MALAIA_GARNET.get());

    public static final Holder<ArmorMaterial> MALI_GARNET_ARMOUR_MATERIAL = register("mali_garnet", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.MALI_GARNET.get());

    public static final Holder<ArmorMaterial> MANDARIN_GARNET_ARMOUR_MATERIAL = register("mandarin_garnet", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.MANDARIN_GARNET.get());

    public static final Holder<ArmorMaterial> MANGANOTANTALITE_ARMOUR_MATERIAL = register("manganotantalite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.MANGANOTANTALITE.get());

    public static final Holder<ArmorMaterial> MARCASITE_ARMOUR_MATERIAL = register("marcasite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.MARCASITE.get());

    public static final Holder<ArmorMaterial> MELIPHANITE_ARMOUR_MATERIAL = register("meliphanite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.MELIPHANITE.get());

    public static final Holder<ArmorMaterial> MELLITE_ARMOUR_MATERIAL = register("mellite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.MELLITE.get());

    public static final Holder<ArmorMaterial> MICROCLINE_ARMOUR_MATERIAL = register("microcline", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.MICROCLINE.get());

    public static final Holder<ArmorMaterial> MICROLITE_ARMOUR_MATERIAL = register("microlite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.MICROLITE.get());

    public static final Holder<ArmorMaterial> MILARITE_ARMOUR_MATERIAL = register("milarite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.MILARITE.get());

    public static final Holder<ArmorMaterial> MILLERITE_ARMOUR_MATERIAL = register("millerite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.MILLERITE.get());

    public static final Holder<ArmorMaterial> MIMETITE_ARMOUR_MATERIAL = register("mimetite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.MIMETITE.get());

    public static final Holder<ArmorMaterial> MOLDAVITE_ARMOUR_MATERIAL = register("moldavite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.MOLDAVITE.get());

    public static final Holder<ArmorMaterial> MONAZITE_ARMOUR_MATERIAL = register("monazite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.MONAZITE.get());

    public static final Holder<ArmorMaterial> MOONSTONE_ARMOUR_MATERIAL = register("moonstone", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.MOONSTONE.get());

    public static final Holder<ArmorMaterial> MORDENITE_ARMOUR_MATERIAL = register("mordenite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.MORDENITE.get());

    public static final Holder<ArmorMaterial> MORGANITE_ARMOUR_MATERIAL = register("morganite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.MORGANITE.get());

    public static final Holder<ArmorMaterial> NAMBULITE_ARMOUR_MATERIAL = register("nambulite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.NAMBULITE.get());

    public static final Holder<ArmorMaterial> NATROLITE_ARMOUR_MATERIAL = register("natrolite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.NATROLITE.get());

    public static final Holder<ArmorMaterial> NATURAL_GLASS_ARMOUR_MATERIAL = register("natural_glass", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.NATURAL_GLASS.get());

    public static final Holder<ArmorMaterial> NEPHELINE_ARMOUR_MATERIAL = register("nepheline", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.NEPHELINE.get());

    public static final Holder<ArmorMaterial> NEPHRITE_ARMOUR_MATERIAL = register("nephrite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.NEPHRITE.get());

    public static final Holder<ArmorMaterial> NEPTUNITE_ARMOUR_MATERIAL = register("neptunite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.NEPTUNITE.get());

    public static final Holder<ArmorMaterial> NICCOLITE_ARMOUR_MATERIAL = register("niccolite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.NICCOLITE.get());

    public static final Holder<ArmorMaterial> OBSIDIAN_ARMOUR_MATERIAL = register("obsidian", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.OBSIDIAN.get());

    public static final Holder<ArmorMaterial> OLIGOCLASE_ARMOUR_MATERIAL = register("oligoclase", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.OLIGOCLASE.get());

    public static final Holder<ArmorMaterial> ONYX_ARMOUR_MATERIAL = register("onyx", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.ONYX.get());

    public static final Holder<ArmorMaterial> OPAL_STONE_ARMOUR_MATERIAL = register("opal_stone", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.OPAL_STONE.get());

    public static final Holder<ArmorMaterial> ORANGE_DIAMOND_ARMOUR_MATERIAL = register("orange_diamond", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.ORANGE_DIAMOND.get());

    public static final Holder<ArmorMaterial> OREGON_SUNSTONE_ARMOUR_MATERIAL = register("oregon_sunstone", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.OREGON_SUNSTONE.get());

    public static final Holder<ArmorMaterial> ORTHOCLASE_ARMOUR_MATERIAL = register("orthoclase", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.ORTHOCLASE.get());

    public static final Holder<ArmorMaterial> PADPARADSCHA_SAPPHIRE_ARMOUR_MATERIAL = register("padparadscha_sapphire", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.PADPARADSCHA_SAPPHIRE.get());

    public static final Holder<ArmorMaterial> PAINITE_ARMOUR_MATERIAL = register("painite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.PAINITE.get());

    public static final Holder<ArmorMaterial> PALYGORSKITE_ARMOUR_MATERIAL = register("palygorskite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.PALYGORSKITE.get());

    public static final Holder<ArmorMaterial> PAPAGOITE_ARMOUR_MATERIAL = register("papagoite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.PAPAGOITE.get());

    public static final Holder<ArmorMaterial> PARAIBA_TOURMALINE_ARMOUR_MATERIAL = register("paraiba_tourmaline", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.PARAIBA_TOURMALINE.get());

    public static final Holder<ArmorMaterial> PARGASITE_ARMOUR_MATERIAL = register("pargasite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.PARGASITE.get());

    public static final Holder<ArmorMaterial> PARISITE_ARMOUR_MATERIAL = register("parisite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.PARISITE.get());

    public static final Holder<ArmorMaterial> PEARL_ARMOUR_MATERIAL = register("pearl", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.PEARL.get());

    public static final Holder<ArmorMaterial> PECTOLITE_ARMOUR_MATERIAL = register("pectolite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.PECTOLITE.get());

    public static final Holder<ArmorMaterial> PENTLANDITE_ARMOUR_MATERIAL = register("pentlandite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.PENTLANDITE.get());

    public static final Holder<ArmorMaterial> PERICLASE_ARMOUR_MATERIAL = register("periclase", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.PERICLASE.get());

    public static final Holder<ArmorMaterial> PERIDOT_ARMOUR_MATERIAL = register("peridot", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.PERIDOT.get());

    public static final Holder<ArmorMaterial> PERISTERITE_ARMOUR_MATERIAL = register("peristerite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.PERISTERITE.get());

    public static final Holder<ArmorMaterial> PERTHITE_ARMOUR_MATERIAL = register("perthite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.PERTHITE.get());

    public static final Holder<ArmorMaterial> PETALITE_ARMOUR_MATERIAL = register("petalite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.PETALITE.get());

    public static final Holder<ArmorMaterial> PHENAKITE_ARMOUR_MATERIAL = register("phenakite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.PHENAKITE.get());

    public static final Holder<ArmorMaterial> PHOSGENITE_ARMOUR_MATERIAL = register("phosgenite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.PHOSGENITE.get());

    public static final Holder<ArmorMaterial> PHOSPHOPHYLLITE_ARMOUR_MATERIAL = register("phosphophyllite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.PHOSPHOPHYLLITE.get());

    public static final Holder<ArmorMaterial> PINK_DIAMOND_ARMOUR_MATERIAL = register("pink_diamond", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.PINK_DIAMOND.get());

    public static final Holder<ArmorMaterial> POLLUCITE_ARMOUR_MATERIAL = register("pollucite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.POLLUCITE.get());

    public static final Holder<ArmorMaterial> POWELLITE_ARMOUR_MATERIAL = register("powellite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.POWELLITE.get());

    public static final Holder<ArmorMaterial> PREHNITE_ARMOUR_MATERIAL = register("prehnite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.PREHNITE.get());

    public static final Holder<ArmorMaterial> PROSOPITE_ARMOUR_MATERIAL = register("prosopite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.PROSOPITE.get());

    public static final Holder<ArmorMaterial> PROTEUS_ARMOUR_MATERIAL = register("proteus", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.PROTEUS.get());

    public static final Holder<ArmorMaterial> PROUSTITE_ARMOUR_MATERIAL = register("proustite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.PROUSTITE.get());

    public static final Holder<ArmorMaterial> PUMPELLYITE_ARMOUR_MATERIAL = register("pumpellyite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.PUMPELLYITE.get());

    public static final Holder<ArmorMaterial> PURPLE_DIAMOND_ARMOUR_MATERIAL = register("purple_diamond", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.PURPLE_DIAMOND.get());

    public static final Holder<ArmorMaterial> PURPURITE_ARMOUR_MATERIAL = register("purpurite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.PURPURITE.get());

    public static final Holder<ArmorMaterial> PYRARGYRITE_ARMOUR_MATERIAL = register("pyrargyrite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.PYRARGYRITE.get());

    public static final Holder<ArmorMaterial> PYRITE_ARMOUR_MATERIAL = register("pyrite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.PYRITE.get());

    public static final Holder<ArmorMaterial> PYROPE_GARNET_ARMOUR_MATERIAL = register("pyrope_garnet", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.PYROPE_GARNET.get());

    public static final Holder<ArmorMaterial> PYROPHYLLITE_ARMOUR_MATERIAL = register("pyrophyllite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.PYROPHYLLITE.get());

    public static final Holder<ArmorMaterial> PYROXMANGITE_ARMOUR_MATERIAL = register("pyroxmangite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.PYROXMANGITE.get());

    public static final Holder<ArmorMaterial> PYRRHOTITE_ARMOUR_MATERIAL = register("pyrrhotite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.PYRRHOTITE.get());

    public static final Holder<ArmorMaterial> QUARTZ_ARMOUR_MATERIAL = register("quartz", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.QUARTZ.get());

    public static final Holder<ArmorMaterial> QUARTZITE_ARMOUR_MATERIAL = register("quartzite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.QUARTZITE.get());

    public static final Holder<ArmorMaterial> REALGAR_ARMOUR_MATERIAL = register("realgar", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.REALGAR.get());

    public static final Holder<ArmorMaterial> RED_BERYL_ARMOUR_MATERIAL = register("red_beryl", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.RED_BERYL.get());

    public static final Holder<ArmorMaterial> RED_DIAMOND_ARMOUR_MATERIAL = register("red_diamond", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.RED_DIAMOND.get());

    public static final Holder<ArmorMaterial> RHODIZITE_ARMOUR_MATERIAL = register("rhodizite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.RHODIZITE.get());

    public static final Holder<ArmorMaterial> RHODOCHROSITE_ARMOUR_MATERIAL = register("rhodochrosite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.RHODOCHROSITE.get());

    public static final Holder<ArmorMaterial> RHODOLITE_GARNET_ARMOUR_MATERIAL = register("rhodolite_garnet", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.RHODOLITE_GARNET.get());

    public static final Holder<ArmorMaterial> RHODONITE_ARMOUR_MATERIAL = register("rhodonite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.RHODONITE.get());

    public static final Holder<ArmorMaterial> ROSE_QUARTZ_ARMOUR_MATERIAL = register("rose_quartz", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.ROSE_QUARTZ.get());

    public static final Holder<ArmorMaterial> RUBELLITE_ARMOUR_MATERIAL = register("rubellite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.RUBELLITE.get());

    public static final Holder<ArmorMaterial> RUBY_ARMOUR_MATERIAL = register("ruby", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.RUBY.get());

    public static final Holder<ArmorMaterial> RUTILE_ARMOUR_MATERIAL = register("rutile", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.RUTILE.get());

    public static final Holder<ArmorMaterial> SALTWATER_PEARL_ARMOUR_MATERIAL = register("saltwater_pearl", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.SALTWATER_PEARL.get());

    public static final Holder<ArmorMaterial> SAMARSKITE_ARMOUR_MATERIAL = register("samarskite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.SAMARSKITE.get());

    public static final Holder<ArmorMaterial> SANIDINE_ARMOUR_MATERIAL = register("sanidine", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.SANIDINE.get());

    public static final Holder<ArmorMaterial> SAPPHIRE_ARMOUR_MATERIAL = register("sapphire", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.SAPPHIRE.get());

    public static final Holder<ArmorMaterial> SAPPHIRINE_ARMOUR_MATERIAL = register("sapphirine", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.SAPPHIRINE.get());

    public static final Holder<ArmorMaterial> SARCOLITE_ARMOUR_MATERIAL = register("sarcolite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.SARCOLITE.get());

    public static final Holder<ArmorMaterial> SCAPOLITE_ARMOUR_MATERIAL = register("scapolite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.SCAPOLITE.get());

    public static final Holder<ArmorMaterial> SCHEELITE_ARMOUR_MATERIAL = register("scheelite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.SCHEELITE.get());

    public static final Holder<ArmorMaterial> SCORODITE_ARMOUR_MATERIAL = register("scorodite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.SCORODITE.get());

    public static final Holder<ArmorMaterial> SELLAITE_ARMOUR_MATERIAL = register("sellaite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.SELLAITE.get());

    public static final Holder<ArmorMaterial> SENARMONTITE_ARMOUR_MATERIAL = register("senarmontite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.SENARMONTITE.get());

    public static final Holder<ArmorMaterial> SERANDITE_ARMOUR_MATERIAL = register("serandite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.SERANDITE.get());

    public static final Holder<ArmorMaterial> SERPENTINE_ARMOUR_MATERIAL = register("serpentine", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.SERPENTINE.get());

    public static final Holder<ArmorMaterial> SHATTUCKITE_ARMOUR_MATERIAL = register("shattuckite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.SHATTUCKITE.get());

    public static final Holder<ArmorMaterial> SHORTITE_ARMOUR_MATERIAL = register("shortite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.SHORTITE.get());

    public static final Holder<ArmorMaterial> SIDERITE_ARMOUR_MATERIAL = register("siderite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.SIDERITE.get());

    public static final Holder<ArmorMaterial> SILLIMANITE_ARMOUR_MATERIAL = register("sillimanite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.SILLIMANITE.get());

    public static final Holder<ArmorMaterial> SIMPSONITE_ARMOUR_MATERIAL = register("simpsonite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.SIMPSONITE.get());

    public static final Holder<ArmorMaterial> SINHALITE_ARMOUR_MATERIAL = register("sinhalite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.SINHALITE.get());

    public static final Holder<ArmorMaterial> SMALTITE_ARMOUR_MATERIAL = register("smaltite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.SMALTITE.get());

    public static final Holder<ArmorMaterial> SMITHSONITE_ARMOUR_MATERIAL = register("smithsonite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.SMITHSONITE.get());

    public static final Holder<ArmorMaterial> SMOKY_QUARTZ_ARMOUR_MATERIAL = register("smoky_quartz", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.SMOKY_QUARTZ.get());

    public static final Holder<ArmorMaterial> SODALITE_ARMOUR_MATERIAL = register("sodalite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.SODALITE.get());

    public static final Holder<ArmorMaterial> SOGDIANITE_ARMOUR_MATERIAL = register("sogdianite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.SOGDIANITE.get());

    public static final Holder<ArmorMaterial> SPESSARTITE_GARNET_ARMOUR_MATERIAL = register("spessartite_garnet", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.SPESSARTITE_GARNET.get());

    public static final Holder<ArmorMaterial> SPHALERITE_ARMOUR_MATERIAL = register("sphalerite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.SPHALERITE.get());

    public static final Holder<ArmorMaterial> SPHENE_ARMOUR_MATERIAL = register("sphene", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.SPHENE.get());

    public static final Holder<ArmorMaterial> SPINEL_ARMOUR_MATERIAL = register("spinel", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.SPINEL.get());

    public static final Holder<ArmorMaterial> SPODUMENE_ARMOUR_MATERIAL = register("spodumene", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.SPODUMENE.get());

    public static final Holder<ArmorMaterial> SPURRITE_ARMOUR_MATERIAL = register("spurrite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.SPURRITE.get());

    public static final Holder<ArmorMaterial> STAR_SAPPHIRE_ARMOUR_MATERIAL = register("star_sapphire", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.STAR_SAPPHIRE.get());

    public static final Holder<ArmorMaterial> STAUROLITE_ARMOUR_MATERIAL = register("staurolite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.STAUROLITE.get());

    public static final Holder<ArmorMaterial> STICHTITE_ARMOUR_MATERIAL = register("stichtite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.STICHTITE.get());

    public static final Holder<ArmorMaterial> STOLZITE_ARMOUR_MATERIAL = register("stolzite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.STOLZITE.get());

    public static final Holder<ArmorMaterial> STRONTIANITE_ARMOUR_MATERIAL = register("strontianite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.STRONTIANITE.get());

    public static final Holder<ArmorMaterial> SUGILITE_ARMOUR_MATERIAL = register("sugilite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.SUGILITE.get());

    public static final Holder<ArmorMaterial> SULFUR_ARMOUR_MATERIAL = register("sulfur", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.SULFUR.get());

    public static final Holder<ArmorMaterial> SUNSTONE_ARMOUR_MATERIAL = register("sunstone", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.SUNSTONE.get());

    public static final Holder<ArmorMaterial> TAAFFEITE_ARMOUR_MATERIAL = register("taaffeite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.TAAFFEITE.get());

    public static final Holder<ArmorMaterial> TALC_ARMOUR_MATERIAL = register("talc", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.TALC.get());

    public static final Holder<ArmorMaterial> TANTALITE_ARMOUR_MATERIAL = register("tantalite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.TANTALITE.get());

    public static final Holder<ArmorMaterial> TANZANITE_ARMOUR_MATERIAL = register("tanzanite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.TANZANITE.get());

    public static final Holder<ArmorMaterial> TEKTITE_ARMOUR_MATERIAL = register("tektite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.TEKTITE.get());

    public static final Holder<ArmorMaterial> TEPHROITE_ARMOUR_MATERIAL = register("tephroite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.TEPHROITE.get());

    public static final Holder<ArmorMaterial> THAUMASITE_ARMOUR_MATERIAL = register("thaumasite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.THAUMASITE.get());

    public static final Holder<ArmorMaterial> THOMSONITE_ARMOUR_MATERIAL = register("thomsonite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.THOMSONITE.get());

    public static final Holder<ArmorMaterial> TIGERS_EYE_ARMOUR_MATERIAL = register("tigers_eye", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.TIGERS_EYE.get());

    public static final Holder<ArmorMaterial> TOPAZ_ARMOUR_MATERIAL = register("topaz", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.TOPAZ.get());

    public static final Holder<ArmorMaterial> TOURMALINE_ARMOUR_MATERIAL = register("tourmaline", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.TOURMALINE.get());

    public static final Holder<ArmorMaterial> TREMOLITE_ARMOUR_MATERIAL = register("tremolite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.TREMOLITE.get());

    public static final Holder<ArmorMaterial> TRIPHYLITE_ARMOUR_MATERIAL = register("triphylite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.TRIPHYLITE.get());

    public static final Holder<ArmorMaterial> TSAVORITE_GARNET_ARMOUR_MATERIAL = register("tsavorite_garnet", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.TSAVORITE_GARNET.get());

    public static final Holder<ArmorMaterial> TUGTUPITE_ARMOUR_MATERIAL = register("tugtupite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.TUGTUPITE.get());

    public static final Holder<ArmorMaterial> TURQUOISE_ARMOUR_MATERIAL = register("turquoise", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.TURQUOISE.get());

    public static final Holder<ArmorMaterial> ULEXITE_ARMOUR_MATERIAL = register("ulexite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.ULEXITE.get());

    public static final Holder<ArmorMaterial> UVAROVITE_GARNET_ARMOUR_MATERIAL = register("uvarovite_garnet", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.UVAROVITE_GARNET.get());

    public static final Holder<ArmorMaterial> VANADINITE_ARMOUR_MATERIAL = register("vanadinite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.VANADINITE.get());

    public static final Holder<ArmorMaterial> VARISCITE_ARMOUR_MATERIAL = register("variscite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.VARISCITE.get());

    public static final Holder<ArmorMaterial> VILLIAUMITE_ARMOUR_MATERIAL = register("villiaumite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.VILLIAUMITE.get());

    public static final Holder<ArmorMaterial> VIVIANITE_ARMOUR_MATERIAL = register("vivianite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.VIVIANITE.get());

    public static final Holder<ArmorMaterial> VAYRYNENITE_ARMOUR_MATERIAL = register("vayrynenite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.VAYRYNENITE.get());

    public static final Holder<ArmorMaterial> WARDITE_ARMOUR_MATERIAL = register("wardite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.WARDITE.get());

    public static final Holder<ArmorMaterial> WAVELLITE_ARMOUR_MATERIAL = register("wavellite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.WAVELLITE.get());

    public static final Holder<ArmorMaterial> WELOGANITE_ARMOUR_MATERIAL = register("weloganite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.WELOGANITE.get());

    public static final Holder<ArmorMaterial> WHEWELLITE_ARMOUR_MATERIAL = register("whewellite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.WHEWELLITE.get());

    public static final Holder<ArmorMaterial> WILKEITE_ARMOUR_MATERIAL = register("wilkeite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.WILKEITE.get());

    public static final Holder<ArmorMaterial> WILLEMITE_ARMOUR_MATERIAL = register("willemite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.WILLEMITE.get());

    public static final Holder<ArmorMaterial> WITHERITE_ARMOUR_MATERIAL = register("witherite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.WITHERITE.get());

    public static final Holder<ArmorMaterial> WOLLASTONITE_ARMOUR_MATERIAL = register("wollastonite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.WOLLASTONITE.get());

    public static final Holder<ArmorMaterial> WULFENITE_ARMOUR_MATERIAL = register("wulfenite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.WULFENITE.get());

    public static final Holder<ArmorMaterial> XONOTLITE_ARMOUR_MATERIAL = register("xonotlite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.XONOTLITE.get());

    public static final Holder<ArmorMaterial> YELLOW_DIAMOND_ARMOUR_MATERIAL = register("yellow_diamond", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.YELLOW_DIAMOND.get());

    public static final Holder<ArmorMaterial> YUGAWARALITE_ARMOUR_MATERIAL = register("yugawaralite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.YUGAWARALITE.get());

    public static final Holder<ArmorMaterial> ZEKTZERITE_ARMOUR_MATERIAL = register("zektzerite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.ZEKTZERITE.get());

    public static final Holder<ArmorMaterial> ZINCITE_ARMOUR_MATERIAL = register("zincite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.ZINCITE.get());

    public static final Holder<ArmorMaterial> ZIRCON = register("zircon", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.ZIRCON.get());

    public static final Holder<ArmorMaterial> ZUNYITE_ARMOUR_MATERIAL = register("zunyite", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 255, 5f, 1f, () -> ModGemstones.ZUNYITE.get());

    private static Holder<ArmorMaterial> register(String name, EnumMap<ArmorItem.Type, Integer> typeProtection,
                                                  int enchantability, float toughness, float knockbackResistance,
                                                  Supplier<Item> ingredientItem) {
        ResourceLocation location = ResourceLocation.fromNamespaceAndPath(ProtoOS.MOD_ID, name);
        Holder<SoundEvent> equipSound = SoundEvents.ARMOR_EQUIP_GENERIC;
        Supplier<Ingredient> ingredient = () -> Ingredient.of(ingredientItem.get());
        List<ArmorMaterial.Layer> Layers = List.of(new ArmorMaterial.Layer(location));

        EnumMap<ArmorItem.Type, Integer> typeMap = new EnumMap<>(ArmorItem.Type.class);
        for (ArmorItem.Type type : ArmorItem.Type.values()) {
            typeMap.put(type, typeProtection.get(type));
        }

        return Registry.registerForHolder(BuiltInRegistries.ARMOR_MATERIAL, location,
                new ArmorMaterial(typeProtection, enchantability, equipSound, ingredient, Layers, toughness, knockbackResistance));
    }
}
