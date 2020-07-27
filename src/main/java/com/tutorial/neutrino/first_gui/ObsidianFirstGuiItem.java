package com.tutorial.neutrino.first_gui;

import com.tutorial.neutrino.group.ModGroup;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;

public class ObsidianFirstGuiItem extends Item {
    public ObsidianFirstGuiItem() {
        super(new Properties().group(ModGroup.itemGroup));
    }


    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        if (worldIn.isRemote) {
            DistExecutor.runWhenOn(Dist.CLIENT, () -> () -> {
                OpenGuI.openGUI();
            });
        }
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
