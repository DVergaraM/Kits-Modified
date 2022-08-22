package customkits.customkits;

import customkits.customkits.commands.CommandManager;
import customkits.customkits.listeners.InventoryEvents;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class CustomKits extends JavaPlugin {

    private static CustomKits plugin;

    @Override
    public void onEnable() {

        plugin = this;

        System.out.println("Custom Kits enabled");
        getServer().getPluginManager().registerEvents(new InventoryEvents(), this);
        Objects.requireNonNull(getCommand("customkits")).setExecutor(new CommandManager());

    }

    @Override
    public void onDisable() {
        System.out.println("Custom Kits disabled");
    }

    public static CustomKits getPlugin() {
        return plugin;
    }
}
