package com.tutorial.neutrino.obsidian_animal;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.World;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityTypeRegistry {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.ENTITIES, "neutrino");
    public static RegistryObject<EntityType<ObsidianAnimal>> obsidianAnimal = ENTITY_TYPES.register("obsidian_animal", () -> {
        return EntityType.Builder.create((EntityType<ObsidianAnimal> entityType, World world) -> {
            return new ObsidianAnimal(entityType, world);
        }, EntityClassification.MISC).size(3, 0.5F).build("obsidian_animal");
    });
}
