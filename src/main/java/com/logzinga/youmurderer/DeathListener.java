package com.logzinga.youmurderer;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathListener implements Listener {

    @EventHandler
    public void onDeath(PlayerDeathEvent e){
        Player player = e.getEntity().getPlayer();
        e.setDeathMessage(e.getDeathMessage() + ", they might want a lawyer");
    }

}
