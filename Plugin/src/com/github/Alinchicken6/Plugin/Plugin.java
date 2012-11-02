package com.github.Alinchicken6.Plugin;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;
 
public final class Plugin extends JavaPlugin {

	public void onEnable(){
		getLogger().info("onEnable has been invoked!");
	}
 
	public void onDisable(){
		getLogger().info("onDisable has been invoked!");
	}
	@EventHandler
	public void onPlayerDeath(EntityDeathEvent event) {
		Object player;
		Player killer = player.getKiller();
		Player target = killer;
		target.setHealth(0);
		}
	}


