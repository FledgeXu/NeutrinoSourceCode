package com.tutorial.neutrino.first_fluid;

import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FluidRegistry {
    public static final ResourceLocation STILL_OIL_TEXTURE = new ResourceLocation("block/water_still");
    public static final ResourceLocation FLOWING_OIL_TEXTURE = new ResourceLocation("block/water_flow");

    public static final DeferredRegister<Fluid> FLUIDS = new DeferredRegister<>(ForgeRegistries.FLUIDS, "neutrino");
    public static RegistryObject<FlowingFluid> obsidianFluid = FLUIDS.register("obsidian_fluid", () -> {
        return new ForgeFlowingFluid.Source(FluidRegistry.PROPERTIES);
    });
    public static RegistryObject<FlowingFluid> obsidianFluidFlowing = FLUIDS.register("obsidian_fluid_flowing", () -> {
        return new ForgeFlowingFluid.Flowing(FluidRegistry.PROPERTIES);
    });
    public static ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(obsidianFluid, obsidianFluidFlowing, FluidAttributes.builder(STILL_OIL_TEXTURE, FLOWING_OIL_TEXTURE).color(0xFF311cbb).density(10)).bucket(ItemRegistry.obsidianFluidBucket).block(BlockRegistry.obsidianRubikCube).slopeFindDistance(3).explosionResistance(100F);
}
