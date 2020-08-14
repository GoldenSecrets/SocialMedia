package me.goldensecrets;

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

	@Override
	public void onEnable () {   // Only use one onEnable- you can run as many methods or commands as you want to inside it.
		//Register our command "Discord"
		this.getCommand("discord").setExecutor(new Sender()); // When server hears "discord" command start Sender class

		//Register our command "Instagram"
		this.getCommand("instagram").setExecutor(new Insta()); // When Server hears "instagram" run new Insta class.
		// This needs to match the class you put the command code in

		//Register our command "YouTube"
		this.getCommand("youtube").setExecutor(new YouTube()); // Try and guess what this does ^_^
	}
}
