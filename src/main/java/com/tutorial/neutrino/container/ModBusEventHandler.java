package com.tutorial.neutrino.container;

import net.minecraft.client.gui.ScreenManager;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBusEventHandler {
    @SubscribeEvent
    public static void onClineSetupEvent(FMLClientSetupEvent event) {
        ScreenManager.registerFactory(ContainerTypeRegistry.obsidianFirstContainer.get(), (ObsidianFirstContainer screenContainer, PlayerInventory inv, ITextComponent titleIn) -> {
            return new ObsidianFirstContainerScreen(screenContainer, inv, titleIn);
        });
    }
}
