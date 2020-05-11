package com.tutorial.neutrino.strcutre;

import net.minecraft.block.Blocks;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.structure.ScatteredStructurePiece;
import net.minecraft.world.gen.feature.structure.StructurePiece;
import net.minecraft.world.gen.feature.template.TemplateManager;

import java.util.Random;

public class DiamondHouseStructurePiece extends ScatteredStructurePiece {
    private static final DiamondHouseStructurePiece.Selector BUILD_STONE_SELECTOR = new DiamondHouseStructurePiece.Selector();

    protected DiamondHouseStructurePiece(Random random, int x, int z) {
        super(CommonEventHandler.diamondHouseStructurePieceType, random, x, 64, z, 12, 10, 15);
    }

    protected DiamondHouseStructurePiece(TemplateManager templateManager, CompoundNBT nbt) {
        super(CommonEventHandler.diamondHouseStructurePieceType, nbt);
    }

    @Override
    public boolean func_225577_a_(IWorld world, ChunkGenerator<?> chunkGenerator, Random random, MutableBoundingBox mutableBoundingBox, ChunkPos chunkPos) {
        this.fillWithRandomizedBlocks(world, mutableBoundingBox, 0, 0, 0, 4, 4, 4, false, random, BUILD_STONE_SELECTOR);
        this.fillWithAir(world, mutableBoundingBox, 1, 1, 1, 3, 3, 3);
        this.setBlockState(world, Blocks.ACACIA_TRAPDOOR.getDefaultState().rotate(Rotation.CLOCKWISE_90), 2, 2, 0, mutableBoundingBox);
        this.fillWithAir(world, mutableBoundingBox, 2, 1, 0, 2, 1, 0);
        return true;
    }

    static class Selector extends StructurePiece.BlockSelector {
        private Selector() {
        }

        public void selectBlocks(Random rand, int x, int y, int z, boolean wall) {
            this.blockstate = Blocks.DIAMOND_BLOCK.getDefaultState();
        }
    }
}
