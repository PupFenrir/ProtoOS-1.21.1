package net.fenrir.protoos;

import net.fenrir.protoos.item.*;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ProtoOS.MOD_ID)
public class ProtoOS
{
    public static final String MOD_ID = "protoos";

    public ProtoOS()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
        ModCreativeModeTabs.register(modEventBus);
        ModGemstones.register(modEventBus);
        ModGemstoneBrush.register(modEventBus);
        ModGemstoneCompass.register(modEventBus);
        ModGemstoneDust.register(modEventBus);
        ModGemstoneSaddle.register(modEventBus);
        ModGemstoneSpyglass.register(modEventBus);
        ModGemstoneElytra.register(modEventBus);
        ModGemstoneTrident.register(modEventBus);
        ModGemstoneFireworkRocket.register(modEventBus);
        ModGemstoneFishingRod.register(modEventBus);
        ModGemstoneFood.register(modEventBus);
        ModGemstoneFlintAndSteel.register(modEventBus);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
