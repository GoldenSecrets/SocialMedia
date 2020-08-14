package me.goldensecrets;


public class SocialMedia extends Java {

    @Override
    public void onEnable() {
        //Register our command "Discord"
        this.getCommand("discord").setExecutor(new CommandDiscord());
    }

    @Override
    public void onEnable() {
        //Register our command "Instagram"
        this.getCommand("instagram").setExecutor(new CommandInstagram());
    }

    @Override
    public void onEnable() {
        //Register our command "YouTube"
        this.getCommand("youtube").setExecutor(new CommandYouTube());
    }
}