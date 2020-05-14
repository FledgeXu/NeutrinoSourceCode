package com.tutorial.neutrino.teisr;

import net.minecraft.client.renderer.model.IBakedModel;
import net.minecraft.client.renderer.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelBakeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Map;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBusEventHandler {
    @SubscribeEvent
    public static void onModelBaked(ModelBakeEvent event) {
        Map<ResourceLocation, IBakedModel> modelRegistry = event.getModelRegistry();
        ModelResourceLocation location = new ModelResourceLocation(ItemRegistry.obsidianWrench.get().getRegistryName(), "inventory");
        IBakedModel existingModel = modelRegistry.get(location);
        if (existingModel == null) {
            throw new RuntimeException("Did not find Obsidian Hidden in registry");
        } else if (existingModel instanceof ObsidianWrenchBakedModel) {
            throw new RuntimeException("Tried to replaceObsidian Hidden twice");
        } else {
            ObsidianWrenchBakedModel obsidianWrenchBakedModel = new ObsidianWrenchBakedModel(existingModel);
            event.getModelRegistry().put(location, obsidianWrenchBakedModel);
        }
    }
}
