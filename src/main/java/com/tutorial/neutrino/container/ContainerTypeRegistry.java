package com.tutorial.neutrino.container;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ContainerTypeRegistry {
    public static final DeferredRegister<ContainerType<?>> CONTAINERS = new DeferredRegister<>(ForgeRegistries.CONTAINERS, "neutrino");
    public static RegistryObject<ContainerType<ObsidianFirstContainer>> obsidianFirstContainer = CONTAINERS.register("obsidian_first_container", () -> {
        return IForgeContainerType.create((int windowId, PlayerInventory inv, PacketBuffer data) -> {
            return new ObsidianFirstContainer(windowId, inv, data.readBlockPos(), Minecraft.getInstance().world.getWorld(), new ObsidianFirstContainerItemNumber());
        });
    });
}
