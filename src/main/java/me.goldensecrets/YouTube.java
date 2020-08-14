package me.goldensecrets;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class YouTube implements CommandExecutor {

	// This method is called, when somebody uses our command
	@Override
	public boolean onCommand (CommandSender sender, Command command, String label, String[] args) {  // Curly braces surround code to be executed.
		if (sender instanceof Player) {
			Player player = (Player) sender;
			player.sendMessage("Equestrians United YouTube Channel is https://www.youtube.com/channel/UCnEzzOx3zHf29RHGPghYkuw"); // All commands end with ;
			return true;
		}
		return false;
	}
}
