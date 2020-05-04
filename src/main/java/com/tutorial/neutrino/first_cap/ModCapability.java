package com.tutorial.neutrino.first_cap;

import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;

public class ModCapability {
    @CapabilityInject(ISimpleCapability.class)
    public static Capability<ISimpleCapability> SIMPLE_CAPABILITY;
}
