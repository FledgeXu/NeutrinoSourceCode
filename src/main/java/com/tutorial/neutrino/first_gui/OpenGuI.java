package com.tutorial.neutrino.first_gui;

import net.minecraft.client.Minecraft;
import net.minecraft.util.text.StringTextComponent;

public class OpenGuI {
    public static void openGUI() {
        Minecraft.getInstance().displayGuiScreen(new ObsidianFirstGui(new StringTextComponent("test")));
    }
}
