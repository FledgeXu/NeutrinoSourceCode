package com.tutorial.neutrino.at;

import net.minecraft.block.ComposterBlock;
import net.minecraft.item.Items;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ATDemo {
    @SubscribeEvent
    public static void addNewItemToComposterBlock(FMLLoadCompleteEvent event) {
        ComposterBlock.registerCompostable(0.3F, Items.OAK_LEAVES);
        ComposterBlock.registerCompostable(0.3F, Items.SPRUCE_LEAVES);
        ComposterBlock.registerCompostable(0.3F, Items.BIRCH_LEAVES);
        ComposterBlock.registerCompostable(0.3F, Items.JUNGLE_LEAVES);
        ComposterBlock.registerCompostable(0.3F, Items.ACACIA_LEAVES);
        ComposterBlock.registerCompostable(0.3F, Items.DARK_OAK_LEAVES);
    }
}
