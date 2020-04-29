package com.tutorial.neutrino.first_tileentity;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityTypeRegistry {
    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPE_DEFERRED_REGISTER = new DeferredRegister<>(ForgeRegistries.TILE_ENTITIES, "neutrino");
    public static RegistryObject<TileEntityType<ObsidianCounterTileEntity>> obsidianCounterTileEntity = TILE_ENTITY_TYPE_DEFERRED_REGISTER.register("obsidian_counter_tileentity", () -> {
        return TileEntityType.Builder.create(() -> {
            return new ObsidianCounterTileEntity();
        }, BlockRegistry.obsidianCounterBlock.get()).build(null);
    });
}
