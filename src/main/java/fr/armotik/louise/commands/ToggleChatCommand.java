package fr.armotik.louise.commands;

import fr.armotik.louise.Louise;
import fr.armotik.louise.listeners.EventManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ToggleChatCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        String space = ChatColor.GOLD + "|-------------------+====+-------------------|";

        if (EventManager.isChatStatus()) {

            EventManager.setChatStatus(false);

            Bukkit.broadcastMessage(space);
            Bukkit.broadcastMessage(ChatColor.BOLD + Louise.PREFIX + "§cA staff member asked me to turn off the chat...");
            Bukkit.broadcastMessage(space);
        } else {

            EventManager.setChatStatus(true);

            Bukkit.broadcastMessage(space);
            Bukkit.broadcastMessage(ChatColor.BOLD + Louise.PREFIX + "§cA staff member asked me to finally re-enable the chat =)");
            Bukkit.broadcastMessage(space);
        }

        return true;
    }
}
