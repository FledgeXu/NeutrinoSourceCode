package com.tutorial.neutrino.input;

import net.minecraft.client.Minecraft;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.lwjgl.glfw.GLFW;

@Mod.EventBusSubscriber
public class KeyBoardInput {
    @SubscribeEvent
    public static void onKeyboardInput(InputEvent.KeyInputEvent event) {
        if (event.getKey() == GLFW.GLFW_KEY_J && event.getAction() == GLFW.GLFW_RELEASE) {
            assert Minecraft.getInstance().player != null;
            Minecraft.getInstance().player.sendMessage(new StringTextComponent("You Press J"));
        }
    }
}
