package fr.armotik.louise.louise;

public abstract class LouiseGlobal {
    private static final String NAME = "§7[§aLouise§7] : ";

    /**
     * Get the name of Louise
     * @return the name
     */
    public static String getName() {
        return NAME;
    }

    /**
     * Get the message when the permission is missing
     * @return the message
     */
    public static String permissionMissing() {
        return getName() + "§c You don't have the permission !";
    }

    /**
     * Get the message when the command is wrong
     * @return the message
     */
    public static String wrongCommand() {
        return getName() + "§cWrong command. Please respect the schema.";
    }

    /**
     * Get the message when the player is not found
     * @return the message
     */
    public static String playerNotFound() {
        return getName() + "§cUnknown player";
    }

    /**
     * Get the message when the command has an error
     * @return the message
     */
    public static String commandError() {
        return getName() + "§cThere was an error during the execution of the order. It could not be completed";
    }
}
