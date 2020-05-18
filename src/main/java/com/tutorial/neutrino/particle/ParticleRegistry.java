package com.tutorial.neutrino.particle;

import net.minecraft.particles.ParticleType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ParticleRegistry {
    public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES = new DeferredRegister<>(ForgeRegistries.PARTICLE_TYPES, "neutrino");
    public static RegistryObject<ParticleType<ObsidianParticleData>> obsidianParticle = PARTICLE_TYPES.register("obsidian_particle", () -> {
        return new ObsidianParticleType();
    });
}
