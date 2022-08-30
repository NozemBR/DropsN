package me.nozembr;

import me.nozembr.events.drop;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class MainD extends JavaPlugin {

    public void onEnable() {

        Bukkit.getPluginManager().registerEvents(new drop(), this);//para declarar eventos


        Bukkit.getConsoleSender().sendMessage("§a[DropsN] Plugin carregado.");

    }

    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§c[DropsN] Plugin descarregado.");

    }
    }
