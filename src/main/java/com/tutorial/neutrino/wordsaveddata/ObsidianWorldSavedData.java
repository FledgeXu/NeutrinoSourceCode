package com.tutorial.neutrino.wordsaveddata;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.INBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.storage.DimensionSavedDataManager;
import net.minecraft.world.storage.WorldSavedData;

import java.util.Stack;

public class ObsidianWorldSavedData extends WorldSavedData {
    private static final String NAME = "ObsidianWorldSavedData";
    private Stack<ItemStack> itemStacks = new Stack<>();

    public ObsidianWorldSavedData() {
        super(NAME);
    }

    public boolean putItem(ItemStack item) {
        itemStacks.push(item);
        markDirty();
        return true;
    }

    public ItemStack getItem() {
        if (itemStacks.isEmpty()) {
            return new ItemStack(Items.AIR);
        }
        markDirty();
        return itemStacks.pop();
    }

    public ObsidianWorldSavedData(String name) {
        super(name);
    }

    public static ObsidianWorldSavedData get(World worldIn) {
        if (!(worldIn instanceof ServerWorld)) {
            throw new RuntimeException("Attempted to get the data from a client world. This is wrong.");
        }

        ServerWorld world = worldIn.getServer().getWorld(DimensionType.OVERWORLD);
        /***
         *   如果你需要每个纬度都有一个自己的World Saved Data。
         *  用 ServerWorld world = (ServerWorld)world; 代替上面那句。
         */
        DimensionSavedDataManager storage = world.getSavedData();
        return storage.getOrCreate(() -> {
            return new ObsidianWorldSavedData();
        }, NAME);
    }

    @Override
    public void read(CompoundNBT nbt) {
        ListNBT listNBT = (ListNBT) nbt.get("list");
        if (listNBT != null) {
            for (INBT value : listNBT) {
                CompoundNBT tag = (CompoundNBT) value;
                ItemStack itemStack = ItemStack.read(tag.getCompound("itemstack"));
                itemStacks.push(itemStack);
            }
        }
    }

    @Override
    public CompoundNBT write(CompoundNBT compound) {
        ListNBT listNBT = new ListNBT();
        itemStacks.stream().forEach((stack) -> {
            CompoundNBT compoundNBT = new CompoundNBT();
            compoundNBT.put("itemstack", stack.serializeNBT());
            listNBT.add(compoundNBT);
        });
        compound.put("list", listNBT);
        return compound;
    }
}
