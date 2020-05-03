package com.tutorial.neutrino.first_entity;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientEventHandler {
    @SubscribeEvent
    public static void onClientSetUpEvent(FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(EntityTypeRegistry.flyingSwordEntity.get(), (EntityRendererManager manager) -> {
            return new FlyingSwordRender(manager);
        });
    }
}
