package com.tutorial.neutrino.obsidian_animal;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientEventHandler {
    @SubscribeEvent
    public static void onClientSetUpEvent(FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(EntityTypeRegistry.obsidianAnimal.get(), (EntityRendererManager manager) -> {
            return new ObsidianAnimalRender(manager);
        });
    }
}
