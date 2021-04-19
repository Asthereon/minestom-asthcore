package com.asthereon.asthcore.TestServer;

import com.asthereon.asthcore.AsthCore;
import net.minestom.server.command.CommandSender;
import net.minestom.server.command.builder.Command;
import net.minestom.server.command.builder.CommandContext;

public class AsthCoreCommand extends Command {
    public AsthCoreCommand() {
        super("asthcore");
        addSyntax(this::execute);
    }

    private void execute(CommandSender sender, CommandContext context) {
        AsthCore.sendMessage(sender, "[AsthCore] You are running AsthCore version " + AsthCore.VERSION);
    }

}
