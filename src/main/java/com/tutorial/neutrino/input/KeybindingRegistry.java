package com.tutorial.neutrino.input;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class KeybindingRegistry {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        ClientRegistry.registerKeyBinding(KeyBoardInput.MESSAGE_KEY);
    }
}
