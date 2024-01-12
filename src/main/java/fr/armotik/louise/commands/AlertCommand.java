package fr.armotik.louise.commands;

import fr.armotik.louise.Louise;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.chat.hover.content.Text;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class AlertCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if (strings.length == 0) {

            TextComponent msg = new TextComponent(Louise.PREFIX + "§cWrong command, please respect the schema");
            msg.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text("§c/alert <args>")));
            commandSender.spigot().sendMessage(msg);
            return false;

        }

        StringBuilder bc = new StringBuilder();

        for (String part : strings) {

            bc.append(part).append(" ");
        }

        Bukkit.broadcastMessage("§c[Alert] : §6" + bc);

        return true;
    }
}
