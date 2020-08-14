package me.goldensecrets;

import kr.entree.spigradle.annotations.PluginMain;
import org.bukkit.plugin.java.JavaPlugin;

@PluginMain
public class SocialMedia extends JavaPlugin {

	@Override
	public void onEnable () {
		//Register our command "Discord"
		this.getCommand("discord").setExecutor(new CommandDiscord());
	}

	@Override
	public void onEnable () {
		//Register our command "Instagram"
		this.getCommand("instagram").setExecutor(new CommandInstagram());
	}

	@Override
	public void onEnable () {
		//Register our command "YouTube"
		this.getCommand("youtube").setExecutor(new CommandYouTube());
	}
}
