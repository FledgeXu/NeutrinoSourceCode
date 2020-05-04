package com.tutorial.neutrino.first_cap;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, "neutrino");
    public static RegistryObject<Block> obsidianDownBlock = BLOCKS.register("obsidian_down_block", () -> {
        return new ObsidianDownBlock();
    });
    public static RegistryObject<Block> obsidianUpBlock = BLOCKS.register("obsidian_up_block", () -> {
        return new ObsidianUpBlock();
    });
}
