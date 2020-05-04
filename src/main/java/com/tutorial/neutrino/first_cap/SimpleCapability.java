package com.tutorial.neutrino.first_cap;

import net.minecraft.util.math.BlockPos;

public class SimpleCapability implements ISimpleCapability {
    private String context;

    public SimpleCapability(String context) {
        this.context = context;
    }

    @Override
    public String getString(BlockPos pos) {
        return pos.toString() + ":::" + this.context;
    }
}
