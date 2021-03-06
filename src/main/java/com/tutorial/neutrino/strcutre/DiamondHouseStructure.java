package com.tutorial.neutrino.strcutre;

import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeManager;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraft.world.gen.feature.structure.StructureStart;
import net.minecraft.world.gen.feature.template.TemplateManager;

import java.util.Random;
import java.util.function.Function;

public class DiamondHouseStructure extends Structure<NoFeatureConfig> {
    public DiamondHouseStructure(Function<Dynamic<?>, ? extends NoFeatureConfig> configFactoryIn) {
        super(configFactoryIn);
    }

    @Override
    public boolean canBeGenerated(BiomeManager biomeManagerIn, ChunkGenerator<?> generatorIn, Random randIn, int chunkX, int chunkZ, Biome biomeIn) {
        if (randIn.nextFloat() < 0.03) {
            return true;
        }
        return false;
    }

    @Override
    public IStartFactory getStartFactory() {
        return DiamondHouseStructure.Start::new;
    }

    @Override
    public String getStructureName() {
        return "neutrino_house";
    }

    @Override
    public int getSize() {
        return 3;
    }

    public static class Start extends StructureStart {

        public Start(Structure<?> structure, int chunkPosX, int chunkPosZ, MutableBoundingBox bounds, int references, long seed) {
            super(structure, chunkPosX, chunkPosZ, bounds, references, seed);
        }

        @Override
        public void init(ChunkGenerator<?> generator, TemplateManager templateManagerIn, int chunkX, int chunkZ, Biome biomeIn) {
            DiamondHouseStructurePiece diamondHouseStructurePiece = new DiamondHouseStructurePiece(this.rand, chunkX * 16, chunkZ * 16);
            this.components.add(diamondHouseStructurePiece);
            this.recalculateStructureSize();
        }
    }
}
