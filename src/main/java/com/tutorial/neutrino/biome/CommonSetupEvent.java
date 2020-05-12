package com.tutorial.neutrino.biome;

import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonSetupEvent {
    @SubscribeEvent
    public static void onCommonSetup(FMLCommonSetupEvent event) {
        BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(BiomeRegistry.obsidianBiome.get(), 1000));
    }
}
