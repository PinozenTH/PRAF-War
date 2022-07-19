package pinont.server.minigame;

import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import pinont.server.minigame.command.*;
import pinont.server.minigame.events.*;

public final class Minigame extends JavaPlugin {
    public static String Plname = ChatColor.AQUA + "[" + ChatColor.BLUE + "NET" + ChatColor.LIGHT_PURPLE + "HER" + ChatColor.YELLOW + "IT" + ChatColor.WHITE + "E" + ChatColor.AQUA + "] ";



    @Override
    public void onEnable() {
        this.getCommand("spawn").setExecutor(new spawn());
        this.getCommand("kit").setExecutor(new kits());
        getServer().getPluginManager().registerEvents(new dia_to_netherite(), this);
        getServer().getPluginManager().registerEvents(new canceldrops(), this);
        getServer().getPluginManager().registerEvents(new wardens(), this);
        getServer().getPluginManager().registerEvents(new joinEvent(), this);
        System.out.println("Minigames Been Loaded!");
    }

    @Override
    public void onDisable() {
        System.out.println("Shutdown Minigames");
    }

}
