package customkits.customkits.listeners;

import customkits.customkits.Menu.KitsGui;
import customkits.customkits.Utils.Msg;
import customkits.customkits.kitsConstructor.*;
import org.bukkit.BanList;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import java.util.Objects;

public class InventoryEvents implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        if (event.getClickedInventory() == null) return;
        Player player = (Player) event.getWhoClicked();

        if (event.isLeftClick()) {
            if (event.getClickedInventory().getHolder() instanceof KitsGui) {

                event.setCancelled(true);


                switch (Objects.requireNonNull(event.getCurrentItem()).getType()) {
                    case NETHERITE_SWORD:
                        new NetheriteGapple(player);
                        player.closeInventory();
                        break;
                    case DIAMOND_SWORD:
                        new DiamondGapple(player);
                        player.closeInventory();
                        break;
                    case END_CRYSTAL:
                        new CrystalPvPZolano(player);
                        player.closeInventory();
                        break;
                    case GOLDEN_CARROT:
                        new DiamondPots(player);
                        player.closeInventory();
                        break;
                    case SPLASH_POTION:
                        new NetheritePots(player);
                        player.closeInventory();
                        break;
                    case RESPAWN_ANCHOR:
                        new CrystalPvPKotx(player);
                        player.closeInventory();
                    case BARRIER:
                        Msg.send(player, "&fSe ha cerrado el Menu &aKits");
                        player.closeInventory();
                        break;
                    default:
                        break;
                }
            }
        } else return;

    }
}
