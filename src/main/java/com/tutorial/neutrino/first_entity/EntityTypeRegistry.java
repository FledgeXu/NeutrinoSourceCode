package com.tutorial.neutrino.first_entity;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.World;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityTypeRegistry {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.ENTITIES, "neutrino");
    public static RegistryObject<EntityType<FlyingSwordEntity>> flyingSwordEntity = ENTITY_TYPES.register("flying_sword", () -> {
        return EntityType.Builder.create((EntityType<FlyingSwordEntity> entityType, World world) -> {
            return new FlyingSwordEntity(entityType, world);
        }, EntityClassification.MISC).size(3, 0.5F).build("flying_sword");
    });
}
