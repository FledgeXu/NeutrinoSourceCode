package com.tutorial.neutrino.biome;

import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BiomeRegistry {
    public static final DeferredRegister<Biome> BIOMES = new DeferredRegister<>(ForgeRegistries.BIOMES, "neutrino");
    public static RegistryObject<ObsidianBiome> obsidianBiome = BIOMES.register("obsidian_biome", () -> {
        return new ObsidianBiome(new Biome.Builder().category(Biome.Category.PLAINS)
                .surfaceBuilder(SurfaceBuilder.DEFAULT,
                        new SurfaceBuilderConfig(Blocks.OBSIDIAN.getDefaultState(), Blocks.STONE.getDefaultState(), Blocks.END_STONE.getDefaultState())
                )
                .scale(3f)
                .downfall(0.5f)
                .precipitation(Biome.RainType.SNOW)
                .depth(1f)
                .temperature(0.7f)
                .waterColor(0x0c0a15)
                .waterFogColor(0x632ebf)
        );
    });

    public static void registryBiome() {
        BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(obsidianBiome.get(), 1000));
    }
}
