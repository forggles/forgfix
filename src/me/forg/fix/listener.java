package me.forg.fix;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;

public class listener implements Listener {
	@EventHandler (priority = EventPriority.LOWEST)
	public void playerinteract(PlayerInteractEvent event) {
		Player person = event.getPlayer();
		GameMode theyare = person.getGameMode();
		if(theyare == GameMode.ADVENTURE) {
			person.setGameMode(GameMode.SURVIVAL);
		}
		

	}
	
}
