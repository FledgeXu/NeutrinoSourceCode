package com.tutorial.neutrino.use_cap;

import com.tutorial.neutrino.first_tileentity.ObsidianCounterTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityTypeRegistry {
    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPE_DEFERRED_REGISTER = new DeferredRegister<>(ForgeRegistries.TILE_ENTITIES, "neutrino");
    public static RegistryObject<TileEntityType<ObsidianTrashTileEntity>> obsidianTrash = TILE_ENTITY_TYPE_DEFERRED_REGISTER.register("obsidian_trash", () -> {
        return TileEntityType.Builder.create(() -> {
            return new ObsidianTrashTileEntity();
        }, BlockRegistry.obsidianTrash.get()).build(null);
    });
}
