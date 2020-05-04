package com.tutorial.neutrino.first_cap;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class ObsidianDownBlockTileEntity extends TileEntity {
    public ObsidianDownBlockTileEntity() {
        super(TileEntityTypeRegistry.obsidianDownTileEntity.get());
    }

    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side) {
        if (cap == ModCapability.SIMPLE_CAPABILITY) {
            return LazyOptional.of(() -> {
                return new SimpleCapability("Hello");
            }).cast();
        }
        return super.getCapability(cap, side);
    }
}
