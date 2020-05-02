package com.tutorial.neutrino.first_gui;

import com.tutorial.neutrino.group.ModGroup;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class ObsidianFirstGuiItem extends Item {
    public ObsidianFirstGuiItem() {
        super(new Properties().group(ModGroup.itemGroup));
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        if(worldIn.isRemote){
            Minecraft.getInstance().displayGuiScreen(new ObsidianFirstGui(new StringTextComponent("test")));
        }
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
