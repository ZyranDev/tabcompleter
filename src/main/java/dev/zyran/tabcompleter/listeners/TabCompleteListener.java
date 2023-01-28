package dev.zyran.tabcompleter.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandSendEvent;

public class TabCompleteListener implements Listener {

    private final String permission;

    public TabCompleteListener(String permission) {
        this.permission = permission;
    }

    @EventHandler
    public void onTabComplete(PlayerCommandSendEvent event) {
        if (!event.getPlayer().hasPermission(permission)) {
            event.getCommands().clear();
        }
    }

}
