package com.tutorial.neutrino.special_render_type;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, "neutrino");
    public static final RegistryObject<GlassJar> glassJar = BLOCKS.register("glass_jar", () -> {
        return new GlassJar();
    });
}
