package fr.armotik.louise.listeners;

import fr.armotik.louise.Louise;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class EventManager implements Listener {

    private static boolean chatStatus = true;

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {

        Player player = event.getPlayer();

            if(!chatStatus && !player.hasPermission("naurellia.staff.helper")) {

                event.setCancelled(true);
                player.sendMessage(Louise.PREFIX + "§cThe chat is currently disabled.");
            }
    }

    public static boolean isChatStatus() {
        return chatStatus;
    }

    public static void setChatStatus(boolean chatStatus) {
        chatStatus = chatStatus;
    }
}
