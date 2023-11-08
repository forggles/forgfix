package me.forg.fix;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.ChatColor;

public class respect implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String label , String[] args) {
		if(sender instanceof Player) {
			Player player = (Player) sender;
			String name = player.getDisplayName();
			Bukkit.broadcastMessage(ChatColor.GOLD + name + ChatColor.GRAY + " has payed their respects.");
			return true;
		}
		return false;
	}
}
