package com.tutorial.neutrino.particle;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.particles.IParticleData;
import net.minecraft.particles.ParticleType;

public class ObsidianParticleData implements IParticleData {
    public static final IDeserializer<ObsidianParticleData> DESERIALIZER = new IDeserializer<ObsidianParticleData>() {

        @Override
        public ObsidianParticleData deserialize(ParticleType<ObsidianParticleData> particleTypeIn, StringReader reader) throws CommandSyntaxException {
            return new ObsidianParticleData();
        }

        @Override
        public ObsidianParticleData read(ParticleType<ObsidianParticleData> particleTypeIn, PacketBuffer buffer) {
            return new ObsidianParticleData();
        }
    };

    @Override
    public ParticleType<?> getType() {
        return ParticleRegistry.obsidianParticle.get();
    }

    @Override
    public void write(PacketBuffer buffer) {

    }

    @Override
    public String getParameters() {
        return "";
    }
}
