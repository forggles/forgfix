package me.forg.fix;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class shrug implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player) {
			Player player = (Player) sender;
			StringBuilder message = new StringBuilder();
			for(int i = 0; i < args.length; i++) {
				message.append(" ");
				message.append(args[i]);
			}
			player.chat("¯\\_(ツ)_/¯"+message.toString());
			return true;
		}
		return false;
	}

}
