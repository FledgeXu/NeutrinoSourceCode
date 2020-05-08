package com.tutorial.neutrino.container;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

import javax.annotation.Nullable;

public class ObsidianFirstContainerTileEntity extends TileEntity implements ITickableTileEntity, INamedContainerProvider {

    private Inventory inventory = new Inventory(1);
    private ObsidianFirstContainerItemNumber itemNumber = new ObsidianFirstContainerItemNumber();

    public ObsidianFirstContainerTileEntity() {
        super(TileEntityTypeRegistry.obsidianFirstContainerTileEntity.get());
    }

    @Override
    public ITextComponent getDisplayName() {
        return new StringTextComponent("Fist Container");
    }

    @Nullable
    @Override
    public Container createMenu(int sycID, PlayerInventory inventory, PlayerEntity player) {
        return new ObsidianFirstContainer(sycID, inventory, this.pos, this.world, itemNumber);
    }

    @Override
    public void read(CompoundNBT compound) {
        this.inventory.addItem(ItemStack.read(compound.getCompound("item")));
        super.read(compound);
    }

    @Override
    public CompoundNBT write(CompoundNBT compound) {
        ItemStack itemStack = this.inventory.getStackInSlot(0).copy();
        compound.put("item", itemStack.serializeNBT());
        return super.write(compound);
    }

    public Inventory getInventory() {
        return inventory;
    }

    @Override
    public void tick() {
        if (!world.isRemote) {
            this.itemNumber.set(0, this.inventory.getStackInSlot(0).getCount());
        }
    }
}
