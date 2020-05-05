package com.tutorial.neutrino.wordsaveddata;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, "neutrino");
    public static RegistryObject<Block> obsidianItemSaveBlock = BLOCKS.register("obsidian_item_save", () -> {
        return new ObsidianItemSaveBlock();
    });
}
