package me.forg.fix;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class cookie implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String label , String[] args) {
		if(sender instanceof Player) {
			Player player = (Player) sender;
			String name = player.getDisplayName();
			return  true;
		}
		return false;
	}

}
