package com.tutorial.neutrino.tickabletileentity;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, "neutrino");
    public static RegistryObject<Block> obsidianHelloBlock = BLOCKS.register("obsidian_hello_block", () -> {
        return new ObsidianHelloBlock();
    });
}
