package com.tutorial.neutrino.network;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.network.NetworkRegistry;
import net.minecraftforge.fml.network.simple.SimpleChannel;

public class Networking {
    public static SimpleChannel INSTANCE;
    private static int ID = 0;

    public static int nextID() {
        return ID++;
    }

    public static void registerMessage() {
        INSTANCE = NetworkRegistry.newSimpleChannel(
                new ResourceLocation("neutrino" + ":first_networking"),
                () -> {
                    return "1.0";
                },
                (s) -> {
                    return true;
                },
                (s) -> {
                    return true;
                });
        INSTANCE.registerMessage(
                nextID(),
                SendPack.class,
                (pack, buffer) -> {
                    pack.toBytes(buffer);
                },
                (buffer) -> {
                    return new SendPack(buffer);
                },
                (pack,ctx) ->{
                    pack.handler(ctx);
                }
        );
    }
}
