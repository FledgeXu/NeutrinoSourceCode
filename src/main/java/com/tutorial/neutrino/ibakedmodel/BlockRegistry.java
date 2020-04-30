package com.tutorial.neutrino.ibakedmodel;

import com.tutorial.neutrino.first_block.ObsidianBlock;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, "neutrino");
    public static RegistryObject<Block> obsidianHidden = BLOCKS.register("obsidian_hidden", () -> {
        return new ObsidianHiddenBlock();
    });
}
