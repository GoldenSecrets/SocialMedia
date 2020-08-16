package me.goldensecrets;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Default;
import org.bukkit.block.CommandBlock;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.logging.Logger;

@CommandAlias("YouTube")
public class YouTube extends BaseCommand {

	private static final SocialMedia plugin = SocialMedia.getInstance();
	// This method is called, when somebody uses our command
	@Default
	public static void onYouTube (CommandSender sender) {  // Curly braces surround code to be executed.
		if (sender instanceof Player) {
			Player player = (Player) sender;
			player.sendMessage("Equestrians United YouTube is https://www.youtube.com/channel/UCnEzzOx3zHf29RHGPghYkuw");
			// This command structure is a void type; which means you do not need to return anything.
		}
		if (! (sender instanceof CommandBlock)) {
			// Read about logic operators in Java. ! means not
			// so in this case if sender is NOT a CommandBlock do this code
			Logger log = plugin.getLogger();
			// There are several levels you can write to log (console)
			// The main ones are INFO, WARN, ERROR
			log.info("Did you forget the YouTube link boss?");
			log.info("It is https://www.youtube.com/channel/UCnEzzOx3zHf29RHGPghYkuw");
		}
	}
}
