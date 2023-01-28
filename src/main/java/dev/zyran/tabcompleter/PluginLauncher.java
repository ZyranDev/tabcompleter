package dev.zyran.tabcompleter;

import dev.zyran.tabcompleter.listeners.TabCompleteListener;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("unused")
public class PluginLauncher extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();
        FileConfiguration config = getConfig();
        TabCompleteListener tabCompleteListener = new TabCompleteListener(config.getString("permission"));
        getServer().getPluginManager().registerEvents(tabCompleteListener, this);
    }
}
