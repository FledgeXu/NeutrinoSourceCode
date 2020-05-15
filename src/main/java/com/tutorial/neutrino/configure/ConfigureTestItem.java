package com.tutorial.neutrino.configure;

import com.tutorial.neutrino.group.ModGroup;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class ConfigureTestItem extends Item {
    public ConfigureTestItem() {
        super(new Properties().group(ModGroup.itemGroup));
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        if (!worldIn.isRemote) {
            playerIn.sendMessage(new StringTextComponent(Integer.toString(Config.VALUE.get())));
        }
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
