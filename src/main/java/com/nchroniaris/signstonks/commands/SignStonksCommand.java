package com.nchroniaris.signstonks.commands;


import com.nchroniaris.signstonks.command.SSTCommand;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.Consumer;

public class SignStonksCommand extends SSTCommand {

    public SignStonksCommand() {

        super(
                new RegisterCommand(),
                new UnregisterCommand()
        );

    }

    @Override
    public boolean execute(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull List<String> args) {

        return false;

    }

    @Override
    public @NotNull String getLabel() {

        return "signstonks";

    }

    @Override
    public void sendHelp(Consumer<String> recipient) {

        recipient.accept(this.getClass().getCanonicalName() + ": test help message");

    }
}
