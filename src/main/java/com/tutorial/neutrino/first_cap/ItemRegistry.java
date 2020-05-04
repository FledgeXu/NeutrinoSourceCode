package com.tutorial.neutrino.first_cap;

import com.tutorial.neutrino.group.ModGroup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, "neutrino");
    public static RegistryObject<Item> obsidianDownBlockItem = ITEMS.register("obsidian_down_block", () -> {
        return new BlockItem(BlockRegistry.obsidianDownBlock.get(), new Item.Properties().group(ModGroup.itemGroup));
    });
    public static RegistryObject<Item> obsidianUpBlockItem = ITEMS.register("obsidian_up_block", () -> {
        return new BlockItem(BlockRegistry.obsidianUpBlock.get(), new Item.Properties().group(ModGroup.itemGroup));
    });
}
