package com.tutorial.neutrino.first_tileentity;

import com.tutorial.neutrino.group.ModGroup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, "neutrino");
    public static RegistryObject<Item> obsidian_counter_block = ITEMS.register("obsidian_counter_block", () -> {
        return new BlockItem(BlockRegistry.obsidianCounterBlock.get(), new Item.Properties().group(ModGroup.itemGroup));
    });
}
