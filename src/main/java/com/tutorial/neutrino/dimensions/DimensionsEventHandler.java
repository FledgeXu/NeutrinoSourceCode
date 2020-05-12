package com.tutorial.neutrino.dimensions;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.dimension.DimensionType;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.event.world.RegisterDimensionsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class DimensionsEventHandler {
    public static final ResourceLocation DIMENSION_ID = new ResourceLocation("neutrino", "obsidian");
    public static DimensionType DIMENSION_TYPE;

    @SubscribeEvent
    public static void onDimensionsRegistry(RegisterDimensionsEvent event) {
        if (DimensionType.byName(DIMENSION_ID) == null) {
            DIMENSION_TYPE = DimensionManager.registerDimension(DIMENSION_ID, ModDimensionRegistry.obsidianModDimension.get(), null, true);
        }
    }
}
