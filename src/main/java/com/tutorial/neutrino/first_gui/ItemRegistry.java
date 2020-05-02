package com.tutorial.neutrino.first_gui;

import com.tutorial.neutrino.first_item.ObsidianIngot;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, "neutrino");
    public static RegistryObject<Item> obsidianIngot = ITEMS.register("obsidian_first_gui", () -> {
        return new ObsidianFirstGuiItem();
    });
}
