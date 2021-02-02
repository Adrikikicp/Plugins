package com.github.adrianacandebat.SuperKits.commands;

import org.bukkit.command.CommandExecutor;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.github.adrianacandebat.SuperKits.SuperKits;



public class Comando implements CommandExecutor{

@SuppressWarnings("unused")
private static final String[] args = null;

		
	
	private SuperKits plugin; 
	
	public Comando(SuperKits plugin) {
		{
			
			
			
			
		}
	this.plugin = plugin;
	

	}


	public boolean onCommand(CommandSender sender, Command comando, String label, String[] args) {
	
		Player jugador = (Player) sender;
		
		
		
		{
	
			
			
			if(sender instanceof Player) {	

	jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cVersion + pdffile.getVersion()"));
	
	

	
	
	
	
	
	
if(((String) args[0]).equalsIgnoreCase("reload"));
	
	plugin.reloadConfig();
	jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cConfiguration reloaded"));
	
	
	
	}


}
	
		{
		return false;

}
	}
	
}
