package com.tutorial.neutrino.hud;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.AbstractGui;
import net.minecraft.util.ResourceLocation;

public class ObsidianGUI extends AbstractGui {
    private int width;
    private int height;
    private Minecraft minecraft;
    private ResourceLocation HUD = new ResourceLocation("neutrino", "textures/gui/hud.png");

    public ObsidianGUI() {
        this.width = Minecraft.getInstance().getMainWindow().getWidth();
        this.height = Minecraft.getInstance().getMainWindow().getHeight();
        this.minecraft = Minecraft.getInstance();
    }

    public void render() {
        RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.minecraft.getTextureManager().bindTexture(HUD);
        this.blit(0, 0, 0, 0, 32, 32, 32, 32);
    }

}
