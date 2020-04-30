package com.tutorial.neutrino.ibakedmodel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ObsidianHiddenBlock extends Block {
    public ObsidianHiddenBlock() {
        super(Properties.create(Material.ROCK).hardnessAndResistance(5).notSolid());
    }
}
