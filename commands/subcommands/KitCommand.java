package customkits.customkits.commands.subcommands;

import customkits.customkits.Creators.Creators;
import customkits.customkits.commands.SubCommand;
import customkits.customkits.kitsConstructor.*;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;


public class KitCommand extends SubCommand {

    @Override
    public String getName() {
        return "kit";
    }

    @Override
    public String getDescription() {
        return "Gives you a kit";
    }

    @Override
    public String getSyntax() {
        return "/ck kit <kit>";
    }

    @Override
    public void perform(Player player, String[] args) {

        switch (args[1]) {
            case "ngapple":
                new NetheriteGapple(player);
                break;
            case "dgapple":
                new DiamondGapple(player);
                break;
            case "cpvp1":
                new CrystalPvPZolano(player);
                break;
            case "dpots":
                new DiamondPots(player);
                break;
            case "npots":
                new NetheritePots(player);
                break;
            case "cpvp2":
                new CrystalPvPKotx(player);
                break;
            case "loka":
                new Loka(player);
                break;
            default:
                break;
        }

    }
}
