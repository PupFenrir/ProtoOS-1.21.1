package net.fenrir.protoos.item;

import net.fenrir.protoos.ProtoOS;
import net.fenrir.protoos.item.custom.ModToolTiers;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.Unbreakable;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModGemstoneHoe
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ProtoOS.MOD_ID);

    public static final RegistryObject<Item> ACTINOLITE_HOE = ITEMS.register("actinolite_hoe",
            () -> new HoeItem(ModToolTiers.ACTINOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ADAMITE_HOE = ITEMS.register("adamite_hoe",
            () -> new HoeItem(ModToolTiers.ADAMITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AGATE_HOE = ITEMS.register("agate_hoe",
            () -> new HoeItem(ModToolTiers.AGATE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ALBITE_HOE = ITEMS.register("albite_hoe",
            () -> new HoeItem(ModToolTiers.ALBITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ALEXANDRITE_HOE = ITEMS.register("alexandrite_hoe",
            () -> new HoeItem(ModToolTiers.ALEXANDRITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ALGODONITE_HOE = ITEMS.register("algodonite_hoe",
            () -> new HoeItem(ModToolTiers.ALGODONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ALMANDINE_GARNET_HOE = ITEMS.register("almandine_garnet_hoe",
            () -> new HoeItem(ModToolTiers.ALMANDINE_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AMAZONITE_HOE = ITEMS.register("amazonite_hoe",
            () -> new HoeItem(ModToolTiers.AMAZONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AMBER_HOE = ITEMS.register("amber_hoe",
            () -> new HoeItem(ModToolTiers.AMBER, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AMBLYGONITE_HOE = ITEMS.register("amblygonite_hoe",
            () -> new HoeItem(ModToolTiers.AMBLYGONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AMETHYST_HOE = ITEMS.register("amethyst_hoe",
            () -> new HoeItem(ModToolTiers.AMETHYST, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AMETRINE_HOE = ITEMS.register("ametrine_hoe",
            () -> new HoeItem(ModToolTiers.AMETRINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AMMOLITE_HOE = ITEMS.register("ammolite_hoe",
            () -> new HoeItem(ModToolTiers.AMMOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ANALCIME_HOE = ITEMS.register("analcime_hoe",
            () -> new HoeItem(ModToolTiers.ANALCIME, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ANATASE_HOE = ITEMS.register("anatase_hoe",
            () -> new HoeItem(ModToolTiers.ANATASE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ANDALUSITE_HOE = ITEMS.register("andalusite_hoe",
            () -> new HoeItem(ModToolTiers.ANDALUSITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ANDESINE_HOE = ITEMS.register("andesine_hoe",
            () -> new HoeItem(ModToolTiers.ANDESINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ANDRADITE_HOE = ITEMS.register("andradite_hoe",
            () -> new HoeItem(ModToolTiers.ANDRADITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ANGLESITE_HOE = ITEMS.register("anglesite_hoe",
            () -> new HoeItem(ModToolTiers.ANGLESITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ANHYDRITE_HOE = ITEMS.register("anhydrite_hoe",
            () -> new HoeItem(ModToolTiers.ANHYDRITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ANORTHITE_HOE = ITEMS.register("anorthite_hoe",
            () -> new HoeItem(ModToolTiers.ANORTHITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> APATITE_HOE = ITEMS.register("apatite_hoe",
            () -> new HoeItem(ModToolTiers.APATITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> APOPHYLLITE_HOE = ITEMS.register("apophyllite_hoe",
            () -> new HoeItem(ModToolTiers.APOPHYLLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AQUAMARINE_HOE = ITEMS.register("aquamarine_hoe",
            () -> new HoeItem(ModToolTiers.AQUAMARINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ARAGONITE_HOE = ITEMS.register("aragonite_hoe",
            () -> new HoeItem(ModToolTiers.ARAGONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ARTISANAL_GLASS_HOE = ITEMS.register("artisanal_glass_hoe",
            () -> new HoeItem(ModToolTiers.ARTISANAL_GLASS, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AUGELITE_HOE = ITEMS.register("augelite_hoe",
            () -> new HoeItem(ModToolTiers.AUGELITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AXINITE_HOE = ITEMS.register("axinite_hoe",
            () -> new HoeItem(ModToolTiers.AXINITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AZURITE_HOE = ITEMS.register("azurite_hoe",
            () -> new HoeItem(ModToolTiers.AZURITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BARITE_HOE = ITEMS.register("barite_hoe",
            () -> new HoeItem(ModToolTiers.BARITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BAYLDONITE_HOE = ITEMS.register("bayldonite_hoe",
            () -> new HoeItem(ModToolTiers.BAYLDONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BENITOITE_HOE = ITEMS.register("benitoite_hoe",
            () -> new HoeItem(ModToolTiers.BENITOITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BERYL_HOE = ITEMS.register("beryl_hoe",
            () -> new HoeItem(ModToolTiers.BERYL, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BERYLLONITE_HOE = ITEMS.register("beryllonite_hoe",
            () -> new HoeItem(ModToolTiers.BERYLLONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BISMUTOTANTALITE_HOE = ITEMS.register("bismutotantalite_hoe",
            () -> new HoeItem(ModToolTiers.BISMUTOTANTALITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BLACK_DIAMOND_HOE = ITEMS.register("black_diamond_hoe",
            () -> new HoeItem(ModToolTiers.BLACK_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BLOODSTONE_HOE = ITEMS.register("bloodstone_hoe",
            () -> new HoeItem(ModToolTiers.BLOODSTONE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BLUE_DIAMOND_HOE = ITEMS.register("blue_diamond_hoe",
            () -> new HoeItem(ModToolTiers.BLUE_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BOLEITE_HOE = ITEMS.register("boleite_hoe",
            () -> new HoeItem(ModToolTiers.BOLEITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BORACITE_HOE = ITEMS.register("boracite_hoe",
            () -> new HoeItem(ModToolTiers.BORACITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BORNITE_HOE = ITEMS.register("bornite_hoe",
            () -> new HoeItem(ModToolTiers.BORNITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BRAZILIANITE_HOE = ITEMS.register("brazilianite_hoe",
            () -> new HoeItem(ModToolTiers.BRAZILIANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BREITHAUPTITE_HOE = ITEMS.register("breithauptite_hoe",
            () -> new HoeItem(ModToolTiers.BREITHAUPTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BROOKITE_HOE = ITEMS.register("brookite_hoe",
            () -> new HoeItem(ModToolTiers.BROOKITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BROWN_DIAMOND_HOE = ITEMS.register("brown_diamond_hoe",
            () -> new HoeItem(ModToolTiers.BROWN_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BRUCITE_HOE = ITEMS.register("brucite_hoe",
            () -> new HoeItem(ModToolTiers.BRUCITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BUSTAMITE_HOE = ITEMS.register("bustamite_hoe",
            () -> new HoeItem(ModToolTiers.BUSTAMITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BYTOWNITE_HOE = ITEMS.register("bytownite_hoe",
            () -> new HoeItem(ModToolTiers.BYTOWNITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CALCAREOUS_CONCRETIONS_HOE = ITEMS.register("calcareous_concretions_hoe",
            () -> new HoeItem(ModToolTiers.CALCAREOUS_CONCRETIONS, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CALCITE_HOE = ITEMS.register("calcite_hoe",
            () -> new HoeItem(ModToolTiers.CALCITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CANASITE_HOE = ITEMS.register("canasite_hoe",
            () -> new HoeItem(ModToolTiers.CANASITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CANCRINITE_HOE = ITEMS.register("cancrinite_hoe",
            () -> new HoeItem(ModToolTiers.CANCRINITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CARNELIAN_HOE = ITEMS.register("carnelian_hoe",
            () -> new HoeItem(ModToolTiers.CARNELIAN, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CASSITERITE_HOE = ITEMS.register("cassiterite_hoe",
            () -> new HoeItem(ModToolTiers.CASSITERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CATAPLEIITE_HOE = ITEMS.register("catapleiite_hoe",
            () -> new HoeItem(ModToolTiers.CATAPLEIITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CELESTITE_HOE = ITEMS.register("celestite_hoe",
            () -> new HoeItem(ModToolTiers.CELESTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CERULEITE_HOE = ITEMS.register("ceruleite_hoe",
            () -> new HoeItem(ModToolTiers.CERULEITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CERUSSITE_HOE = ITEMS.register("cerussite_hoe",
            () -> new HoeItem(ModToolTiers.CERUSSITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHABAZITE_HOE = ITEMS.register("chabazite_hoe",
            () -> new HoeItem(ModToolTiers.CHABAZITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHALCEDONY_HOE = ITEMS.register("chalcedony_hoe",
            () -> new HoeItem(ModToolTiers.CHALCEDONY, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHAMBERSITE_HOE = ITEMS.register("chambersite_hoe",
            () -> new HoeItem(ModToolTiers.CHAMBERSITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHAMAELEON_DIAMOND_HOE = ITEMS.register("chamaeleon_diamond_hoe",
            () -> new HoeItem(ModToolTiers.CHAMAELEON_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHAROITE_HOE = ITEMS.register("charoite_hoe",
            () -> new HoeItem(ModToolTiers.CHAROITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHICKEN_BLOOD_STONE_HOE = ITEMS.register("chicken_blood_stone_hoe",
            () -> new HoeItem(ModToolTiers.CHICKEN_BLOOD_STONE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHILDRENITE_HOE = ITEMS.register("childrenite_hoe",
            () -> new HoeItem(ModToolTiers.CHILDRENITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHIOLITE_HOE = ITEMS.register("chiolite_hoe",
            () -> new HoeItem(ModToolTiers.CHIOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHROMITE_HOE = ITEMS.register("chromite_hoe",
            () -> new HoeItem(ModToolTiers.CHROMITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHRYSOBERYL_HOE = ITEMS.register("chrysoberyl_hoe",
            () -> new HoeItem(ModToolTiers.CHRYSOBERYL, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHRYSOCOLLA_HOE = ITEMS.register("chrysocolla_hoe",
            () -> new HoeItem(ModToolTiers.CHRYSOCOLLA, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHRYSOCOLLA_CHALCEDONY_HOE = ITEMS.register("chrysocolla_chalcedony_hoe",
            () -> new HoeItem(ModToolTiers.CHRYSOCOLLA_CHALCEDONY, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHRYSOPRASE_HOE = ITEMS.register("chrysoprase_hoe",
            () -> new HoeItem(ModToolTiers.CHRYSOPRASE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CINNABAR_HOE = ITEMS.register("cinnabar_hoe",
            () -> new HoeItem(ModToolTiers.CINNABAR, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CITRINE_HOE = ITEMS.register("citrine_hoe",
            () -> new HoeItem(ModToolTiers.CITRINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CLINOCHLORE_HOE = ITEMS.register("clinochlore_hoe",
            () -> new HoeItem(ModToolTiers.CLINOCHLORE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> COBALTITE_HOE = ITEMS.register("cobaltite_hoe",
            () -> new HoeItem(ModToolTiers.COBALTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> COLEMANITE_HOE = ITEMS.register("colemanite_hoe",
            () -> new HoeItem(ModToolTiers.COLEMANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> COLOR_CHANGE_GARNET_HOE = ITEMS.register("color_change_garnet_hoe",
            () -> new HoeItem(ModToolTiers.COLOR_CHANGE_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> COLOR_CHANGE_SAPPHIRE_HOE = ITEMS.register("color_change_sapphire_hoe",
            () -> new HoeItem(ModToolTiers.COLOR_CHANGE_SAPPHIRE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CORAL_HOE = ITEMS.register("coral_hoe",
            () -> new HoeItem(ModToolTiers.CORAL, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CORDIERITE_HOE = ITEMS.register("cordierite_hoe",
            () -> new HoeItem(ModToolTiers.CORDIERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CORUNDUM_HOE = ITEMS.register("corundum_hoe",
            () -> new HoeItem(ModToolTiers.CORUNDUM, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> COVELLITE_HOE = ITEMS.register("covellite_hoe",
            () -> new HoeItem(ModToolTiers.COVELLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CREEDITE_HOE = ITEMS.register("creedite_hoe",
            () -> new HoeItem(ModToolTiers.CREEDITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CROCOITE_HOE = ITEMS.register("crocoite_hoe",
            () -> new HoeItem(ModToolTiers.CROCOITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CRYOLITE_HOE = ITEMS.register("cryolite_hoe",
            () -> new HoeItem(ModToolTiers.CRYOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CUPRITE_HOE = ITEMS.register("cuprite_hoe",
            () -> new HoeItem(ModToolTiers.CUPRITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> DANBURITE_HOE = ITEMS.register("danburite_hoe",
            () -> new HoeItem(ModToolTiers.DANBURITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> DATOLITE_HOE = ITEMS.register("datolite_hoe",
            () -> new HoeItem(ModToolTiers.DATOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> DEMANTOID_GARNET_HOE = ITEMS.register("demantoid_garnet_hoe",
            () -> new HoeItem(ModToolTiers.DEMANTOID_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> DIAMOND_HOE = ITEMS.register("diamond_hoe",
            () -> new HoeItem(ModToolTiers.DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> DIASPORE_HOE = ITEMS.register("diaspore_hoe",
            () -> new HoeItem(ModToolTiers.DIASPORE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> DICKINSONITE_HOE = ITEMS.register("dickinsonite_hoe",
            () -> new HoeItem(ModToolTiers.DICKINSONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> DIOPSIDE_HOE = ITEMS.register("diopside_hoe",
            () -> new HoeItem(ModToolTiers.DIOPSIDE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> DIOPTASE_HOE = ITEMS.register("dioptase_hoe",
            () -> new HoeItem(ModToolTiers.DIOPTASE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> DOLOMITE_HOE = ITEMS.register("dolomite_hoe",
            () -> new HoeItem(ModToolTiers.DOLOMITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> DUMORTIERITE_HOE = ITEMS.register("dumortierite_hoe",
            () -> new HoeItem(ModToolTiers.DUMORTIERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> EKANITE_HOE = ITEMS.register("ekanite_hoe",
            () -> new HoeItem(ModToolTiers.EKANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> EMERALD_HOE = ITEMS.register("emerald_hoe",
            () -> new HoeItem(ModToolTiers.EMERALD, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ENSTATITE_HOE = ITEMS.register("enstatite_hoe",
            () -> new HoeItem(ModToolTiers.ENSTATITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> EOSPHORITE_HOE = ITEMS.register("eosphorite_hoe",
            () -> new HoeItem(ModToolTiers.EOSPHORITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> EPIDOTE_HOE = ITEMS.register("epidote_hoe",
            () -> new HoeItem(ModToolTiers.EPIDOTE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ETTRINGITE_HOE = ITEMS.register("ettringite_hoe",
            () -> new HoeItem(ModToolTiers.ETTRINGITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> EUCLASE_HOE = ITEMS.register("euclase_hoe",
            () -> new HoeItem(ModToolTiers.EUCLASE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> EUDIALYTE_HOE = ITEMS.register("eudialyte_hoe",
            () -> new HoeItem(ModToolTiers.EUDIALYTE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> EUXENITE_HOE = ITEMS.register("euxenite_hoe",
            () -> new HoeItem(ModToolTiers.EUXENITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> FELDSPAR_HOE = ITEMS.register("feldspar_hoe",
            () -> new HoeItem(ModToolTiers.FELDSPAR, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> FERGUSONITE_HOE = ITEMS.register("fergusonite_hoe",
            () -> new HoeItem(ModToolTiers.FERGUSONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> FLUORITE_HOE = ITEMS.register("fluorite_hoe",
            () -> new HoeItem(ModToolTiers.FLUORITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> FRESHWATER_PEARL_HOE = ITEMS.register("freshwater_pearl_hoe",
            () -> new HoeItem(ModToolTiers.FRESHWATER_PEARL, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> FRIEDELITE_HOE = ITEMS.register("friedelite_hoe",
            () -> new HoeItem(ModToolTiers.FRIEDELITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> GADOLINITE_HOE = ITEMS.register("gadolinite_hoe",
            () -> new HoeItem(ModToolTiers.GADOLINITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> GAHNOSPINEL_HOE = ITEMS.register("gahnospinel_hoe",
            () -> new HoeItem(ModToolTiers.GAHNOSPINEL, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> GARNET_HOE = ITEMS.register("garnet_hoe",
            () -> new HoeItem(ModToolTiers.GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> GRANDIDIERITE_HOE = ITEMS.register("grandidierite_hoe",
            () -> new HoeItem(ModToolTiers.GRANDIDIERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> GRAY_DIAMOND_HOE = ITEMS.register("gray_diamond_hoe",
            () -> new HoeItem(ModToolTiers.GRAY_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> GREEN_DIAMOND_HOE = ITEMS.register("green_diamond_hoe",
            () -> new HoeItem(ModToolTiers.GREEN_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> GROSSULAR_GARNET_HOE = ITEMS.register("grossular_garnet_hoe",
            () -> new HoeItem(ModToolTiers.GROSSULAR_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> GYPSUM_HOE = ITEMS.register("gypsum_hoe",
            () -> new HoeItem(ModToolTiers.GYPSUM, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HAMBERGITE_HOE = ITEMS.register("hambergite_hoe",
            () -> new HoeItem(ModToolTiers.HAMBERGITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HUAYNE_HOE = ITEMS.register("huayne_hoe",
            () -> new HoeItem(ModToolTiers.HUAYNE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HELIODOR_HOE = ITEMS.register("heliodor_hoe",
            () -> new HoeItem(ModToolTiers.HELIODOR, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HEMATITE_HOE = ITEMS.register("hematite_hoe",
            () -> new HoeItem(ModToolTiers.HEMATITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HEMIMORPHITE_HOE = ITEMS.register("hemimorphite_hoe",
            () -> new HoeItem(ModToolTiers.HEMIMORPHITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HERDERITE_HOE = ITEMS.register("herderite_hoe",
            () -> new HoeItem(ModToolTiers.HERDERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HESSONITE_HOE = ITEMS.register("hessonite_hoe",
            () -> new HoeItem(ModToolTiers.HESSONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HODGKINSONITE_HOE = ITEMS.register("hodgkinsonite_hoe",
            () -> new HoeItem(ModToolTiers.HODGKINSONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HOLTITE_HOE = ITEMS.register("holtite_hoe",
            () -> new HoeItem(ModToolTiers.HOLTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HOWLITE_HOE = ITEMS.register("howlite_hoe",
            () -> new HoeItem(ModToolTiers.HOWLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HUEBNERITE_HOE = ITEMS.register("huebnerite_hoe",
            () -> new HoeItem(ModToolTiers.HUEBNERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HUMITE_HOE = ITEMS.register("humite_hoe",
            () -> new HoeItem(ModToolTiers.HUMITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HUREAULITE_HOE = ITEMS.register("hureaulite_hoe",
            () -> new HoeItem(ModToolTiers.HUREAULITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HURLBUTITE_HOE = ITEMS.register("hurlbutite_hoe",
            () -> new HoeItem(ModToolTiers.HURLBUTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HYDROGROSSULAR_GARNET_HOE = ITEMS.register("hydrogrossular_garnet_hoe",
            () -> new HoeItem(ModToolTiers.HYDROGROSSULAR_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HYPERITDIABAS_HOE = ITEMS.register("hyperitdiabas_hoe",
            () -> new HoeItem(ModToolTiers.HYPERITDIABAS, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> IDOCRASE_HOE = ITEMS.register("idocrase_hoe",
            () -> new HoeItem(ModToolTiers.IDOCRASE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> INDERITE_HOE = ITEMS.register("inderite_hoe",
            () -> new HoeItem(ModToolTiers.INDERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> IOLITE_HOE = ITEMS.register("iolite_hoe",
            () -> new HoeItem(ModToolTiers.IOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> JADEITE_HOE = ITEMS.register("jadeite_hoe",
            () -> new HoeItem(ModToolTiers.JADEITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> JASPER_HOE = ITEMS.register("jasper_hoe",
            () -> new HoeItem(ModToolTiers.JASPER, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> JEREMEJEVITE_HOE = ITEMS.register("jeremejevite_hoe",
            () -> new HoeItem(ModToolTiers.JEREMEJEVITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> JET_HOE = ITEMS.register("jet_hoe",
            () -> new HoeItem(ModToolTiers.JET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> KORNERUPINE_HOE = ITEMS.register("kornerupine_hoe",
            () -> new HoeItem(ModToolTiers.KORNERUPINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> KURNAKOVITE_HOE = ITEMS.register("kurnakovite_hoe",
            () -> new HoeItem(ModToolTiers.KURNAKOVITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> KYANITE_HOE = ITEMS.register("kyanite_hoe",
            () -> new HoeItem(ModToolTiers.KYANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> KAMMEREREITE_HOE = ITEMS.register("kammererite_hoe",
            () -> new HoeItem(ModToolTiers.KAMMEREREITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LABRADORITE_HOE = ITEMS.register("labradorite_hoe",
            () -> new HoeItem(ModToolTiers.LABRADORITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LANGBEINITE_HOE = ITEMS.register("langbeinite_hoe",
            () -> new HoeItem(ModToolTiers.LANGBEINITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LAPIS_LAZULI_HOE = ITEMS.register("lapis_lazuli_hoe",
            () -> new HoeItem(ModToolTiers.LAPIS_LAZULI, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LASERBLUE_HOE = ITEMS.register("laserblue_hoe",
            () -> new HoeItem(ModToolTiers.LASERBLUE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LAWSONITE_HOE = ITEMS.register("lawsonite_hoe",
            () -> new HoeItem(ModToolTiers.LAWSONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LAZULITE_HOE = ITEMS.register("lazulite_hoe",
            () -> new HoeItem(ModToolTiers.LAZULITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LEGRANDITE_HOE = ITEMS.register("legrandite_hoe",
            () -> new HoeItem(ModToolTiers.LEGRANDITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LEPIDOLITE_HOE = ITEMS.register("lepidolite_hoe",
            () -> new HoeItem(ModToolTiers.LEPIDOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LEUCITE_HOE = ITEMS.register("leucite_hoe",
            () -> new HoeItem(ModToolTiers.LEUCITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LINARITE_HOE = ITEMS.register("linarite_hoe",
            () -> new HoeItem(ModToolTiers.LINARITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LUDLAMITE_HOE = ITEMS.register("ludlamite_hoe",
            () -> new HoeItem(ModToolTiers.LUDLAMITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MAGNESITE_HOE = ITEMS.register("magnesite_hoe",
            () -> new HoeItem(ModToolTiers.MAGNESITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MALACHITE_HOE = ITEMS.register("malachite_hoe",
            () -> new HoeItem(ModToolTiers.MALACHITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MALAIA_GARNET_HOE = ITEMS.register("malaia_garnet_hoe",
            () -> new HoeItem(ModToolTiers.MALAIA_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MALI_GARNET_HOE = ITEMS.register("mali_garnet_hoe",
            () -> new HoeItem(ModToolTiers.MALI_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MANDARIN_GARNET_HOE = ITEMS.register("mandarin_garnet_hoe",
            () -> new HoeItem(ModToolTiers.MANDARIN_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MANGANOTANTALITE_HOE = ITEMS.register("manganotantalite_hoe",
            () -> new HoeItem(ModToolTiers.MANGANOTANTALITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MARCASITE_HOE = ITEMS.register("marcasite_hoe",
            () -> new HoeItem(ModToolTiers.MARCASITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MELIPHANITE_HOE = ITEMS.register("meliphanite_hoe",
            () -> new HoeItem(ModToolTiers.MELIPHANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MELLITE_HOE = ITEMS.register("mellite_hoe",
            () -> new HoeItem(ModToolTiers.MELLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MICROCLINE_HOE = ITEMS.register("microcline_hoe",
            () -> new HoeItem(ModToolTiers.MICROCLINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MICROLITE_HOE = ITEMS.register("microlite_hoe",
            () -> new HoeItem(ModToolTiers.MICROLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MILARITE_HOE = ITEMS.register("milarite_hoe",
            () -> new HoeItem(ModToolTiers.MILARITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MILLERITE_HOE = ITEMS.register("millerite_hoe",
            () -> new HoeItem(ModToolTiers.MILLERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MIMETITE_HOE = ITEMS.register("mimetite_hoe",
            () -> new HoeItem(ModToolTiers.MIMETITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MOLDAVITE_HOE = ITEMS.register("moldavite_hoe",
            () -> new HoeItem(ModToolTiers.MOLDAVITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MONAZITE_HOE = ITEMS.register("monazite_hoe",
            () -> new HoeItem(ModToolTiers.MONAZITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MOONSTONE_HOE = ITEMS.register("moonstone_hoe",
            () -> new HoeItem(ModToolTiers.MOONSTONE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MORDENITE_HOE = ITEMS.register("mordenite_hoe",
            () -> new HoeItem(ModToolTiers.MORDENITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MORGANITE_HOE = ITEMS.register("morganite_hoe",
            () -> new HoeItem(ModToolTiers.MORGANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> NAMBULITE_HOE = ITEMS.register("nambulite_hoe",
            () -> new HoeItem(ModToolTiers.NAMBULITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> NATROLITE_HOE = ITEMS.register("natrolite_hoe",
            () -> new HoeItem(ModToolTiers.NATROLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> NATURAL_GLASS_HOE = ITEMS.register("natural_glass_hoe",
            () -> new HoeItem(ModToolTiers.NATURAL_GLASS, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> NEPHELINE_HOE = ITEMS.register("nepheline_hoe",
            () -> new HoeItem(ModToolTiers.NEPHELINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> NEPHRITE_HOE = ITEMS.register("nephrite_hoe",
            () -> new HoeItem(ModToolTiers.NEPHRITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> NEPTUNITE_HOE = ITEMS.register("neptunite_hoe",
            () -> new HoeItem(ModToolTiers.NEPTUNITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> NICCOLITE_HOE = ITEMS.register("niccolite_hoe",
            () -> new HoeItem(ModToolTiers.NICCOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> OBSIDIAN_HOE = ITEMS.register("obsidian_hoe",
            () -> new HoeItem(ModToolTiers.OBSIDIAN, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> OLIGOCLASE_HOE = ITEMS.register("oligoclase_hoe",
            () -> new HoeItem(ModToolTiers.OLIGOCLASE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ONYX_HOE = ITEMS.register("onyx_hoe",
            () -> new HoeItem(ModToolTiers.ONYX, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> OPAL_STONE_HOE = ITEMS.register("opal_stone_hoe",
            () -> new HoeItem(ModToolTiers.OPAL_STONE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ORANGE_DIAMOND_HOE = ITEMS.register("orange_diamond_hoe",
            () -> new HoeItem(ModToolTiers.ORANGE_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> OREGON_SUNSTONE_HOE = ITEMS.register("oregon_sunstone_hoe",
            () -> new HoeItem(ModToolTiers.OREGON_SUNSTONE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ORTHOCLASE_HOE = ITEMS.register("orthoclase_hoe",
            () -> new HoeItem(ModToolTiers.ORTHOCLASE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PADPARADSCHA_SAPPHIRE_HOE = ITEMS.register("padparadscha_sapphire_hoe",
            () -> new HoeItem(ModToolTiers.PADPARADSCHA_SAPPHIRE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PAINITE_HOE = ITEMS.register("painite_hoe",
            () -> new HoeItem(ModToolTiers.PAINITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PALYGORSKITE_HOE = ITEMS.register("palygorskite_hoe",
            () -> new HoeItem(ModToolTiers.PALYGORSKITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PAPAGOITE_HOE = ITEMS.register("papagoite_hoe",
            () -> new HoeItem(ModToolTiers.PAPAGOITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PARAIBA_TOURMALINE_HOE = ITEMS.register("paraiba_tourmaline_hoe",
            () -> new HoeItem(ModToolTiers.PARAIBA_TOURMALINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PARGASITE_HOE = ITEMS.register("pargasite_hoe",
            () -> new HoeItem(ModToolTiers.PARGASITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PARISITE_HOE = ITEMS.register("parisite_hoe",
            () -> new HoeItem(ModToolTiers.PARISITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PEARL_HOE = ITEMS.register("pearl_hoe",
            () -> new HoeItem(ModToolTiers.PEARL, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PECTOLITE_HOE = ITEMS.register("pectolite_hoe",
            () -> new HoeItem(ModToolTiers.PECTOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PENTLANDITE_HOE = ITEMS.register("pentlandite_hoe",
            () -> new HoeItem(ModToolTiers.PENTLANDITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PERICLASE_HOE = ITEMS.register("periclase_hoe",
            () -> new HoeItem(ModToolTiers.PERICLASE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PERIDOT_HOE = ITEMS.register("peridot_hoe",
            () -> new HoeItem(ModToolTiers.PERIDOT, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PERISTERITE_HOE = ITEMS.register("peristerite_hoe",
            () -> new HoeItem(ModToolTiers.PERISTERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PERTHITE_HOE = ITEMS.register("perthite_hoe",
            () -> new HoeItem(ModToolTiers.PERTHITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PETALITE_HOE = ITEMS.register("petalite_hoe",
            () -> new HoeItem(ModToolTiers.PETALITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PHENAKITE_HOE = ITEMS.register("phenakite_hoe",
            () -> new HoeItem(ModToolTiers.PHENAKITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PHOSGENITE_HOE = ITEMS.register("phosgenite_hoe",
            () -> new HoeItem(ModToolTiers.PHOSGENITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PHOSPHOPHYLLITE_HOE = ITEMS.register("phosphophyllite_hoe",
            () -> new HoeItem(ModToolTiers.PHOSPHOPHYLLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PINK_DIAMOND_HOE = ITEMS.register("pink_diamond_hoe",
            () -> new HoeItem(ModToolTiers.PINK_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> POLLUCITE_HOE = ITEMS.register("pollucite_hoe",
            () -> new HoeItem(ModToolTiers.POLLUCITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> POWELLITE_HOE = ITEMS.register("powellite_hoe",
            () -> new HoeItem(ModToolTiers.POWELLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PREHNITE_HOE = ITEMS.register("prehnite_hoe",
            () -> new HoeItem(ModToolTiers.PREHNITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PROSOPITE_HOE = ITEMS.register("prosopite_hoe",
            () -> new HoeItem(ModToolTiers.PROSOPITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PROTEUS_HOE = ITEMS.register("proteus_hoe",
            () -> new HoeItem(ModToolTiers.PROTEUS, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PROUSTITE_HOE = ITEMS.register("proustite_hoe",
            () -> new HoeItem(ModToolTiers.PROUSTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PUMPELLYITE_HOE = ITEMS.register("pumpellyite_hoe",
            () -> new HoeItem(ModToolTiers.PUMPELLYITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PURPLE_DIAMOND_HOE = ITEMS.register("purple_diamond_hoe",
            () -> new HoeItem(ModToolTiers.PURPLE_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PURPURITE_HOE = ITEMS.register("purpurite_hoe",
            () -> new HoeItem(ModToolTiers.PURPURITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PYRARGYRITE_HOE = ITEMS.register("pyrargyrite_hoe",
            () -> new HoeItem(ModToolTiers.PYRARGYRITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PYRITE_HOE = ITEMS.register("pyrite_hoe",
            () -> new HoeItem(ModToolTiers.PYRITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PYROPE_GARNET_HOE = ITEMS.register("pyrope_garnet_hoe",
            () -> new HoeItem(ModToolTiers.PYROPE_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PYROPHYLLITE_HOE = ITEMS.register("pyrophyllite_hoe",
            () -> new HoeItem(ModToolTiers.PYROPHYLLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PYROXMANGITE_HOE = ITEMS.register("pyroxmangite_hoe",
            () -> new HoeItem(ModToolTiers.PYROXMANGITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PYRRHOTITE_HOE = ITEMS.register("pyrrhotite_hoe",
            () -> new HoeItem(ModToolTiers.PYRRHOTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> QUARTZ_HOE = ITEMS.register("quartz_hoe",
            () -> new HoeItem(ModToolTiers.QUARTZ, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> QUARTZITE_HOE = ITEMS.register("quartzite_hoe",
            () -> new HoeItem(ModToolTiers.QUARTZITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> REALGAR_HOE = ITEMS.register("realgar_hoe",
            () -> new HoeItem(ModToolTiers.REALGAR, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> RED_BERYL_HOE = ITEMS.register("red_beryl_hoe",
            () -> new HoeItem(ModToolTiers.RED_BERYL, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> RED_DIAMOND_HOE = ITEMS.register("red_diamond_hoe",
            () -> new HoeItem(ModToolTiers.RED_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> RHODIZITE_HOE = ITEMS.register("rhodizite_hoe",
            () -> new HoeItem(ModToolTiers.RHODIZITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> RHODOCHROSITE_HOE = ITEMS.register("rhodochrosite_hoe",
            () -> new HoeItem(ModToolTiers.RHODOCHROSITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> RHODOLITE_GARNET_HOE = ITEMS.register("rhodolite_garnet_hoe",
            () -> new HoeItem(ModToolTiers.RHODOLITE_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> RHODONITE_HOE = ITEMS.register("rhodonite_hoe",
            () -> new HoeItem(ModToolTiers.RHODONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ROSE_QUARTZ_HOE = ITEMS.register("rose_quartz_hoe",
            () -> new HoeItem(ModToolTiers.ROSE_QUARTZ, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> RUBELLITE_HOE = ITEMS.register("rubellite_hoe",
            () -> new HoeItem(ModToolTiers.RUBELLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe",
            () -> new HoeItem(ModToolTiers.RUBY, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> RUTILE_HOE = ITEMS.register("rutile_hoe",
            () -> new HoeItem(ModToolTiers.RUTILE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SALTWATER_PEARL_HOE = ITEMS.register("saltwater_pearl_hoe",
            () -> new HoeItem(ModToolTiers.SALTWATER_PEARL, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SAMARSKITE_HOE = ITEMS.register("samarskite_hoe",
            () -> new HoeItem(ModToolTiers.SAMARSKITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SANIDINE_HOE = ITEMS.register("sanidine_hoe",
            () -> new HoeItem(ModToolTiers.SANIDINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe",
            () -> new HoeItem(ModToolTiers.SAPPHIRE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SAPPHIRINE_HOE = ITEMS.register("sapphirine_hoe",
            () -> new HoeItem(ModToolTiers.SAPPHIRINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SARCOLITE_HOE = ITEMS.register("sarcolite_hoe",
            () -> new HoeItem(ModToolTiers.SARCOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SCAPOLITE_HOE = ITEMS.register("scapolite_hoe",
            () -> new HoeItem(ModToolTiers.SCAPOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SCHEELITE_HOE = ITEMS.register("scheelite_hoe",
            () -> new HoeItem(ModToolTiers.SCHEELITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SCORODITE_HOE = ITEMS.register("scorodite_hoe",
            () -> new HoeItem(ModToolTiers.SCORODITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SELLAITE_HOE = ITEMS.register("sellaite_hoe",
            () -> new HoeItem(ModToolTiers.SELLAITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SENARMONTITE_HOE = ITEMS.register("senarmontite_hoe",
            () -> new HoeItem(ModToolTiers.SENARMONTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SERANDITE_HOE = ITEMS.register("serandite_hoe",
            () -> new HoeItem(ModToolTiers.SERANDITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SERPENTINE_HOE = ITEMS.register("serpentine_hoe",
            () -> new HoeItem(ModToolTiers.SERPENTINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SHATTUCKITE_HOE = ITEMS.register("shattuckite_hoe",
            () -> new HoeItem(ModToolTiers.SHATTUCKITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SHORTITE_HOE = ITEMS.register("shortite_hoe",
            () -> new HoeItem(ModToolTiers.SHORTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SIDERITE_HOE = ITEMS.register("siderite_hoe",
            () -> new HoeItem(ModToolTiers.SIDERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SILLIMANITE_HOE = ITEMS.register("sillimanite_hoe",
            () -> new HoeItem(ModToolTiers.SILLIMANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SIMPSONITE_HOE = ITEMS.register("simpsonite_hoe",
            () -> new HoeItem(ModToolTiers.SIMPSONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SINHALITE_HOE = ITEMS.register("sinhalite_hoe",
            () -> new HoeItem(ModToolTiers.SINHALITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SMALTITE_HOE = ITEMS.register("smaltite_hoe",
            () -> new HoeItem(ModToolTiers.SMALTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SMITHSONITE_HOE = ITEMS.register("smithsonite_hoe",
            () -> new HoeItem(ModToolTiers.SMITHSONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SMOKY_QUARTZ_HOE = ITEMS.register("smoky_quartz_hoe",
            () -> new HoeItem(ModToolTiers.SMOKY_QUARTZ, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SODALITE_HOE = ITEMS.register("sodalite_hoe",
            () -> new HoeItem(ModToolTiers.SODALITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SOGDIANITE_HOE = ITEMS.register("sogdianite_hoe",
            () -> new HoeItem(ModToolTiers.SOGDIANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SPESSARTITE_GARNET_HOE = ITEMS.register("spessartite_garnet_hoe",
            () -> new HoeItem(ModToolTiers.SPESSARTITE_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SPHALERITE_HOE = ITEMS.register("sphalerite_hoe",
            () -> new HoeItem(ModToolTiers.SPHALERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SPHENE_HOE = ITEMS.register("sphene_hoe",
            () -> new HoeItem(ModToolTiers.SPHENE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SPINEL_HOE = ITEMS.register("spinel_hoe",
            () -> new HoeItem(ModToolTiers.SPINEL, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SPODUMENE_HOE = ITEMS.register("spodumene_hoe",
            () -> new HoeItem(ModToolTiers.SPODUMENE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SPURRITE_HOE = ITEMS.register("spurrite_hoe",
            () -> new HoeItem(ModToolTiers.SPURRITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> STAR_SAPPHIRE_HOE = ITEMS.register("star_sapphire_hoe",
            () -> new HoeItem(ModToolTiers.STAR_SAPPHIRE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> STAUROLITE_HOE = ITEMS.register("staurolite_hoe",
            () -> new HoeItem(ModToolTiers.STAUROLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> STICHTITE_HOE = ITEMS.register("stichtite_hoe",
            () -> new HoeItem(ModToolTiers.STICHTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> STOLZITE_HOE = ITEMS.register("stolzite_hoe",
            () -> new HoeItem(ModToolTiers.STOLZITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> STRONTIANITE_HOE = ITEMS.register("strontianite_hoe",
            () -> new HoeItem(ModToolTiers.STRONTIANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SUGILITE_HOE = ITEMS.register("sugilite_hoe",
            () -> new HoeItem(ModToolTiers.SUGILITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SULFUR_HOE = ITEMS.register("sulfur_hoe",
            () -> new HoeItem(ModToolTiers.SULFUR, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SUNSTONE_HOE = ITEMS.register("sunstone_hoe",
            () -> new HoeItem(ModToolTiers.SUNSTONE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TAAFFEITE_HOE = ITEMS.register("taaffeite_hoe",
            () -> new HoeItem(ModToolTiers.TAAFFEITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TALC_HOE = ITEMS.register("talc_hoe",
            () -> new HoeItem(ModToolTiers.TALC, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TANTALITE_HOE = ITEMS.register("tantalite_hoe",
            () -> new HoeItem(ModToolTiers.TANTALITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TANZANITE_HOE = ITEMS.register("tanzanite_hoe",
            () -> new HoeItem(ModToolTiers.TANZANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TEKTITE_HOE = ITEMS.register("tektite_hoe",
            () -> new HoeItem(ModToolTiers.TEKTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TEPHROITE_HOE = ITEMS.register("tephroite_hoe",
            () -> new HoeItem(ModToolTiers.TEPHROITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> THAUMASITE_HOE = ITEMS.register("thaumasite_hoe",
            () -> new HoeItem(ModToolTiers.THAUMASITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> THOMSONITE_HOE = ITEMS.register("thomsonite_hoe",
            () -> new HoeItem(ModToolTiers.THOMSONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TIGERS_EYE_HOE = ITEMS.register("tigers_eye_hoe",
            () -> new HoeItem(ModToolTiers.TIGERS_EYE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TOPAZ_HOE = ITEMS.register("topaz_hoe",
            () -> new HoeItem(ModToolTiers.TOPAZ, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TOURMALINE_HOE = ITEMS.register("tourmaline_hoe",
            () -> new HoeItem(ModToolTiers.TOURMALINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TREMOLITE_HOE = ITEMS.register("tremolite_hoe",
            () -> new HoeItem(ModToolTiers.TREMOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TRIPHYLITE_HOE = ITEMS.register("triphylite_hoe",
            () -> new HoeItem(ModToolTiers.TRIPHYLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TSAVORITE_GARNET_HOE = ITEMS.register("tsavorite_garnet_hoe",
            () -> new HoeItem(ModToolTiers.TSAVORITE_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TUGTUPITE_HOE = ITEMS.register("tugtupite_hoe",
            () -> new HoeItem(ModToolTiers.TUGTUPITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TURQUOISE_HOE = ITEMS.register("turquoise_hoe",
            () -> new HoeItem(ModToolTiers.TURQUOISE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ULEXITE_HOE = ITEMS.register("ulexite_hoe",
            () -> new HoeItem(ModToolTiers.ULEXITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> UVAROVITE_GARNET_HOE = ITEMS.register("uvarovite_garnet_hoe",
            () -> new HoeItem(ModToolTiers.UVAROVITE_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> VANADINITE_HOE = ITEMS.register("vanadinite_hoe",
            () -> new HoeItem(ModToolTiers.VANADINITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> VARISCITE_HOE = ITEMS.register("variscite_hoe",
            () -> new HoeItem(ModToolTiers.VARISCITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> VILLIAUMITE_HOE = ITEMS.register("villiaumite_hoe",
            () -> new HoeItem(ModToolTiers.VILLIAUMITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> VIVIANITE_HOE = ITEMS.register("vivianite_hoe",
            () -> new HoeItem(ModToolTiers.VIVIANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> VAYRYNENITE_HOE = ITEMS.register("vayrynenite_hoe",
            () -> new HoeItem(ModToolTiers.VAYRYNENITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> WARDITE_HOE = ITEMS.register("wardite_hoe",
            () -> new HoeItem(ModToolTiers.WARDITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> WAVELLITE_HOE = ITEMS.register("wavellite_hoe",
            () -> new HoeItem(ModToolTiers.WAVELLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> WELOGANITE_HOE = ITEMS.register("weloganite_hoe",
            () -> new HoeItem(ModToolTiers.WELOGANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> WHEWELLITE_HOE = ITEMS.register("whewellite_hoe",
            () -> new HoeItem(ModToolTiers.WHEWELLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> WILKEITE_HOE = ITEMS.register("wilkeite_hoe",
            () -> new HoeItem(ModToolTiers.WILKEITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> WILLEMITE_HOE = ITEMS.register("willemite_hoe",
            () -> new HoeItem(ModToolTiers.WILLEMITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> WITHERITE_HOE = ITEMS.register("witherite_hoe",
            () -> new HoeItem(ModToolTiers.WITHERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> WOLLASTONITE_HOE = ITEMS.register("wollastonite_hoe",
            () -> new HoeItem(ModToolTiers.WOLLASTONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> WULFENITE_HOE = ITEMS.register("wulfenite_hoe",
            () -> new HoeItem(ModToolTiers.WULFENITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> XONOTLITE_HOE = ITEMS.register("xonotlite_hoe",
            () -> new HoeItem(ModToolTiers.XONOTLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> YELLOW_DIAMOND_HOE = ITEMS.register("yellow_diamond_hoe",
            () -> new HoeItem(ModToolTiers.YELLOW_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> YUGAWARALITE_HOE = ITEMS.register("yugawaralite_hoe",
            () -> new HoeItem(ModToolTiers.YUGAWARALITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ZEKTZERITE_HOE = ITEMS.register("zektzerite_hoe",
            () -> new HoeItem(ModToolTiers.ZEKTZERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ZINCITE_HOE = ITEMS.register("zincite_hoe",
            () -> new HoeItem(ModToolTiers.ZINCITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ZIRCON_HOE = ITEMS.register("zircon_hoe",
            () -> new HoeItem(ModToolTiers.ZIRCON, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ZUNYITE_HOE = ITEMS.register("zunyite_hoe",
            () -> new HoeItem(ModToolTiers.ZUNYITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
