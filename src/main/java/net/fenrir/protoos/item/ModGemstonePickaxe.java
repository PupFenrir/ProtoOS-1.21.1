package net.fenrir.protoos.item;

import net.fenrir.protoos.ProtoOS;
import net.fenrir.protoos.item.custom.ModToolTiers;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.component.Unbreakable;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModGemstonePickaxe
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ProtoOS.MOD_ID);

    public static final RegistryObject<Item> ACTINOLITE_PICKAXE = ITEMS.register("actinolite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ACTINOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ADAMITE_PICKAXE = ITEMS.register("adamite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ADAMITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AGATE_PICKAXE = ITEMS.register("agate_pickaxe",
            () -> new PickaxeItem(ModToolTiers.AGATE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ALBITE_PICKAXE = ITEMS.register("albite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ALBITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ALEXANDRITE_PICKAXE = ITEMS.register("alexandrite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ALEXANDRITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ALGODONITE_PICKAXE = ITEMS.register("algodonite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ALGODONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ALMANDINE_GARNET_PICKAXE = ITEMS.register("almandine_garnet_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ALMANDINE_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AMAZONITE_PICKAXE = ITEMS.register("amazonite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.AMAZONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AMBER_PICKAXE = ITEMS.register("amber_pickaxe",
            () -> new PickaxeItem(ModToolTiers.AMBER, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AMBLYGONITE_PICKAXE = ITEMS.register("amblygonite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.AMBLYGONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AMETHYST_PICKAXE = ITEMS.register("amethyst_pickaxe",
            () -> new PickaxeItem(ModToolTiers.AMETHYST, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AMETRINE_PICKAXE = ITEMS.register("ametrine_pickaxe",
            () -> new PickaxeItem(ModToolTiers.AMETRINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AMMOLITE_PICKAXE = ITEMS.register("ammolite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.AMMOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ANALCIME_PICKAXE = ITEMS.register("analcime_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ANALCIME, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ANATASE_PICKAXE = ITEMS.register("anatase_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ANATASE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ANDALUSITE_PICKAXE = ITEMS.register("andalusite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ANDALUSITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ANDESINE_PICKAXE = ITEMS.register("andesine_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ANDESINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ANDRADITE_PICKAXE = ITEMS.register("andradite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ANDRADITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ANGLESITE_PICKAXE = ITEMS.register("anglesite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ANGLESITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ANHYDRITE_PICKAXE = ITEMS.register("anhydrite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ANHYDRITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ANORTHITE_PICKAXE = ITEMS.register("anorthite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ANORTHITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> APATITE_PICKAXE = ITEMS.register("apatite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.APATITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> APOPHYLLITE_PICKAXE = ITEMS.register("apophyllite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.APOPHYLLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AQUAMARINE_PICKAXE = ITEMS.register("aquamarine_pickaxe",
            () -> new PickaxeItem(ModToolTiers.AQUAMARINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ARAGONITE_PICKAXE = ITEMS.register("aragonite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ARAGONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ARTISANAL_GLASS_PICKAXE = ITEMS.register("artisanal_glass_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ARTISANAL_GLASS, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AUGELITE_PICKAXE = ITEMS.register("augelite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.AUGELITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AXINITE_PICKAXE = ITEMS.register("axinite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.AXINITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> AZURITE_PICKAXE = ITEMS.register("azurite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.AZURITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BARITE_PICKAXE = ITEMS.register("barite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.BARITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BAYLDONITE_PICKAXE = ITEMS.register("bayldonite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.BAYLDONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BENITOITE_PICKAXE = ITEMS.register("benitoite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.BENITOITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BERYL_PICKAXE = ITEMS.register("beryl_pickaxe",
            () -> new PickaxeItem(ModToolTiers.BERYL, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BERYLLONITE_PICKAXE = ITEMS.register("beryllonite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.BERYLLONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BISMUTOTANTALITE_PICKAXE = ITEMS.register("bismutotantalite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.BISMUTOTANTALITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BLACK_DIAMOND_PICKAXE = ITEMS.register("black_diamond_pickaxe",
            () -> new PickaxeItem(ModToolTiers.BLACK_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BLOODSTONE_PICKAXE = ITEMS.register("bloodstone_pickaxe",
            () -> new PickaxeItem(ModToolTiers.BLOODSTONE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BLUE_DIAMOND_PICKAXE = ITEMS.register("blue_diamond_pickaxe",
            () -> new PickaxeItem(ModToolTiers.BLUE_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BOLEITE_PICKAXE = ITEMS.register("boleite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.BOLEITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BORACITE_PICKAXE = ITEMS.register("boracite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.BORACITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BORNITE_PICKAXE = ITEMS.register("bornite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.BORNITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BRAZILIANITE_PICKAXE = ITEMS.register("brazilianite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.BRAZILIANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BREITHAUPTITE_PICKAXE = ITEMS.register("breithauptite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.BREITHAUPTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BROOKITE_PICKAXE = ITEMS.register("brookite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.BROOKITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BROWN_DIAMOND_PICKAXE = ITEMS.register("brown_diamond_pickaxe",
            () -> new PickaxeItem(ModToolTiers.BROWN_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BRUCITE_PICKAXE = ITEMS.register("brucite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.BRUCITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BUSTAMITE_PICKAXE = ITEMS.register("bustamite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.BUSTAMITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> BYTOWNITE_PICKAXE = ITEMS.register("bytownite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.BYTOWNITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CALCAREOUS_CONCRETIONS_PICKAXE = ITEMS.register("calcareous_concretions_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CALCAREOUS_CONCRETIONS, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CALCITE_PICKAXE = ITEMS.register("calcite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CALCITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CANASITE_PICKAXE = ITEMS.register("canasite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CANASITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CANCRINITE_PICKAXE = ITEMS.register("cancrinite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CANCRINITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CARNELIAN_PICKAXE = ITEMS.register("carnelian_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CARNELIAN, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CASSITERITE_PICKAXE = ITEMS.register("cassiterite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CASSITERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CATAPLEIITE_PICKAXE = ITEMS.register("catapleiite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CATAPLEIITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CELESTITE_PICKAXE = ITEMS.register("celestite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CELESTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CERULEITE_PICKAXE = ITEMS.register("ceruleite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CERULEITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CERUSSITE_PICKAXE = ITEMS.register("cerussite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CERUSSITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHABAZITE_PICKAXE = ITEMS.register("chabazite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CHABAZITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHALCEDONY_PICKAXE = ITEMS.register("chalcedony_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CHALCEDONY, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHAMBERSITE_PICKAXE = ITEMS.register("chambersite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CHAMBERSITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHAMAELEON_DIAMOND_PICKAXE = ITEMS.register("chamaeleon_diamond_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CHAMAELEON_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHAROITE_PICKAXE = ITEMS.register("charoite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CHAROITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHICKEN_BLOOD_STONE_PICKAXE = ITEMS.register("chicken_blood_stone_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CHICKEN_BLOOD_STONE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHILDRENITE_PICKAXE = ITEMS.register("childrenite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CHILDRENITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHIOLITE_PICKAXE = ITEMS.register("chiolite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CHIOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHROMITE_PICKAXE = ITEMS.register("chromite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CHROMITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHRYSOBERYL_PICKAXE = ITEMS.register("chrysoberyl_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CHRYSOBERYL, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHRYSOCOLLA_PICKAXE = ITEMS.register("chrysocolla_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CHRYSOCOLLA, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHRYSOCOLLA_CHALCEDONY_PICKAXE = ITEMS.register("chrysocolla_chalcedony_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CHRYSOCOLLA_CHALCEDONY, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CHRYSOPRASE_PICKAXE = ITEMS.register("chrysoprase_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CHRYSOPRASE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CINNABAR_PICKAXE = ITEMS.register("cinnabar_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CINNABAR, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CITRINE_PICKAXE = ITEMS.register("citrine_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CITRINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CLINOCHLORE_PICKAXE = ITEMS.register("clinochlore_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CLINOCHLORE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> COBALTITE_PICKAXE = ITEMS.register("cobaltite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.COBALTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> COLEMANITE_PICKAXE = ITEMS.register("colemanite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.COLEMANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> COLOR_CHANGE_GARNET_PICKAXE = ITEMS.register("color_change_garnet_pickaxe",
            () -> new PickaxeItem(ModToolTiers.COLOR_CHANGE_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> COLOR_CHANGE_SAPPHIRE_PICKAXE = ITEMS.register("color_change_sapphire_pickaxe",
            () -> new PickaxeItem(ModToolTiers.COLOR_CHANGE_SAPPHIRE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CORAL_PICKAXE = ITEMS.register("coral_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CORAL, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CORDIERITE_PICKAXE = ITEMS.register("cordierite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CORDIERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CORUNDUM_PICKAXE = ITEMS.register("corundum_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CORUNDUM, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> COVELLITE_PICKAXE = ITEMS.register("covellite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.COVELLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CREEDITE_PICKAXE = ITEMS.register("creedite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CREEDITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CROCOITE_PICKAXE = ITEMS.register("crocoite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CROCOITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CRYOLITE_PICKAXE = ITEMS.register("cryolite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CRYOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> CUPRITE_PICKAXE = ITEMS.register("cuprite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CUPRITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> DANBURITE_PICKAXE = ITEMS.register("danburite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.DANBURITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> DATOLITE_PICKAXE = ITEMS.register("datolite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.DATOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> DEMANTOID_GARNET_PICKAXE = ITEMS.register("demantoid_garnet_pickaxe",
            () -> new PickaxeItem(ModToolTiers.DEMANTOID_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> DIAMOND_PICKAXE = ITEMS.register("diamond_pickaxe",
            () -> new PickaxeItem(ModToolTiers.DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> DIASPORE_PICKAXE = ITEMS.register("diaspore_pickaxe",
            () -> new PickaxeItem(ModToolTiers.DIASPORE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> DICKINSONITE_PICKAXE = ITEMS.register("dickinsonite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.DICKINSONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> DIOPSIDE_PICKAXE = ITEMS.register("diopside_pickaxe",
            () -> new PickaxeItem(ModToolTiers.DIOPSIDE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> DIOPTASE_PICKAXE = ITEMS.register("dioptase_pickaxe",
            () -> new PickaxeItem(ModToolTiers.DIOPTASE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> DOLOMITE_PICKAXE = ITEMS.register("dolomite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.DOLOMITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> DUMORTIERITE_PICKAXE = ITEMS.register("dumortierite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.DUMORTIERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> EKANITE_PICKAXE = ITEMS.register("ekanite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.EKANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe",
            () -> new PickaxeItem(ModToolTiers.EMERALD, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ENSTATITE_PICKAXE = ITEMS.register("enstatite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ENSTATITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> EOSPHORITE_PICKAXE = ITEMS.register("eosphorite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.EOSPHORITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> EPIDOTE_PICKAXE = ITEMS.register("epidote_pickaxe",
            () -> new PickaxeItem(ModToolTiers.EPIDOTE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ETTRINGITE_PICKAXE = ITEMS.register("ettringite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ETTRINGITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> EUCLASE_PICKAXE = ITEMS.register("euclase_pickaxe",
            () -> new PickaxeItem(ModToolTiers.EUCLASE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> EUDIALYTE_PICKAXE = ITEMS.register("eudialyte_pickaxe",
            () -> new PickaxeItem(ModToolTiers.EUDIALYTE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> EUXENITE_PICKAXE = ITEMS.register("euxenite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.EUXENITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> FELDSPAR_PICKAXE = ITEMS.register("feldspar_pickaxe",
            () -> new PickaxeItem(ModToolTiers.FELDSPAR, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> FERGUSONITE_PICKAXE = ITEMS.register("fergusonite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.FERGUSONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> FLUORITE_PICKAXE = ITEMS.register("fluorite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.FLUORITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> FRESHWATER_PEARL_PICKAXE = ITEMS.register("freshwater_pearl_pickaxe",
            () -> new PickaxeItem(ModToolTiers.FRESHWATER_PEARL, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> FRIEDELITE_PICKAXE = ITEMS.register("friedelite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.FRIEDELITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> GADOLINITE_PICKAXE = ITEMS.register("gadolinite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.GADOLINITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> GAHNOSPINEL_PICKAXE = ITEMS.register("gahnospinel_pickaxe",
            () -> new PickaxeItem(ModToolTiers.GAHNOSPINEL, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> GARNET_PICKAXE = ITEMS.register("garnet_pickaxe",
            () -> new PickaxeItem(ModToolTiers.GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> GRANDIDIERITE_PICKAXE = ITEMS.register("grandidierite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.GRANDIDIERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> GRAY_DIAMOND_PICKAXE = ITEMS.register("gray_diamond_pickaxe",
            () -> new PickaxeItem(ModToolTiers.GRAY_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> GREEN_DIAMOND_PICKAXE = ITEMS.register("green_diamond_pickaxe",
            () -> new PickaxeItem(ModToolTiers.GREEN_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> GROSSULAR_GARNET_PICKAXE = ITEMS.register("grossular_garnet_pickaxe",
            () -> new PickaxeItem(ModToolTiers.GROSSULAR_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> GYPSUM_PICKAXE = ITEMS.register("gypsum_pickaxe",
            () -> new PickaxeItem(ModToolTiers.GYPSUM, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HAMBERGITE_PICKAXE = ITEMS.register("hambergite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.HAMBERGITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HUAYNE_PICKAXE = ITEMS.register("huayne_pickaxe",
            () -> new PickaxeItem(ModToolTiers.HUAYNE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HELIODOR_PICKAXE = ITEMS.register("heliodor_pickaxe",
            () -> new PickaxeItem(ModToolTiers.HELIODOR, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HEMATITE_PICKAXE = ITEMS.register("hematite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.HEMATITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HEMIMORPHITE_PICKAXE = ITEMS.register("hemimorphite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.HEMIMORPHITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HERDERITE_PICKAXE = ITEMS.register("herderite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.HERDERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HESSONITE_PICKAXE = ITEMS.register("hessonite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.HESSONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HODGKINSONITE_PICKAXE = ITEMS.register("hodgkinsonite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.HODGKINSONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HOLTITE_PICKAXE = ITEMS.register("holtite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.HOLTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HOWLITE_PICKAXE = ITEMS.register("howlite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.HOWLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HUEBNERITE_PICKAXE = ITEMS.register("huebnerite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.HUEBNERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HUMITE_PICKAXE = ITEMS.register("humite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.HUMITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HUREAULITE_PICKAXE = ITEMS.register("hureaulite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.HUREAULITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HURLBUTITE_PICKAXE = ITEMS.register("hurlbutite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.HURLBUTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HYDROGROSSULAR_GARNET_PICKAXE = ITEMS.register("hydrogrossular_garnet_pickaxe",
            () -> new PickaxeItem(ModToolTiers.HYDROGROSSULAR_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> HYPERITDIABAS_PICKAXE = ITEMS.register("hyperitdiabas_pickaxe",
            () -> new PickaxeItem(ModToolTiers.HYPERITDIABAS, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> IDOCRASE_PICKAXE = ITEMS.register("idocrase_pickaxe",
            () -> new PickaxeItem(ModToolTiers.IDOCRASE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> INDERITE_PICKAXE = ITEMS.register("inderite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.INDERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> IOLITE_PICKAXE = ITEMS.register("iolite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.IOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> JADEITE_PICKAXE = ITEMS.register("jadeite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.JADEITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> JASPER_PICKAXE = ITEMS.register("jasper_pickaxe",
            () -> new PickaxeItem(ModToolTiers.JASPER, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> JEREMEJEVITE_PICKAXE = ITEMS.register("jeremejevite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.JEREMEJEVITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> JET_PICKAXE = ITEMS.register("jet_pickaxe",
            () -> new PickaxeItem(ModToolTiers.JET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> KORNERUPINE_PICKAXE = ITEMS.register("kornerupine_pickaxe",
            () -> new PickaxeItem(ModToolTiers.KORNERUPINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> KURNAKOVITE_PICKAXE = ITEMS.register("kurnakovite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.KURNAKOVITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> KYANITE_PICKAXE = ITEMS.register("kyanite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.KYANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> KAMMEREREITE_PICKAXE = ITEMS.register("kammererite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.KAMMEREREITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LABRADORITE_PICKAXE = ITEMS.register("labradorite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.LABRADORITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LANGBEINITE_PICKAXE = ITEMS.register("langbeinite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.LANGBEINITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LAPIS_LAZULI_PICKAXE = ITEMS.register("lapis_lazuli_pickaxe",
            () -> new PickaxeItem(ModToolTiers.LAPIS_LAZULI, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LASERBLUE_PICKAXE = ITEMS.register("laserblue_pickaxe",
            () -> new PickaxeItem(ModToolTiers.LASERBLUE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LAWSONITE_PICKAXE = ITEMS.register("lawsonite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.LAWSONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LAZULITE_PICKAXE = ITEMS.register("lazulite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.LAZULITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LEGRANDITE_PICKAXE = ITEMS.register("legrandite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.LEGRANDITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LEPIDOLITE_PICKAXE = ITEMS.register("lepidolite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.LEPIDOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LEUCITE_PICKAXE = ITEMS.register("leucite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.LEUCITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LINARITE_PICKAXE = ITEMS.register("linarite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.LINARITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> LUDLAMITE_PICKAXE = ITEMS.register("ludlamite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.LUDLAMITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MAGNESITE_PICKAXE = ITEMS.register("magnesite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.MAGNESITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MALACHITE_PICKAXE = ITEMS.register("malachite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.MALACHITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MALAIA_GARNET_PICKAXE = ITEMS.register("malaia_garnet_pickaxe",
            () -> new PickaxeItem(ModToolTiers.MALAIA_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MALI_GARNET_PICKAXE = ITEMS.register("mali_garnet_pickaxe",
            () -> new PickaxeItem(ModToolTiers.MALI_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MANDARIN_GARNET_PICKAXE = ITEMS.register("mandarin_garnet_pickaxe",
            () -> new PickaxeItem(ModToolTiers.MANDARIN_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MANGANOTANTALITE_PICKAXE = ITEMS.register("manganotantalite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.MANGANOTANTALITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MARCASITE_PICKAXE = ITEMS.register("marcasite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.MARCASITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MELIPHANITE_PICKAXE = ITEMS.register("meliphanite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.MELIPHANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MELLITE_PICKAXE = ITEMS.register("mellite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.MELLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MICROCLINE_PICKAXE = ITEMS.register("microcline_pickaxe",
            () -> new PickaxeItem(ModToolTiers.MICROCLINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MICROLITE_PICKAXE = ITEMS.register("microlite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.MICROLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MILARITE_PICKAXE = ITEMS.register("milarite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.MILARITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MILLERITE_PICKAXE = ITEMS.register("millerite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.MILLERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MIMETITE_PICKAXE = ITEMS.register("mimetite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.MIMETITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MOLDAVITE_PICKAXE = ITEMS.register("moldavite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.MOLDAVITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MONAZITE_PICKAXE = ITEMS.register("monazite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.MONAZITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MOONSTONE_PICKAXE = ITEMS.register("moonstone_pickaxe",
            () -> new PickaxeItem(ModToolTiers.MOONSTONE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MORDENITE_PICKAXE = ITEMS.register("mordenite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.MORDENITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> MORGANITE_PICKAXE = ITEMS.register("morganite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.MORGANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> NAMBULITE_PICKAXE = ITEMS.register("nambulite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.NAMBULITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> NATROLITE_PICKAXE = ITEMS.register("natrolite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.NATROLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> NATURAL_GLASS_PICKAXE = ITEMS.register("natural_glass_pickaxe",
            () -> new PickaxeItem(ModToolTiers.NATURAL_GLASS, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> NEPHELINE_PICKAXE = ITEMS.register("nepheline_pickaxe",
            () -> new PickaxeItem(ModToolTiers.NEPHELINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> NEPHRITE_PICKAXE = ITEMS.register("nephrite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.NEPHRITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> NEPTUNITE_PICKAXE = ITEMS.register("neptunite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.NEPTUNITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> NICCOLITE_PICKAXE = ITEMS.register("niccolite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.NICCOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> OBSIDIAN_PICKAXE = ITEMS.register("obsidian_pickaxe",
            () -> new PickaxeItem(ModToolTiers.OBSIDIAN, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> OLIGOCLASE_PICKAXE = ITEMS.register("oligoclase_pickaxe",
            () -> new PickaxeItem(ModToolTiers.OLIGOCLASE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ONYX_PICKAXE = ITEMS.register("onyx_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ONYX, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> OPAL_STONE_PICKAXE = ITEMS.register("opal_stone_pickaxe",
            () -> new PickaxeItem(ModToolTiers.OPAL_STONE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ORANGE_DIAMOND_PICKAXE = ITEMS.register("orange_diamond_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ORANGE_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> OREGON_SUNSTONE_PICKAXE = ITEMS.register("oregon_sunstone_pickaxe",
            () -> new PickaxeItem(ModToolTiers.OREGON_SUNSTONE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ORTHOCLASE_PICKAXE = ITEMS.register("orthoclase_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ORTHOCLASE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PADPARADSCHA_SAPPHIRE_PICKAXE = ITEMS.register("padparadscha_sapphire_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PADPARADSCHA_SAPPHIRE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PAINITE_PICKAXE = ITEMS.register("painite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PAINITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PALYGORSKITE_PICKAXE = ITEMS.register("palygorskite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PALYGORSKITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PAPAGOITE_PICKAXE = ITEMS.register("papagoite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PAPAGOITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PARAIBA_TOURMALINE_PICKAXE = ITEMS.register("paraiba_tourmaline_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PARAIBA_TOURMALINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PARGASITE_PICKAXE = ITEMS.register("pargasite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PARGASITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PARISITE_PICKAXE = ITEMS.register("parisite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PARISITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PEARL_PICKAXE = ITEMS.register("pearl_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PEARL, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PECTOLITE_PICKAXE = ITEMS.register("pectolite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PECTOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PENTLANDITE_PICKAXE = ITEMS.register("pentlandite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PENTLANDITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PERICLASE_PICKAXE = ITEMS.register("periclase_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PERICLASE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PERIDOT_PICKAXE = ITEMS.register("peridot_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PERIDOT, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PERISTERITE_PICKAXE = ITEMS.register("peristerite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PERISTERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PERTHITE_PICKAXE = ITEMS.register("perthite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PERTHITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PETALITE_PICKAXE = ITEMS.register("petalite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PETALITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PHENAKITE_PICKAXE = ITEMS.register("phenakite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PHENAKITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PHOSGENITE_PICKAXE = ITEMS.register("phosgenite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PHOSGENITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PHOSPHOPHYLLITE_PICKAXE = ITEMS.register("phosphophyllite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PHOSPHOPHYLLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PINK_DIAMOND_PICKAXE = ITEMS.register("pink_diamond_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PINK_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> POLLUCITE_PICKAXE = ITEMS.register("pollucite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.POLLUCITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> POWELLITE_PICKAXE = ITEMS.register("powellite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.POWELLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PREHNITE_PICKAXE = ITEMS.register("prehnite_pickaxed",
            () -> new PickaxeItem(ModToolTiers.PREHNITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PROSOPITE_PICKAXE = ITEMS.register("prosopite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PROSOPITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PROTEUS_PICKAXE = ITEMS.register("proteus_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PROTEUS, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PROUSTITE_PICKAXE = ITEMS.register("proustite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PROUSTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PUMPELLYITE_PICKAXE = ITEMS.register("pumpellyite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PUMPELLYITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PURPLE_DIAMOND_PICKAXE = ITEMS.register("purple_diamond_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PURPLE_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PURPURITE_PICKAXE = ITEMS.register("purpurite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PURPURITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PYRARGYRITE_PICKAXE = ITEMS.register("pyrargyrite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PYRARGYRITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PYRITE_PICKAXE = ITEMS.register("pyrite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PYRITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PYROPE_GARNET_PICKAXE = ITEMS.register("pyrope_garnet_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PYROPE_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PYROPHYLLITE_PICKAXE = ITEMS.register("pyrophyllite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PYROPHYLLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PYROXMANGITE_PICKAXE = ITEMS.register("pyroxmangite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PYROXMANGITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> PYRRHOTITE_PICKAXE = ITEMS.register("pyrrhotite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PYRRHOTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> QUARTZ_PICKAXE = ITEMS.register("quartz_pickaxe",
            () -> new PickaxeItem(ModToolTiers.QUARTZ, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> QUARTZITE_PICKAXE = ITEMS.register("quartzite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.QUARTZITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> REALGAR_PICKAXE = ITEMS.register("realgar_pickaxe",
            () -> new PickaxeItem(ModToolTiers.REALGAR, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> RED_BERYL_PICKAXE = ITEMS.register("red_beryl_pickaxe",
            () -> new PickaxeItem(ModToolTiers.RED_BERYL, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> RED_DIAMOND_PICKAXE = ITEMS.register("red_diamond_pickaxe",
            () -> new PickaxeItem(ModToolTiers.RED_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> RHODIZITE_PICKAXE = ITEMS.register("rhodizite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.RHODIZITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> RHODOCHROSITE_PICKAXE = ITEMS.register("rhodochrosite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.RHODOCHROSITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> RHODOLITE_GARNET_PICKAXE = ITEMS.register("rhodolite_garnet_pickaxe",
            () -> new PickaxeItem(ModToolTiers.RHODOLITE_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> RHODONITE_PICKAXE = ITEMS.register("rhodonite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.RHODONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ROSE_QUARTZ_PICKAXE = ITEMS.register("rose_quartz_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ROSE_QUARTZ, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> RUBELLITE_PICKAXE = ITEMS.register("rubellite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.RUBELLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
            () -> new PickaxeItem(ModToolTiers.RUBY, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> RUTILE_PICKAXE = ITEMS.register("rutile_pickaxe",
            () -> new PickaxeItem(ModToolTiers.RUTILE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SALTWATER_PEARL_PICKAXE = ITEMS.register("saltwater_pearl_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SALTWATER_PEARL, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SAMARSKITE_PICKAXE = ITEMS.register("samarskite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SAMARSKITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SANIDINE_PICKAXE = ITEMS.register("sanidine_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SANIDINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SAPPHIRE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SAPPHIRINE_PICKAXE = ITEMS.register("sapphirine_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SAPPHIRINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SARCOLITE_PICKAXE = ITEMS.register("sarcolite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SARCOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SCAPOLITE_PICKAXE = ITEMS.register("scapolite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SCAPOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SCHEELITE_PICKAXE = ITEMS.register("scheelite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SCHEELITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SCORODITE_PICKAXE = ITEMS.register("scorodite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SCORODITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SELLAITE_PICKAXE = ITEMS.register("sellaite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SELLAITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SENARMONTITE_PICKAXE = ITEMS.register("senarmontite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SENARMONTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SERANDITE_PICKAXE = ITEMS.register("serandite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SERANDITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SERPENTINE_PICKAXE = ITEMS.register("serpentine_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SERPENTINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SHATTUCKITE_PICKAXE = ITEMS.register("shattuckite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SHATTUCKITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SHORTITE_PICKAXE = ITEMS.register("shortite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SHORTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SIDERITE_PICKAXE = ITEMS.register("siderite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SIDERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SILLIMANITE_PICKAXE = ITEMS.register("sillimanite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SILLIMANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SIMPSONITE_PICKAXE = ITEMS.register("simpsonite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SIMPSONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SINHALITE_PICKAXE = ITEMS.register("sinhalite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SINHALITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SMALTITE_PICKAXE = ITEMS.register("smaltite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SMALTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SMITHSONITE_PICKAXE = ITEMS.register("smithsonite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SMITHSONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SMOKY_QUARTZ_PICKAXE = ITEMS.register("smoky_quartz_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SMOKY_QUARTZ, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SODALITE_PICKAXE = ITEMS.register("sodalite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SODALITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SOGDIANITE_PICKAXE = ITEMS.register("sogdianite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SOGDIANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SPESSARTITE_GARNET_PICKAXE = ITEMS.register("spessartite_garnet_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SPESSARTITE_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SPHALERITE_PICKAXE = ITEMS.register("sphalerite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SPHALERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SPHENE_PICKAXE = ITEMS.register("sphene_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SPHENE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SPINEL_PICKAXE = ITEMS.register("spinel_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SPINEL, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SPODUMENE_PICKAXE = ITEMS.register("spodumene_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SPODUMENE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SPURRITE_PICKAXE = ITEMS.register("spurrite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SPURRITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> STAR_SAPPHIRE_PICKAXE = ITEMS.register("star_sapphire_pickaxe",
            () -> new PickaxeItem(ModToolTiers.STAR_SAPPHIRE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> STAUROLITE_PICKAXE = ITEMS.register("staurolite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.STAUROLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> STICHTITE_PICKAXE = ITEMS.register("stichtite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.STICHTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> STOLZITE_PICKAXE = ITEMS.register("stolzite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.STOLZITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> STRONTIANITE_PICKAXE = ITEMS.register("strontianite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.STRONTIANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SUGILITE_PICKAXE = ITEMS.register("sugilite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SUGILITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SULFUR_PICKAXE = ITEMS.register("sulfur_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SULFUR, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> SUNSTONE_PICKAXE = ITEMS.register("sunstone_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SUNSTONE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TAAFFEITE_PICKAXE = ITEMS.register("taaffeite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.TAAFFEITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TALC_PICKAXE = ITEMS.register("talc_pickaxe",
            () -> new PickaxeItem(ModToolTiers.TALC, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TANTALITE_PICKAXE = ITEMS.register("tantalite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.TANTALITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TANZANITE_PICKAXE = ITEMS.register("tanzanite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.TANZANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TEKTITE_PICKAXE = ITEMS.register("tektite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.TEKTITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TEPHROITE_PICKAXE = ITEMS.register("tephroite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.TEPHROITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> THAUMASITE_PICKAXE = ITEMS.register("thaumasite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.THAUMASITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> THOMSONITE_PICKAXE = ITEMS.register("thomsonite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.THOMSONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TIGERS_EYE_PICKAXE = ITEMS.register("tigers_eye_pickaxe",
            () -> new PickaxeItem(ModToolTiers.TIGERS_EYE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TOPAZ_PICKAXE = ITEMS.register("topaz_pickaxe",
            () -> new PickaxeItem(ModToolTiers.TOPAZ, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TOURMALINE_PICKAXE = ITEMS.register("tourmaline_pickaxe",
            () -> new PickaxeItem(ModToolTiers.TOURMALINE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TREMOLITE_PICKAXE = ITEMS.register("tremolite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.TREMOLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TRIPHYLITE_PICKAXE = ITEMS.register("triphylite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.TRIPHYLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TSAVORITE_GARNET_PICKAXE = ITEMS.register("tsavorite_garnet_pickaxe",
            () -> new PickaxeItem(ModToolTiers.TSAVORITE_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TUGTUPITE_PICKAXE = ITEMS.register("tugtupite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.TUGTUPITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> TURQUOISE_PICKAXE = ITEMS.register("turquoise_pickaxe",
            () -> new PickaxeItem(ModToolTiers.TURQUOISE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ULEXITE_PICKAXE = ITEMS.register("ulexite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ULEXITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> UVAROVITE_GARNET_PICKAXE = ITEMS.register("uvarovite_garnet_pickaxe",
            () -> new PickaxeItem(ModToolTiers.UVAROVITE_GARNET, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> VANADINITE_PICKAXE = ITEMS.register("vanadinite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.VANADINITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> VARISCITE_PICKAXE = ITEMS.register("variscite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.VARISCITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> VILLIAUMITE_PICKAXE = ITEMS.register("villiaumite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.VILLIAUMITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> VIVIANITE_PICKAXE = ITEMS.register("vivianite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.VIVIANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> VAYRYNENITE_PICKAXE = ITEMS.register("vayrynenite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.VAYRYNENITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> WARDITE_PICKAXE = ITEMS.register("wardite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.WARDITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> WAVELLITE_PICKAXE = ITEMS.register("wavellite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.WAVELLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> WELOGANITE_PICKAXE = ITEMS.register("weloganite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.WELOGANITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> WHEWELLITE_PICKAXE = ITEMS.register("whewellite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.WHEWELLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> WILKEITE_PICKAXE = ITEMS.register("wilkeite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.WILKEITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> WILLEMITE_PICKAXE = ITEMS.register("willemite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.WILLEMITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> WITHERITE_PICKAXE = ITEMS.register("witherite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.WITHERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> WOLLASTONITE_PICKAXE = ITEMS.register("wollastonite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.WOLLASTONITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> WULFENITE_PICKAXE = ITEMS.register("wulfenite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.WULFENITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> XONOTLITE_PICKAXE = ITEMS.register("xonotlite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.XONOTLITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> YELLOW_DIAMOND_PICKAXE = ITEMS.register("yellow_diamond_pickaxe",
            () -> new PickaxeItem(ModToolTiers.YELLOW_DIAMOND, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> YUGAWARALITE_PICKAXE = ITEMS.register("yugawaralite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.YUGAWARALITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ZEKTZERITE_PICKAXE = ITEMS.register("zektzerite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ZEKTZERITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ZINCITE_PICKAXE = ITEMS.register("zincite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ZINCITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ZIRCON_PICKAXE = ITEMS.register("zircon_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ZIRCON, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));
    public static final RegistryObject<Item> ZUNYITE_PICKAXE = ITEMS.register("zunyite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ZUNYITE, new Item.Properties().component(DataComponents.UNBREAKABLE, new Unbreakable(true))));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
