package com.tutorial.neutrino.input;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.client.util.InputMappings;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.settings.KeyConflictContext;
import net.minecraftforge.client.settings.KeyModifier;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.lwjgl.glfw.GLFW;

@Mod.EventBusSubscriber
public class KeyBoardInput {
    public static final KeyBinding MESSAGE_KEY = new KeyBinding("key.message",
            KeyConflictContext.IN_GAME,
            KeyModifier.CONTROL,
            InputMappings.Type.KEYSYM,
            GLFW.GLFW_KEY_J,
            "key.category.neutrino");

    @SubscribeEvent
    public static void onKeyboardInput(InputEvent.KeyInputEvent event) {
        if (MESSAGE_KEY.isPressed()) {
            assert Minecraft.getInstance().player != null;
            Minecraft.getInstance().player.sendMessage(new StringTextComponent("You Press J"));
        }
    }
}
