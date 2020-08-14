package me.goldensecrets;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class Sender implements CommandExecutor {
    // This method is called, when somebody uses our command
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
    Player player = sender.getPlayer();
    player.sendMessage ("Equestrians United discord is https://discord.gg/BENtZpB")
        return true;
    }
}