package com.tutorial.neutrino.use_cap;

import com.tutorial.neutrino.first_tileentity.ObsidianCounter;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, "neutrino");
    public static RegistryObject<Block> obsidianTrash = BLOCKS.register("obsidian_trash", () -> {
        return new ObsidianTrash();
    });
}
