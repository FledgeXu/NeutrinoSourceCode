package com.tutorial.neutrino.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.tree.LiteralCommandNode;
import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;

@Mod.EventBusSubscriber
public class CommandEventHandler {
    @SubscribeEvent
    public static void onServerStaring(FMLServerStartingEvent event) {
        CommandDispatcher<CommandSource> dispatcher = event.getCommandDispatcher();
        LiteralCommandNode<CommandSource> cmd = dispatcher.register(
                Commands.literal("neutrino").then(
                        Commands.literal("test")
                                .requires((commandSource) -> {
                                    return commandSource.hasPermissionLevel(0);
                                })
                                .executes(TestCommand.instance)
                )
        );
        dispatcher.register(Commands.literal("nu").redirect(cmd));
    }
}
