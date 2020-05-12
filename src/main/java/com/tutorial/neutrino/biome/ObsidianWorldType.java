package com.tutorial.neutrino.biome;

import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.provider.SingleBiomeProvider;
import net.minecraft.world.biome.provider.SingleBiomeProviderSettings;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.IExtendedNoiseRandom;
import net.minecraft.world.gen.OverworldChunkGenerator;
import net.minecraft.world.gen.OverworldGenSettings;
import net.minecraft.world.gen.area.IArea;
import net.minecraft.world.gen.area.IAreaFactory;

import java.util.function.LongFunction;

public class ObsidianWorldType extends WorldType {
    public ObsidianWorldType() {
        super("neutrino_type");
    }

    @Override
    public ChunkGenerator<?> createChunkGenerator(World world) {
        OverworldGenSettings settings = new OverworldGenSettings();
        SingleBiomeProvider singleBiomeProvider = new SingleBiomeProvider(new SingleBiomeProviderSettings(world.getWorldInfo()).setBiome(BiomeRegistry.obsidianBiome.get()));
        return new OverworldChunkGenerator(world, singleBiomeProvider, settings);
    }

    @Override
    public <T extends IArea, C extends IExtendedNoiseRandom<T>> IAreaFactory<T> getBiomeLayer(IAreaFactory<T> parentLayer, OverworldGenSettings chunkSettings, LongFunction<C> contextFactory) {
        return null;
    }
}
