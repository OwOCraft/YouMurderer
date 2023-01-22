package com.logzinga.youmurderer;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class YouMurderer extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents((Listener) new DeathListener(), this);
        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("youmurdererabout")) {
            if(sender instanceof Player) {
                Player p = (Player) sender;
                p.sendMessage("YouMurderer");
                p.sendMessage("Developed by OwOCraft (logzinga), for use in OwOCraft Servers.");
            }
        }
        return true;

    }
}
