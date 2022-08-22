package customkits.customkits.kitsConstructor;


import customkits.customkits.Creators.Creators;
import customkits.customkits.Utils.Msg;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;

public class DiamondGapple {
    Creators creators = new Creators();

    ItemStack helmet;
    ItemStack chestplate;
    ItemStack leggings;
    ItemStack boots;
    ItemStack sword;
    public DiamondGapple(Player player) {

        helmet = creators.helmetCreator2(Material.DIAMOND_HELMET, Enchantment.PROTECTION_ENVIRONMENTAL, Enchantment.DURABILITY,4 ,3);

        chestplate = creators.chestplateAndLeggingsCreator2(Material.DIAMOND_CHESTPLATE, Enchantment.PROTECTION_ENVIRONMENTAL, Enchantment.DURABILITY, 4 ,3);

        leggings = creators.chestplateAndLeggingsCreator2(Material.DIAMOND_LEGGINGS, Enchantment.PROTECTION_ENVIRONMENTAL, Enchantment.DURABILITY, 4 ,3);

        boots = creators.bootsCreator2(Material.DIAMOND_BOOTS, Enchantment.PROTECTION_ENVIRONMENTAL, Enchantment.DURABILITY, 4,3 );

        sword = creators.swordCreator3(Material.DIAMOND_SWORD, Enchantment.DAMAGE_ALL, Enchantment.DURABILITY, Enchantment.FIRE_ASPECT,5,3,2);


        ItemStack GApple = new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 64);

        player.getInventory().clear();

        player.getInventory().setHelmet(helmet);
        player.getInventory().setChestplate(chestplate);
        player.getInventory().setLeggings(leggings);
        player.getInventory().setBoots(boots);
        player.getInventory().setItem(0, sword);
        player.getInventory().setItemInOffHand(GApple);

        Msg.send(player, "&fSe te ha dado el Kit &9Diamond Gapple.");
    }
    public DiamondGapple(ArmorStand armorStand) {

        helmet = creators.helmetCreator2(Material.DIAMOND_HELMET, Enchantment.PROTECTION_ENVIRONMENTAL, Enchantment.DURABILITY,4 ,3);

        chestplate = creators.chestplateAndLeggingsCreator2(Material.DIAMOND_CHESTPLATE, Enchantment.PROTECTION_ENVIRONMENTAL, Enchantment.DURABILITY, 4 ,3);

        leggings = creators.chestplateAndLeggingsCreator2(Material.DIAMOND_LEGGINGS, Enchantment.PROTECTION_ENVIRONMENTAL, Enchantment.DURABILITY, 4 ,3);

        boots = creators.bootsCreator2(Material.DIAMOND_BOOTS, Enchantment.PROTECTION_ENVIRONMENTAL, Enchantment.DURABILITY, 4,3 );

        sword = creators.swordCreator3(Material.DIAMOND_SWORD, Enchantment.DAMAGE_ALL, Enchantment.DURABILITY, Enchantment.FIRE_ASPECT,5,3,2);

        ItemStack GApple = new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 64);


        armorStand.getEquipment().setHelmet(helmet);
        armorStand.getEquipment().setChestplate(chestplate);
        armorStand.getEquipment().setLeggings(leggings);
        armorStand.getEquipment().setBoots(boots);
        armorStand.setArms(true);
        armorStand.getEquipment().setItemInMainHand(sword);
        armorStand.getEquipment().setItemInOffHand(GApple);
        armorStand.setInvulnerable(true);

        armorStand.addEquipmentLock(EquipmentSlot.HEAD, ArmorStand.LockType.ADDING_OR_CHANGING);
        armorStand.addEquipmentLock(EquipmentSlot.HEAD, ArmorStand.LockType.REMOVING_OR_CHANGING);
        armorStand.addEquipmentLock(EquipmentSlot.CHEST, ArmorStand.LockType.ADDING_OR_CHANGING);
        armorStand.addEquipmentLock(EquipmentSlot.CHEST, ArmorStand.LockType.REMOVING_OR_CHANGING);
        armorStand.addEquipmentLock(EquipmentSlot.LEGS, ArmorStand.LockType.ADDING_OR_CHANGING);
        armorStand.addEquipmentLock(EquipmentSlot.LEGS, ArmorStand.LockType.REMOVING_OR_CHANGING);
        armorStand.addEquipmentLock(EquipmentSlot.FEET, ArmorStand.LockType.ADDING_OR_CHANGING);
        armorStand.addEquipmentLock(EquipmentSlot.FEET, ArmorStand.LockType.REMOVING_OR_CHANGING);
        armorStand.addEquipmentLock(EquipmentSlot.HAND, ArmorStand.LockType.ADDING_OR_CHANGING);
        armorStand.addEquipmentLock(EquipmentSlot.HAND, ArmorStand.LockType.REMOVING_OR_CHANGING);
        armorStand.addEquipmentLock(EquipmentSlot.OFF_HAND, ArmorStand.LockType.ADDING_OR_CHANGING);
        armorStand.addEquipmentLock(EquipmentSlot.OFF_HAND, ArmorStand.LockType.REMOVING_OR_CHANGING);

    }
}
