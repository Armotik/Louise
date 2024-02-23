package fr.armotik.louise;

import fr.armotik.louise.commands.AlertCommand;
import fr.armotik.louise.commands.ClearChatCommand;
import fr.armotik.louise.commands.RankCommand;
import fr.armotik.louise.commands.ToggleChatCommand;
import fr.armotik.louise.listeners.EventManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;
import java.util.logging.Logger;

public final class Louise extends JavaPlugin {

    private static Louise instance;
    private final Logger logger = Logger.getLogger(Louise.class.getName());
    public static final String PREFIX = "§7[§aLouise§7] : ";

    @Override
    public void onEnable() {
        // Plugin startup logic

        logger.info("[Louise] -> Plugin is starting...");
        instance = this;

        Objects.requireNonNull(getCommand("clearchat")).setExecutor(new ClearChatCommand());
        Objects.requireNonNull(getCommand("togglechat")).setExecutor(new ToggleChatCommand());
        Objects.requireNonNull(getCommand("alert")).setExecutor(new AlertCommand());
        Objects.requireNonNull(getCommand("rank")).setExecutor(new RankCommand());

        getServer().getPluginManager().registerEvents(new EventManager(), this);

        logger.info("[Louise] -> Plugin is started !");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    /**
     * Get the instance of the plugin
     * Singleton pattern
     * @return instance
     */
    public static Louise getInstance() {

        if (instance == null) {
            instance = new Louise();
        }

        return instance;
    }
}
