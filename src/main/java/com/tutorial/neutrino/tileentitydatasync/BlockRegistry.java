package com.tutorial.neutrino.tileentitydatasync;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, "neutrino");
    public static RegistryObject<Block> obsidianZombieBlock = BLOCKS.register("obsidian_zombie_block", () -> {
        return new ObsidianZombieBlock();
    });
}
