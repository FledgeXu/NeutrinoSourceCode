package com.tutorial.neutrino.obsidian_animal;

import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class ObsidianAnimal extends AnimalEntity {
    protected ObsidianAnimal(EntityType<? extends AnimalEntity> type, World worldIn) {
        super(type, worldIn);
        this.goalSelector.addGoal(0, new ObsidianGoal(this));
    }

    @Nullable
    @Override
    public AgeableEntity createChild(AgeableEntity ageable) {
        return null;
    }
}
