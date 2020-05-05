package com.tutorial.neutrino.wordsaveddata;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

public class ObsidianItemSaveBlock extends Block {
    public ObsidianItemSaveBlock() {
        super(Properties.create(Material.ROCK).hardnessAndResistance(5));
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        if (!worldIn.isRemote && handIn == Hand.MAIN_HAND) {
            ObsidianWorldSavedData worldSavedData = ObsidianWorldSavedData.get(worldIn);
            ItemStack mainHandItemStack = player.getItemStackFromSlot(EquipmentSlotType.MAINHAND);
            if (!mainHandItemStack.isEmpty()) {
                worldSavedData.putItem(mainHandItemStack.copy());
                mainHandItemStack.shrink(mainHandItemStack.getCount());
            } else {
                ItemStack stack = worldSavedData.getItem();
                player.setItemStackToSlot(EquipmentSlotType.MAINHAND, stack);
            }
        }
        return ActionResultType.SUCCESS;
    }
}
