package com.tutorial.neutrino.gui_container;

import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ContainerTypeRegistry {
    public static final DeferredRegister<ContainerType<?>> CONTAINERS = new DeferredRegister<>(ForgeRegistries.CONTAINERS, "neutrino");
    public static RegistryObject<ContainerType<ObsidianFirstContainer>> obsidianContainerType = CONTAINERS.register("obsidian_container_type", () -> {
        return IForgeContainerType.create((windowId, inv, data) -> {
            return new ObsidianFirstContainer(windowId);
        });
    });
}

