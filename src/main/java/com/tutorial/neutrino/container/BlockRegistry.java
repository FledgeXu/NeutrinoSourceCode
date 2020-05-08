package com.tutorial.neutrino.container;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, "neutrino");
    public static RegistryObject<Block> obsidianFirstContainerBlock = BLOCKS.register("obsidian_first_container", () -> {
        return new ObsidianFirstContainerBlock();
    });
}
