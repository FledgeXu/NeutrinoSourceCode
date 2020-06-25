package com.tutorial.neutrino;

import com.tutorial.neutrino.biome.ObsidianWorldType;
import com.tutorial.neutrino.configure.Config;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("neutrino")
public class Neutrino {
    public static final ObsidianWorldType obsidianWorldType = new ObsidianWorldType();

    public Neutrino() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.COMMON_CONFIG);
        com.tutorial.neutrino.first_item.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.food.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.melee_weapons.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.first_block.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.first_block.BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.blockstate.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.blockstate.BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.notsoildblock.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.notsoildblock.BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.obj.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.obj.BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.first_tileentity.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.first_tileentity.BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.first_tileentity.TileEntityTypeRegistry.TILE_ENTITY_TYPE_DEFERRED_REGISTER.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.tickabletileentity.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.tickabletileentity.BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.tickabletileentity.TileEntityTypeRegistry.TILE_ENTITY_TYPE_DEFERRED_REGISTER.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.tileentitydatasync.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.tileentitydatasync.BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.tileentitydatasync.TileEntityTypeRegistry.TILE_ENTITY_TYPE_DEFERRED_REGISTER.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.ibakedmodel.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.ibakedmodel.BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.ter.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.ter.BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.ter.TileEntityTypeRegistry.TILE_ENTITY_TYPE_DEFERRED_REGISTER.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.network.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.first_gui.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.first_entity.EntityTypeRegistry.ENTITY_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.obsidian_animal.EntityTypeRegistry.ENTITY_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.first_cap.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.first_cap.BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.first_cap.TileEntityTypeRegistry.TILE_ENTITY_TYPE_DEFERRED_REGISTER.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.use_cap.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.use_cap.BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.use_cap.TileEntityTypeRegistry.TILE_ENTITY_TYPE_DEFERRED_REGISTER.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.entity_capabilityprovider.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.wordsaveddata.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.wordsaveddata.BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.container.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.container.BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.container.TileEntityTypeRegistry.TILE_ENTITY_TYPE_DEFERRED_REGISTER.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.container.ContainerTypeRegistry.CONTAINERS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.hud.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.first_fluid.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.first_fluid.BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.first_fluid.FluidRegistry.FLUIDS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.strcutre.FeatureRegistry.FEATURES.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.biome.BiomeRegistry.BIOMES.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.dimensions.ModDimensionRegistry.MOD_DIMENSION.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.ister.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.configure.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.sounds.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.sounds.SoundEventRegistry.SOUNDS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.particle.ParticleRegistry.PARTICLE_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.special_render_type.BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.special_render_type.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
