package net.fenrir.protoos.item;

import net.fenrir.protoos.ProtoOS;
import net.fenrir.protoos.item.custom.ModHammer;
import net.fenrir.protoos.item.custom.ModToolTiers;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.Unbreakable;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModGemstoneHammer
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ProtoOS.MOD_ID);

    public static final RegistryObject<Item> ACTINOLITE_HAMMER = ITEMS.register("actinolite_hammer",
            () -> new ModHammer(ModToolTiers.ACTINOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ADAMITE_HAMMER = ITEMS.register("adamite_hammer",
            () -> new ModHammer(ModToolTiers.ADAMITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AGATE_HAMMER = ITEMS.register("agate_hammer",
            () -> new ModHammer(ModToolTiers.AGATE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ALBITE_HAMMER = ITEMS.register("albite_hammer",
            () -> new ModHammer(ModToolTiers.ALBITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ALEXANDRITE_HAMMER = ITEMS.register("alexandrite_hammer",
            () -> new ModHammer(ModToolTiers.ALEXANDRITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ALGODONITE_HAMMER = ITEMS.register("algodonite_hammer",
            () -> new ModHammer(ModToolTiers.ALGODONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ALMANDINE_GARNET_HAMMER = ITEMS.register("almandine_garnet_hammer",
            () -> new ModHammer(ModToolTiers.ALMANDINE_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AMAZONITE_HAMMER = ITEMS.register("amazonite_hammer",
            () -> new ModHammer(ModToolTiers.AMAZONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AMBER_HAMMER = ITEMS.register("amber_hammer",
            () -> new ModHammer(ModToolTiers.AMBER, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AMBLYGONITE_HAMMER = ITEMS.register("amblygonite_hammer",
            () -> new ModHammer(ModToolTiers.AMBLYGONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AMETHYST_HAMMER = ITEMS.register("amethyst_hammer",
            () -> new ModHammer(ModToolTiers.AMETHYST, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AMETRINE_HAMMER = ITEMS.register("ametrine_hammer",
            () -> new ModHammer(ModToolTiers.AMETRINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AMMOLITE_HAMMER = ITEMS.register("ammolite_hammer",
            () -> new ModHammer(ModToolTiers.AMMOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ANALCIME_HAMMER = ITEMS.register("analcime_hammer",
            () -> new ModHammer(ModToolTiers.ANALCIME, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ANATASE_HAMMER = ITEMS.register("anatase_hammer",
            () -> new ModHammer(ModToolTiers.ANATASE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ANDALUSITE_HAMMER = ITEMS.register("andalusite_hammer",
            () -> new ModHammer(ModToolTiers.ANDALUSITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ANDESINE_HAMMER = ITEMS.register("andesine_hammer",
            () -> new ModHammer(ModToolTiers.ANDESINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ANDRADITE_HAMMER = ITEMS.register("andradite_hammer",
            () -> new ModHammer(ModToolTiers.ANDRADITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ANGLESITE_HAMMER = ITEMS.register("anglesite_hammer",
            () -> new ModHammer(ModToolTiers.ANGLESITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ANHYDRITE_HAMMER = ITEMS.register("anhydrite_hammer",
            () -> new ModHammer(ModToolTiers.ANHYDRITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ANORTHITE_HAMMER = ITEMS.register("anorthite_hammer",
            () -> new ModHammer(ModToolTiers.ANORTHITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> APATITE_HAMMER = ITEMS.register("apatite_hammer",
            () -> new ModHammer(ModToolTiers.APATITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> APOPHYLLITE_HAMMER = ITEMS.register("apophyllite_hammer",
            () -> new ModHammer(ModToolTiers.APOPHYLLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AQUAMARINE_HAMMER = ITEMS.register("aquamarine_hammer",
            () -> new ModHammer(ModToolTiers.AQUAMARINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ARAGONITE_HAMMER = ITEMS.register("aragonite_hammer",
            () -> new ModHammer(ModToolTiers.ARAGONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ARTISANAL_GLASS_HAMMER = ITEMS.register("artisanal_glass_hammer",
            () -> new ModHammer(ModToolTiers.ARTISANAL_GLASS, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AUGELITE_HAMMER = ITEMS.register("augelite_hammer",
            () -> new ModHammer(ModToolTiers.AUGELITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AXINITE_HAMMER = ITEMS.register("axinite_hammer",
            () -> new ModHammer(ModToolTiers.AXINITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AZURITE_HAMMER = ITEMS.register("azurite_hammer",
            () -> new ModHammer(ModToolTiers.AZURITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BARITE_HAMMER = ITEMS.register("barite_hammer",
            () -> new ModHammer(ModToolTiers.BARITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BAYLDONITE_HAMMER = ITEMS.register("bayldonite_hammer",
            () -> new ModHammer(ModToolTiers.BAYLDONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BENITOITE_HAMMER = ITEMS.register("benitoite_hammer",
            () -> new ModHammer(ModToolTiers.BENITOITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BERYL_HAMMER = ITEMS.register("beryl_hammer",
            () -> new ModHammer(ModToolTiers.BERYL, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BERYLLONITE_HAMMER = ITEMS.register("beryllonite_hammer",
            () -> new ModHammer(ModToolTiers.BERYLLONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BISMUTOTANTALITE_HAMMER = ITEMS.register("bismutotantalite_hammer",
            () -> new ModHammer(ModToolTiers.BISMUTOTANTALITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BLACK_DIAMOND_HAMMER = ITEMS.register("black_diamond_hammer",
            () -> new ModHammer(ModToolTiers.BLACK_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BLOODSTONE_HAMMER = ITEMS.register("bloodstone_hammer",
            () -> new ModHammer(ModToolTiers.BLOODSTONE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BLUE_DIAMOND_HAMMER = ITEMS.register("blue_diamond_hammer",
            () -> new ModHammer(ModToolTiers.BLUE_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BOLEITE_HAMMER = ITEMS.register("boleite_hammer",
            () -> new ModHammer(ModToolTiers.BOLEITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BORACITE_HAMMER = ITEMS.register("boracite_hammer",
            () -> new ModHammer(ModToolTiers.BORACITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BORNITE_HAMMER = ITEMS.register("bornite_hammer",
            () -> new ModHammer(ModToolTiers.BORNITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BRAZILIANITE_HAMMER = ITEMS.register("brazilianite_hammer",
            () -> new ModHammer(ModToolTiers.BRAZILIANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BREITHAUPTITE_HAMMER = ITEMS.register("breithauptite_hammer",
            () -> new ModHammer(ModToolTiers.BREITHAUPTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BROOKITE_HAMMER = ITEMS.register("brookite_hammer",
            () -> new ModHammer(ModToolTiers.BROOKITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BROWN_DIAMOND_HAMMER = ITEMS.register("brown_diamond_hammer",
            () -> new ModHammer(ModToolTiers.BROWN_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BRUCITE_HAMMER = ITEMS.register("brucite_hammer",
            () -> new ModHammer(ModToolTiers.BRUCITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BUSTAMITE_HAMMER = ITEMS.register("bustamite_hammer",
            () -> new ModHammer(ModToolTiers.BUSTAMITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BYTOWNITE_HAMMER = ITEMS.register("bytownite_hammer",
            () -> new ModHammer(ModToolTiers.BYTOWNITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CALCAREOUS_CONCRETIONS_HAMMER = ITEMS.register("calcareous_concretions_hammer",
            () -> new ModHammer(ModToolTiers.CALCAREOUS_CONCRETIONS, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CALCITE_HAMMER = ITEMS.register("calcite_hammer",
            () -> new ModHammer(ModToolTiers.CALCITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CANASITE_HAMMER = ITEMS.register("canasite_hammer",
            () -> new ModHammer(ModToolTiers.CANASITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CANCRINITE_HAMMER = ITEMS.register("cancrinite_hammer",
            () -> new ModHammer(ModToolTiers.CANCRINITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CARNELIAN_HAMMER = ITEMS.register("carnelian_hammer",
            () -> new ModHammer(ModToolTiers.CARNELIAN, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CASSITERITE_HAMMER = ITEMS.register("cassiterite_hammer",
            () -> new ModHammer(ModToolTiers.CASSITERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CATAPLEIITE_HAMMER = ITEMS.register("catapleiite_hammer",
            () -> new ModHammer(ModToolTiers.CATAPLEIITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CELESTITE_HAMMER = ITEMS.register("celestite_hammer",
            () -> new ModHammer(ModToolTiers.CELESTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CERULEITE_HAMMER = ITEMS.register("ceruleite_hammer",
            () -> new ModHammer(ModToolTiers.CERULEITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CERUSSITE_HAMMER = ITEMS.register("cerussite_hammer",
            () -> new ModHammer(ModToolTiers.CERUSSITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHABAZITE_HAMMER = ITEMS.register("chabazite_hammer",
            () -> new ModHammer(ModToolTiers.CHABAZITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHALCEDONY_HAMMER = ITEMS.register("chalcedony_hammer",
            () -> new ModHammer(ModToolTiers.CHALCEDONY, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHAMBERSITE_HAMMER = ITEMS.register("chambersite_hammer",
            () -> new ModHammer(ModToolTiers.CHAMBERSITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHAMAELEON_DIAMOND_HAMMER = ITEMS.register("chamaeleon_diamond_hammer",
            () -> new ModHammer(ModToolTiers.CHAMAELEON_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHAROITE_HAMMER = ITEMS.register("charoite_hammer",
            () -> new ModHammer(ModToolTiers.CHAROITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHICKEN_BLOOD_STONE_HAMMER = ITEMS.register("chicken_blood_stone_hammer",
            () -> new ModHammer(ModToolTiers.CHICKEN_BLOOD_STONE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHILDRENITE_HAMMER = ITEMS.register("childrenite_hammer",
            () -> new ModHammer(ModToolTiers.CHILDRENITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHIOLITE_HAMMER = ITEMS.register("chiolite_hammer",
            () -> new ModHammer(ModToolTiers.CHIOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHROMITE_HAMMER = ITEMS.register("chromite_hammer",
            () -> new ModHammer(ModToolTiers.CHROMITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHRYSOBERYL_HAMMER = ITEMS.register("chrysoberyl_hammer",
            () -> new ModHammer(ModToolTiers.CHRYSOBERYL, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHRYSOCOLLA_HAMMER = ITEMS.register("chrysocolla_hammer",
            () -> new ModHammer(ModToolTiers.CHRYSOCOLLA, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHRYSOCOLLA_CHALCEDONY_HAMMER = ITEMS.register("chrysocolla_chalcedony_hammer",
            () -> new ModHammer(ModToolTiers.CHRYSOCOLLA_CHALCEDONY, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHRYSOPRASE_HAMMER = ITEMS.register("chrysoprase_hammer",
            () -> new ModHammer(ModToolTiers.CHRYSOPRASE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CINNABAR_HAMMER = ITEMS.register("cinnabar_hammer",
            () -> new ModHammer(ModToolTiers.CINNABAR, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CITRINE_HAMMER = ITEMS.register("citrine_hammer",
            () -> new ModHammer(ModToolTiers.CITRINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CLINOCHLORE_HAMMER = ITEMS.register("clinochlore_hammer",
            () -> new ModHammer(ModToolTiers.CLINOCHLORE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> COBALTITE_HAMMER = ITEMS.register("cobaltite_hammer",
            () -> new ModHammer(ModToolTiers.COBALTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> COLEMANITE_HAMMER = ITEMS.register("colemanite_hammer",
            () -> new ModHammer(ModToolTiers.COLEMANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> COLOR_CHANGE_GARNET_HAMMER = ITEMS.register("color_change_garnet_hammer",
            () -> new ModHammer(ModToolTiers.COLOR_CHANGE_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> COLOR_CHANGE_SAPPHIRE_HAMMER = ITEMS.register("color_change_sapphire_hammer",
            () -> new ModHammer(ModToolTiers.COLOR_CHANGE_SAPPHIRE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CORAL_HAMMER = ITEMS.register("coral_hammer",
            () -> new ModHammer(ModToolTiers.CORAL, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CORDIERITE_HAMMER = ITEMS.register("cordierite_hammer",
            () -> new ModHammer(ModToolTiers.CORDIERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CORUNDUM_HAMMER = ITEMS.register("corundum_hammer",
            () -> new ModHammer(ModToolTiers.CORUNDUM, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> COVELLITE_HAMMER = ITEMS.register("covellite_hammer",
            () -> new ModHammer(ModToolTiers.COVELLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CREEDITE_HAMMER = ITEMS.register("creedite_hammer",
            () -> new ModHammer(ModToolTiers.CREEDITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CROCOITE_HAMMER = ITEMS.register("crocoite_hammer",
            () -> new ModHammer(ModToolTiers.CROCOITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CRYOLITE_HAMMER = ITEMS.register("cryolite_hammer",
            () -> new ModHammer(ModToolTiers.CRYOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CUPRITE_HAMMER = ITEMS.register("cuprite_hammer",
            () -> new ModHammer(ModToolTiers.CUPRITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> DANBURITE_HAMMER = ITEMS.register("danburite_hammer",
            () -> new ModHammer(ModToolTiers.DANBURITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> DATOLITE_HAMMER = ITEMS.register("datolite_hammer",
            () -> new ModHammer(ModToolTiers.DATOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> DEMANTOID_GARNET_HAMMER = ITEMS.register("demantoid_garnet_hammer",
            () -> new ModHammer(ModToolTiers.DEMANTOID_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> DIAMOND_HAMMER = ITEMS.register("diamond_hammer",
            () -> new ModHammer(ModToolTiers.DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> DIASPORE_HAMMER = ITEMS.register("diaspore_hammer",
            () -> new ModHammer(ModToolTiers.DIASPORE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> DICKINSONITE_HAMMER = ITEMS.register("dickinsonite_hammer",
            () -> new ModHammer(ModToolTiers.DICKINSONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> DIOPSIDE_HAMMER = ITEMS.register("diopside_hammer",
            () -> new ModHammer(ModToolTiers.DIOPSIDE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> DIOPTASE_HAMMER = ITEMS.register("dioptase_hammer",
            () -> new ModHammer(ModToolTiers.DIOPTASE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> DOLOMITE_HAMMER = ITEMS.register("dolomite_hammer",
            () -> new ModHammer(ModToolTiers.DOLOMITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> DUMORTIERITE_HAMMER = ITEMS.register("dumortierite_hammer",
            () -> new ModHammer(ModToolTiers.DUMORTIERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> EKANITE_HAMMER = ITEMS.register("ekanite_hammer",
            () -> new ModHammer(ModToolTiers.EKANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> EMERALD_HAMMER = ITEMS.register("emerald_hammer",
            () -> new ModHammer(ModToolTiers.EMERALD, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ENSTATITE_HAMMER = ITEMS.register("enstatite_hammer",
            () -> new ModHammer(ModToolTiers.ENSTATITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> EOSPHORITE_HAMMER = ITEMS.register("eosphorite_hammer",
            () -> new ModHammer(ModToolTiers.EOSPHORITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> EPIDOTE_HAMMER = ITEMS.register("epidote_hammer",
            () -> new ModHammer(ModToolTiers.EPIDOTE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ETTRINGITE_HAMMER = ITEMS.register("ettringite_hammer",
            () -> new ModHammer(ModToolTiers.ETTRINGITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> EUCLASE_HAMMER = ITEMS.register("euclase_hammer",
            () -> new ModHammer(ModToolTiers.EUCLASE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> EUDIALYTE_HAMMER = ITEMS.register("eudialyte_hammer",
            () -> new ModHammer(ModToolTiers.EUDIALYTE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> EUXENITE_HAMMER = ITEMS.register("euxenite_hammer",
            () -> new ModHammer(ModToolTiers.EUXENITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> FELDSPAR_HAMMER = ITEMS.register("feldspar_hammer",
            () -> new ModHammer(ModToolTiers.FELDSPAR, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> FERGUSONITE_HAMMER = ITEMS.register("fergusonite_hammer",
            () -> new ModHammer(ModToolTiers.FERGUSONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> FLUORITE_HAMMER = ITEMS.register("fluorite_hammer",
            () -> new ModHammer(ModToolTiers.FLUORITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> FRESHWATER_PEARL_HAMMER = ITEMS.register("freshwater_pearl_hammer",
            () -> new ModHammer(ModToolTiers.FRESHWATER_PEARL, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> FRIEDELITE_HAMMER = ITEMS.register("friedelite_hammer",
            () -> new ModHammer(ModToolTiers.FRIEDELITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> GADOLINITE_HAMMER = ITEMS.register("gadolinite_hammer",
            () -> new ModHammer(ModToolTiers.GADOLINITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> GAHNOSPINEL_HAMMER = ITEMS.register("gahnospinel_hammer",
            () -> new ModHammer(ModToolTiers.GAHNOSPINEL, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> GARNET_HAMMER = ITEMS.register("garnet_hammer",
            () -> new ModHammer(ModToolTiers.GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> GRANDIDIERITE_HAMMER = ITEMS.register("grandidierite_hammer",
            () -> new ModHammer(ModToolTiers.GRANDIDIERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> GRAY_DIAMOND_HAMMER = ITEMS.register("gray_diamond_hammer",
            () -> new ModHammer(ModToolTiers.GRAY_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> GREEN_DIAMOND_HAMMER = ITEMS.register("green_diamond_hammer",
            () -> new ModHammer(ModToolTiers.GREEN_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> GROSSULAR_GARNET_HAMMER = ITEMS.register("grossular_garnet_hammer",
            () -> new ModHammer(ModToolTiers.GROSSULAR_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> GYPSUM_HAMMER = ITEMS.register("gypsum_hammer",
            () -> new ModHammer(ModToolTiers.GYPSUM, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HAMBERGITE_HAMMER = ITEMS.register("hambergite_hammer",
            () -> new ModHammer(ModToolTiers.HAMBERGITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HUAYNE_HAMMER = ITEMS.register("huayne_hammer",
            () -> new ModHammer(ModToolTiers.HUAYNE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HELIODOR_HAMMER = ITEMS.register("heliodor_hammer",
            () -> new ModHammer(ModToolTiers.HELIODOR, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HEMATITE_HAMMER = ITEMS.register("hematite_hammer",
            () -> new ModHammer(ModToolTiers.HEMATITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HEMIMORPHITE_HAMMER = ITEMS.register("hemimorphite_hammer",
            () -> new ModHammer(ModToolTiers.HEMIMORPHITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HERDERITE_HAMMER = ITEMS.register("herderite_hammer",
            () -> new ModHammer(ModToolTiers.HERDERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HESSONITE_HAMMER = ITEMS.register("hessonite_hammer",
            () -> new ModHammer(ModToolTiers.HESSONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HODGKINSONITE_HAMMER = ITEMS.register("hodgkinsonite_hammer",
            () -> new ModHammer(ModToolTiers.HODGKINSONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HOLTITE_HAMMER = ITEMS.register("holtite_hammer",
            () -> new ModHammer(ModToolTiers.HOLTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HOWLITE_HAMMER = ITEMS.register("howlite_hammer",
            () -> new ModHammer(ModToolTiers.HOWLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HUEBNERITE_HAMMER = ITEMS.register("huebnerite_hammer",
            () -> new ModHammer(ModToolTiers.HUEBNERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HUMITE_HAMMER = ITEMS.register("humite_hammer",
            () -> new ModHammer(ModToolTiers.HUMITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HUREAULITE_HAMMER = ITEMS.register("hureaulite_hammer",
            () -> new ModHammer(ModToolTiers.HUREAULITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HURLBUTITE_HAMMER = ITEMS.register("hurlbutite_hammer",
            () -> new ModHammer(ModToolTiers.HURLBUTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HYDROGROSSULAR_GARNET_HAMMER = ITEMS.register("hydrogrossular_garnet_hammer",
            () -> new ModHammer(ModToolTiers.HYDROGROSSULAR_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HYPERITDIABAS_HAMMER = ITEMS.register("hyperitdiabas_hammer",
            () -> new ModHammer(ModToolTiers.HYPERITDIABAS, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> IDOCRASE_HAMMER = ITEMS.register("idocrase_hammer",
            () -> new ModHammer(ModToolTiers.IDOCRASE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> INDERITE_HAMMER = ITEMS.register("inderite_hammer",
            () -> new ModHammer(ModToolTiers.INDERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> IOLITE_HAMMER = ITEMS.register("iolite_hammer",
            () -> new ModHammer(ModToolTiers.IOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> JADEITE_HAMMER = ITEMS.register("jadeite_hammer",
            () -> new ModHammer(ModToolTiers.JADEITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> JASPER_HAMMER = ITEMS.register("jasper_hammer",
            () -> new ModHammer(ModToolTiers.JASPER, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> JEREMEJEVITE_HAMMER = ITEMS.register("jeremejevite_hammer",
            () -> new ModHammer(ModToolTiers.JEREMEJEVITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> JET_HAMMER = ITEMS.register("jet_hammer",
            () -> new ModHammer(ModToolTiers.JET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> KORNERUPINE_HAMMER = ITEMS.register("kornerupine_hammer",
            () -> new ModHammer(ModToolTiers.KORNERUPINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> KURNAKOVITE_HAMMER = ITEMS.register("kurnakovite_hammer",
            () -> new ModHammer(ModToolTiers.KURNAKOVITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> KYANITE_HAMMER = ITEMS.register("kyanite_hammer",
            () -> new ModHammer(ModToolTiers.KYANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> KAMMEREREITE_HAMMER = ITEMS.register("kammererite_hammer",
            () -> new ModHammer(ModToolTiers.KAMMEREREITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LABRADORITE_HAMMER = ITEMS.register("labradorite_hammer",
            () -> new ModHammer(ModToolTiers.LABRADORITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LANGBEINITE_HAMMER = ITEMS.register("langbeinite_hammer",
            () -> new ModHammer(ModToolTiers.LANGBEINITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LAPIS_LAZULI_HAMMER = ITEMS.register("lapis_lazuli_hammer",
            () -> new ModHammer(ModToolTiers.LAPIS_LAZULI, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LASERBLUE_HAMMER = ITEMS.register("laserblue_hammer",
            () -> new ModHammer(ModToolTiers.LASERBLUE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LAWSONITE_HAMMER = ITEMS.register("lawsonite_hammer",
            () -> new ModHammer(ModToolTiers.LAWSONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LAZULITE_HAMMER = ITEMS.register("lazulite_hammer",
            () -> new ModHammer(ModToolTiers.LAZULITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LEGRANDITE_HAMMER = ITEMS.register("legrandite_hammer",
            () -> new ModHammer(ModToolTiers.LEGRANDITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LEPIDOLITE_HAMMER = ITEMS.register("lepidolite_hammer",
            () -> new ModHammer(ModToolTiers.LEPIDOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LEUCITE_HAMMER = ITEMS.register("leucite_hammer",
            () -> new ModHammer(ModToolTiers.LEUCITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LINARITE_HAMMER = ITEMS.register("linarite_hammer",
            () -> new ModHammer(ModToolTiers.LINARITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LUDLAMITE_HAMMER = ITEMS.register("ludlamite_hammer",
            () -> new ModHammer(ModToolTiers.LUDLAMITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MAGNESITE_HAMMER = ITEMS.register("magnesite_hammer",
            () -> new ModHammer(ModToolTiers.MAGNESITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MALACHITE_HAMMER = ITEMS.register("malachite_hammer",
            () -> new ModHammer(ModToolTiers.MALACHITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MALAIA_GARNET_HAMMER = ITEMS.register("malaia_garnet_hammer",
            () -> new ModHammer(ModToolTiers.MALAIA_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MALI_GARNET_HAMMER = ITEMS.register("mali_garnet_hammer",
            () -> new ModHammer(ModToolTiers.MALI_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MANDARIN_GARNET_HAMMER = ITEMS.register("mandarin_garnet_hammer",
            () -> new ModHammer(ModToolTiers.MANDARIN_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MANGANOTANTALITE_HAMMER = ITEMS.register("manganotantalite_hammer",
            () -> new ModHammer(ModToolTiers.MANGANOTANTALITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MARCASITE_HAMMER = ITEMS.register("marcasite_hammer",
            () -> new ModHammer(ModToolTiers.MARCASITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MELIPHANITE_HAMMER = ITEMS.register("meliphanite_hammer",
            () -> new ModHammer(ModToolTiers.MELIPHANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MELLITE_HAMMER = ITEMS.register("mellite_hammer",
            () -> new ModHammer(ModToolTiers.MELLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MICROCLINE_HAMMER = ITEMS.register("microcline_hammer",
            () -> new ModHammer(ModToolTiers.MICROCLINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MICROLITE_HAMMER = ITEMS.register("microlite_hammer",
            () -> new ModHammer(ModToolTiers.MICROLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MILARITE_HAMMER = ITEMS.register("milarite_hammer",
            () -> new ModHammer(ModToolTiers.MILARITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MILLERITE_HAMMER = ITEMS.register("millerite_hammer",
            () -> new ModHammer(ModToolTiers.MILLERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MIMETITE_HAMMER = ITEMS.register("mimetite_hammer",
            () -> new ModHammer(ModToolTiers.MIMETITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MOLDAVITE_HAMMER = ITEMS.register("moldavite_hammer",
            () -> new ModHammer(ModToolTiers.MOLDAVITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MONAZITE_HAMMER = ITEMS.register("monazite_hammer",
            () -> new ModHammer(ModToolTiers.MONAZITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MOONSTONE_HAMMER = ITEMS.register("moonstone_hammer",
            () -> new ModHammer(ModToolTiers.MOONSTONE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MORDENITE_HAMMER = ITEMS.register("mordenite_hammer",
            () -> new ModHammer(ModToolTiers.MORDENITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MORGANITE_HAMMER = ITEMS.register("morganite_hammer",
            () -> new ModHammer(ModToolTiers.MORGANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> NAMBULITE_HAMMER = ITEMS.register("nambulite_hammer",
            () -> new ModHammer(ModToolTiers.NAMBULITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> NATROLITE_HAMMER = ITEMS.register("natrolite_hammer",
            () -> new ModHammer(ModToolTiers.NATROLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> NATURAL_GLASS_HAMMER = ITEMS.register("natural_glass_hammer",
            () -> new ModHammer(ModToolTiers.NATURAL_GLASS, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> NEPHELINE_HAMMER = ITEMS.register("nepheline_hammer",
            () -> new ModHammer(ModToolTiers.NEPHELINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> NEPHRITE_HAMMER = ITEMS.register("nephrite_hammer",
            () -> new ModHammer(ModToolTiers.NEPHRITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> NEPTUNITE_HAMMER = ITEMS.register("neptunite_hammer",
            () -> new ModHammer(ModToolTiers.NEPTUNITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> NICCOLITE_HAMMER = ITEMS.register("niccolite_hammer",
            () -> new ModHammer(ModToolTiers.NICCOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> OBSIDIAN_HAMMER = ITEMS.register("obsidian_hammer",
            () -> new ModHammer(ModToolTiers.OBSIDIAN, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> OLIGOCLASE_HAMMER = ITEMS.register("oligoclase_hammer",
            () -> new ModHammer(ModToolTiers.OLIGOCLASE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ONYX_HAMMER = ITEMS.register("onyx_hammer",
            () -> new ModHammer(ModToolTiers.ONYX, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> OPAL_STONE_HAMMER = ITEMS.register("opal_stone_hammer",
            () -> new ModHammer(ModToolTiers.OPAL_STONE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ORANGE_DIAMOND_HAMMER = ITEMS.register("orange_diamond_hammer",
            () -> new ModHammer(ModToolTiers.ORANGE_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> OREGON_SUNSTONE_HAMMER = ITEMS.register("oregon_sunstone_hammer",
            () -> new ModHammer(ModToolTiers.OREGON_SUNSTONE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ORTHOCLASE_HAMMER = ITEMS.register("orthoclase_hammer",
            () -> new ModHammer(ModToolTiers.ORTHOCLASE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PADPARADSCHA_SAPPHIRE_HAMMER = ITEMS.register("padparadscha_sapphire_hammer",
            () -> new ModHammer(ModToolTiers.PADPARADSCHA_SAPPHIRE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PAINITE_HAMMER = ITEMS.register("painite_hammer",
            () -> new ModHammer(ModToolTiers.PAINITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PALYGORSKITE_HAMMER = ITEMS.register("palygorskite_hammer",
            () -> new ModHammer(ModToolTiers.PALYGORSKITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PAPAGOITE_HAMMER = ITEMS.register("papagoite_hammer",
            () -> new ModHammer(ModToolTiers.PAPAGOITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PARAIBA_TOURMALINE_HAMMER = ITEMS.register("paraiba_tourmaline_hammer",
            () -> new ModHammer(ModToolTiers.PARAIBA_TOURMALINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PARGASITE_HAMMER = ITEMS.register("pargasite_hammer",
            () -> new ModHammer(ModToolTiers.PARGASITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PARISITE_HAMMER = ITEMS.register("parisite_hammer",
            () -> new ModHammer(ModToolTiers.PARISITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PEARL_HAMMER = ITEMS.register("pearl_hammer",
            () -> new ModHammer(ModToolTiers.PEARL, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PECTOLITE_HAMMER = ITEMS.register("pectolite_hammer",
            () -> new ModHammer(ModToolTiers.PECTOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PENTLANDITE_HAMMER = ITEMS.register("pentlandite_hammer",
            () -> new ModHammer(ModToolTiers.PENTLANDITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PERICLASE_HAMMER = ITEMS.register("periclase_hammer",
            () -> new ModHammer(ModToolTiers.PERICLASE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PERIDOT_HAMMER = ITEMS.register("peridot_hammer",
            () -> new ModHammer(ModToolTiers.PERIDOT, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PERISTERITE_HAMMER = ITEMS.register("peristerite_hammer",
            () -> new ModHammer(ModToolTiers.PERISTERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PERTHITE_HAMMER = ITEMS.register("perthite_hammer",
            () -> new ModHammer(ModToolTiers.PERTHITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PETALITE_HAMMER = ITEMS.register("petalite_hammer",
            () -> new ModHammer(ModToolTiers.PETALITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PHENAKITE_HAMMER = ITEMS.register("phenakite_hammer",
            () -> new ModHammer(ModToolTiers.PHENAKITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PHOSGENITE_HAMMER = ITEMS.register("phosgenite_hammer",
            () -> new ModHammer(ModToolTiers.PHOSGENITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PHOSPHOPHYLLITE_HAMMER = ITEMS.register("phosphophyllite_hammer",
            () -> new ModHammer(ModToolTiers.PHOSPHOPHYLLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PINK_DIAMOND_HAMMER = ITEMS.register("pink_diamond_hammer",
            () -> new ModHammer(ModToolTiers.PINK_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> POLLUCITE_HAMMER = ITEMS.register("pollucite_hammer",
            () -> new ModHammer(ModToolTiers.POLLUCITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> POWELLITE_HAMMER = ITEMS.register("powellite_hammer",
            () -> new ModHammer(ModToolTiers.POWELLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PREHNITE_HAMMER = ITEMS.register("prehnite_hammer",
            () -> new ModHammer(ModToolTiers.PREHNITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PROSOPITE_HAMMER = ITEMS.register("prosopite_hammer",
            () -> new ModHammer(ModToolTiers.PROSOPITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PROTEUS_HAMMER = ITEMS.register("proteus_hammer",
            () -> new ModHammer(ModToolTiers.PROTEUS, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PROUSTITE_HAMMER = ITEMS.register("proustite_hammer",
            () -> new ModHammer(ModToolTiers.PROUSTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PUMPELLYITE_HAMMER = ITEMS.register("pumpellyite_hammer",
            () -> new ModHammer(ModToolTiers.PUMPELLYITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PURPLE_DIAMOND_HAMMER = ITEMS.register("purple_diamond_hammer",
            () -> new ModHammer(ModToolTiers.PURPLE_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PURPURITE_HAMMER = ITEMS.register("purpurite_hammer",
            () -> new ModHammer(ModToolTiers.PURPURITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PYRARGYRITE_HAMMER = ITEMS.register("pyrargyrite_hammer",
            () -> new ModHammer(ModToolTiers.PYRARGYRITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PYRITE_HAMMER = ITEMS.register("pyrite_hammer",
            () -> new ModHammer(ModToolTiers.PYRITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PYROPE_GARNET_HAMMER = ITEMS.register("pyrope_garnet_hammer",
            () -> new ModHammer(ModToolTiers.PYROPE_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PYROPHYLLITE_HAMMER = ITEMS.register("pyrophyllite_hammer",
            () -> new ModHammer(ModToolTiers.PYROPHYLLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PYROXMANGITE_HAMMER = ITEMS.register("pyroxmangite_hammer",
            () -> new ModHammer(ModToolTiers.PYROXMANGITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PYRRHOTITE_HAMMER = ITEMS.register("pyrrhotite_hammer",
            () -> new ModHammer(ModToolTiers.PYRRHOTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> QUARTZ_HAMMER = ITEMS.register("quartz_hammer",
            () -> new ModHammer(ModToolTiers.QUARTZ, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> QUARTZITE_HAMMER = ITEMS.register("quartzite_hammer",
            () -> new ModHammer(ModToolTiers.QUARTZITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> REALGAR_HAMMER = ITEMS.register("realgar_hammer",
            () -> new ModHammer(ModToolTiers.REALGAR, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> RED_BERYL_HAMMER = ITEMS.register("red_beryl_hammer",
            () -> new ModHammer(ModToolTiers.RED_BERYL, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> RED_DIAMOND_HAMMER = ITEMS.register("red_diamond_hammer",
            () -> new ModHammer(ModToolTiers.RED_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> RHODIZITE_HAMMER = ITEMS.register("rhodizite_hammer",
            () -> new ModHammer(ModToolTiers.RHODIZITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> RHODOCHROSITE_HAMMER = ITEMS.register("rhodochrosite_hammer",
            () -> new ModHammer(ModToolTiers.RHODOCHROSITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> RHODOLITE_GARNET_HAMMER = ITEMS.register("rhodolite_garnet_hammer",
            () -> new ModHammer(ModToolTiers.RHODOLITE_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> RHODONITE_HAMMER = ITEMS.register("rhodonite_hammer",
            () -> new ModHammer(ModToolTiers.RHODONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ROSE_QUARTZ_HAMMER = ITEMS.register("rose_quartz_hammer",
            () -> new ModHammer(ModToolTiers.ROSE_QUARTZ, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> RUBELLITE_HAMMER = ITEMS.register("rubellite_hammer",
            () -> new ModHammer(ModToolTiers.RUBELLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> RUBY_HAMMER = ITEMS.register("ruby_hammer",
            () -> new ModHammer(ModToolTiers.RUBY, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> RUTILE_HAMMER = ITEMS.register("rutile_hammer",
            () -> new ModHammer(ModToolTiers.RUTILE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SALTWATER_PEARL_HAMMER = ITEMS.register("saltwater_pearl_hammer",
            () -> new ModHammer(ModToolTiers.SALTWATER_PEARL, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SAMARSKITE_HAMMER = ITEMS.register("samarskite_hammer",
            () -> new ModHammer(ModToolTiers.SAMARSKITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SANIDINE_HAMMER = ITEMS.register("sanidine_hammer",
            () -> new ModHammer(ModToolTiers.SANIDINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SAPPHIRE_HAMMER = ITEMS.register("sapphire_hammer",
            () -> new ModHammer(ModToolTiers.SAPPHIRE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SAPPHIRINE_HAMMER = ITEMS.register("sapphirine_hammer",
            () -> new ModHammer(ModToolTiers.SAPPHIRINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SARCOLITE_HAMMER = ITEMS.register("sarcolite_hammer",
            () -> new ModHammer(ModToolTiers.SARCOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SCAPOLITE_HAMMER = ITEMS.register("scapolite_hammer",
            () -> new ModHammer(ModToolTiers.SCAPOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SCHEELITE_HAMMER = ITEMS.register("scheelite_hammer",
            () -> new ModHammer(ModToolTiers.SCHEELITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SCORODITE_HAMMER = ITEMS.register("scorodite_hammer",
            () -> new ModHammer(ModToolTiers.SCORODITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SELLAITE_HAMMER = ITEMS.register("sellaite_hammer",
            () -> new ModHammer(ModToolTiers.SELLAITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SENARMONTITE_HAMMER = ITEMS.register("senarmontite_hammer",
            () -> new ModHammer(ModToolTiers.SENARMONTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SERANDITE_HAMMER = ITEMS.register("serandite_hammer",
            () -> new ModHammer(ModToolTiers.SERANDITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SERPENTINE_HAMMER = ITEMS.register("serpentine_hammer",
            () -> new ModHammer(ModToolTiers.SERPENTINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SHATTUCKITE_HAMMER = ITEMS.register("shattuckite_hammer",
            () -> new ModHammer(ModToolTiers.SHATTUCKITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SHORTITE_HAMMER = ITEMS.register("shortite_hammer",
            () -> new ModHammer(ModToolTiers.SHORTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SIDERITE_HAMMER = ITEMS.register("siderite_hammer",
            () -> new ModHammer(ModToolTiers.SIDERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SILLIMANITE_HAMMER = ITEMS.register("sillimanite_hammer",
            () -> new ModHammer(ModToolTiers.SILLIMANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SIMPSONITE_HAMMER = ITEMS.register("simpsonite_hammer",
            () -> new ModHammer(ModToolTiers.SIMPSONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SINHALITE_HAMMER = ITEMS.register("sinhalite_hammer",
            () -> new ModHammer(ModToolTiers.SINHALITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SMALTITE_HAMMER = ITEMS.register("smaltite_hammer",
            () -> new ModHammer(ModToolTiers.SMALTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SMITHSONITE_HAMMER = ITEMS.register("smithsonite_hammer",
            () -> new ModHammer(ModToolTiers.SMITHSONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SMOKY_QUARTZ_HAMMER = ITEMS.register("smoky_quartz_hammer",
            () -> new ModHammer(ModToolTiers.SMOKY_QUARTZ, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SODALITE_HAMMER = ITEMS.register("sodalite_hammer",
            () -> new ModHammer(ModToolTiers.SODALITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SOGDIANITE_HAMMER = ITEMS.register("sogdianite_hammer",
            () -> new ModHammer(ModToolTiers.SOGDIANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SPESSARTITE_GARNET_HAMMER = ITEMS.register("spessartite_garnet_hammer",
            () -> new ModHammer(ModToolTiers.SPESSARTITE_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SPHALERITE_HAMMER = ITEMS.register("sphalerite_hammer",
            () -> new ModHammer(ModToolTiers.SPHALERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SPHENE_HAMMER = ITEMS.register("sphene_hammer",
            () -> new ModHammer(ModToolTiers.SPHENE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SPINEL_HAMMER = ITEMS.register("spinel_hammer",
            () -> new ModHammer(ModToolTiers.SPINEL, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SPODUMENE_HAMMER = ITEMS.register("spodumene_hammer",
            () -> new ModHammer(ModToolTiers.SPODUMENE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SPURRITE_HAMMER = ITEMS.register("spurrite_hammer",
            () -> new ModHammer(ModToolTiers.SPURRITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> STAR_SAPPHIRE_HAMMER = ITEMS.register("star_sapphire_hammer",
            () -> new ModHammer(ModToolTiers.STAR_SAPPHIRE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> STAUROLITE_HAMMER = ITEMS.register("staurolite_hammer",
            () -> new ModHammer(ModToolTiers.STAUROLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> STICHTITE_HAMMER = ITEMS.register("stichtite_hammer",
            () -> new ModHammer(ModToolTiers.STICHTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> STOLZITE_HAMMER = ITEMS.register("stolzite_hammer",
            () -> new ModHammer(ModToolTiers.STOLZITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> STRONTIANITE_HAMMER = ITEMS.register("strontianite_hammer",
            () -> new ModHammer(ModToolTiers.STRONTIANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SUGILITE_HAMMER = ITEMS.register("sugilite_hammer",
            () -> new ModHammer(ModToolTiers.SUGILITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SULFUR_HAMMER = ITEMS.register("sulfur_hammer",
            () -> new ModHammer(ModToolTiers.SULFUR, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SUNSTONE_HAMMER = ITEMS.register("sunstone_hammer",
            () -> new ModHammer(ModToolTiers.SUNSTONE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TAAFFEITE_HAMMER = ITEMS.register("taaffeite_hammer",
            () -> new ModHammer(ModToolTiers.TAAFFEITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TALC_HAMMER = ITEMS.register("talc_hammer",
            () -> new ModHammer(ModToolTiers.TALC, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TANTALITE_HAMMER = ITEMS.register("tantalite_hammer",
            () -> new ModHammer(ModToolTiers.TANTALITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TANZANITE_HAMMER = ITEMS.register("tanzanite_hammer",
            () -> new ModHammer(ModToolTiers.TANZANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TEKTITE_HAMMER = ITEMS.register("tektite_hammer",
            () -> new ModHammer(ModToolTiers.TEKTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TEPHROITE_HAMMER = ITEMS.register("tephroite_hammer",
            () -> new ModHammer(ModToolTiers.TEPHROITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> THAUMASITE_HAMMER = ITEMS.register("thaumasite_hammer",
            () -> new ModHammer(ModToolTiers.THAUMASITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> THOMSONITE_HAMMER = ITEMS.register("thomsonite_hammer",
            () -> new ModHammer(ModToolTiers.THOMSONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TIGERS_EYE_HAMMER = ITEMS.register("tigers_eye_hammer",
            () -> new ModHammer(ModToolTiers.TIGERS_EYE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TOPAZ_HAMMER = ITEMS.register("topaz_hammer",
            () -> new ModHammer(ModToolTiers.TOPAZ, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TOURMALINE_HAMMER = ITEMS.register("tourmaline_hammer",
            () -> new ModHammer(ModToolTiers.TOURMALINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TREMOLITE_HAMMER = ITEMS.register("tremolite_hammer",
            () -> new ModHammer(ModToolTiers.TREMOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TRIPHYLITE_HAMMER = ITEMS.register("triphylite_hammer",
            () -> new ModHammer(ModToolTiers.TRIPHYLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TSAVORITE_GARNET_HAMMER = ITEMS.register("tsavorite_garnet_hammer",
            () -> new ModHammer(ModToolTiers.TSAVORITE_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TUGTUPITE_HAMMER = ITEMS.register("tugtupite_hammer",
            () -> new ModHammer(ModToolTiers.TUGTUPITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TURQUOISE_HAMMER = ITEMS.register("turquoise_hammer",
            () -> new ModHammer(ModToolTiers.TURQUOISE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ULEXITE_HAMMER = ITEMS.register("ulexite_hammer",
            () -> new ModHammer(ModToolTiers.ULEXITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> UVAROVITE_GARNET_HAMMER = ITEMS.register("uvarovite_garnet_hammer",
            () -> new ModHammer(ModToolTiers.UVAROVITE_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> VANADINITE_HAMMER = ITEMS.register("vanadinite_hammer",
            () -> new ModHammer(ModToolTiers.VANADINITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> VARISCITE_HAMMER = ITEMS.register("variscite_hammer",
            () -> new ModHammer(ModToolTiers.VARISCITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> VILLIAUMITE_HAMMER = ITEMS.register("villiaumite_hammer",
            () -> new ModHammer(ModToolTiers.VILLIAUMITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> VIVIANITE_HAMMER = ITEMS.register("vivianite_hammer",
            () -> new ModHammer(ModToolTiers.VIVIANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> VAYRYNENITE_HAMMER = ITEMS.register("vayrynenite_hammer",
            () -> new ModHammer(ModToolTiers.VAYRYNENITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> WARDITE_HAMMER = ITEMS.register("wardite_hammer",
            () -> new ModHammer(ModToolTiers.WARDITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> WAVELLITE_HAMMER = ITEMS.register("wavellite_hammer",
            () -> new ModHammer(ModToolTiers.WAVELLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> WELOGANITE_HAMMER = ITEMS.register("weloganite_hammer",
            () -> new ModHammer(ModToolTiers.WELOGANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> WHEWELLITE_HAMMER = ITEMS.register("whewellite_hammer",
            () -> new ModHammer(ModToolTiers.WHEWELLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> WILKEITE_HAMMER = ITEMS.register("wilkeite_hammer",
            () -> new ModHammer(ModToolTiers.WILKEITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> WILLEMITE_HAMMER = ITEMS.register("willemite_hammer",
            () -> new ModHammer(ModToolTiers.WILLEMITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> WITHERITE_HAMMER = ITEMS.register("witherite_hammer",
            () -> new ModHammer(ModToolTiers.WITHERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> WOLLASTONITE_HAMMER = ITEMS.register("wollastonite_hammer",
            () -> new ModHammer(ModToolTiers.WOLLASTONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> WULFENITE_HAMMER = ITEMS.register("wulfenite_hammer",
            () -> new ModHammer(ModToolTiers.WULFENITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> XONOTLITE_HAMMER = ITEMS.register("xonotlite_hammer",
            () -> new ModHammer(ModToolTiers.XONOTLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> YELLOW_DIAMOND_HAMMER = ITEMS.register("yellow_diamond_hammer",
            () -> new ModHammer(ModToolTiers.YELLOW_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> YUGAWARALITE_HAMMER = ITEMS.register("yugawaralite_hammer",
            () -> new ModHammer(ModToolTiers.YUGAWARALITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ZEKTZERITE_HAMMER = ITEMS.register("zektzerite_hammer",
            () -> new ModHammer(ModToolTiers.ZEKTZERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ZINCITE_HAMMER = ITEMS.register("zincite_hammer",
            () -> new ModHammer(ModToolTiers.ZINCITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ZIRCON_HAMMER = ITEMS.register("zircon_hammer",
            () -> new ModHammer(ModToolTiers.ZIRCON, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ZUNYITE_HAMMER = ITEMS.register("zunyite_hammer",
            () -> new ModHammer(ModToolTiers.ZUNYITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
