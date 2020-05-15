package com.tutorial.neutrino.sounds;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SoundEventRegistry {
    public static final DeferredRegister<SoundEvent> SOUNDS = new DeferredRegister<>(ForgeRegistries.SOUND_EVENTS, "neutrino");
    public static RegistryObject<SoundEvent> meaSound = SOUNDS.register("mea", () -> {
        return new SoundEvent(new ResourceLocation("neutrino", "mea"));
    });
}
