package com.tutorial.neutrino.tickabletileentity;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.text.StringTextComponent;

public class ObsidianHelloTileEntity extends TileEntity implements ITickableTileEntity {
    private static final int MAX_TIME = 5 * 20;
    private int timer = 0;

    public ObsidianHelloTileEntity() {
        super(TileEntityTypeRegistry.obsidianHelloTileentity.get());
    }

    @Override
    public void tick() {
        if (!world.isRemote) {
            if (timer == MAX_TIME) {
                PlayerEntity player = world.getClosestPlayer(pos.getX(), pos.getY(), pos.getZ(), 10, false);
                StringTextComponent stringTextComponent = new StringTextComponent("Hello");
                player.sendMessage(stringTextComponent);
                timer = 0;
            }
            timer++;
        }
    }
}
