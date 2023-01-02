package com.logzinga.youmurderer;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathListener implements Listener {

    @EventHandler
    public void onDeath(PlayerDeathEvent e){
        e.getDeathMessage = death;

        e.setDeathMessage(death + "you might want a lawyer");
    }
}
