package me.goldensecrets;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Default;
import de.leonhard.storage.Yaml;
import org.bukkit.block.CommandBlock;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.logging.Logger;

// Class Names should match the class name in IntelliJ (which is also the filename)
@CommandAlias("instagram")
public class Insta extends BaseCommand {

    // We can use the name plugin here because it is private and does not extend JavaPlugin
    private static final SocialMedia plugin = SocialMedia.getInstance();

    @Default // Use default because there are no sub command or arguments passed to it.
    public static void onInstagram (CommandSender sender) {
        Yaml config;
        config = new Yaml("config",SocialMedia.getInstance().getDataFolder().toString(),SocialMedia.getInstance().getResource("config.yml"));
        String url;
        url = config.getString("Instagram.url");
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.sendMessage("Equestrians United Instagram is https://www.instagram.com/equestrians.united.mc/?hl=en");
            // This command structure is a void type; which means you do not need to return anything.
        }
        if (! (sender instanceof CommandBlock)) {
            // Read about logic operators in Java. ! means not
            // so in this case if sender is NOT a CommandBlock do this code
            Logger log = plugin.getLogger();
            // There are several levels you can write to log (console)
            // The main ones are INFO, WARN, ERROR
            log.info("Did you forget the Instagram link boss?");
            log.info("It is https://www.instagram.com/equestrians.united.mc/?hl=en");
        }
    }
}
