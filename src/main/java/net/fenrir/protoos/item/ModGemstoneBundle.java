package net.fenrir.protoos.item;

import net.fenrir.protoos.ProtoOS;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.BundleItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.BundleContents;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModGemstoneBundle
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ProtoOS.MOD_ID);

    public static final RegistryObject<Item> ACTINOLITE_BUNDLE = ITEMS.register("actinolite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> ADAMITE_BUNDLE = ITEMS.register("adamite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> AGATE_BUNDLE = ITEMS.register("agate_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> ALBITE_BUNDLE = ITEMS.register("albite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> ALEXANDRITE_BUNDLE = ITEMS.register("alexandrite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> ALGODONITE_BUNDLE = ITEMS.register("algodonite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> ALMANDINE_GARNET_BUNDLE = ITEMS.register("almandine_garnet_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> AMAZONITE_BUNDLE = ITEMS.register("amazonite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> AMBER_BUNDLE = ITEMS.register("amber_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> AMBLYGONITE_BUNDLE = ITEMS.register("amblygonite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> AMETHYST_BUNDLE = ITEMS.register("amethyst_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> AMETRINE_BUNDLE = ITEMS.register("ametrine_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> AMMOLITE_BUNDLE = ITEMS.register("ammolite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> ANALCIME_BUNDLE = ITEMS.register("analcime_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> ANATASE_BUNDLE = ITEMS.register("anatase_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> ANDALUSITE_BUNDLE = ITEMS.register("andalusite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> ANDESINE_BUNDLE = ITEMS.register("andesine_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> ANDRADITE_BUNDLE = ITEMS.register("andradite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> ANGLESITE_BUNDLE = ITEMS.register("anglesite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> ANHYDRITE_BUNDLE = ITEMS.register("anhydrite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> ANORTHITE_BUNDLE = ITEMS.register("anorthite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> APATITE_BUNDLE = ITEMS.register("apatite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> APOPHYLLITE_BUNDLE = ITEMS.register("apophyllite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> AQUAMARINE_BUNDLE = ITEMS.register("aquamarine_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> ARAGONITE_BUNDLE = ITEMS.register("aragonite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> ARTISANAL_GLASS_BUNDLE = ITEMS.register("artisanal_glass_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> AUGELITE_BUNDLE = ITEMS.register("augelite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> AXINITE_BUNDLE = ITEMS.register("axinite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> AZURITE_BUNDLE = ITEMS.register("azurite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> BARITE_BUNDLE = ITEMS.register("barite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> BAYLDONITE_BUNDLE = ITEMS.register("bayldonite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> BENITOITE_BUNDLE = ITEMS.register("benitoite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> BERYL_BUNDLE = ITEMS.register("beryl_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> BERYLLONITE_BUNDLE = ITEMS.register("beryllonite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> BISMUTOTANTALITE_BUNDLE = ITEMS.register("bismutotantalite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> BLACK_DIAMOND_BUNDLE = ITEMS.register("black_diamond_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> BLOODSTONE_BUNDLE = ITEMS.register("bloodstone_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> BLUE_DIAMOND_BUNDLE = ITEMS.register("blue_diamond_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> BOLEITE_BUNDLE = ITEMS.register("boleite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> BORACITE_BUNDLE = ITEMS.register("boracite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> BORNITE_BUNDLE = ITEMS.register("bornite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> BRAZILIANITE_BUNDLE = ITEMS.register("brazilianite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> BREITHAUPTITE_BUNDLE = ITEMS.register("breithauptite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> BROOKITE_BUNDLE = ITEMS.register("brookite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> BROWN_DIAMOND_BUNDLE = ITEMS.register("brown_diamond_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> BRUCITE_BUNDLE = ITEMS.register("brucite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> BUSTAMITE_BUNDLE = ITEMS.register("bustamite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> BYTOWNITE_BUNDLE = ITEMS.register("bytownite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> CALCAREOUS_CONCRETIONS_BUNDLE = ITEMS.register("calcareous_concretions_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> CALCITE_BUNDLE = ITEMS.register("calcite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> CANASITE_BUNDLE = ITEMS.register("canasite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> CANCRINITE_BUNDLE = ITEMS.register("cancrinite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> CARNELIAN_BUNDLE = ITEMS.register("carnelian_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> CASSITERITE_BUNDLE = ITEMS.register("cassiterite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> CATAPLEIITE_BUNDLE = ITEMS.register("catapleiite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> CELESTITE_BUNDLE = ITEMS.register("celestite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> CERULEITE_BUNDLE = ITEMS.register("ceruleite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> CERUSSITE_BUNDLE = ITEMS.register("cerussite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> CHABAZITE_BUNDLE = ITEMS.register("chabazite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> CHALCEDONY_BUNDLE = ITEMS.register("chalcedony_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> CHAMBERSITE_BUNDLE = ITEMS.register("chambersite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> CHAMAELEON_DIAMOND_BUNDLE = ITEMS.register("chamaeleon_diamond_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> CHAROITE_BUNDLE = ITEMS.register("charoite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> CHICKEN_BLOOD_STONE_BUNDLE = ITEMS.register("chicken_blood_stone_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> CHILDRENITE_BUNDLE = ITEMS.register("childrenite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> CHIOLITE_BUNDLE = ITEMS.register("chiolite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> CHROMITE_BUNDLE = ITEMS.register("chromite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> CHRYSOBERYL_BUNDLE = ITEMS.register("chrysoberyl_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> CHRYSOCOLLA_BUNDLE = ITEMS.register("chrysocolla_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> CHRYSOCOLLA_CHALCEDONY_BUNDLE = ITEMS.register("chrysocolla_chalcedony_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> CHRYSOPRASE_BUNDLE = ITEMS.register("chrysoprase_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> CINNABAR_BUNDLE = ITEMS.register("cinnabar_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> CITRINE_BUNDLE = ITEMS.register("citrine_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> CLINOCHLORE_BUNDLE = ITEMS.register("clinochlore_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> COBALTITE_BUNDLE = ITEMS.register("cobaltite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> COLEMANITE_BUNDLE = ITEMS.register("colemanite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> COLOR_CHANGE_GARNET_BUNDLE = ITEMS.register("color_change_garnet_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> COLOR_CHANGE_SAPPHIRE_BUNDLE = ITEMS.register("color_change_sapphire_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> CORAL_BUNDLE = ITEMS.register("coral_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> CORDIERITE_BUNDLE = ITEMS.register("cordierite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> CORUNDUM_BUNDLE = ITEMS.register("corundum_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> COVELLITE_BUNDLE = ITEMS.register("covellite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> CREEDITE_BUNDLE = ITEMS.register("creedite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> CROCOITE_BUNDLE = ITEMS.register("crocoite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> CRYOLITE_BUNDLE = ITEMS.register("cryolite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> CUPRITE_BUNDLE = ITEMS.register("cuprite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> DANBURITE_BUNDLE = ITEMS.register("danburite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> DATOLITE_BUNDLE = ITEMS.register("datolite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> DEMANTOID_GARNET_BUNDLE = ITEMS.register("demantoid_garnet_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> DIAMOND_BUNDLE = ITEMS.register("diamond_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> DIASPORE_BUNDLE = ITEMS.register("diaspore_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> DICKINSONITE_BUNDLE = ITEMS.register("dickinsonite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> DIOPSIDE_BUNDLE = ITEMS.register("diopside_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> DIOPTASE_BUNDLE = ITEMS.register("dioptase_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> DOLOMITE_BUNDLE = ITEMS.register("dolomite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> DUMORTIERITE_BUNDLE = ITEMS.register("dumortierite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> EKANITE_BUNDLE = ITEMS.register("ekanite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> EMERALD_BUNDLE = ITEMS.register("emerald_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> ENSTATITE_BUNDLE = ITEMS.register("enstatite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> EOSPHORITE_BUNDLE = ITEMS.register("eosphorite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> EPIDOTE_BUNDLE = ITEMS.register("epidote_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> ETTRINGITE_BUNDLE = ITEMS.register("ettringite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> EUCLASE_BUNDLE = ITEMS.register("euclase_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> EUDIALYTE_BUNDLE = ITEMS.register("eudialyte_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> EUXENITE_BUNDLE = ITEMS.register("euxenite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> FELDSPAR_BUNDLE = ITEMS.register("feldspar_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> FERGUSONITE_BUNDLE = ITEMS.register("fergusonite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> FLUORITE_BUNDLE = ITEMS.register("fluorite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> FRESHWATER_PEARL_BUNDLE = ITEMS.register("freshwater_pearl_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> FRIEDELITE_BUNDLE = ITEMS.register("friedelite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> GADOLINITE_BUNDLE = ITEMS.register("gadolinite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> GAHNOSPINEL_BUNDLE = ITEMS.register("gahnospinel_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> GARNET_BUNDLE = ITEMS.register("garnet_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> GRANDIDIERITE_BUNDLE = ITEMS.register("grandidierite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> GRAY_DIAMOND_BUNDLE = ITEMS.register("gray_diamond_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> GREEN_DIAMOND_BUNDLE = ITEMS.register("green_diamond_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> GROSSULAR_GARNET_BUNDLE = ITEMS.register("grossular_garnet_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> GYPSUM_BUNDLE = ITEMS.register("gypsum_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> HAMBERGITE_BUNDLE = ITEMS.register("hambergite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> HUAYNE_BUNDLE = ITEMS.register("huayne_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> HELIODOR_BUNDLE = ITEMS.register("heliodor_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> HEMATITE_BUNDLE = ITEMS.register("hematite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> HEMIMORPHITE_BUNDLE = ITEMS.register("hemimorphite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> HERDERITE_BUNDLE = ITEMS.register("herderite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> HESSONITE_BUNDLE = ITEMS.register("hessonite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> HODGKINSONITE_BUNDLE = ITEMS.register("hodgkinsonite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> HOLTITE_BUNDLE = ITEMS.register("holtite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> HOWLITE_BUNDLE = ITEMS.register("howlite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> HUEBNERITE_BUNDLE = ITEMS.register("huebnerite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> HUMITE_BUNDLE = ITEMS.register("humite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> HUREAULITE_BUNDLE = ITEMS.register("hureaulite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> HURLBUTITE_BUNDLE = ITEMS.register("hurlbutite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> HYDROGROSSULAR_GARNET_BUNDLE = ITEMS.register("hydrogrossular_garnet_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> HYPERITDIABAS_BUNDLE = ITEMS.register("hyperitdiabas_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> IDOCRASE_BUNDLE = ITEMS.register("idocrase_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> INDERITE_BUNDLE = ITEMS.register("inderite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> IOLITE_BUNDLE = ITEMS.register("iolite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> JADEITE_BUNDLE = ITEMS.register("jadeite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> JASPER_BUNDLE = ITEMS.register("jasper_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> JEREMEJEVITE_BUNDLE = ITEMS.register("jeremejevite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> JET_BUNDLE = ITEMS.register("jet_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> KORNERUPINE_BUNDLE = ITEMS.register("kornerupine_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> KURNAKOVITE_BUNDLE = ITEMS.register("kurnakovite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> KYANITE_BUNDLE = ITEMS.register("kyanite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> KAMMEREREITE_BUNDLE = ITEMS.register("kammererite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> LABRADORITE_BUNDLE = ITEMS.register("labradorite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> LANGBEINITE_BUNDLE = ITEMS.register("langbeinite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> LAPIS_LAZULI_BUNDLE = ITEMS.register("lapis_lazuli_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> LASERBLUE_BUNDLE = ITEMS.register("laserblue_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> LAWSONITE_BUNDLE = ITEMS.register("lawsonite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> LAZULITE_BUNDLE = ITEMS.register("lazulite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> LEGRANDITE_BUNDLE = ITEMS.register("legrandite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> LEPIDOLITE_BUNDLE = ITEMS.register("lepidolite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> LEUCITE_BUNDLE = ITEMS.register("leucite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> LINARITE_BUNDLE = ITEMS.register("linarite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> LUDLAMITE_BUNDLE = ITEMS.register("ludlamite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> MAGNESITE_BUNDLE = ITEMS.register("magnesite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> MALACHITE_BUNDLE = ITEMS.register("malachite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> MALAIA_GARNET_BUNDLE = ITEMS.register("malaia_garnet_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> MALI_GARNET_BUNDLE = ITEMS.register("mali_garnet_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> MANDARIN_GARNET_BUNDLE = ITEMS.register("mandarin_garnet_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> MANGANOTANTALITE_BUNDLE = ITEMS.register("manganotantalite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> MARCASITE_BUNDLE = ITEMS.register("marcasite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> MELIPHANITE_BUNDLE = ITEMS.register("meliphanite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> MELLITE_BUNDLE = ITEMS.register("mellite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> MICROCLINE_BUNDLE = ITEMS.register("microcline_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> MICROLITE_BUNDLE = ITEMS.register("microlite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> MILARITE_BUNDLE = ITEMS.register("milarite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> MILLERITE_BUNDLE = ITEMS.register("millerite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> MIMETITE_BUNDLE = ITEMS.register("mimetite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> MOLDAVITE_BUNDLE = ITEMS.register("moldavite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> MONAZITE_BUNDLE = ITEMS.register("monazite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> MOONSTONE_BUNDLE = ITEMS.register("moonstone_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> MORDENITE_BUNDLE = ITEMS.register("mordenite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> MORGANITE_BUNDLE = ITEMS.register("morganite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> NAMBULITE_BUNDLE = ITEMS.register("nambulite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> NATROLITE_BUNDLE = ITEMS.register("natrolite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> NATURAL_GLASS_BUNDLE = ITEMS.register("natural_glass_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> NEPHELINE_BUNDLE = ITEMS.register("nepheline_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> NEPHRITE_BUNDLE = ITEMS.register("nephrite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> NEPTUNITE_BUNDLE = ITEMS.register("neptunite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> NICCOLITE_BUNDLE = ITEMS.register("niccolite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> OBSIDIAN_BUNDLE = ITEMS.register("obsidian_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> OLIGOCLASE_BUNDLE = ITEMS.register("oligoclase_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> ONYX_BUNDLE = ITEMS.register("onyx_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> OPAL_STONE_BUNDLE = ITEMS.register("opal_stone_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> ORANGE_DIAMOND_BUNDLE = ITEMS.register("orange_diamond_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> OREGON_SUNSTONE_BUNDLE = ITEMS.register("oregon_sunstone_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> ORTHOCLASE_BUNDLE = ITEMS.register("orthoclase_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> PADPARADSCHA_SAPPHIRE_BUNDLE = ITEMS.register("padparadscha_sapphire_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> PAINITE_BUNDLE = ITEMS.register("painite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> PALYGORSKITE_BUNDLE = ITEMS.register("palygorskite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> PAPAGOITE_BUNDLE = ITEMS.register("papagoite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> PARAIBA_TOURMALINE_BUNDLE = ITEMS.register("paraiba_tourmaline_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> PARGASITE_BUNDLE = ITEMS.register("pargasite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> PARISITE_BUNDLE = ITEMS.register("parisite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> PEARL_BUNDLE = ITEMS.register("pearl_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> PECTOLITE_BUNDLE = ITEMS.register("pectolite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> PENTLANDITE_BUNDLE = ITEMS.register("pentlandite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> PERICLASE_BUNDLE = ITEMS.register("periclase_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> PERIDOT_BUNDLE = ITEMS.register("peridot_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> PERISTERITE_BUNDLE = ITEMS.register("peristerite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> PERTHITE_BUNDLE = ITEMS.register("perthite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> PETALITE_BUNDLE = ITEMS.register("petalite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> PHENAKITE_BUNDLE = ITEMS.register("phenakite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> PHOSGENITE_BUNDLE = ITEMS.register("phosgenite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> PHOSPHOPHYLLITE_BUNDLE = ITEMS.register("phosphophyllite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> PINK_DIAMOND_BUNDLE = ITEMS.register("pink_diamond_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> POLLUCITE_BUNDLE = ITEMS.register("pollucite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> POWELLITE_BUNDLE = ITEMS.register("powellite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> PREHNITE_BUNDLE = ITEMS.register("prehnite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> PROSOPITE_BUNDLE = ITEMS.register("prosopite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> PROTEUS_BUNDLE = ITEMS.register("proteus_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> PROUSTITE_BUNDLE = ITEMS.register("proustite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> PUMPELLYITE_BUNDLE = ITEMS.register("pumpellyite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> PURPLE_DIAMOND_BUNDLE = ITEMS.register("purple_diamond_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> PURPURITE_BUNDLE = ITEMS.register("purpurite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> PYRARGYRITE_BUNDLE = ITEMS.register("pyrargyrite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> PYRITE_BUNDLE = ITEMS.register("pyrite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> PYROPE_GARNET_BUNDLE = ITEMS.register("pyrope_garnet_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> PYROPHYLLITE_BUNDLE = ITEMS.register("pyrophyllite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> PYROXMANGITE_BUNDLE = ITEMS.register("pyroxmangite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> PYRRHOTITE_BUNDLE = ITEMS.register("pyrrhotite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> QUARTZ_BUNDLE = ITEMS.register("quartz_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> QUARTZITE_BUNDLE = ITEMS.register("quartzite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> REALGAR_BUNDLE = ITEMS.register("realgar_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> RED_BERYL_BUNDLE = ITEMS.register("red_beryl_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> RED_DIAMOND_BUNDLE = ITEMS.register("red_diamond_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> RHODIZITE_BUNDLE = ITEMS.register("rhodizite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> RHODOCHROSITE_BUNDLE = ITEMS.register("rhodochrosite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> RHODOLITE_GARNET_BUNDLE = ITEMS.register("rhodolite_garnet_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> RHODONITE_BUNDLE = ITEMS.register("rhodonite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> ROSE_QUARTZ_BUNDLE = ITEMS.register("rose_quartz_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> RUBELLITE_BUNDLE = ITEMS.register("rubellite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> RUBY_BUNDLE = ITEMS.register("ruby_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> RUTILE_BUNDLE = ITEMS.register("rutile_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> SALTWATER_PEARL_BUNDLE = ITEMS.register("saltwater_pearl_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> SAMARSKITE_BUNDLE = ITEMS.register("samarskite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> SANIDINE_BUNDLE = ITEMS.register("sanidine_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> SAPPHIRE_BUNDLE = ITEMS.register("sapphire_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> SAPPHIRINE_BUNDLE = ITEMS.register("sapphirine_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> SARCOLITE_BUNDLE = ITEMS.register("sarcolite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> SCAPOLITE_BUNDLE = ITEMS.register("scapolite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> SCHEELITE_BUNDLE = ITEMS.register("scheelite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> SCORODITE_BUNDLE = ITEMS.register("scorodite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> SELLAITE_BUNDLE = ITEMS.register("sellaite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> SENARMONTITE_BUNDLE = ITEMS.register("senarmontite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> SERANDITE_BUNDLE = ITEMS.register("serandite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> SERPENTINE_BUNDLE = ITEMS.register("serpentine_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> SHATTUCKITE_BUNDLE = ITEMS.register("shattuckite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> SHORTITE_BUNDLE = ITEMS.register("shortite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> SIDERITE_BUNDLE = ITEMS.register("siderite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> SILLIMANITE_BUNDLE = ITEMS.register("sillimanite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> SIMPSONITE_BUNDLE = ITEMS.register("simpsonite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> SINHALITE_BUNDLE = ITEMS.register("sinhalite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> SMALTITE_BUNDLE = ITEMS.register("smaltite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> SMITHSONITE_BUNDLE = ITEMS.register("smithsonite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> SMOKY_QUARTZ_BUNDLE = ITEMS.register("smoky_quartz_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> SODALITE_BUNDLE = ITEMS.register("sodalite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> SOGDIANITE_BUNDLE = ITEMS.register("sogdianite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> SPESSARTITE_GARNET_BUNDLE = ITEMS.register("spessartite_garnet_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> SPHALERITE_BUNDLE = ITEMS.register("sphalerite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> SPHENE_BUNDLE = ITEMS.register("sphene_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> SPINEL_BUNDLE = ITEMS.register("spinel_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> SPODUMENE_BUNDLE = ITEMS.register("spodumene_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> SPURRITE_BUNDLE = ITEMS.register("spurrite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> STAR_SAPPHIRE_BUNDLE = ITEMS.register("star_sapphire_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> STAUROLITE_BUNDLE = ITEMS.register("staurolite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> STICHTITE_BUNDLE = ITEMS.register("stichtite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> STOLZITE_BUNDLE = ITEMS.register("stolzite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> STRONTIANITE_BUNDLE = ITEMS.register("strontianite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> SUGILITE_BUNDLE = ITEMS.register("sugilite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> SULFUR_BUNDLE = ITEMS.register("sulfur_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> SUNSTONE_BUNDLE = ITEMS.register("sunstone_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> TAAFFEITE_BUNDLE = ITEMS.register("taaffeite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> TALC_BUNDLE = ITEMS.register("talc_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> TANTALITE_BUNDLE = ITEMS.register("tantalite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> TANZANITE_BUNDLE = ITEMS.register("tanzanite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> TEKTITE_BUNDLE = ITEMS.register("tektite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> TEPHROITE_BUNDLE = ITEMS.register("tephroite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> THAUMASITE_BUNDLE = ITEMS.register("thaumasite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> THOMSONITE_BUNDLE = ITEMS.register("thomsonite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> TIGERS_EYE_BUNDLE = ITEMS.register("tigers_eye_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> TOPAZ_BUNDLE = ITEMS.register("topaz_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> TOURMALINE_BUNDLE = ITEMS.register("tourmaline_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> TREMOLITE_BUNDLE = ITEMS.register("tremolite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> TRIPHYLITE_BUNDLE = ITEMS.register("triphylite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> TSAVORITE_GARNET_BUNDLE = ITEMS.register("tsavorite_garnet_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> TUGTUPITE_BUNDLE = ITEMS.register("tugtupite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> TURQUOISE_BUNDLE = ITEMS.register("turquoise_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> ULEXITE_BUNDLE = ITEMS.register("ulexite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> UVAROVITE_GARNET_BUNDLE = ITEMS.register("uvarovite_garnet_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> VANADINITE_BUNDLE = ITEMS.register("vanadinite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> VARISCITE_BUNDLE = ITEMS.register("variscite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> VILLIAUMITE_BUNDLE = ITEMS.register("villiaumite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> VIVIANITE_BUNDLE = ITEMS.register("vivianite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> VAYRYNENITE_BUNDLE = ITEMS.register("vayrynenite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> WARDITE_BUNDLE = ITEMS.register("wardite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> WAVELLITE_BUNDLE = ITEMS.register("wavellite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> WELOGANITE_BUNDLE = ITEMS.register("weloganite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> WHEWELLITE_BUNDLE = ITEMS.register("whewellite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> WILKEITE_BUNDLE = ITEMS.register("wilkeite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> WILLEMITE_BUNDLE = ITEMS.register("willemite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> WITHERITE_BUNDLE = ITEMS.register("witherite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> WOLLASTONITE_BUNDLE = ITEMS.register("wollastonite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> WULFENITE_BUNDLE = ITEMS.register("wulfenite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> XONOTLITE_BUNDLE = ITEMS.register("xonotlite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> YELLOW_DIAMOND_BUNDLE = ITEMS.register("yellow_diamond_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> YUGAWARALITE_BUNDLE = ITEMS.register("yugawaralite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> ZEKTZERITE_BUNDLE = ITEMS.register("zektzerite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> ZINCITE_BUNDLE = ITEMS.register("zincite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> ZIRCON_BUNDLE = ITEMS.register("zircon_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));
    public static final RegistryObject<Item> ZUNYITE_BUNDLE = ITEMS.register("zunyite_bundle",
            () -> new BundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
