package com.asthereon.asthcore.TestServer;

import com.asthereon.asthcore.AsthCore;
import net.minestom.server.MinecraftServer;
import net.minestom.server.command.CommandManager;

public class TestServer {

    public static void main(String[] args) {
        MinecraftServer minecraftServer = AsthCore.createTestServer();
        registerCommands();
        AsthCore.startTestServer(minecraftServer);
    }

    private static void registerCommands() {
        CommandManager commandManager = MinecraftServer.getCommandManager();
        commandManager.register(new AsthCoreCommand());
    }

}
