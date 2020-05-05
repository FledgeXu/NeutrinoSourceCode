package com.tutorial.neutrino.entity_capabilityprovider;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, "neutrino");
    public static RegistryObject<Item> obsidianShowSpeedupItem = ITEMS.register("obsidian_show_speedup", () -> {
        return new ObsidianSpeedUpShowItem();
    });
}
