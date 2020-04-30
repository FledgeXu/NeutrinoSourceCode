package com.tutorial.neutrino;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("neutrino")
public class Neutrino {
    public Neutrino() {
        com.tutorial.neutrino.first_item.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.food.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.melee_weapons.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.first_block.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.first_block.BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.blockstate.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.blockstate.BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.nonesoildblock.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.nonesoildblock.BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
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
    }
}
