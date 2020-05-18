package com.tutorial.neutrino.particle;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class ObsidianParticleBlock extends Block {
    public ObsidianParticleBlock() {
        super(Properties.create(Material.ROCK).hardnessAndResistance(5));
    }

    @Override
    public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
        if (worldIn.isRemote) {
            double xpos = pos.getX() + 0.5;
            double ypos = pos.getY() + 2.0;
            double zpos = pos.getZ() + 0.5;
            double velocityX = 0;
            double velocityY = 0.1;
            double velocityZ = 0;
            ObsidianParticleData flameParticleData = new ObsidianParticleData();
            worldIn.addParticle(flameParticleData, false,
                    xpos, ypos, zpos, velocityX, velocityY, velocityZ);
        }
        super.animateTick(stateIn, worldIn, pos, rand);
    }
}
