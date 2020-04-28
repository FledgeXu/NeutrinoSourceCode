package com.tutorial.neutrino.nonesoildblock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ObsidianFrame extends Block {
    public ObsidianFrame() {
        super(Properties.create(Material.ROCK).hardnessAndResistance(5).notSolid());
    }
}
