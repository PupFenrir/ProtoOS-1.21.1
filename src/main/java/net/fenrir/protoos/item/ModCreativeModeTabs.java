package net.fenrir.protoos.item;

import net.fenrir.protoos.ProtoOS;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ProtoOS.MOD_ID);
    public static final RegistryObject<CreativeModeTab> PROTOOS_TAB = CREATIVE_MODE_TABS.register("protoos_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModGemstones.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.protoos_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        ModGemstones.ITEMS.getEntries().forEach(item -> output.accept(item.get()));
                        ModGemstoneBrush.ITEMS.getEntries().forEach(item -> output.accept(item.get()));
                        ModGemstoneCompass.ITEMS.getEntries().forEach(item -> output.accept(item.get()));
                        ModGemstoneDust.ITEMS.getEntries().forEach(item -> output.accept(item.get()));
                        ModGemstoneSaddle.ITEMS.getEntries().forEach(item -> output.accept(item.get()));
                        ModGemstoneSpyglass.ITEMS.getEntries().forEach(item -> output.accept(item.get()));
                        ModGemstoneElytra.ITEMS.getEntries().forEach(item -> output.accept(item.get()));
                        ModGemstoneTrident.ITEMS.getEntries().forEach(item -> output.accept(item.get()));
                        ModGemstoneFireworkRocket.ITEMS.getEntries().forEach(item -> output.accept(item.get()));
                        ModGemstoneFishingRod.ITEMS.getEntries().forEach(item -> output.accept(item.get()));
                        ModGemstoneFood.ITEMS.getEntries().forEach(item -> output.accept(item.get()));
                        ModGemstoneFlintAndSteel.ITEMS.getEntries().forEach(item -> output.accept(item.get()));
                    })
                    .withSearchBar()
                    .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
