package com.github.adrianacandebat.SuperKits;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import com.github.adrianacandebat.SuperKits.commands.Comando;



public class SuperKits extends JavaPlugin{


PluginDescriptionFile pdffile = getDescription();
public String version = pdffile.getVersion();
public String name = pdffile.getName();


public String latestversion;

public void onEnable() {
	
	registerCommands();
	updateChecker();
	
	
	Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&3++++++++++++++++++++++++++++++++++++++++++++++"));
	Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&2[&4SuperKits&2] &c SuperKits has been enabled"));
	Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&l&7Version 1.0"));
	Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&3++++++++++++++++++++++++++++++++++++++++++++++"));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
public void onDisable() {
	
	Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&3++++++++++++++++++++++++++++++++++++++++++++++"));
	Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&2[&4SuperKits&2] &c SuperKits has been disabled"));
	Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&3++++++++++++++++++++++++++++++++++++++++++++++"));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


























public void registerCommands() {
	
	
	
	
	
	
	
	
	
	
	
	
	
	

		
		this.getCommand("superkits").setExecutor(new Comando (null));
}




public void updateChecker() {
	
	
	  try {
		  HttpURLConnection con = (HttpURLConnection) new URL(
                  "https://api.spigotmc.org/legacy/update.php?resource=41736").openConnection();
          int timed_out = 1250;
          con.setConnectTimeout(timed_out);
          con.setReadTimeout(timed_out);
          latestversion = new BufferedReader(new InputStreamReader(con.getInputStream())).readLine();
          if (latestversion.length() <= 7) {
        	  if(!version.equals(latestversion)){
        		  Bukkit.getConsoleSender().sendMessage(ChatColor.RED +"There is a new version available. "+ChatColor.YELLOW+
        				  "("+ChatColor.GRAY+latestversion+ChatColor.YELLOW+")");
        		  Bukkit.getConsoleSender().sendMessage(ChatColor.RED+"You can download it at: "+ChatColor.WHITE+"");  
        	  }      	  
          }
      } catch (Exception ex) {
    	  Bukkit.getConsoleSender().sendMessage(ChatColor.RED +"Error while checking update.");
      }
  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}







	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	






















