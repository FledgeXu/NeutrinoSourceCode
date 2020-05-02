package com.tutorial.neutrino.first_gui;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.OptionSlider;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.settings.SliderPercentageOption;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class ObsidianFirstGui extends Screen {
    TextFieldWidget textFieldWidget;
    Button button;
    OptionSlider optionSlider;
    ResourceLocation OBSIDIAN_FIRST_GUI_TEXTURE = new ResourceLocation("neutrino", "textures/gui/first_gui.png");
    String content = "Hello";
    SliderPercentageOption sliderPercentageOption;
    Widget sliderBar;

    protected ObsidianFirstGui(ITextComponent titleIn) {
        super(titleIn);
    }

    @Override
    protected void init() {
        this.minecraft.keyboardListener.enableRepeatEvents(true);
        this.textFieldWidget = new TextFieldWidget(this.font, this.width / 2 - 100, 66, 200, 20, "Context");
        this.children.add(this.textFieldWidget);

        this.button = new Button(this.width / 2 - 40, 96, 80, 20, "Save", (button) -> {
        });
        this.addButton(button);

        this.sliderPercentageOption = new SliderPercentageOption("neutrino.sliderbar", 5, 100, 5, (setting) -> {
            return Double.valueOf(0);
        }, (setting, value) -> {
        }, (gameSettings, sliderPercentageOption1) -> "test");
        this.sliderBar = this.sliderPercentageOption.createWidget(Minecraft.getInstance().gameSettings, this.width / 2 - 100, 120, 200);
        this.children.add(this.sliderBar);

        super.init();
    }

    @Override
    public void render(int p_render_1_, int p_render_2_, float p_render_3_) {
        this.renderBackground();
        RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.minecraft.getTextureManager().bindTexture(OBSIDIAN_FIRST_GUI_TEXTURE);
        int textureWidth = 208;
        int textureHeight = 156;
        this.blit(this.width / 2 - 150, 10, 0, 0, 300, 200, textureWidth, textureHeight);
        this.drawString(this.font, content, this.width / 2 - 10, 30, 0xeb0505);

        this.textFieldWidget.render(p_render_1_, p_render_2_, p_render_3_);
        this.button.render(p_render_1_, p_render_2_, p_render_3_);
        this.sliderBar.render(p_render_1_, p_render_2_, p_render_3_);
        super.render(p_render_1_, p_render_2_, p_render_3_);
    }
}
