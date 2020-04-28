package com.tutorial.neutrino.blockstate;

import com.tutorial.neutrino.group.ModGroup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, "neutrino");
    public static RegistryObject<Item> obsidianRubikCube = ITEMS.register("obsidian_rubik_cube", () -> {
        return new BlockItem(BlockRegistry.obsidianRubikCube.get(), new Item.Properties().group(ModGroup.itemGroup));
    });
}
