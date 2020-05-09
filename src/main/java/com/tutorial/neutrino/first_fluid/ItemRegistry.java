package com.tutorial.neutrino.first_fluid;

import com.tutorial.neutrino.group.ModGroup;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, "neutrino");
    public static RegistryObject<Item> obsidianFluidBucket = ITEMS.register("obsidian_fluid_bucket", () -> {
        return new BucketItem(FluidRegistry.obsidianFluid, new Item.Properties().group(ModGroup.itemGroup));
    });
}
