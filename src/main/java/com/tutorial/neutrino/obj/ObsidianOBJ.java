package com.tutorial.neutrino.obj;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ObsidianOBJ extends Block {
    public ObsidianOBJ() {
        super(Properties.create(Material.ROCK).hardnessAndResistance(5).notSolid());
    }
}
