package com.tutorial.neutrino.strcutre;

import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.structure.IStructurePieceType;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartedEvent;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ServerServerHandler {
    public static IStructurePieceType type;

    @SubscribeEvent
    public static void onServerEventBus(FMLCommonSetupEvent event) {
        type = Registry.register(Registry.STRUCTURE_PIECE, "house", DiamondHouseTemplate::new);

    }

    @SubscribeEvent
    public static void onServerEventBus(FMLServerStartedEvent event) {
        for (Biome biome : ForgeRegistries.BIOMES) {
//            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
//                    Feature.ORE.withConfiguration(
//                            new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
//                                    BlockRegistry.obsidianBlock.get().getDefaultState(),
//                                    3)
//                    ).withPlacement(Placement.COUNT_DEPTH_AVERAGE.configure(new DepthAverageConfig(30, 30, 20)))
//            );
            biome.addStructure(StructureRegistry.obsidianBlock.get().withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
        }
    }
}
