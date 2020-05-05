package com.tutorial.neutrino.wordsaveddata;

import com.tutorial.neutrino.group.ModGroup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, "neutrino");
    public static RegistryObject<Item> obsidianItemSave = ITEMS.register("obsidian_item_save", () -> {
        return new BlockItem(BlockRegistry.obsidianItemSaveBlock.get(), new Item.Properties().group(ModGroup.itemGroup));
    });
}
