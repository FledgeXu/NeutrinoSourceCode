package com.tutorial.neutrino.entity_capabilityprovider;

import net.minecraft.nbt.CompoundNBT;

public class SpeedUpCapability implements ISpeedUpCapability {
    private int level;

    public SpeedUpCapability(int level) {
        this.level = level;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public CompoundNBT serializeNBT() {
        CompoundNBT compoundNBT = new CompoundNBT();
        compoundNBT.putInt("level", this.level);
        return compoundNBT;
    }

    @Override
    public void deserializeNBT(CompoundNBT nbt) {
        this.level = nbt.getInt("level");
    }
}
