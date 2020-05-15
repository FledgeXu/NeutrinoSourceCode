package com.tutorial.neutrino.sounds;

import com.tutorial.neutrino.group.ModGroup;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class SoundTestItem extends Item {
    public SoundTestItem() {
        super(new Properties().group(ModGroup.itemGroup));
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        if (worldIn.isRemote) {
            worldIn.playSound(playerIn, playerIn.getPosition(), SoundEventRegistry.meaSound.get(), SoundCategory.AMBIENT, 10f, 1f);
        }
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
