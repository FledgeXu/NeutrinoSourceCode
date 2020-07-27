package com.tutorial.neutrino.ister;

import com.tutorial.neutrino.group.ModGroup;
import net.minecraft.item.Item;

public class ObsidianWrench extends Item {
    public ObsidianWrench() {
        super(new Properties().group(ModGroup.itemGroup).setISTER(() -> ObsidianWrenchItemStackTileEntityRenderer::new));
    }
}
