package com.tutorial.neutrino.tileentitydatasync;

import com.tutorial.neutrino.group.ModGroup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, "neutrino");
    public static RegistryObject<Item> obsidianZombieBlock = ITEMS.register("obsidian_zombie_block", () -> {
        return new BlockItem(BlockRegistry.obsidianZombieBlock.get(), new Item.Properties().group(ModGroup.itemGroup));
    });
}
