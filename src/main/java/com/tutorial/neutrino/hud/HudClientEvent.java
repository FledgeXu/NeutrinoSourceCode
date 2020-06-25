package com.tutorial.neutrino.hud;

import net.minecraft.client.Minecraft;
import net.minecraft.util.Hand;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class HudClientEvent {

    @SubscribeEvent
    public static void onOverlayRender(RenderGameOverlayEvent event) {
        if (event.getType() != RenderGameOverlayEvent.ElementType.ALL) {
            return;
        }
        if (Minecraft.getInstance().player == null || Minecraft.getInstance().player.getHeldItem(Hand.MAIN_HAND).getItem() != ItemRegistry.obsidianHud.get()) {
            return;
        }
        ObsidianGUI obsidianGUI = new ObsidianGUI();
        obsidianGUI.render();
    }
}
