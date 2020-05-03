package com.tutorial.neutrino.obsidian_animal;

import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ObsidianGoal extends Goal {
    private ObsidianAnimal obsidianAnimal;

    public ObsidianGoal(ObsidianAnimal obsidianAnimal) {
        this.obsidianAnimal = obsidianAnimal;
    }

    @Override
    public boolean shouldExecute() {
        World world = this.obsidianAnimal.getEntityWorld();
        if (!world.isRemote) {
            BlockPos blockPos = this.obsidianAnimal.getPosition();
            PlayerEntity player = world.getClosestPlayer(blockPos.getX(), blockPos.getY(), blockPos.getZ(), 10, false);
            if (player != null) {
                player.addPotionEffect(new EffectInstance(Effects.HUNGER, 3 * 20, 3));
            }
        }
        return true;
    }
}
