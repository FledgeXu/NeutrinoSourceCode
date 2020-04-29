package com.tutorial.neutrino.first_tileentity;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;

public class ObsidianCounterTileEntity extends TileEntity {
    private int counter = 0;

    public ObsidianCounterTileEntity() {
        super(TileEntityTypeRegistry.obsidianCounterTileEntity.get());
    }


    public int increase() {
        counter++;
        markDirty();
        return counter;
    }

    @Override
    public void read(CompoundNBT compound) {
        counter = compound.getInt("counter");
        super.read(compound);
    }

    @Override
    public CompoundNBT write(CompoundNBT compound) {
        compound.putInt("counter", counter);
        return super.write(compound);
    }
}
