package com.tutorial.neutrino.dimensions;

import net.minecraftforge.common.ModDimension;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModDimensionRegistry {
    public static final DeferredRegister<ModDimension> MOD_DIMENSION = new DeferredRegister<>(ForgeRegistries.MOD_DIMENSIONS, "neutrino");
    public static RegistryObject<ObsidianModDimensions> obsidianModDimension = MOD_DIMENSION.register("obsidian_mod_dimension", () -> {
        return new ObsidianModDimensions();
    });
}
