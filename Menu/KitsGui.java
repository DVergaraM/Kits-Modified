package customkits.customkits.Menu;


import customkits.customkits.Creators.Creators;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;;
import org.bukkit.potion.PotionEffectType;

import static org.bukkit.enchantments.Enchantment.LUCK;


public class KitsGui implements InventoryHolder {
    private Inventory inv;
    Creators creators = new Creators();
    public KitsGui() {
        inv = Bukkit.createInventory(this, 18, "Kits");
        init();
    }

    private void init() {
        ItemStack item;
        ItemStack potion;

        /*for(int i = 6; i<17; i++) {
            item = createItem("§7Netherite Gapple", Material.NETHERITE_SWORD);

            inv.setItem(0, item);
        }*/

        //Netherite Gapple
        item = creators.itemCreator("§7Netherite Gapple", Material.NETHERITE_SWORD, ItemFlag.HIDE_ENCHANTS, LUCK, 1);
        inv.setItem(0, item);

        //Diamond Gapple
        item = creators.itemCreator("§3Diamond Gapple", Material.DIAMOND_SWORD, ItemFlag.HIDE_ENCHANTS, LUCK, 1);
        inv.setItem(1, item);

        //Crystal PvP Zolano
        item = creators.itemCreator("§6Crystal PvP 1", Material.END_CRYSTAL, ItemFlag.HIDE_ENCHANTS, LUCK, 1);
        inv.setItem(2, item);

        //Diamond pots
        item = creators.itemCreator("§bDiamond Pots", Material.GOLDEN_CARROT, ItemFlag.HIDE_ENCHANTS, LUCK, 1);
        inv.setItem(3, item);


        // Netherite Pots
        potion = creators.potionCreatorRGB(Material.SPLASH_POTION,"§3Netherite Pots",PotionEffectType.INCREASE_DAMAGE, 0, 1, 134, 34, 12, ItemFlag.HIDE_POTION_EFFECTS);
        inv.setItem(4, potion);

        // Crystal PvP Kotx
        item = creators.itemCreator("§6Crystal PvP 2", Material.RESPAWN_ANCHOR, ItemFlag.HIDE_ENCHANTS, LUCK, 1);
        inv.setItem(5, item);

        //Barrier
        for(int i = 7; i<18; i++) {
            item = creators.itemCreator("§cNo esta disponible", Material.BARRIER, ItemFlag.HIDE_ENCHANTS, LUCK, 1);
            inv.setItem(i, item);
        }
        //Test
        item = creators.itemCreator("§aLoka", Material.BREAD, ItemFlag.HIDE_ENCHANTS, LUCK, 1);
        inv.setItem(6, item);



    }

    @Override
    public Inventory getInventory() {
        return inv;
    }
}
