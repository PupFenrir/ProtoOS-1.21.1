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
        ModGemstoneArrow.register(modEventBus);
        ModGemstoneAxe.register(modEventBus);
        ModGemstoneBonemeal.register(modEventBus);
        ModGemstoneBow.register(modEventBus);
        ModGemstoneBrush.register(modEventBus);
        ModGemstoneBundle.register(modEventBus);
        ModGemstoneCompass.register(modEventBus);
        ModGemstoneDust.register(modEventBus);
        ModGemstoneElytra.register(modEventBus);
        ModGemstoneFireworkRocket.register(modEventBus);
        ModGemstoneFishingRod.register(modEventBus);
        ModGemstoneFlintAndSteel.register(modEventBus);
        ModGemstoneFood.register(modEventBus);
        ModGemstoneFuelSource.register(modEventBus);
        ModGemstoneHammer.register(modEventBus);
        ModGemstoneHoe.register(modEventBus);
        ModGemstoneMace.register(modEventBus);
        ModGemstonePickaxe.register(modEventBus);
        ModGemstones.register(modEventBus);
        ModGemstoneSaddle.register(modEventBus);
        ModGemstoneShears.register(modEventBus);
        ModGemstoneShield.register(modEventBus);
        ModGemstoneShovel.register(modEventBus);
        ModGemstoneSpyglass.register(modEventBus);
        ModGemstoneSword.register(modEventBus);
        ModGemstoneTrident.register(modEventBus);
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
