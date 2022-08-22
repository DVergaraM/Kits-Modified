package customkits.customkits.commands.subcommands;

import customkits.customkits.Menu.KitsGui;
import customkits.customkits.Utils.Msg;
import customkits.customkits.commands.SubCommand;
import org.bukkit.entity.Player;

public class MenuKits extends SubCommand {
    @Override
    public String getName() {
        return "menukits";
    }

    @Override
    public String getDescription() {
        return "Opens a menu with the kits from /ck kit";
    }

    @Override
    public String getSyntax() {
        return "/ck menukits";
    }

    @Override
    public void perform(Player player, String[] args) {

        KitsGui gui = new KitsGui();

        player.openInventory(gui.getInventory());
        Msg.send(player, "&fEscoge tu kit");

    }
}
