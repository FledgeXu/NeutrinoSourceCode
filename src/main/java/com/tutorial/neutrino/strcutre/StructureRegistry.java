package com.tutorial.neutrino.strcutre;

import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class StructureRegistry {
    public static final DeferredRegister<Feature<?>> FEATURES = new DeferredRegister<>(ForgeRegistries.FEATURES, "neutrino");
    public static RegistryObject<Structure<NoFeatureConfig>> obsidianBlock = FEATURES.register("house", () -> {
        return new DiamondHouse(NoFeatureConfig::deserialize);
    });
}
