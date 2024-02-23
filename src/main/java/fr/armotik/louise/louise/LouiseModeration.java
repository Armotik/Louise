package fr.armotik.louise.louise;

public class LouiseModeration extends LouiseGlobal {

    /**
     * Get the message when the chat is disabled
     * @return the message
     */
    public static String chatFilter() {
        return getName() + "§cYou cant say that !";
    }

    /**
     * Get the message when the chat is disabled
     * @return the message
     */
    public static String chatDisabled() {
        return getName() + "§cThe chat is currently disabled.";
    }

    /**
     * Get the message when the player is muted
     * @return the message
     */
    public static String muted() {
        return getName() + "§cYou're muted, you can't speak in the chat !";
    }

    /**
     * Get the message when the player sends too many caps in a message
     * @return the message
     */
    public static String tooManyCaps() {
        return getName() + "§cToo many caps in your message !";
    }

    /**
     * Get the message when the player sends a link in the chat
     * @return the message
     */
    public static String unauthorizedLink() {
        return getName() + "§cYou can't send links in the chat !";
    }
}
