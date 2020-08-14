package me.goldensecrets;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

// Class Names should match the class name in IntelliJ (which is also the filename)
public class Insta implements CommandExecutor {

	// This method is called, when somebody uses our command
	@Override
	public boolean onCommand (CommandSender sender, Command command, String label, String[] args) {
		if (sender instanceof Player) { // Is sender a Player?
			Player player = (Player) sender; // If yes, cast sender to player ( Force Java to see sender as player )
			player.sendMessage("Equestrians United instagram is https://www.instagram.com/equestrians.united.mc/");
			return true;
		}
		return false;   // This has to return either true of false. So if sender is not a player (console or command)
		// It will do nothing, and return false.
	}
}
