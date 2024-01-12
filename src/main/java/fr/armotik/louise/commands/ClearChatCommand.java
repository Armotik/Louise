package fr.armotik.louise.commands;

import fr.armotik.louise.Louise;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ClearChatCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        for(int i = 0 ; i < 100 ; i++) {

            Bukkit.broadcastMessage("");
        }

        Bukkit.broadcastMessage(ChatColor.GOLD + "|-------------------+====+-------------------|");
        Bukkit.broadcastMessage(ChatColor.BOLD + Louise.PREFIX + " §cA staff member asked me to clear the chat...");
        Bukkit.broadcastMessage(ChatColor.GOLD + "|-------------------+====+-------------------|");
        return true;
    }
}
