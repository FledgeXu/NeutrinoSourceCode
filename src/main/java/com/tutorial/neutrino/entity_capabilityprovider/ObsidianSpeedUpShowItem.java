package com.tutorial.neutrino.entity_capabilityprovider;

import com.tutorial.neutrino.group.ModGroup;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.common.util.LazyOptional;

public class ObsidianSpeedUpShowItem extends Item {
    public ObsidianSpeedUpShowItem() {
        super(new Properties().group(ModGroup.itemGroup));
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        if (!worldIn.isRemote && handIn == Hand.MAIN_HAND) {
            LazyOptional<ISpeedUpCapability> speedCap = playerIn.getCapability(ModCapability.SPEED_UP_CAPABILITY);
            speedCap.ifPresent((l) -> {
                        int level = l.getLevel();
                        playerIn.sendMessage(new StringTextComponent("Level: " + level));
                    }
            );
        }
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
