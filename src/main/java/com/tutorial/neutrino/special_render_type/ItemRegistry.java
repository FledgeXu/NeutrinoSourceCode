package com.tutorial.neutrino.special_render_type;

import com.tutorial.neutrino.group.ModGroup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, "neutrino");
    public static final RegistryObject<BlockItem> glassJar = ITEMS.register("glass_jar", () -> {
        return new BlockItem(BlockRegistry.glassJar.get(), new Item.Properties().group(ModGroup.itemGroup));
    });
}
