package com.tutorial.neutrino.network;

import net.minecraft.network.PacketBuffer;
import net.minecraftforge.fml.network.NetworkEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.function.Supplier;

public class SendPack {
    private String message;
    private static final Logger LOGGER = LogManager.getLogger();

    public SendPack(PacketBuffer buffer) {
        message = buffer.readString();
    }

    public SendPack(String message) {
        this.message = message;
    }

    public void toBytes(PacketBuffer buf) {
        buf.writeString(this.message);
    }

    public void handler(Supplier<NetworkEvent.Context> ctx) {
        ctx.get().enqueueWork(() -> {
            LOGGER.info(this.message);
        });
        ctx.get().setPacketHandled(true);
    }
}
