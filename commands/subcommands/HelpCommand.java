package customkits.customkits.commands.subcommands;

import customkits.customkits.commands.CommandManager;
import customkits.customkits.commands.SubCommand;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class HelpCommand extends SubCommand {

    @Override
    public String getName(){
        return "help";
    }

    @Override
    public String getDescription(){
        return "Show all of the commands for CustomKits";
    }

    @Override
    public String getSyntax(){
        return "/ck help";
    }

    @Override
    public void perform(Player p, String[] args){

        CommandManager commandManager = new CommandManager();
        p.sendMessage(ChatColor.DARK_RED + "======= " + ChatColor.BLUE + ChatColor.BOLD + "Custom" + ChatColor.RED + ChatColor.ITALIC + "Kits " + ChatColor.YELLOW + "Commands " + ChatColor.DARK_RED + "=======");
        for (int i = 0; i < commandManager.getSubCommands().size(); i++){
            p.sendMessage(ChatColor.YELLOW + commandManager.getSubCommands().get(i).getSyntax() + " - " + ChatColor.GRAY + ChatColor.ITALIC + commandManager.getSubCommands().get(i).getDescription());
        }
        p.sendMessage(ChatColor.YELLOW + "/menukits" + " - " + ChatColor.GRAY + ChatColor.ITALIC + "Opens a menu with the kits from /ck kit");
        p.sendMessage(ChatColor.DARK_RED + "=====================================");

    }

}
