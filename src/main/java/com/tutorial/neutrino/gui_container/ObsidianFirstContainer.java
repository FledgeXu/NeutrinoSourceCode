package com.tutorial.neutrino.gui_container;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;

import javax.annotation.Nullable;

public class ObsidianFirstContainer extends Container {

    protected ObsidianFirstContainer( int id) {
        super(ContainerTypeRegistry.obsidianContainerType.get(), id);
    }

    @Override
    public boolean canInteractWith(PlayerEntity playerIn) {
        return false;
    }
}
