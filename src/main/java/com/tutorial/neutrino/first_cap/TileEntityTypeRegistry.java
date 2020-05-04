package com.tutorial.neutrino.first_cap;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityTypeRegistry {
    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPE_DEFERRED_REGISTER = new DeferredRegister<>(ForgeRegistries.TILE_ENTITIES, "neutrino");
    public static RegistryObject<TileEntityType<ObsidianDownBlockTileEntity>> obsidianDownTileEntity = TILE_ENTITY_TYPE_DEFERRED_REGISTER.register("obsidian_down_tileentity", () -> {
        return TileEntityType.Builder.create(() -> {
            return new ObsidianDownBlockTileEntity();
        }, BlockRegistry.obsidianDownBlock.get()).build(null);
    });
    public static RegistryObject<TileEntityType<ObsidianUpBlockTileEntity>> obsidianUpTileEntity = TILE_ENTITY_TYPE_DEFERRED_REGISTER.register("obsidian_up_tileentity", () -> {
        return TileEntityType.Builder.create(() -> {
            return new ObsidianUpBlockTileEntity();
        }, BlockRegistry.obsidianUpBlock.get()).build(null);
    });
}
