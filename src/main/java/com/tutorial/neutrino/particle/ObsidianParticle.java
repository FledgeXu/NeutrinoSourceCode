package com.tutorial.neutrino.particle;

import net.minecraft.client.particle.IParticleRenderType;
import net.minecraft.client.particle.SpriteTexturedParticle;
import net.minecraft.world.World;

public class ObsidianParticle extends SpriteTexturedParticle {
    protected ObsidianParticle(World world, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
        super(world, x, y, z, velocityX, velocityY, velocityZ);
        maxAge = 100;
        motionX = velocityX;
        motionY = velocityY;
        motionZ = velocityZ;
        this.canCollide = true;
    }

    @Override
    public IParticleRenderType getRenderType() {
        return IParticleRenderType.PARTICLE_SHEET_TRANSLUCENT;
    }

    @Override
    public void tick() {
        prevPosX = posX;
        prevPosY = posY;
        prevPosZ = posZ;

        move(motionX, motionY, motionZ);
        if (onGround) {
            this.setExpired();
        }

        if (prevPosY == posY && motionY > 0) {
            this.setExpired();
        }

        if (this.age++ >= this.maxAge) {
            this.setExpired();
        }
    }
}
