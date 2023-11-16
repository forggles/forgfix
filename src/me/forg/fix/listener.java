package me.forg.fix;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerDropItemEvent;

public class listener implements Listener {
	@EventHandler (priority = EventPriority.LOWEST)
	public void playerinteract(PlayerInteractEvent event) {
		Player person = event.getPlayer();
		GameMode theyare = person.getGameMode();
		if(theyare == GameMode.ADVENTURE) {
			person.setGameMode(GameMode.SURVIVAL);
		}
		

	}
	@EventHandler (priority = EventPriority.LOWEST)
	public void playerdrop(PlayerDropItemEvent event) {
		String world = event.getPlayer().getWorld().getName().toString();
		String name = event.getPlayer().getName().toString();
		if(world.equalsIgnoreCase("world")) {
			event.setCancelled(true);
			Bukkit.getLogger().info(name +" tried to drop something in spawn");

		}
	}
	
}
