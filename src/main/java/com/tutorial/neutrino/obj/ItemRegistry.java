package com.tutorial.neutrino.obj;

import com.tutorial.neutrino.group.ModGroup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, "neutrino");
    public static RegistryObject<Item> obsidianObj = ITEMS.register("obsidian_obj", () -> {
        return new BlockItem(BlockRegistry.obsidanObj.get(), new Item.Properties().group(ModGroup.itemGroup));
    });
}
