package customkits.customkits.commands;

import customkits.customkits.commands.subcommands.*;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class CommandManager implements CommandExecutor {

    private ArrayList<SubCommand> subcommands = new ArrayList<>();

    public CommandManager(){
        //Get the subcommands, so we can access them in the command manager class(here)
        subcommands.add(new HelpCommand());
        subcommands.add(new KitCommand());
        subcommands.add(new ArmorStandKitsCommand());
        subcommands.add(new MenuKits());
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player p = (Player) sender;

                if (args.length == 0){
                    HelpCommand help = new HelpCommand();
                    help.perform(p, args);
                }else if(args.length > 0){
                    boolean isValidSubcommand = false;
                    for (int i = 0; i < this.getSubCommands().size(); i++){
                        if (args[0].equalsIgnoreCase(this.getSubCommands().get(i).getName())){
                            isValidSubcommand = true;
                            //The subcommand matches the argument given in /qm [subcommand]
                            this.getSubCommands().get(i).perform(p, args);

                            break;
                        }
                    }
                    if (!isValidSubcommand){
                        p.sendMessage(ChatColor.RED + "That is not a valid command.");
                        p.sendMessage(ChatColor.GRAY + "Do " + ChatColor.YELLOW + "/ck help" + ChatColor.GRAY + " for more info.");
                    }
                    return true;
                }

        } else {
            System.out.println("This command is for players.");
        }

        return true;
    }

    public ArrayList<SubCommand> getSubCommands(){
        return subcommands;
    }
}
