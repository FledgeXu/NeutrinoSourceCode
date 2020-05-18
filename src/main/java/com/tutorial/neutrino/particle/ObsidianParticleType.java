package com.tutorial.neutrino.particle;

import net.minecraft.particles.ParticleType;

public class ObsidianParticleType extends ParticleType<ObsidianParticleData> {
    public ObsidianParticleType() {
        super(false, ObsidianParticleData.DESERIALIZER);
    }
}
