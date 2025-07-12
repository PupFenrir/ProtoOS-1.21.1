package net.fenrir.protoos.item;

import net.fenrir.protoos.ProtoOS;
import net.fenrir.protoos.item.custom.ModToolTiers;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.component.Unbreakable;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModGemstoneSword
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ProtoOS.MOD_ID);

    public static final RegistryObject<Item> ACTINOLITE_SWORD = ITEMS.register("actinolite_sword",
            () -> new SwordItem(ModToolTiers.ACTINOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ADAMITE_SWORD = ITEMS.register("adamite_sword",
            () -> new SwordItem(ModToolTiers.ADAMITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AGATE_SWORD = ITEMS.register("agate_sword",
            () -> new SwordItem(ModToolTiers.AGATE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ALBITE_SWORD = ITEMS.register("albite_sword",
            () -> new SwordItem(ModToolTiers.ALBITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ALEXANDRITE_SWORD = ITEMS.register("alexandrite_sword",
            () -> new SwordItem(ModToolTiers.ALEXANDRITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ALGODONITE_SWORD = ITEMS.register("algodonite_sword",
            () -> new SwordItem(ModToolTiers.ALGODONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ALMANDINE_GARNET_SWORD = ITEMS.register("almandine_garnet_sword",
            () -> new SwordItem(ModToolTiers.ALMANDINE_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AMAZONITE_SWORD = ITEMS.register("amazonite_sword",
            () -> new SwordItem(ModToolTiers.AMAZONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AMBER_SWORD = ITEMS.register("amber_sword",
            () -> new SwordItem(ModToolTiers.AMBER, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AMBLYGONITE_SWORD = ITEMS.register("amblygonite_sword",
            () -> new SwordItem(ModToolTiers.AMBLYGONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AMETHYST_SWORD = ITEMS.register("amethyst_sword",
            () -> new SwordItem(ModToolTiers.AMETHYST, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AMETRINE_SWORD = ITEMS.register("ametrine_sword",
            () -> new SwordItem(ModToolTiers.AMETRINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AMMOLITE_SWORD = ITEMS.register("ammolite_sword",
            () -> new SwordItem(ModToolTiers.AMMOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ANALCIME_SWORD = ITEMS.register("analcime_sword",
            () -> new SwordItem(ModToolTiers.ANALCIME, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ANATASE_SWORD = ITEMS.register("anatase_sword",
            () -> new SwordItem(ModToolTiers.ANATASE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ANDALUSITE_SWORD = ITEMS.register("andalusite_sword",
            () -> new SwordItem(ModToolTiers.ANDALUSITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ANDESINE_SWORD = ITEMS.register("andesine_sword",
            () -> new SwordItem(ModToolTiers.ANDESINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ANDRADITE_SWORD = ITEMS.register("andradite_sword",
            () -> new SwordItem(ModToolTiers.ANDRADITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ANGLESITE_SWORD = ITEMS.register("anglesite_sword",
            () -> new SwordItem(ModToolTiers.ANGLESITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ANHYDRITE_SWORD = ITEMS.register("anhydrite_sword",
            () -> new SwordItem(ModToolTiers.ANHYDRITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ANORTHITE_SWORD = ITEMS.register("anorthite_sword",
            () -> new SwordItem(ModToolTiers.ANORTHITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> APATITE_SWORD = ITEMS.register("apatite_sword",
            () -> new SwordItem(ModToolTiers.APATITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> APOPHYLLITE_SWORD = ITEMS.register("apophyllite_sword",
            () -> new SwordItem(ModToolTiers.APOPHYLLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AQUAMARINE_SWORD = ITEMS.register("aquamarine_sword",
            () -> new SwordItem(ModToolTiers.AQUAMARINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ARAGONITE_SWORD = ITEMS.register("aragonite_sword",
            () -> new SwordItem(ModToolTiers.ARAGONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ARTISANAL_GLASS_SWORD = ITEMS.register("artisanal_glass_sword",
            () -> new SwordItem(ModToolTiers.ARTISANAL_GLASS, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AUGELITE_SWORD = ITEMS.register("augelite_sword",
            () -> new SwordItem(ModToolTiers.AUGELITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AXINITE_SWORD = ITEMS.register("axinite_sword",
            () -> new SwordItem(ModToolTiers.AXINITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AZURITE_SWORD = ITEMS.register("azurite_sword",
            () -> new SwordItem(ModToolTiers.AZURITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BARITE_SWORD = ITEMS.register("barite_sword",
            () -> new SwordItem(ModToolTiers.BARITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BAYLDONITE_SWORD = ITEMS.register("bayldonite_sword",
            () -> new SwordItem(ModToolTiers.BAYLDONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BENITOITE_SWORD = ITEMS.register("benitoite_sword",
            () -> new SwordItem(ModToolTiers.BENITOITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BERYL_SWORD = ITEMS.register("beryl_sword",
            () -> new SwordItem(ModToolTiers.BERYL, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BERYLLONITE_SWORD = ITEMS.register("beryllonite_sword",
            () -> new SwordItem(ModToolTiers.BERYLLONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BISMUTOTANTALITE_SWORD = ITEMS.register("bismutotantalite_sword",
            () -> new SwordItem(ModToolTiers.BISMUTOTANTALITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BLACK_DIAMOND_SWORD = ITEMS.register("black_diamond_sword",
            () -> new SwordItem(ModToolTiers.BLACK_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BLOODSTONE_SWORD = ITEMS.register("bloodstone_sword",
            () -> new SwordItem(ModToolTiers.BLOODSTONE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BLUE_DIAMOND_SWORD = ITEMS.register("blue_diamond_sword",
            () -> new SwordItem(ModToolTiers.BLUE_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BOLEITE_SWORD = ITEMS.register("boleite_sword",
            () -> new SwordItem(ModToolTiers.BOLEITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BORACITE_SWORD = ITEMS.register("boracite_sword",
            () -> new SwordItem(ModToolTiers.BORACITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BORNITE_SWORD = ITEMS.register("bornite_sword",
            () -> new SwordItem(ModToolTiers.BORNITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BRAZILIANITE_SWORD = ITEMS.register("brazilianite_sword",
            () -> new SwordItem(ModToolTiers.BRAZILIANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BREITHAUPTITE_SWORD = ITEMS.register("breithauptite_sword",
            () -> new SwordItem(ModToolTiers.BREITHAUPTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BROOKITE_SWORD = ITEMS.register("brookite_sword",
            () -> new SwordItem(ModToolTiers.BROOKITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BROWN_DIAMOND_SWORD = ITEMS.register("brown_diamond_sword",
            () -> new SwordItem(ModToolTiers.BROWN_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BRUCITE_SWORD = ITEMS.register("brucite_sword",
            () -> new SwordItem(ModToolTiers.BRUCITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BUSTAMITE_SWORD = ITEMS.register("bustamite_sword",
            () -> new SwordItem(ModToolTiers.BUSTAMITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BYTOWNITE_SWORD = ITEMS.register("bytownite_sword",
            () -> new SwordItem(ModToolTiers.BYTOWNITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CALCAREOUS_CONCRETIONS_SWORD = ITEMS.register("calcareous_concretions_sword",
            () -> new SwordItem(ModToolTiers.CALCAREOUS_CONCRETIONS, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CALCITE_SWORD = ITEMS.register("calcite_sword",
            () -> new SwordItem(ModToolTiers.CALCITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CANASITE_SWORD = ITEMS.register("canasite_sword",
            () -> new SwordItem(ModToolTiers.CANASITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CANCRINITE_SWORD = ITEMS.register("cancrinite_sword",
            () -> new SwordItem(ModToolTiers.CANCRINITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CARNELIAN_SWORD = ITEMS.register("carnelian_sword",
            () -> new SwordItem(ModToolTiers.CARNELIAN, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CASSITERITE_SWORD = ITEMS.register("cassiterite_sword",
            () -> new SwordItem(ModToolTiers.CASSITERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CATAPLEIITE_SWORD = ITEMS.register("catapleiite_sword",
            () -> new SwordItem(ModToolTiers.CATAPLEIITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CELESTITE_SWORD = ITEMS.register("celestite_sword",
            () -> new SwordItem(ModToolTiers.CELESTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CERULEITE_SWORD = ITEMS.register("ceruleite_sword",
            () -> new SwordItem(ModToolTiers.CERULEITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CERUSSITE_SWORD = ITEMS.register("cerussite_sword",
            () -> new SwordItem(ModToolTiers.CERUSSITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHABAZITE_SWORD = ITEMS.register("chabazite_sword",
            () -> new SwordItem(ModToolTiers.CHABAZITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHALCEDONY_SWORD = ITEMS.register("chalcedony_sword",
            () -> new SwordItem(ModToolTiers.CHALCEDONY, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHAMBERSITE_SWORD = ITEMS.register("chambersite_sword",
            () -> new SwordItem(ModToolTiers.CHAMBERSITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHAMAELEON_DIAMOND_SWORD = ITEMS.register("chamaeleon_diamond_sword",
            () -> new SwordItem(ModToolTiers.CHAMAELEON_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHAROITE_SWORD = ITEMS.register("charoite_sword",
            () -> new SwordItem(ModToolTiers.CHAROITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHICKEN_BLOOD_STONE_SWORD = ITEMS.register("chicken_blood_stone_sword",
            () -> new SwordItem(ModToolTiers.CHICKEN_BLOOD_STONE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHILDRENITE_SWORD = ITEMS.register("childrenite_sword",
            () -> new SwordItem(ModToolTiers.CHILDRENITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHIOLITE_SWORD = ITEMS.register("chiolite_sword",
            () -> new SwordItem(ModToolTiers.CHIOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHROMITE_SWORD = ITEMS.register("chromite_sword",
            () -> new SwordItem(ModToolTiers.CHROMITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHRYSOBERYL_SWORD = ITEMS.register("chrysoberyl_sword",
            () -> new SwordItem(ModToolTiers.CHRYSOBERYL, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHRYSOCOLLA_SWORD = ITEMS.register("chrysocolla_sword",
            () -> new SwordItem(ModToolTiers.CHRYSOCOLLA, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHRYSOCOLLA_CHALCEDONY_SWORD = ITEMS.register("chrysocolla_chalcedony_sword",
            () -> new SwordItem(ModToolTiers.CHRYSOCOLLA_CHALCEDONY, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHRYSOPRASE_SWORD = ITEMS.register("chrysoprase_sword",
            () -> new SwordItem(ModToolTiers.CHRYSOPRASE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CINNABAR_SWORD = ITEMS.register("cinnabar_sword",
            () -> new SwordItem(ModToolTiers.CINNABAR, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CITRINE_SWORD = ITEMS.register("citrine_sword",
            () -> new SwordItem(ModToolTiers.CITRINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CLINOCHLORE_SWORD = ITEMS.register("clinochlore_sword",
            () -> new SwordItem(ModToolTiers.CLINOCHLORE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> COBALTITE_SWORD = ITEMS.register("cobaltite_sword",
            () -> new SwordItem(ModToolTiers.COBALTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> COLEMANITE_SWORD = ITEMS.register("colemanite_sword",
            () -> new SwordItem(ModToolTiers.COLEMANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> COLOR_CHANGE_GARNET_SWORD = ITEMS.register("color_change_garnet_sword",
            () -> new SwordItem(ModToolTiers.COLOR_CHANGE_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> COLOR_CHANGE_SAPPHIRE_SWORD = ITEMS.register("color_change_sapphire_sword",
            () -> new SwordItem(ModToolTiers.COLOR_CHANGE_SAPPHIRE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CORAL_SWORD = ITEMS.register("coral_sword",
            () -> new SwordItem(ModToolTiers.CORAL, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CORDIERITE_SWORD = ITEMS.register("cordierite_sword",
            () -> new SwordItem(ModToolTiers.CORDIERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CORUNDUM_SWORD = ITEMS.register("corundum_sword",
            () -> new SwordItem(ModToolTiers.CORUNDUM, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> COVELLITE_SWORD = ITEMS.register("covellite_sword",
            () -> new SwordItem(ModToolTiers.COVELLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CREEDITE_SWORD = ITEMS.register("creedite_sword",
            () -> new SwordItem(ModToolTiers.CREEDITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CROCOITE_SWORD = ITEMS.register("crocoite_sword",
            () -> new SwordItem(ModToolTiers.CROCOITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CRYOLITE_SWORD = ITEMS.register("cryolite_sword",
            () -> new SwordItem(ModToolTiers.CRYOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CUPRITE_SWORD = ITEMS.register("cuprite_sword",
            () -> new SwordItem(ModToolTiers.CUPRITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> DANBURITE_SWORD = ITEMS.register("danburite_sword",
            () -> new SwordItem(ModToolTiers.DANBURITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> DATOLITE_SWORD = ITEMS.register("datolite_sword",
            () -> new SwordItem(ModToolTiers.DATOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> DEMANTOID_GARNET_SWORD = ITEMS.register("demantoid_garnet_sword",
            () -> new SwordItem(ModToolTiers.DEMANTOID_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> DIAMOND_SWORD = ITEMS.register("diamond_sword",
            () -> new SwordItem(ModToolTiers.DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> DIASPORE_SWORD = ITEMS.register("diaspore_sword",
            () -> new SwordItem(ModToolTiers.DIASPORE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> DICKINSONITE_SWORD = ITEMS.register("dickinsonite_sword",
            () -> new SwordItem(ModToolTiers.DICKINSONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> DIOPSIDE_SWORD = ITEMS.register("diopside_sword",
            () -> new SwordItem(ModToolTiers.DIOPSIDE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> DIOPTASE_SWORD = ITEMS.register("dioptase_sword",
            () -> new SwordItem(ModToolTiers.DIOPTASE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> DOLOMITE_SWORD = ITEMS.register("dolomite_sword",
            () -> new SwordItem(ModToolTiers.DOLOMITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> DUMORTIERITE_SWORD = ITEMS.register("dumortierite_sword",
            () -> new SwordItem(ModToolTiers.DUMORTIERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> EKANITE_SWORD = ITEMS.register("ekanite_sword",
            () -> new SwordItem(ModToolTiers.EKANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword",
            () -> new SwordItem(ModToolTiers.EMERALD, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ENSTATITE_SWORD = ITEMS.register("enstatite_sword",
            () -> new SwordItem(ModToolTiers.ENSTATITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> EOSPHORITE_SWORD = ITEMS.register("eosphorite_sword",
            () -> new SwordItem(ModToolTiers.EOSPHORITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> EPIDOTE_SWORD = ITEMS.register("epidote_sword",
            () -> new SwordItem(ModToolTiers.EPIDOTE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ETTRINGITE_SWORD = ITEMS.register("ettringite_sword",
            () -> new SwordItem(ModToolTiers.ETTRINGITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> EUCLASE_SWORD = ITEMS.register("euclase_sword",
            () -> new SwordItem(ModToolTiers.EUCLASE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> EUDIALYTE_SWORD = ITEMS.register("eudialyte_sword",
            () -> new SwordItem(ModToolTiers.EUDIALYTE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> EUXENITE_SWORD = ITEMS.register("euxenite_sword",
            () -> new SwordItem(ModToolTiers.EUXENITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> FELDSPAR_SWORD = ITEMS.register("feldspar_sword",
            () -> new SwordItem(ModToolTiers.FELDSPAR, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> FERGUSONITE_SWORD = ITEMS.register("fergusonite_sword",
            () -> new SwordItem(ModToolTiers.FERGUSONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> FLUORITE_SWORD = ITEMS.register("fluorite_sword",
            () -> new SwordItem(ModToolTiers.FLUORITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> FRESHWATER_PEARL_SWORD = ITEMS.register("freshwater_pearl_sword",
            () -> new SwordItem(ModToolTiers.FRESHWATER_PEARL, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> FRIEDELITE_SWORD = ITEMS.register("friedelite_sword",
            () -> new SwordItem(ModToolTiers.FRIEDELITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> GADOLINITE_SWORD = ITEMS.register("gadolinite_sword",
            () -> new SwordItem(ModToolTiers.GADOLINITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> GAHNOSPINEL_SWORD = ITEMS.register("gahnospinel_sword",
            () -> new SwordItem(ModToolTiers.GAHNOSPINEL, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> GARNET_SWORD = ITEMS.register("garnet_sword",
            () -> new SwordItem(ModToolTiers.GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> GRANDIDIERITE_SWORD = ITEMS.register("grandidierite_sword",
            () -> new SwordItem(ModToolTiers.GRANDIDIERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> GRAY_DIAMOND_SWORD = ITEMS.register("gray_diamond_sword",
            () -> new SwordItem(ModToolTiers.GRAY_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> GREEN_DIAMOND_SWORD = ITEMS.register("green_diamond_sword",
            () -> new SwordItem(ModToolTiers.GREEN_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> GROSSULAR_GARNET_SWORD = ITEMS.register("grossular_garnet_sword",
            () -> new SwordItem(ModToolTiers.GROSSULAR_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> GYPSUM_SWORD = ITEMS.register("gypsum_sword",
            () -> new SwordItem(ModToolTiers.GYPSUM, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HAMBERGITE_SWORD = ITEMS.register("hambergite_sword",
            () -> new SwordItem(ModToolTiers.HAMBERGITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HUAYNE_SWORD = ITEMS.register("huayne_sword",
            () -> new SwordItem(ModToolTiers.HUAYNE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HELIODOR_SWORD = ITEMS.register("heliodor_sword",
            () -> new SwordItem(ModToolTiers.HELIODOR, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HEMATITE_SWORD = ITEMS.register("hematite_sword",
            () -> new SwordItem(ModToolTiers.HEMATITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HEMIMORPHITE_SWORD = ITEMS.register("hemimorphite_sword",
            () -> new SwordItem(ModToolTiers.HEMIMORPHITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HERDERITE_SWORD = ITEMS.register("herderite_sword",
            () -> new SwordItem(ModToolTiers.HERDERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HESSONITE_SWORD = ITEMS.register("hessonite_sword",
            () -> new SwordItem(ModToolTiers.HESSONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HODGKINSONITE_SWORD = ITEMS.register("hodgkinsonite_sword",
            () -> new SwordItem(ModToolTiers.HODGKINSONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HOLTITE_SWORD = ITEMS.register("holtite_sword",
            () -> new SwordItem(ModToolTiers.HOLTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HOWLITE_SWORD = ITEMS.register("howlite_sword",
            () -> new SwordItem(ModToolTiers.HOWLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HUEBNERITE_SWORD = ITEMS.register("huebnerite_sword",
            () -> new SwordItem(ModToolTiers.HUEBNERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HUMITE_SWORD = ITEMS.register("humite_sword",
            () -> new SwordItem(ModToolTiers.HUMITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HUREAULITE_SWORD = ITEMS.register("hureaulite_sword",
            () -> new SwordItem(ModToolTiers.HUREAULITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HURLBUTITE_SWORD = ITEMS.register("hurlbutite_sword",
            () -> new SwordItem(ModToolTiers.HURLBUTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HYDROGROSSULAR_GARNET_SWORD = ITEMS.register("hydrogrossular_garnet_sword",
            () -> new SwordItem(ModToolTiers.HYDROGROSSULAR_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HYPERITDIABAS_SWORD = ITEMS.register("hyperitdiabas_sword",
            () -> new SwordItem(ModToolTiers.HYPERITDIABAS, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> IDOCRASE_SWORD = ITEMS.register("idocrase_sword",
            () -> new SwordItem(ModToolTiers.IDOCRASE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> INDERITE_SWORD = ITEMS.register("inderite_sword",
            () -> new SwordItem(ModToolTiers.INDERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> IOLITE_SWORD = ITEMS.register("iolite_sword",
            () -> new SwordItem(ModToolTiers.IOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> JADEITE_SWORD = ITEMS.register("jadeite_sword",
            () -> new SwordItem(ModToolTiers.JADEITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> JASPER_SWORD = ITEMS.register("jasper_sword",
            () -> new SwordItem(ModToolTiers.JASPER, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> JEREMEJEVITE_SWORD = ITEMS.register("jeremejevite_sword",
            () -> new SwordItem(ModToolTiers.JEREMEJEVITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> JET_SWORD = ITEMS.register("jet_sword",
            () -> new SwordItem(ModToolTiers.JET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> KORNERUPINE_SWORD = ITEMS.register("kornerupine_sword",
            () -> new SwordItem(ModToolTiers.KORNERUPINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> KURNAKOVITE_SWORD = ITEMS.register("kurnakovite_sword",
            () -> new SwordItem(ModToolTiers.KURNAKOVITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> KYANITE_SWORD = ITEMS.register("kyanite_sword",
            () -> new SwordItem(ModToolTiers.KYANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> KAMMEREREITE_SWORD = ITEMS.register("kammererite_sword",
            () -> new SwordItem(ModToolTiers.KAMMEREREITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LABRADORITE_SWORD = ITEMS.register("labradorite_sword",
            () -> new SwordItem(ModToolTiers.LABRADORITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LANGBEINITE_SWORD = ITEMS.register("langbeinite_sword",
            () -> new SwordItem(ModToolTiers.LANGBEINITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LAPIS_LAZULI_SWORD = ITEMS.register("lapis_lazuli_sword",
            () -> new SwordItem(ModToolTiers.LAPIS_LAZULI, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LASERBLUE_SWORD = ITEMS.register("laserblue_sword",
            () -> new SwordItem(ModToolTiers.LASERBLUE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LAWSONITE_SWORD = ITEMS.register("lawsonite_sword",
            () -> new SwordItem(ModToolTiers.LAWSONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LAZULITE_SWORD = ITEMS.register("lazulite_sword",
            () -> new SwordItem(ModToolTiers.LAZULITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LEGRANDITE_SWORD = ITEMS.register("legrandite_sword",
            () -> new SwordItem(ModToolTiers.LEGRANDITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LEPIDOLITE_SWORD = ITEMS.register("lepidolite_sword",
            () -> new SwordItem(ModToolTiers.LEPIDOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LEUCITE_SWORD = ITEMS.register("leucite_sword",
            () -> new SwordItem(ModToolTiers.LEUCITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LINARITE_SWORD = ITEMS.register("linarite_sword",
            () -> new SwordItem(ModToolTiers.LINARITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LUDLAMITE_SWORD = ITEMS.register("ludlamite_sword",
            () -> new SwordItem(ModToolTiers.LUDLAMITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MAGNESITE_SWORD = ITEMS.register("magnesite_sword",
            () -> new SwordItem(ModToolTiers.MAGNESITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MALACHITE_SWORD = ITEMS.register("malachite_sword",
            () -> new SwordItem(ModToolTiers.MALACHITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MALAIA_GARNET_SWORD = ITEMS.register("malaia_garnet_sword",
            () -> new SwordItem(ModToolTiers.MALAIA_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MALI_GARNET_SWORD = ITEMS.register("mali_garnet_sword",
            () -> new SwordItem(ModToolTiers.MALI_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MANDARIN_GARNET_SWORD = ITEMS.register("mandarin_garnet_sword",
            () -> new SwordItem(ModToolTiers.MANDARIN_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MANGANOTANTALITE_SWORD = ITEMS.register("manganotantalite_sword",
            () -> new SwordItem(ModToolTiers.MANGANOTANTALITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MARCASITE_SWORD = ITEMS.register("marcasite_sword",
            () -> new SwordItem(ModToolTiers.MARCASITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MELIPHANITE_SWORD = ITEMS.register("meliphanite_sword",
            () -> new SwordItem(ModToolTiers.MELIPHANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MELLITE_SWORD = ITEMS.register("mellite_sword",
            () -> new SwordItem(ModToolTiers.MELLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MICROCLINE_SWORD = ITEMS.register("microcline_sword",
            () -> new SwordItem(ModToolTiers.MICROCLINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MICROLITE_SWORD = ITEMS.register("microlite_sword",
            () -> new SwordItem(ModToolTiers.MICROLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MILARITE_SWORD = ITEMS.register("milarite_sword",
            () -> new SwordItem(ModToolTiers.MILARITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MILLERITE_SWORD = ITEMS.register("millerite_sword",
            () -> new SwordItem(ModToolTiers.MILLERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MIMETITE_SWORD = ITEMS.register("mimetite_sword",
            () -> new SwordItem(ModToolTiers.MIMETITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MOLDAVITE_SWORD = ITEMS.register("moldavite_sword",
            () -> new SwordItem(ModToolTiers.MOLDAVITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MONAZITE_SWORD = ITEMS.register("monazite_sword",
            () -> new SwordItem(ModToolTiers.MONAZITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MOONSTONE_SWORD = ITEMS.register("moonstone_sword",
            () -> new SwordItem(ModToolTiers.MOONSTONE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MORDENITE_SWORD = ITEMS.register("mordenite_sword",
            () -> new SwordItem(ModToolTiers.MORDENITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MORGANITE_SWORD = ITEMS.register("morganite_sword",
            () -> new SwordItem(ModToolTiers.MORGANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> NAMBULITE_SWORD = ITEMS.register("nambulite_sword",
            () -> new SwordItem(ModToolTiers.NAMBULITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> NATROLITE_SWORD = ITEMS.register("natrolite_sword",
            () -> new SwordItem(ModToolTiers.NATROLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> NATURAL_GLASS_SWORD = ITEMS.register("natural_glass_sword",
            () -> new SwordItem(ModToolTiers.NATURAL_GLASS, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> NEPHELINE_SWORD = ITEMS.register("nepheline_sword",
            () -> new SwordItem(ModToolTiers.NEPHELINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> NEPHRITE_SWORD = ITEMS.register("nephrite_sword",
            () -> new SwordItem(ModToolTiers.NEPHRITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> NEPTUNITE_SWORD = ITEMS.register("neptunite_sword",
            () -> new SwordItem(ModToolTiers.NEPTUNITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> NICCOLITE_SWORD = ITEMS.register("niccolite_sword",
            () -> new SwordItem(ModToolTiers.NICCOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> OBSIDIAN_SWORD = ITEMS.register("obsidian_sword",
            () -> new SwordItem(ModToolTiers.OBSIDIAN, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> OLIGOCLASE_SWORD = ITEMS.register("oligoclase_sword",
            () -> new SwordItem(ModToolTiers.OLIGOCLASE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ONYX_SWORD = ITEMS.register("onyx_sword",
            () -> new SwordItem(ModToolTiers.ONYX, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> OPAL_STONE_SWORD = ITEMS.register("opal_stone_sword",
            () -> new SwordItem(ModToolTiers.OPAL_STONE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ORANGE_DIAMOND_SWORD = ITEMS.register("orange_diamond_sword",
            () -> new SwordItem(ModToolTiers.ORANGE_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> OREGON_SUNSTONE_SWORD = ITEMS.register("oregon_sunstone_sword",
            () -> new SwordItem(ModToolTiers.OREGON_SUNSTONE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ORTHOCLASE_SWORD = ITEMS.register("orthoclase_sword",
            () -> new SwordItem(ModToolTiers.ORTHOCLASE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PADPARADSCHA_SAPPHIRE_SWORD = ITEMS.register("padparadscha_sapphire_sword",
            () -> new SwordItem(ModToolTiers.PADPARADSCHA_SAPPHIRE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PAINITE_SWORD = ITEMS.register("painite_sword",
            () -> new SwordItem(ModToolTiers.PAINITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PALYGORSKITE_SWORD = ITEMS.register("palygorskite_sword",
            () -> new SwordItem(ModToolTiers.PALYGORSKITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PAPAGOITE_SWORD = ITEMS.register("papagoite_sword",
            () -> new SwordItem(ModToolTiers.PAPAGOITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PARAIBA_TOURMALINE_SWORD = ITEMS.register("paraiba_tourmaline_sword",
            () -> new SwordItem(ModToolTiers.PARAIBA_TOURMALINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PARGASITE_SWORD = ITEMS.register("pargasite_sword",
            () -> new SwordItem(ModToolTiers.PARGASITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PARISITE_SWORD = ITEMS.register("parisite_sword",
            () -> new SwordItem(ModToolTiers.PARISITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PEARL_SWORD = ITEMS.register("pearl_sword",
            () -> new SwordItem(ModToolTiers.PEARL, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PECTOLITE_SWORD = ITEMS.register("pectolite_sword",
            () -> new SwordItem(ModToolTiers.PECTOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PENTLANDITE_SWORD = ITEMS.register("pentlandite_sword",
            () -> new SwordItem(ModToolTiers.PENTLANDITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PERICLASE_SWORD = ITEMS.register("periclase_sword",
            () -> new SwordItem(ModToolTiers.PERICLASE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PERIDOT_SWORD = ITEMS.register("peridot_sword",
            () -> new SwordItem(ModToolTiers.PERIDOT, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PERISTERITE_SWORD = ITEMS.register("peristerite_sword",
            () -> new SwordItem(ModToolTiers.PERISTERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PERTHITE_SWORD = ITEMS.register("perthite_sword",
            () -> new SwordItem(ModToolTiers.PERTHITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PETALITE_SWORD = ITEMS.register("petalite_sword",
            () -> new SwordItem(ModToolTiers.PETALITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PHENAKITE_SWORD = ITEMS.register("phenakite_sword",
            () -> new SwordItem(ModToolTiers.PHENAKITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PHOSGENITE_SWORD = ITEMS.register("phosgenite_sword",
            () -> new SwordItem(ModToolTiers.PHOSGENITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PHOSPHOPHYLLITE_SWORD = ITEMS.register("phosphophyllite_sword",
            () -> new SwordItem(ModToolTiers.PHOSPHOPHYLLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PINK_DIAMOND_SWORD = ITEMS.register("pink_diamond_sword",
            () -> new SwordItem(ModToolTiers.PINK_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> POLLUCITE_SWORD = ITEMS.register("pollucite_sword",
            () -> new SwordItem(ModToolTiers.POLLUCITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> POWELLITE_SWORD = ITEMS.register("powellite_sword",
            () -> new SwordItem(ModToolTiers.POWELLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PREHNITE_SWORD = ITEMS.register("prehnite_sword",
            () -> new SwordItem(ModToolTiers.PREHNITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PROSOPITE_SWORD = ITEMS.register("prosopite_sword",
            () -> new SwordItem(ModToolTiers.PROSOPITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PROTEUS_SWORD = ITEMS.register("proteus_sword",
            () -> new SwordItem(ModToolTiers.PROTEUS, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PROUSTITE_SWORD = ITEMS.register("proustite_sword",
            () -> new SwordItem(ModToolTiers.PROUSTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PUMPELLYITE_SWORD = ITEMS.register("pumpellyite_sword",
            () -> new SwordItem(ModToolTiers.PUMPELLYITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PURPLE_DIAMOND_SWORD = ITEMS.register("purple_diamond_sword",
            () -> new SwordItem(ModToolTiers.PURPLE_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PURPURITE_SWORD = ITEMS.register("purpurite_sword",
            () -> new SwordItem(ModToolTiers.PURPURITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PYRARGYRITE_SWORD = ITEMS.register("pyrargyrite_sword",
            () -> new SwordItem(ModToolTiers.PYRARGYRITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PYRITE_SWORD = ITEMS.register("pyrite_sword",
            () -> new SwordItem(ModToolTiers.PYRITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PYROPE_GARNET_SWORD = ITEMS.register("pyrope_garnet_sword",
            () -> new SwordItem(ModToolTiers.PYROPE_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PYROPHYLLITE_SWORD = ITEMS.register("pyrophyllite_sword",
            () -> new SwordItem(ModToolTiers.PYROPHYLLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PYROXMANGITE_SWORD = ITEMS.register("pyroxmangite_sword",
            () -> new SwordItem(ModToolTiers.PYROXMANGITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PYRRHOTITE_SWORD = ITEMS.register("pyrrhotite_sword",
            () -> new SwordItem(ModToolTiers.PYRRHOTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> QUARTZ_SWORD = ITEMS.register("quartz_sword",
            () -> new SwordItem(ModToolTiers.QUARTZ, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> QUARTZITE_SWORD = ITEMS.register("quartzite_sword",
            () -> new SwordItem(ModToolTiers.QUARTZITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> REALGAR_SWORD = ITEMS.register("realgar_sword",
            () -> new SwordItem(ModToolTiers.REALGAR, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> RED_BERYL_SWORD = ITEMS.register("red_beryl_sword",
            () -> new SwordItem(ModToolTiers.RED_BERYL, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> RED_DIAMOND_SWORD = ITEMS.register("red_diamond_sword",
            () -> new SwordItem(ModToolTiers.RED_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> RHODIZITE_SWORD = ITEMS.register("rhodizite_sword",
            () -> new SwordItem(ModToolTiers.RHODIZITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> RHODOCHROSITE_SWORD = ITEMS.register("rhodochrosite_sword",
            () -> new SwordItem(ModToolTiers.RHODOCHROSITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> RHODOLITE_GARNET_SWORD = ITEMS.register("rhodolite_garnet_sword",
            () -> new SwordItem(ModToolTiers.RHODOLITE_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> RHODONITE_SWORD = ITEMS.register("rhodonite_sword",
            () -> new SwordItem(ModToolTiers.RHODONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ROSE_QUARTZ_SWORD = ITEMS.register("rose_quartz_sword",
            () -> new SwordItem(ModToolTiers.ROSE_QUARTZ, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> RUBELLITE_SWORD = ITEMS.register("rubellite_sword",
            () -> new SwordItem(ModToolTiers.RUBELLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword",
            () -> new SwordItem(ModToolTiers.RUBY, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> RUTILE_SWORD = ITEMS.register("rutile_sword",
            () -> new SwordItem(ModToolTiers.RUTILE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SALTWATER_PEARL_SWORD = ITEMS.register("saltwater_pearl_sword",
            () -> new SwordItem(ModToolTiers.SALTWATER_PEARL, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SAMARSKITE_SWORD = ITEMS.register("samarskite_sword",
            () -> new SwordItem(ModToolTiers.SAMARSKITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SANIDINE_SWORD = ITEMS.register("sanidine_sword",
            () -> new SwordItem(ModToolTiers.SANIDINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword",
            () -> new SwordItem(ModToolTiers.SAPPHIRE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SAPPHIRINE_SWORD = ITEMS.register("sapphirine_sword",
            () -> new SwordItem(ModToolTiers.SAPPHIRINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SARCOLITE_SWORD = ITEMS.register("sarcolite_sword",
            () -> new SwordItem(ModToolTiers.SARCOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SCAPOLITE_SWORD = ITEMS.register("scapolite_sword",
            () -> new SwordItem(ModToolTiers.SCAPOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SCHEELITE_SWORD = ITEMS.register("scheelite_sword",
            () -> new SwordItem(ModToolTiers.SCHEELITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SCORODITE_SWORD = ITEMS.register("scorodite_sword",
            () -> new SwordItem(ModToolTiers.SCORODITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SELLAITE_SWORD = ITEMS.register("sellaite_sword",
            () -> new SwordItem(ModToolTiers.SELLAITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SENARMONTITE_SWORD = ITEMS.register("senarmontite_sword",
            () -> new SwordItem(ModToolTiers.SENARMONTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SERANDITE_SWORD = ITEMS.register("serandite_sword",
            () -> new SwordItem(ModToolTiers.SERANDITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SERPENTINE_SWORD = ITEMS.register("serpentine_sword",
            () -> new SwordItem(ModToolTiers.SERPENTINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SHATTUCKITE_SWORD = ITEMS.register("shattuckite_sword",
            () -> new SwordItem(ModToolTiers.SHATTUCKITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SHORTITE_SWORD = ITEMS.register("shortite_sword",
            () -> new SwordItem(ModToolTiers.SHORTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SIDERITE_SWORD = ITEMS.register("siderite_sword",
            () -> new SwordItem(ModToolTiers.SIDERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SILLIMANITE_SWORD = ITEMS.register("sillimanite_sword",
            () -> new SwordItem(ModToolTiers.SILLIMANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SIMPSONITE_SWORD = ITEMS.register("simpsonite_sword",
            () -> new SwordItem(ModToolTiers.SIMPSONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SINHALITE_SWORD = ITEMS.register("sinhalite_sword",
            () -> new SwordItem(ModToolTiers.SINHALITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SMALTITE_SWORD = ITEMS.register("smaltite_sword",
            () -> new SwordItem(ModToolTiers.SMALTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SMITHSONITE_SWORD = ITEMS.register("smithsonite_sword",
            () -> new SwordItem(ModToolTiers.SMITHSONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SMOKY_QUARTZ_SWORD = ITEMS.register("smoky_quartz_sword",
            () -> new SwordItem(ModToolTiers.SMOKY_QUARTZ, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SODALITE_SWORD = ITEMS.register("sodalite_sword",
            () -> new SwordItem(ModToolTiers.SODALITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SOGDIANITE_SWORD = ITEMS.register("sogdianite_sword",
            () -> new SwordItem(ModToolTiers.SOGDIANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SPESSARTITE_GARNET_SWORD = ITEMS.register("spessartite_garnet_sword",
            () -> new SwordItem(ModToolTiers.SPESSARTITE_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SPHALERITE_SWORD = ITEMS.register("sphalerite_sword",
            () -> new SwordItem(ModToolTiers.SPHALERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SPHENE_SWORD = ITEMS.register("sphene_sword",
            () -> new SwordItem(ModToolTiers.SPHENE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SPINEL_SWORD = ITEMS.register("spinel_sword",
            () -> new SwordItem(ModToolTiers.SPINEL, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SPODUMENE_SWORD = ITEMS.register("spodumene_sword",
            () -> new SwordItem(ModToolTiers.SPODUMENE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SPURRITE_SWORD = ITEMS.register("spurrite_sword",
            () -> new SwordItem(ModToolTiers.SPURRITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> STAR_SAPPHIRE_SWORD = ITEMS.register("star_sapphire_sword",
            () -> new SwordItem(ModToolTiers.STAR_SAPPHIRE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> STAUROLITE_SWORD = ITEMS.register("staurolite_sword",
            () -> new SwordItem(ModToolTiers.STAUROLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> STICHTITE_SWORD = ITEMS.register("stichtite_sword",
            () -> new SwordItem(ModToolTiers.STICHTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> STOLZITE_SWORD = ITEMS.register("stolzite_sword",
            () -> new SwordItem(ModToolTiers.STOLZITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> STRONTIANITE_SWORD = ITEMS.register("strontianite_sword",
            () -> new SwordItem(ModToolTiers.STRONTIANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SUGILITE_SWORD = ITEMS.register("sugilite_sword",
            () -> new SwordItem(ModToolTiers.SUGILITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SULFUR_SWORD = ITEMS.register("sulfur_sword",
            () -> new SwordItem(ModToolTiers.SULFUR, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SUNSTONE_SWORD = ITEMS.register("sunstone_sword",
            () -> new SwordItem(ModToolTiers.SUNSTONE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TAAFFEITE_SWORD = ITEMS.register("taaffeite_sword",
            () -> new SwordItem(ModToolTiers.TAAFFEITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TALC_SWORD = ITEMS.register("talc_sword",
            () -> new SwordItem(ModToolTiers.TALC, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TANTALITE_SWORD = ITEMS.register("tantalite_sword",
            () -> new SwordItem(ModToolTiers.TANTALITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TANZANITE_SWORD = ITEMS.register("tanzanite_sword",
            () -> new SwordItem(ModToolTiers.TANZANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TEKTITE_SWORD = ITEMS.register("tektite_sword",
            () -> new SwordItem(ModToolTiers.TEKTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TEPHROITE_SWORD = ITEMS.register("tephroite_sword",
            () -> new SwordItem(ModToolTiers.TEPHROITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> THAUMASITE_SWORD = ITEMS.register("thaumasite_sword",
            () -> new SwordItem(ModToolTiers.THAUMASITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> THOMSONITE_SWORD = ITEMS.register("thomsonite_sword",
            () -> new SwordItem(ModToolTiers.THOMSONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TIGERS_EYE_SWORD = ITEMS.register("tigers_eye_sword",
            () -> new SwordItem(ModToolTiers.TIGERS_EYE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TOPAZ_SWORD = ITEMS.register("topaz_sword",
            () -> new SwordItem(ModToolTiers.TOPAZ, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TOURMALINE_SWORD = ITEMS.register("tourmaline_sword",
            () -> new SwordItem(ModToolTiers.TOURMALINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TREMOLITE_SWORD = ITEMS.register("tremolite_sword",
            () -> new SwordItem(ModToolTiers.TREMOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TRIPHYLITE_SWORD = ITEMS.register("triphylite_sword",
            () -> new SwordItem(ModToolTiers.TRIPHYLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TSAVORITE_GARNET_SWORD = ITEMS.register("tsavorite_garnet_sword",
            () -> new SwordItem(ModToolTiers.TSAVORITE_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TUGTUPITE_SWORD = ITEMS.register("tugtupite_sword",
            () -> new SwordItem(ModToolTiers.TUGTUPITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TURQUOISE_SWORD = ITEMS.register("turquoise_sword",
            () -> new SwordItem(ModToolTiers.TURQUOISE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ULEXITE_SWORD = ITEMS.register("ulexite_sword",
            () -> new SwordItem(ModToolTiers.ULEXITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> UVAROVITE_GARNET_SWORD = ITEMS.register("uvarovite_garnet_sword",
            () -> new SwordItem(ModToolTiers.UVAROVITE_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> VANADINITE_SWORD = ITEMS.register("vanadinite_sword",
            () -> new SwordItem(ModToolTiers.VANADINITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> VARISCITE_SWORD = ITEMS.register("variscite_sword",
            () -> new SwordItem(ModToolTiers.VARISCITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> VILLIAUMITE_SWORD = ITEMS.register("villiaumite_sword",
            () -> new SwordItem(ModToolTiers.VILLIAUMITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> VIVIANITE_SWORD = ITEMS.register("vivianite_sword",
            () -> new SwordItem(ModToolTiers.VIVIANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> VAYRYNENITE_SWORD = ITEMS.register("vayrynenite_sword",
            () -> new SwordItem(ModToolTiers.VAYRYNENITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> WARDITE_SWORD = ITEMS.register("wardite_sword",
            () -> new SwordItem(ModToolTiers.WARDITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> WAVELLITE_SWORD = ITEMS.register("wavellite_sword",
            () -> new SwordItem(ModToolTiers.WAVELLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> WELOGANITE_SWORD = ITEMS.register("weloganite_sword",
            () -> new SwordItem(ModToolTiers.WELOGANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> WHEWELLITE_SWORD = ITEMS.register("whewellite_sword",
            () -> new SwordItem(ModToolTiers.WHEWELLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> WILKEITE_SWORD = ITEMS.register("wilkeite_sword",
            () -> new SwordItem(ModToolTiers.WILKEITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> WILLEMITE_SWORD = ITEMS.register("willemite_sword",
            () -> new SwordItem(ModToolTiers.WILLEMITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> WITHERITE_SWORD = ITEMS.register("witherite_sword",
            () -> new SwordItem(ModToolTiers.WITHERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> WOLLASTONITE_SWORD = ITEMS.register("wollastonite_sword",
            () -> new SwordItem(ModToolTiers.WOLLASTONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> WULFENITE_SWORD = ITEMS.register("wulfenite_sword",
            () -> new SwordItem(ModToolTiers.WULFENITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> XONOTLITE_SWORD = ITEMS.register("xonotlite_sword",
            () -> new SwordItem(ModToolTiers.XONOTLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> YELLOW_DIAMOND_SWORD = ITEMS.register("yellow_diamond_sword",
            () -> new SwordItem(ModToolTiers.YELLOW_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> YUGAWARALITE_SWORD = ITEMS.register("yugawaralite_sword",
            () -> new SwordItem(ModToolTiers.YUGAWARALITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ZEKTZERITE_SWORD = ITEMS.register("zektzerite_sword",
            () -> new SwordItem(ModToolTiers.ZEKTZERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ZINCITE_SWORD = ITEMS.register("zincite_sword",
            () -> new SwordItem(ModToolTiers.ZINCITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ZIRCON_SWORD = ITEMS.register("zircon_sword",
            () -> new SwordItem(ModToolTiers.ZIRCON, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ZUNYITE_SWORD = ITEMS.register("zunyite_sword",
            () -> new SwordItem(ModToolTiers.ZUNYITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
