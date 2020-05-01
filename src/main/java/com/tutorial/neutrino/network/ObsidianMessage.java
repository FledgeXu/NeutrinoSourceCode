package com.tutorial.neutrino.network;

import com.tutorial.neutrino.group.ModGroup;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.PacketDistributor;

public class ObsidianMessage extends Item {
    public ObsidianMessage() {
        super(new Properties().group(ModGroup.itemGroup));
    }


    @Override
    public ActionResultType onItemUse(ItemUseContext context) {
        World world = context.getWorld();
        if (world.isRemote) {
            Networking.INSTANCE.sendToServer(new SendPack("From the Client"));
        }
        if (!world.isRemote) {
            Networking.INSTANCE.send(
                    PacketDistributor.PLAYER.with(
                            () -> {
                                return (ServerPlayerEntity) context.getPlayer();
                            }
                    ),
                    new SendPack("From Server"));

        }
        return super.onItemUse(context);
    }
}
