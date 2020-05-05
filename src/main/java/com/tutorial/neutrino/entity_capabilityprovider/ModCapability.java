package com.tutorial.neutrino.entity_capabilityprovider;

import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;

public class ModCapability {
    @CapabilityInject(ISpeedUpCapability.class)
    public static Capability<ISpeedUpCapability> SPEED_UP_CAPABILITY;
}
