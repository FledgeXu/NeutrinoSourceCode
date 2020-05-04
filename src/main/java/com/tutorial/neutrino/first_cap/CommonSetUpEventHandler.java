package com.tutorial.neutrino.first_cap;

import net.minecraft.nbt.INBT;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonSetUpEventHandler {
    @SubscribeEvent
    public static void onSetUpEvent(FMLCommonSetupEvent event) {
        CapabilityManager.INSTANCE.register(
                ISimpleCapability.class,
                new Capability.IStorage<ISimpleCapability>() {
                    @Nullable
                    @Override
                    public INBT writeNBT(Capability<ISimpleCapability> capability, ISimpleCapability instance, Direction side) {
                        return null;
                    }

                    @Override
                    public void readNBT(Capability<ISimpleCapability> capability, ISimpleCapability instance, Direction side, INBT nbt) {

                    }
                },
                () -> null
        );
    }
}
