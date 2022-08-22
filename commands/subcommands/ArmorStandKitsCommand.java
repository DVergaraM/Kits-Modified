package customkits.customkits.commands.subcommands;

import customkits.customkits.commands.SubCommand;
import customkits.customkits.kitsConstructor.*;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class ArmorStandKitsCommand extends SubCommand {

    @Override
    public String getName() {
        return "armorstand";
    }

    @Override
    public String getDescription() {
        return "Set kits to armor stands";
    }

    @Override
    public String getSyntax() {
        return "/ck armorstand <kit>";
    }

    @Override
    public void perform(Player player, String[] args) {

        ArmorStand armorStand = (ArmorStand) player.getWorld().spawnEntity(player.getLocation(), EntityType.ARMOR_STAND);
        armorStand.setBasePlate(false);
        switch (args[1]) {
            case "ngapple":
                new NetheriteGapple(armorStand);
                break;
            case "dgapple":
                new DiamondGapple(armorStand);
                break;
            case "cpvp1":
                new CrystalPvPZolano(armorStand);
                break;
            case "dpots":
                new DiamondPots(armorStand);
                break;
            case "npots":
                new NetheritePots(armorStand);
                break;
            case "cpvp2":
                new CrystalPvPKotx(armorStand);
                break;
            case "loka":
                new Loka(armorStand);
                break;
            default:
                break;
        }

    }
}
