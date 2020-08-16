package me.goldensecrets;

import co.aikar.commands.BukkitCommandManager;
import org.bukkit.plugin.java.JavaPlugin;

/* This confused me too:
 *
 * Error:   Please present your main class using the annotation @kr.entree.spigradle.annotations.PluginMain or @Plugin,
 * Error:   or set the 'main' property in spigot {} block on build.gradle,
 *
 * It either wants @Plugin OR @kr.entree.spigradle.annotations.PluginMain
 * I thought @PluginMain would work. But no bueno. ^_^
 * I couldn't get either annotation to work. I added main to build.gradle
 */

public class SocialMedia extends JavaPlugin {


	private static SocialMedia instance;

	@Override
	public void onEnable () {   // Only use one onEnable- you can run as many methods or commands as you want to inside it.
		instance = this;
		registerCommands();
	}

	private void registerCommands () {
		// You need to register a command manager. You only need to do this once.
		BukkitCommandManager manager = new BukkitCommandManager(this);
		// Then use the manager to register each command.
		manager.registerCommand(new Discord());
		// Register the other commands here
	}

	// This method is used to refer to the plugin from other classes.
	// Think of it as "getPlugin" but that method is used by Bukkit so we use different name.
	public static SocialMedia getInstance () {
		return instance;
	}
}
