package com.tutorial.neutrino.command;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;
import net.minecraft.util.text.StringTextComponent;

public class TestCommand implements Command<CommandSource> {
    public static TestCommand instance = new TestCommand();

    public static ArgumentBuilder<CommandSource, ?> register(CommandDispatcher<CommandSource> dispatcher) {
        return Commands.literal("test")
                .requires((commandSource) -> {
                    return commandSource.hasPermissionLevel(0);
                })
                .executes(instance);
    }

    @Override
    public int run(CommandContext<CommandSource> context) throws CommandSyntaxException {
        context.getSource().sendFeedback(new StringTextComponent("Hello,world"), false);
        return 0;
    }
}
