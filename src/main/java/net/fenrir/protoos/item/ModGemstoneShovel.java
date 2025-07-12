package net.fenrir.protoos.item;

import net.fenrir.protoos.ProtoOS;
import net.fenrir.protoos.item.custom.ModToolTiers;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.component.Unbreakable;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModGemstoneShovel
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ProtoOS.MOD_ID);

    public static final RegistryObject<Item> ACTINOLITE_SHOVEL = ITEMS.register("actinolite_shovel",
            () -> new ShovelItem(ModToolTiers.ACTINOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ADAMITE_SHOVEL = ITEMS.register("adamite_shovel",
            () -> new ShovelItem(ModToolTiers.ADAMITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AGATE_SHOVEL = ITEMS.register("agate_shovel",
            () -> new ShovelItem(ModToolTiers.AGATE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ALBITE_SHOVEL = ITEMS.register("albite_shovel",
            () -> new ShovelItem(ModToolTiers.ALBITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ALEXANDRITE_SHOVEL = ITEMS.register("alexandrite_shovel",
            () -> new ShovelItem(ModToolTiers.ALEXANDRITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ALGODONITE_SHOVEL = ITEMS.register("algodonite_shovel",
            () -> new ShovelItem(ModToolTiers.ALGODONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ALMANDINE_GARNET_SHOVEL = ITEMS.register("almandine_garnet_shovel",
            () -> new ShovelItem(ModToolTiers.ALMANDINE_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AMAZONITE_SHOVEL = ITEMS.register("amazonite_shovel",
            () -> new ShovelItem(ModToolTiers.AMAZONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AMBER_SHOVEL = ITEMS.register("amber_shovel",
            () -> new ShovelItem(ModToolTiers.AMBER, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AMBLYGONITE_SHOVEL = ITEMS.register("amblygonite_shovel",
            () -> new ShovelItem(ModToolTiers.AMBLYGONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AMETHYST_SHOVEL = ITEMS.register("amethyst_shovel",
            () -> new ShovelItem(ModToolTiers.AMETHYST, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AMETRINE_SHOVEL = ITEMS.register("ametrine_shovel",
            () -> new ShovelItem(ModToolTiers.AMETRINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AMMOLITE_SHOVEL = ITEMS.register("ammolite_shovel",
            () -> new ShovelItem(ModToolTiers.AMMOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ANALCIME_SHOVEL = ITEMS.register("analcime_shovel",
            () -> new ShovelItem(ModToolTiers.ANALCIME, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ANATASE_SHOVEL = ITEMS.register("anatase_shovel",
            () -> new ShovelItem(ModToolTiers.ANATASE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ANDALUSITE_SHOVEL = ITEMS.register("andalusite_shovel",
            () -> new ShovelItem(ModToolTiers.ANDALUSITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ANDESINE_SHOVEL = ITEMS.register("andesine_shovel",
            () -> new ShovelItem(ModToolTiers.ANDESINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ANDRADITE_SHOVEL = ITEMS.register("andradite_shovel",
            () -> new ShovelItem(ModToolTiers.ANDRADITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ANGLESITE_SHOVEL = ITEMS.register("anglesite_shovel",
            () -> new ShovelItem(ModToolTiers.ANGLESITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ANHYDRITE_SHOVEL = ITEMS.register("anhydrite_shovel",
            () -> new ShovelItem(ModToolTiers.ANHYDRITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ANORTHITE_SHOVEL = ITEMS.register("anorthite_shovel",
            () -> new ShovelItem(ModToolTiers.ANORTHITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> APATITE_SHOVEL = ITEMS.register("apatite_shovel",
            () -> new ShovelItem(ModToolTiers.APATITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> APOPHYLLITE_SHOVEL = ITEMS.register("apophyllite_shovel",
            () -> new ShovelItem(ModToolTiers.APOPHYLLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AQUAMARINE_SHOVEL = ITEMS.register("aquamarine_shovel",
            () -> new ShovelItem(ModToolTiers.AQUAMARINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ARAGONITE_SHOVEL = ITEMS.register("aragonite_shovel",
            () -> new ShovelItem(ModToolTiers.ARAGONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ARTISANAL_GLASS_SHOVEL = ITEMS.register("artisanal_glass_shovel",
            () -> new ShovelItem(ModToolTiers.ARTISANAL_GLASS, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AUGELITE_SHOVEL = ITEMS.register("augelite_shovel",
            () -> new ShovelItem(ModToolTiers.AUGELITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AXINITE_SHOVEL = ITEMS.register("axinite_shovel",
            () -> new ShovelItem(ModToolTiers.AXINITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AZURITE_SHOVEL = ITEMS.register("azurite_shovel",
            () -> new ShovelItem(ModToolTiers.AZURITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BARITE_SHOVEL = ITEMS.register("barite_shovel",
            () -> new ShovelItem(ModToolTiers.BARITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BAYLDONITE_SHOVEL = ITEMS.register("bayldonite_shovel",
            () -> new ShovelItem(ModToolTiers.BAYLDONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BENITOITE_SHOVEL = ITEMS.register("benitoite_shovel",
            () -> new ShovelItem(ModToolTiers.BENITOITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BERYL_SHOVEL = ITEMS.register("beryl_shovel",
            () -> new ShovelItem(ModToolTiers.BERYL, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BERYLLONITE_SHOVEL = ITEMS.register("beryllonite_shovel",
            () -> new ShovelItem(ModToolTiers.BERYLLONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BISMUTOTANTALITE_SHOVEL = ITEMS.register("bismutotantalite_shovel",
            () -> new ShovelItem(ModToolTiers.BISMUTOTANTALITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BLACK_DIAMOND_SHOVEL = ITEMS.register("black_diamond_shovel",
            () -> new ShovelItem(ModToolTiers.BLACK_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BLOODSTONE_SHOVEL = ITEMS.register("bloodstone_shovel",
            () -> new ShovelItem(ModToolTiers.BLOODSTONE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BLUE_DIAMOND_SHOVEL = ITEMS.register("blue_diamond_shovel",
            () -> new ShovelItem(ModToolTiers.BLUE_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BOLEITE_SHOVEL = ITEMS.register("boleite_shovel",
            () -> new ShovelItem(ModToolTiers.BOLEITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BORACITE_SHOVEL = ITEMS.register("boracite_shovel",
            () -> new ShovelItem(ModToolTiers.BORACITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BORNITE_SHOVEL = ITEMS.register("bornite_shovel",
            () -> new ShovelItem(ModToolTiers.BORNITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BRAZILIANITE_SHOVEL = ITEMS.register("brazilianite_shovel",
            () -> new ShovelItem(ModToolTiers.BRAZILIANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BREITHAUPTITE_SHOVEL = ITEMS.register("breithauptite_shovel",
            () -> new ShovelItem(ModToolTiers.BREITHAUPTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BROOKITE_SHOVEL = ITEMS.register("brookite_shovel",
            () -> new ShovelItem(ModToolTiers.BROOKITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BROWN_DIAMOND_SHOVEL = ITEMS.register("brown_diamond_shovel",
            () -> new ShovelItem(ModToolTiers.BROWN_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BRUCITE_SHOVEL = ITEMS.register("brucite_shovel",
            () -> new ShovelItem(ModToolTiers.BRUCITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BUSTAMITE_SHOVEL = ITEMS.register("bustamite_shovel",
            () -> new ShovelItem(ModToolTiers.BUSTAMITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BYTOWNITE_SHOVEL = ITEMS.register("bytownite_shovel",
            () -> new ShovelItem(ModToolTiers.BYTOWNITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CALCAREOUS_CONCRETIONS_SHOVEL = ITEMS.register("calcareous_concretions_shovel",
            () -> new ShovelItem(ModToolTiers.CALCAREOUS_CONCRETIONS, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CALCITE_SHOVEL = ITEMS.register("calcite_shovel",
            () -> new ShovelItem(ModToolTiers.CALCITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CANASITE_SHOVEL = ITEMS.register("canasite_shovel",
            () -> new ShovelItem(ModToolTiers.CANASITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CANCRINITE_SHOVEL = ITEMS.register("cancrinite_shovel",
            () -> new ShovelItem(ModToolTiers.CANCRINITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CARNELIAN_SHOVEL = ITEMS.register("carnelian_shovel",
            () -> new ShovelItem(ModToolTiers.CARNELIAN, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CASSITERITE_SHOVEL = ITEMS.register("cassiterite_shovel",
            () -> new ShovelItem(ModToolTiers.CASSITERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CATAPLEIITE_SHOVEL = ITEMS.register("catapleiite_shovel",
            () -> new ShovelItem(ModToolTiers.CATAPLEIITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CELESTITE_SHOVEL = ITEMS.register("celestite_shovel",
            () -> new ShovelItem(ModToolTiers.CELESTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CERULEITE_SHOVEL = ITEMS.register("ceruleite_shovel",
            () -> new ShovelItem(ModToolTiers.CERULEITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CERUSSITE_SHOVEL = ITEMS.register("cerussite_shovel",
            () -> new ShovelItem(ModToolTiers.CERUSSITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHABAZITE_SHOVEL = ITEMS.register("chabazite_shovel",
            () -> new ShovelItem(ModToolTiers.CHABAZITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHALCEDONY_SHOVEL = ITEMS.register("chalcedony_shovel",
            () -> new ShovelItem(ModToolTiers.CHALCEDONY, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHAMBERSITE_SHOVEL = ITEMS.register("chambersite_shovel",
            () -> new ShovelItem(ModToolTiers.CHAMBERSITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHAMAELEON_DIAMOND_SHOVEL = ITEMS.register("chamaeleon_diamond_shovel",
            () -> new ShovelItem(ModToolTiers.CHAMAELEON_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHAROITE_SHOVEL = ITEMS.register("charoite_shovel",
            () -> new ShovelItem(ModToolTiers.CHAROITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHICKEN_BLOOD_STONE_SHOVEL = ITEMS.register("chicken_blood_stone_shovel",
            () -> new ShovelItem(ModToolTiers.CHICKEN_BLOOD_STONE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHILDRENITE_SHOVEL = ITEMS.register("childrenite_shovel",
            () -> new ShovelItem(ModToolTiers.CHILDRENITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHIOLITE_SHOVEL = ITEMS.register("chiolite_shovel",
            () -> new ShovelItem(ModToolTiers.CHIOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHROMITE_SHOVEL = ITEMS.register("chromite_shovel",
            () -> new ShovelItem(ModToolTiers.CHROMITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHRYSOBERYL_SHOVEL = ITEMS.register("chrysoberyl_shovel",
            () -> new ShovelItem(ModToolTiers.CHRYSOBERYL, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHRYSOCOLLA_SHOVEL = ITEMS.register("chrysocolla_shovel",
            () -> new ShovelItem(ModToolTiers.CHRYSOCOLLA, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHRYSOCOLLA_CHALCEDONY_SHOVEL = ITEMS.register("chrysocolla_chalcedony_shovel",
            () -> new ShovelItem(ModToolTiers.CHRYSOCOLLA_CHALCEDONY, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHRYSOPRASE_SHOVEL = ITEMS.register("chrysoprase_shovel",
            () -> new ShovelItem(ModToolTiers.CHRYSOPRASE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CINNABAR_SHOVEL = ITEMS.register("cinnabar_shovel",
            () -> new ShovelItem(ModToolTiers.CINNABAR, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CITRINE_SHOVEL = ITEMS.register("citrine_shovel",
            () -> new ShovelItem(ModToolTiers.CITRINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CLINOCHLORE_SHOVEL = ITEMS.register("clinochlore_shovel",
            () -> new ShovelItem(ModToolTiers.CLINOCHLORE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> COBALTITE_SHOVEL = ITEMS.register("cobaltite_shovel",
            () -> new ShovelItem(ModToolTiers.COBALTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> COLEMANITE_SHOVEL = ITEMS.register("colemanite_shovel",
            () -> new ShovelItem(ModToolTiers.COLEMANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> COLOR_CHANGE_GARNET_SHOVEL = ITEMS.register("color_change_garnet_shovel",
            () -> new ShovelItem(ModToolTiers.COLOR_CHANGE_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> COLOR_CHANGE_SAPPHIRE_SHOVEL = ITEMS.register("color_change_sapphire_shovel",
            () -> new ShovelItem(ModToolTiers.COLOR_CHANGE_SAPPHIRE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CORAL_SHOVEL = ITEMS.register("coral_shovel",
            () -> new ShovelItem(ModToolTiers.CORAL, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CORDIERITE_SHOVEL = ITEMS.register("cordierite_shovel",
            () -> new ShovelItem(ModToolTiers.CORDIERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CORUNDUM_SHOVEL = ITEMS.register("corundum_shovel",
            () -> new ShovelItem(ModToolTiers.CORUNDUM, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> COVELLITE_SHOVEL = ITEMS.register("covellite_shovel",
            () -> new ShovelItem(ModToolTiers.COVELLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CREEDITE_SHOVEL = ITEMS.register("creedite_shovel",
            () -> new ShovelItem(ModToolTiers.CREEDITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CROCOITE_SHOVEL = ITEMS.register("crocoite_shovel",
            () -> new ShovelItem(ModToolTiers.CROCOITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CRYOLITE_SHOVEL = ITEMS.register("cryolite_shovel",
            () -> new ShovelItem(ModToolTiers.CRYOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CUPRITE_SHOVEL = ITEMS.register("cuprite_shovel",
            () -> new ShovelItem(ModToolTiers.CUPRITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> DANBURITE_SHOVEL = ITEMS.register("danburite_shovel",
            () -> new ShovelItem(ModToolTiers.DANBURITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> DATOLITE_SHOVEL = ITEMS.register("datolite_shovel",
            () -> new ShovelItem(ModToolTiers.DATOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> DEMANTOID_GARNET_SHOVEL = ITEMS.register("demantoid_garnet_shovel",
            () -> new ShovelItem(ModToolTiers.DEMANTOID_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> DIAMOND_SHOVEL = ITEMS.register("diamond_shovel",
            () -> new ShovelItem(ModToolTiers.DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> DIASPORE_SHOVEL = ITEMS.register("diaspore_shovel",
            () -> new ShovelItem(ModToolTiers.DIASPORE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> DICKINSONITE_SHOVEL = ITEMS.register("dickinsonite_shovel",
            () -> new ShovelItem(ModToolTiers.DICKINSONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> DIOPSIDE_SHOVEL = ITEMS.register("diopside_shovel",
            () -> new ShovelItem(ModToolTiers.DIOPSIDE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> DIOPTASE_SHOVEL = ITEMS.register("dioptase_shovel",
            () -> new ShovelItem(ModToolTiers.DIOPTASE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> DOLOMITE_SHOVEL = ITEMS.register("dolomite_shovel",
            () -> new ShovelItem(ModToolTiers.DOLOMITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> DUMORTIERITE_SHOVEL = ITEMS.register("dumortierite_shovel",
            () -> new ShovelItem(ModToolTiers.DUMORTIERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> EKANITE_SHOVEL = ITEMS.register("ekanite_shovel",
            () -> new ShovelItem(ModToolTiers.EKANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> EMERALD_SHOVEL = ITEMS.register("emerald_shovel",
            () -> new ShovelItem(ModToolTiers.EMERALD, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ENSTATITE_SHOVEL = ITEMS.register("enstatite_shovel",
            () -> new ShovelItem(ModToolTiers.ENSTATITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> EOSPHORITE_SHOVEL = ITEMS.register("eosphorite_shovel",
            () -> new ShovelItem(ModToolTiers.EOSPHORITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> EPIDOTE_SHOVEL = ITEMS.register("epidote_shovel",
            () -> new ShovelItem(ModToolTiers.EPIDOTE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ETTRINGITE_SHOVEL = ITEMS.register("ettringite_shovel",
            () -> new ShovelItem(ModToolTiers.ETTRINGITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> EUCLASE_SHOVEL = ITEMS.register("euclase_shovel",
            () -> new ShovelItem(ModToolTiers.EUCLASE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> EUDIALYTE_SHOVEL = ITEMS.register("eudialyte_shovel",
            () -> new ShovelItem(ModToolTiers.EUDIALYTE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> EUXENITE_SHOVEL = ITEMS.register("euxenite_shovel",
            () -> new ShovelItem(ModToolTiers.EUXENITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> FELDSPAR_SHOVEL = ITEMS.register("feldspar_shovel",
            () -> new ShovelItem(ModToolTiers.FELDSPAR, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> FERGUSONITE_SHOVEL = ITEMS.register("fergusonite_shovel",
            () -> new ShovelItem(ModToolTiers.FERGUSONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> FLUORITE_SHOVEL = ITEMS.register("fluorite_shovel",
            () -> new ShovelItem(ModToolTiers.FLUORITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> FRESHWATER_PEARL_SHOVEL = ITEMS.register("freshwater_pearl_shovel",
            () -> new ShovelItem(ModToolTiers.FRESHWATER_PEARL, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> FRIEDELITE_SHOVEL = ITEMS.register("friedelite_shovel",
            () -> new ShovelItem(ModToolTiers.FRIEDELITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> GADOLINITE_SHOVEL = ITEMS.register("gadolinite_shovel",
            () -> new ShovelItem(ModToolTiers.GADOLINITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> GAHNOSPINEL_SHOVEL = ITEMS.register("gahnospinel_shovel",
            () -> new ShovelItem(ModToolTiers.GAHNOSPINEL, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> GARNET_SHOVEL = ITEMS.register("garnet_shovel",
            () -> new ShovelItem(ModToolTiers.GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> GRANDIDIERITE_SHOVEL = ITEMS.register("grandidierite_shovel",
            () -> new ShovelItem(ModToolTiers.GRANDIDIERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> GRAY_DIAMOND_SHOVEL = ITEMS.register("gray_diamond_shovel",
            () -> new ShovelItem(ModToolTiers.GRAY_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> GREEN_DIAMOND_SHOVEL = ITEMS.register("green_diamond_shovel",
            () -> new ShovelItem(ModToolTiers.GREEN_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> GROSSULAR_GARNET_SHOVEL = ITEMS.register("grossular_garnet_shovel",
            () -> new ShovelItem(ModToolTiers.GROSSULAR_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> GYPSUM_SHOVEL = ITEMS.register("gypsum_shovel",
            () -> new ShovelItem(ModToolTiers.GYPSUM, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HAMBERGITE_SHOVEL = ITEMS.register("hambergite_shovel",
            () -> new ShovelItem(ModToolTiers.HAMBERGITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HUAYNE_SHOVEL = ITEMS.register("huayne_shovel",
            () -> new ShovelItem(ModToolTiers.HUAYNE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HELIODOR_SHOVEL = ITEMS.register("heliodor_shovel",
            () -> new ShovelItem(ModToolTiers.HELIODOR, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HEMATITE_SHOVEL = ITEMS.register("hematite_shovel",
            () -> new ShovelItem(ModToolTiers.HEMATITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HEMIMORPHITE_SHOVEL = ITEMS.register("hemimorphite_shovel",
            () -> new ShovelItem(ModToolTiers.HEMIMORPHITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HERDERITE_SHOVEL = ITEMS.register("herderite_shovel",
            () -> new ShovelItem(ModToolTiers.HERDERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HESSONITE_SHOVEL = ITEMS.register("hessonite_shovel",
            () -> new ShovelItem(ModToolTiers.HESSONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HODGKINSONITE_SHOVEL = ITEMS.register("hodgkinsonite_shovel",
            () -> new ShovelItem(ModToolTiers.HODGKINSONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HOLTITE_SHOVEL = ITEMS.register("holtite_shovel",
            () -> new ShovelItem(ModToolTiers.HOLTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HOWLITE_SHOVEL = ITEMS.register("howlite_shovel",
            () -> new ShovelItem(ModToolTiers.HOWLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HUEBNERITE_SHOVEL = ITEMS.register("huebnerite_shovel",
            () -> new ShovelItem(ModToolTiers.HUEBNERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HUMITE_SHOVEL = ITEMS.register("humite_shovel",
            () -> new ShovelItem(ModToolTiers.HUMITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HUREAULITE_SHOVEL = ITEMS.register("hureaulite_shovel",
            () -> new ShovelItem(ModToolTiers.HUREAULITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HURLBUTITE_SHOVEL = ITEMS.register("hurlbutite_shovel",
            () -> new ShovelItem(ModToolTiers.HURLBUTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HYDROGROSSULAR_GARNET_SHOVEL = ITEMS.register("hydrogrossular_garnet_shovel",
            () -> new ShovelItem(ModToolTiers.HYDROGROSSULAR_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HYPERITDIABAS_SHOVEL = ITEMS.register("hyperitdiabas_shovel",
            () -> new ShovelItem(ModToolTiers.HYPERITDIABAS, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> IDOCRASE_SHOVEL = ITEMS.register("idocrase_shovel",
            () -> new ShovelItem(ModToolTiers.IDOCRASE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> INDERITE_SHOVEL = ITEMS.register("inderite_shovel",
            () -> new ShovelItem(ModToolTiers.INDERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> IOLITE_SHOVEL = ITEMS.register("iolite_shovel",
            () -> new ShovelItem(ModToolTiers.IOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> JADEITE_SHOVEL = ITEMS.register("jadeite_shovel",
            () -> new ShovelItem(ModToolTiers.JADEITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> JASPER_SHOVEL = ITEMS.register("jasper_shovel",
            () -> new ShovelItem(ModToolTiers.JASPER, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> JEREMEJEVITE_SHOVEL = ITEMS.register("jeremejevite_shovel",
            () -> new ShovelItem(ModToolTiers.JEREMEJEVITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> JET_SHOVEL = ITEMS.register("jet_shovel",
            () -> new ShovelItem(ModToolTiers.JET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> KORNERUPINE_SHOVEL = ITEMS.register("kornerupine_shovel",
            () -> new ShovelItem(ModToolTiers.KORNERUPINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> KURNAKOVITE_SHOVEL = ITEMS.register("kurnakovite_shovel",
            () -> new ShovelItem(ModToolTiers.KURNAKOVITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> KYANITE_SHOVEL = ITEMS.register("kyanite_shovel",
            () -> new ShovelItem(ModToolTiers.KYANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> KAMMEREREITE_SHOVEL = ITEMS.register("kammererite_shovel",
            () -> new ShovelItem(ModToolTiers.KAMMEREREITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LABRADORITE_SHOVEL = ITEMS.register("labradorite_shovel",
            () -> new ShovelItem(ModToolTiers.LABRADORITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LANGBEINITE_SHOVEL = ITEMS.register("langbeinite_shovel",
            () -> new ShovelItem(ModToolTiers.LANGBEINITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LAPIS_LAZULI_SHOVEL = ITEMS.register("lapis_lazuli_shovel",
            () -> new ShovelItem(ModToolTiers.LAPIS_LAZULI, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LASERBLUE_SHOVEL = ITEMS.register("laserblue_shovel",
            () -> new ShovelItem(ModToolTiers.LASERBLUE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LAWSONITE_SHOVEL = ITEMS.register("lawsonite_shovel",
            () -> new ShovelItem(ModToolTiers.LAWSONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LAZULITE_SHOVEL = ITEMS.register("lazulite_shovel",
            () -> new ShovelItem(ModToolTiers.LAZULITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LEGRANDITE_SHOVEL = ITEMS.register("legrandite_shovel",
            () -> new ShovelItem(ModToolTiers.LEGRANDITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LEPIDOLITE_SHOVEL = ITEMS.register("lepidolite_shovel",
            () -> new ShovelItem(ModToolTiers.LEPIDOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LEUCITE_SHOVEL = ITEMS.register("leucite_shovel",
            () -> new ShovelItem(ModToolTiers.LEUCITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LINARITE_SHOVEL = ITEMS.register("linarite_shovel",
            () -> new ShovelItem(ModToolTiers.LINARITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LUDLAMITE_SHOVEL = ITEMS.register("ludlamite_shovel",
            () -> new ShovelItem(ModToolTiers.LUDLAMITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MAGNESITE_SHOVEL = ITEMS.register("magnesite_shovel",
            () -> new ShovelItem(ModToolTiers.MAGNESITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MALACHITE_SHOVEL = ITEMS.register("malachite_shovel",
            () -> new ShovelItem(ModToolTiers.MALACHITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MALAIA_GARNET_SHOVEL = ITEMS.register("malaia_garnet_shovel",
            () -> new ShovelItem(ModToolTiers.MALAIA_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MALI_GARNET_SHOVEL = ITEMS.register("mali_garnet_shovel",
            () -> new ShovelItem(ModToolTiers.MALI_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MANDARIN_GARNET_SHOVEL = ITEMS.register("mandarin_garnet_shovel",
            () -> new ShovelItem(ModToolTiers.MANDARIN_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MANGANOTANTALITE_SHOVEL = ITEMS.register("manganotantalite_shovel",
            () -> new ShovelItem(ModToolTiers.MANGANOTANTALITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MARCASITE_SHOVEL = ITEMS.register("marcasite_shovel",
            () -> new ShovelItem(ModToolTiers.MARCASITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MELIPHANITE_SHOVEL = ITEMS.register("meliphanite_shovel",
            () -> new ShovelItem(ModToolTiers.MELIPHANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MELLITE_SHOVEL = ITEMS.register("mellite_shovel",
            () -> new ShovelItem(ModToolTiers.MELLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MICROCLINE_SHOVEL = ITEMS.register("microcline_shovel",
            () -> new ShovelItem(ModToolTiers.MICROCLINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MICROLITE_SHOVEL = ITEMS.register("microlite_shovel",
            () -> new ShovelItem(ModToolTiers.MICROLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MILARITE_SHOVEL = ITEMS.register("milarite_shovel",
            () -> new ShovelItem(ModToolTiers.MILARITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MILLERITE_SHOVEL = ITEMS.register("millerite_shovel",
            () -> new ShovelItem(ModToolTiers.MILLERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MIMETITE_SHOVEL = ITEMS.register("mimetite_shovel",
            () -> new ShovelItem(ModToolTiers.MIMETITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MOLDAVITE_SHOVEL = ITEMS.register("moldavite_shovel",
            () -> new ShovelItem(ModToolTiers.MOLDAVITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MONAZITE_SHOVEL = ITEMS.register("monazite_shovel",
            () -> new ShovelItem(ModToolTiers.MONAZITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MOONSTONE_SHOVEL = ITEMS.register("moonstone_shovel",
            () -> new ShovelItem(ModToolTiers.MOONSTONE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MORDENITE_SHOVEL = ITEMS.register("mordenite_shovel",
            () -> new ShovelItem(ModToolTiers.MORDENITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MORGANITE_SHOVEL = ITEMS.register("morganite_shovel",
            () -> new ShovelItem(ModToolTiers.MORGANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> NAMBULITE_SHOVEL = ITEMS.register("nambulite_shovel",
            () -> new ShovelItem(ModToolTiers.NAMBULITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> NATROLITE_SHOVEL = ITEMS.register("natrolite_shovel",
            () -> new ShovelItem(ModToolTiers.NATROLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> NATURAL_GLASS_SHOVEL = ITEMS.register("natural_glass_shovel",
            () -> new ShovelItem(ModToolTiers.NATURAL_GLASS, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> NEPHELINE_SHOVEL = ITEMS.register("nepheline_shovel",
            () -> new ShovelItem(ModToolTiers.NEPHELINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> NEPHRITE_SHOVEL = ITEMS.register("nephrite_shovel",
            () -> new ShovelItem(ModToolTiers.NEPHRITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> NEPTUNITE_SHOVEL = ITEMS.register("neptunite_shovel",
            () -> new ShovelItem(ModToolTiers.NEPTUNITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> NICCOLITE_SHOVEL = ITEMS.register("niccolite_shovel",
            () -> new ShovelItem(ModToolTiers.NICCOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> OBSIDIAN_SHOVEL = ITEMS.register("obsidian_shovel",
            () -> new ShovelItem(ModToolTiers.OBSIDIAN, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> OLIGOCLASE_SHOVEL = ITEMS.register("oligoclase_shovel",
            () -> new ShovelItem(ModToolTiers.OLIGOCLASE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ONYX_SHOVEL = ITEMS.register("onyx_shovel",
            () -> new ShovelItem(ModToolTiers.ONYX, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> OPAL_STONE_SHOVEL = ITEMS.register("opal_stone_shovel",
            () -> new ShovelItem(ModToolTiers.OPAL_STONE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ORANGE_DIAMOND_SHOVEL = ITEMS.register("orange_diamond_shovel",
            () -> new ShovelItem(ModToolTiers.ORANGE_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> OREGON_SUNSTONE_SHOVEL = ITEMS.register("oregon_sunstone_shovel",
            () -> new ShovelItem(ModToolTiers.OREGON_SUNSTONE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ORTHOCLASE_SHOVEL = ITEMS.register("orthoclase_shovel",
            () -> new ShovelItem(ModToolTiers.ORTHOCLASE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PADPARADSCHA_SAPPHIRE_SHOVEL = ITEMS.register("padparadscha_sapphire_shovel",
            () -> new ShovelItem(ModToolTiers.PADPARADSCHA_SAPPHIRE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PAINITE_SHOVEL = ITEMS.register("painite_shovel",
            () -> new ShovelItem(ModToolTiers.PAINITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PALYGORSKITE_SHOVEL = ITEMS.register("palygorskite_shovel",
            () -> new ShovelItem(ModToolTiers.PALYGORSKITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PAPAGOITE_SHOVEL = ITEMS.register("papagoite_shovel",
            () -> new ShovelItem(ModToolTiers.PAPAGOITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PARAIBA_TOURMALINE_SHOVEL = ITEMS.register("paraiba_tourmaline_shovel",
            () -> new ShovelItem(ModToolTiers.PARAIBA_TOURMALINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PARGASITE_SHOVEL = ITEMS.register("pargasite_shovel",
            () -> new ShovelItem(ModToolTiers.PARGASITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PARISITE_SHOVEL = ITEMS.register("parisite_shovel",
            () -> new ShovelItem(ModToolTiers.PARISITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PEARL_SHOVEL = ITEMS.register("pearl_shovel",
            () -> new ShovelItem(ModToolTiers.PEARL, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PECTOLITE_SHOVEL = ITEMS.register("pectolite_shovel",
            () -> new ShovelItem(ModToolTiers.PECTOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PENTLANDITE_SHOVEL = ITEMS.register("pentlandite_shovel",
            () -> new ShovelItem(ModToolTiers.PENTLANDITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PERICLASE_SHOVEL = ITEMS.register("periclase_shovel",
            () -> new ShovelItem(ModToolTiers.PERICLASE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PERIDOT_SHOVEL = ITEMS.register("peridot_shovel",
            () -> new ShovelItem(ModToolTiers.PERIDOT, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PERISTERITE_SHOVEL = ITEMS.register("peristerite_shovel",
            () -> new ShovelItem(ModToolTiers.PERISTERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PERTHITE_SHOVEL = ITEMS.register("perthite_shovel",
            () -> new ShovelItem(ModToolTiers.PERTHITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PETALITE_SHOVEL = ITEMS.register("petalite_shovel",
            () -> new ShovelItem(ModToolTiers.PETALITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PHENAKITE_SHOVEL = ITEMS.register("phenakite_shovel",
            () -> new ShovelItem(ModToolTiers.PHENAKITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PHOSGENITE_SHOVEL = ITEMS.register("phosgenite_shovel",
            () -> new ShovelItem(ModToolTiers.PHOSGENITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PHOSPHOPHYLLITE_SHOVEL = ITEMS.register("phosphophyllite_shovel",
            () -> new ShovelItem(ModToolTiers.PHOSPHOPHYLLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PINK_DIAMOND_SHOVEL = ITEMS.register("pink_diamond_shovel",
            () -> new ShovelItem(ModToolTiers.PINK_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> POLLUCITE_SHOVEL = ITEMS.register("pollucite_shovel",
            () -> new ShovelItem(ModToolTiers.POLLUCITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> POWELLITE_SHOVEL = ITEMS.register("powellite_shovel",
            () -> new ShovelItem(ModToolTiers.POWELLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PREHNITE_SHOVEL = ITEMS.register("prehnite_shovel",
            () -> new ShovelItem(ModToolTiers.PREHNITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PROSOPITE_SHOVEL = ITEMS.register("prosopite_shovel",
            () -> new ShovelItem(ModToolTiers.PROSOPITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PROTEUS_SHOVEL = ITEMS.register("proteus_shovel",
            () -> new ShovelItem(ModToolTiers.PROTEUS, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PROUSTITE_SHOVEL = ITEMS.register("proustite_shovel",
            () -> new ShovelItem(ModToolTiers.PROUSTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PUMPELLYITE_SHOVEL = ITEMS.register("pumpellyite_shovel",
            () -> new ShovelItem(ModToolTiers.PUMPELLYITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PURPLE_DIAMOND_SHOVEL = ITEMS.register("purple_diamond_shovel",
            () -> new ShovelItem(ModToolTiers.PURPLE_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PURPURITE_SHOVEL = ITEMS.register("purpurite_shovel",
            () -> new ShovelItem(ModToolTiers.PURPURITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PYRARGYRITE_SHOVEL = ITEMS.register("pyrargyrite_shovel",
            () -> new ShovelItem(ModToolTiers.PYRARGYRITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PYRITE_SHOVEL = ITEMS.register("pyrite_shovel",
            () -> new ShovelItem(ModToolTiers.PYRITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PYROPE_GARNET_SHOVEL = ITEMS.register("pyrope_garnet_shovel",
            () -> new ShovelItem(ModToolTiers.PYROPE_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PYROPHYLLITE_SHOVEL = ITEMS.register("pyrophyllite_shovel",
            () -> new ShovelItem(ModToolTiers.PYROPHYLLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PYROXMANGITE_SHOVEL = ITEMS.register("pyroxmangite_shovel",
            () -> new ShovelItem(ModToolTiers.PYROXMANGITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PYRRHOTITE_SHOVEL = ITEMS.register("pyrrhotite_shovel",
            () -> new ShovelItem(ModToolTiers.PYRRHOTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> QUARTZ_SHOVEL = ITEMS.register("quartz_shovel",
            () -> new ShovelItem(ModToolTiers.QUARTZ, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> QUARTZITE_SHOVEL = ITEMS.register("quartzite_shovel",
            () -> new ShovelItem(ModToolTiers.QUARTZITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> REALGAR_SHOVEL = ITEMS.register("realgar_shovel",
            () -> new ShovelItem(ModToolTiers.REALGAR, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> RED_BERYL_SHOVEL = ITEMS.register("red_beryl_shovel",
            () -> new ShovelItem(ModToolTiers.RED_BERYL, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> RED_DIAMOND_SHOVEL = ITEMS.register("red_diamond_shovel",
            () -> new ShovelItem(ModToolTiers.RED_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> RHODIZITE_SHOVEL = ITEMS.register("rhodizite_shovel",
            () -> new ShovelItem(ModToolTiers.RHODIZITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> RHODOCHROSITE_SHOVEL = ITEMS.register("rhodochrosite_shovel",
            () -> new ShovelItem(ModToolTiers.RHODOCHROSITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> RHODOLITE_GARNET_SHOVEL = ITEMS.register("rhodolite_garnet_shovel",
            () -> new ShovelItem(ModToolTiers.RHODOLITE_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> RHODONITE_SHOVEL = ITEMS.register("rhodonite_shovel",
            () -> new ShovelItem(ModToolTiers.RHODONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ROSE_QUARTZ_SHOVEL = ITEMS.register("rose_quartz_shovel",
            () -> new ShovelItem(ModToolTiers.ROSE_QUARTZ, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> RUBELLITE_SHOVEL = ITEMS.register("rubellite_shovel",
            () -> new ShovelItem(ModToolTiers.RUBELLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel",
            () -> new ShovelItem(ModToolTiers.RUBY, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> RUTILE_SHOVEL = ITEMS.register("rutile_shovel",
            () -> new ShovelItem(ModToolTiers.RUTILE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SALTWATER_PEARL_SHOVEL = ITEMS.register("saltwater_pearl_shovel",
            () -> new ShovelItem(ModToolTiers.SALTWATER_PEARL, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SAMARSKITE_SHOVEL = ITEMS.register("samarskite_shovel",
            () -> new ShovelItem(ModToolTiers.SAMARSKITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SANIDINE_SHOVEL = ITEMS.register("sanidine_shovel",
            () -> new ShovelItem(ModToolTiers.SANIDINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel",
            () -> new ShovelItem(ModToolTiers.SAPPHIRE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SAPPHIRINE_SHOVEL = ITEMS.register("sapphirine_shovel",
            () -> new ShovelItem(ModToolTiers.SAPPHIRINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SARCOLITE_SHOVEL = ITEMS.register("sarcolite_shovel",
            () -> new ShovelItem(ModToolTiers.SARCOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SCAPOLITE_SHOVEL = ITEMS.register("scapolite_shovel",
            () -> new ShovelItem(ModToolTiers.SCAPOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SCHEELITE_SHOVEL = ITEMS.register("scheelite_shovel",
            () -> new ShovelItem(ModToolTiers.SCHEELITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SCORODITE_SHOVEL = ITEMS.register("scorodite_shovel",
            () -> new ShovelItem(ModToolTiers.SCORODITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SELLAITE_SHOVEL = ITEMS.register("sellaite_shovel",
            () -> new ShovelItem(ModToolTiers.SELLAITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SENARMONTITE_SHOVEL = ITEMS.register("senarmontite_shovel",
            () -> new ShovelItem(ModToolTiers.SENARMONTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SERANDITE_SHOVEL = ITEMS.register("serandite_shovel",
            () -> new ShovelItem(ModToolTiers.SERANDITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SERPENTINE_SHOVEL = ITEMS.register("serpentine_shovel",
            () -> new ShovelItem(ModToolTiers.SERPENTINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SHATTUCKITE_SHOVEL = ITEMS.register("shattuckite_shovel",
            () -> new ShovelItem(ModToolTiers.SHATTUCKITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SHORTITE_SHOVEL = ITEMS.register("shortite_shovel",
            () -> new ShovelItem(ModToolTiers.SHORTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SIDERITE_SHOVEL = ITEMS.register("siderite_shovel",
            () -> new ShovelItem(ModToolTiers.SIDERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SILLIMANITE_SHOVEL = ITEMS.register("sillimanite_shovel",
            () -> new ShovelItem(ModToolTiers.SILLIMANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SIMPSONITE_SHOVEL = ITEMS.register("simpsonite_shovel",
            () -> new ShovelItem(ModToolTiers.SIMPSONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SINHALITE_SHOVEL = ITEMS.register("sinhalite_shovel",
            () -> new ShovelItem(ModToolTiers.SINHALITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SMALTITE_SHOVEL = ITEMS.register("smaltite_shovel",
            () -> new ShovelItem(ModToolTiers.SMALTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SMITHSONITE_SHOVEL = ITEMS.register("smithsonite_shovel",
            () -> new ShovelItem(ModToolTiers.SMITHSONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SMOKY_QUARTZ_SHOVEL = ITEMS.register("smoky_quartz_shovel",
            () -> new ShovelItem(ModToolTiers.SMOKY_QUARTZ, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SODALITE_SHOVEL = ITEMS.register("sodalite_shovel",
            () -> new ShovelItem(ModToolTiers.SODALITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SOGDIANITE_SHOVEL = ITEMS.register("sogdianite_shovel",
            () -> new ShovelItem(ModToolTiers.SOGDIANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SPESSARTITE_GARNET_SHOVEL = ITEMS.register("spessartite_garnet_shovel",
            () -> new ShovelItem(ModToolTiers.SPESSARTITE_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SPHALERITE_SHOVEL = ITEMS.register("sphalerite_shovel",
            () -> new ShovelItem(ModToolTiers.SPHALERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SPHENE_SHOVEL = ITEMS.register("sphene_shovel",
            () -> new ShovelItem(ModToolTiers.SPHENE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SPINEL_SHOVEL = ITEMS.register("spinel_shovel",
            () -> new ShovelItem(ModToolTiers.SPINEL, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SPODUMENE_SHOVEL = ITEMS.register("spodumene_shovel",
            () -> new ShovelItem(ModToolTiers.SPODUMENE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SPURRITE_SHOVEL = ITEMS.register("spurrite_shovel",
            () -> new ShovelItem(ModToolTiers.SPURRITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> STAR_SAPPHIRE_SHOVEL = ITEMS.register("star_sapphire_shovel",
            () -> new ShovelItem(ModToolTiers.STAR_SAPPHIRE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> STAUROLITE_SHOVEL = ITEMS.register("staurolite_shovel",
            () -> new ShovelItem(ModToolTiers.STAUROLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> STICHTITE_SHOVEL = ITEMS.register("stichtite_shovel",
            () -> new ShovelItem(ModToolTiers.STICHTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> STOLZITE_SHOVEL = ITEMS.register("stolzite_shovel",
            () -> new ShovelItem(ModToolTiers.STOLZITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> STRONTIANITE_SHOVEL = ITEMS.register("strontianite_shovel",
            () -> new ShovelItem(ModToolTiers.STRONTIANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SUGILITE_SHOVEL = ITEMS.register("sugilite_shovel",
            () -> new ShovelItem(ModToolTiers.SUGILITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SULFUR_SHOVEL = ITEMS.register("sulfur_shovel",
            () -> new ShovelItem(ModToolTiers.SULFUR, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SUNSTONE_SHOVEL = ITEMS.register("sunstone_shovel",
            () -> new ShovelItem(ModToolTiers.SUNSTONE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TAAFFEITE_SHOVEL = ITEMS.register("taaffeite_shovel",
            () -> new ShovelItem(ModToolTiers.TAAFFEITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TALC_SHOVEL = ITEMS.register("talc_shovel",
            () -> new ShovelItem(ModToolTiers.TALC, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TANTALITE_SHOVEL = ITEMS.register("tantalite_shovel",
            () -> new ShovelItem(ModToolTiers.TANTALITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TANZANITE_SHOVEL = ITEMS.register("tanzanite_shovel",
            () -> new ShovelItem(ModToolTiers.TANZANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TEKTITE_SHOVEL = ITEMS.register("tektite_shovel",
            () -> new ShovelItem(ModToolTiers.TEKTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TEPHROITE_SHOVEL = ITEMS.register("tephroite_shovel",
            () -> new ShovelItem(ModToolTiers.TEPHROITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> THAUMASITE_SHOVEL = ITEMS.register("thaumasite_shovel",
            () -> new ShovelItem(ModToolTiers.THAUMASITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> THOMSONITE_SHOVEL = ITEMS.register("thomsonite_shovel",
            () -> new ShovelItem(ModToolTiers.THOMSONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TIGERS_EYE_SHOVEL = ITEMS.register("tigers_eye_shovel",
            () -> new ShovelItem(ModToolTiers.TIGERS_EYE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TOPAZ_SHOVEL = ITEMS.register("topaz_shovel",
            () -> new ShovelItem(ModToolTiers.TOPAZ, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TOURMALINE_SHOVEL = ITEMS.register("tourmaline_shovel",
            () -> new ShovelItem(ModToolTiers.TOURMALINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TREMOLITE_SHOVEL = ITEMS.register("tremolite_shovel",
            () -> new ShovelItem(ModToolTiers.TREMOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TRIPHYLITE_SHOVEL = ITEMS.register("triphylite_shovel",
            () -> new ShovelItem(ModToolTiers.TRIPHYLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TSAVORITE_GARNET_SHOVEL = ITEMS.register("tsavorite_garnet_shovel",
            () -> new ShovelItem(ModToolTiers.TSAVORITE_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TUGTUPITE_SHOVEL = ITEMS.register("tugtupite_shovel",
            () -> new ShovelItem(ModToolTiers.TUGTUPITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TURQUOISE_SHOVEL = ITEMS.register("turquoise_shovel",
            () -> new ShovelItem(ModToolTiers.TURQUOISE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ULEXITE_SHOVEL = ITEMS.register("ulexite_shovel",
            () -> new ShovelItem(ModToolTiers.ULEXITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> UVAROVITE_GARNET_SHOVEL = ITEMS.register("uvarovite_garnet_shovel",
            () -> new ShovelItem(ModToolTiers.UVAROVITE_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> VANADINITE_SHOVEL = ITEMS.register("vanadinite_shovel",
            () -> new ShovelItem(ModToolTiers.VANADINITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> VARISCITE_SHOVEL = ITEMS.register("variscite_shovel",
            () -> new ShovelItem(ModToolTiers.VARISCITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> VILLIAUMITE_SHOVEL = ITEMS.register("villiaumite_shovel",
            () -> new ShovelItem(ModToolTiers.VILLIAUMITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> VIVIANITE_SHOVEL = ITEMS.register("vivianite_shovel",
            () -> new ShovelItem(ModToolTiers.VIVIANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> VAYRYNENITE_SHOVEL = ITEMS.register("vayrynenite_shovel",
            () -> new ShovelItem(ModToolTiers.VAYRYNENITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> WARDITE_SHOVEL = ITEMS.register("wardite_shovel",
            () -> new ShovelItem(ModToolTiers.WARDITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> WAVELLITE_SHOVEL = ITEMS.register("wavellite_shovel",
            () -> new ShovelItem(ModToolTiers.WAVELLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> WELOGANITE_SHOVEL = ITEMS.register("weloganite_shovel",
            () -> new ShovelItem(ModToolTiers.WELOGANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> WHEWELLITE_SHOVEL = ITEMS.register("whewellite_shovel",
            () -> new ShovelItem(ModToolTiers.WHEWELLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> WILKEITE_SHOVEL = ITEMS.register("wilkeite_shovel",
            () -> new ShovelItem(ModToolTiers.WILKEITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> WILLEMITE_SHOVEL = ITEMS.register("willemite_shovel",
            () -> new ShovelItem(ModToolTiers.WILLEMITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> WITHERITE_SHOVEL = ITEMS.register("witherite_shovel",
            () -> new ShovelItem(ModToolTiers.WITHERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> WOLLASTONITE_SHOVEL = ITEMS.register("wollastonite_shovel",
            () -> new ShovelItem(ModToolTiers.WOLLASTONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> WULFENITE_SHOVEL = ITEMS.register("wulfenite_shovel",
            () -> new ShovelItem(ModToolTiers.WULFENITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> XONOTLITE = ITEMS.register("xonotlite_shovel",
            () -> new ShovelItem(ModToolTiers.XONOTLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> YELLOW_DIAMOND = ITEMS.register("yellow_diamond_shovel",
            () -> new ShovelItem(ModToolTiers.YELLOW_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> YUGAWARALITE = ITEMS.register("yugawaralite_shovel",
            () -> new ShovelItem(ModToolTiers.YUGAWARALITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ZEKTZERITE = ITEMS.register("zektzerite_shovel",
            () -> new ShovelItem(ModToolTiers.ZEKTZERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ZINCITE = ITEMS.register("zincite_shovel",
            () -> new ShovelItem(ModToolTiers.ZINCITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ZIRCON = ITEMS.register("zircon_shovel",
            () -> new ShovelItem(ModToolTiers.ZIRCON, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ZUNYITE = ITEMS.register("zunyite_shovel",
            () -> new ShovelItem(ModToolTiers.ZUNYITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
