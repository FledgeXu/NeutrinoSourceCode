package com.tutorial.neutrino.biome;

import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;

public class ObsidianBiome extends Biome {
    protected ObsidianBiome(Builder biomeBuilder) {
        super(biomeBuilder);
        this.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Blocks.GOLD_ORE.getDefaultState(), 9)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(20, 32, 32, 80))));
        addSpawn(EntityClassification.AMBIENT, new SpawnListEntry(EntityType.WITHER_SKELETON, 30, 5, 10));
        DefaultBiomeFeatures.addCarvers(this);
        DefaultBiomeFeatures.addEndCity(this);
    }

    @Override
    public TempCategory getTempCategory() {
        return super.getTempCategory();
    }
}
