package me.goldensecrets;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Sender implements CommandExecutor {

	// This method is called, when somebody uses our command
	@Override
	public boolean onCommand (CommandSender sender, Command command, String label, String[] args) {
		if (sender instanceof Player) {
			Player player = (Player) sender;
		player.sendMessage("Equestrians United discord is https://discord.gg/BENtZpB");
		return true;
		}
		return false; // See note in Insta class
	}
}
