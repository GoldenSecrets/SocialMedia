package me.goldensecrets;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class Sender implements CommandExecutor {
    // This method is called, when somebody uses our command
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
    Player player = sender.getPlayer();
    player.sendMessage ("Equestrians United YouTube Channel is https://www.youtube.com/channel/UCnEzzOx3zHf29RHGPghYkuw")
        return true;
    }
}