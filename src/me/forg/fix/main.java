package me.forg.fix;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
	@Override
	public void onEnable() {
	getServer().getPluginManager().registerEvents(new listener(), this);
	this.getCommand("f").setExecutor(new respect());
	this.getCommand("shrug").setExecutor(new shrug());
	this.getCommand("gibcookie").setExecutor(new cookie());
    }
    @Override
    public void onDisable() {
    
    }
    public void mainshiz() {
    	
    }
}
