package com.tutorial.neutrino.blockstate;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, "neutrino");
    public static RegistryObject<Block> obsidianRubikCube = BLOCKS.register("obsidian_rubik_cube", () -> {
        return new ObsidianRubikCube();
    });
}
