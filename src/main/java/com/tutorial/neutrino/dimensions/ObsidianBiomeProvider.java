package com.tutorial.neutrino.dimensions;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.biome.provider.BiomeProvider;

import java.util.*;

public class ObsidianBiomeProvider extends BiomeProvider {
    private static final List<Biome> BIOMES = new ArrayList<>(Arrays.asList(Biomes.PLAINS, Biomes.OCEAN));
    private Random random;

    protected ObsidianBiomeProvider() {
        super(new HashSet<>(BIOMES));
        random = new Random();
    }

    @Override
    public Biome getNoiseBiome(int x, int y, int z) {
        return BIOMES.get(random.nextInt(2));
    }
}
