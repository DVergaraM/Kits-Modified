package customkits.customkits.kitsConstructor;

import customkits.customkits.Creators.Creators;
import customkits.customkits.Utils.Msg;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;


public class Loka {
    Creators creators = new Creators();

    ItemStack helmet;
    ItemStack chestplate;
    ItemStack leggings;
    ItemStack boots;
    ItemStack sword;
    public Loka(Player player) {

        helmet = creators.helmetCreator2(Material.DIAMOND_HELMET, Enchantment.PROTECTION_ENVIRONMENTAL, Enchantment.DURABILITY, 2,3);

        chestplate = creators.chestplateAndLeggingsCreator2(Material.DIAMOND_CHESTPLATE, Enchantment.PROTECTION_ENVIRONMENTAL, Enchantment.DURABILITY, 2, 3);

        leggings = creators.chestplateAndLeggingsCreator2(Material.DIAMOND_LEGGINGS, Enchantment.PROTECTION_ENVIRONMENTAL, Enchantment.DURABILITY,2 ,3);

        boots = creators.bootsCreator2(Material.DIAMOND_BOOTS, Enchantment.PROTECTION_ENVIRONMENTAL, Enchantment.DURABILITY, 2, 3);

        sword = creators.swordCreator3(Material.DIAMOND_SWORD, Enchantment.DAMAGE_ALL, Enchantment.DURABILITY, Enchantment.FIRE_ASPECT, 3,3, 2);

        ItemStack gCarrot = new ItemStack(Material.BREAD, 64);
        ItemStack gapps = new ItemStack(Material.ENDER_PEARL, 16);

        ItemStack speed2 = creators.potionCreatorRGB(Material.SPLASH_POTION, "§fSpeed II", PotionEffectType.SPEED, 2, 1800, 115, 184, 184, ItemFlag.HIDE_POTION_EFFECTS);
        ItemStack strength2 = creators.potionCreatorRGB(Material.SPLASH_POTION, "§fStrength II", PotionEffectType.INCREASE_DAMAGE, 2, 1800, 134, 34, 12, ItemFlag.HIDE_POTION_EFFECTS);

        ItemStack InstantHealth = creators.potionCreator(Material.SPLASH_POTION, "§fInstant Health II", PotionEffectType.HEAL, 2, 0, Color.RED, ItemFlag.HIDE_POTION_EFFECTS);


        ItemStack regen = creators.potionCreatorRGB(Material.SPLASH_POTION, "§fRegeneration", PotionEffectType.REGENERATION, 1, 1800, 220, 89, 192, ItemFlag.HIDE_POTION_EFFECTS);

        ItemStack magma = new Creators().itemCreator("Magma", Material.MAGMA_CREAM, ItemFlag.HIDE_ENCHANTS, Enchantment.LUCK, 1);



        player.getInventory().clear();
        player.getEquipment().setHelmet(helmet);
        player.getEquipment().setChestplate(chestplate);
        player.getEquipment().setLeggings(leggings);
        player.getEquipment().setBoots(boots);
        player.getInventory().setItem(0, sword);
        player.getInventory().setItemInOffHand(magma);
        player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 6000, 0));
        player.getInventory().setItem(1, gCarrot);
        player.getInventory().setItem(2, gapps);
        player.getInventory().setItem(3, speed2);
        player.getInventory().setItem(4,regen);
        player.getInventory().setItem(5, strength2);
        player.getInventory().setItem(6, InstantHealth);
        player.getInventory().setItem(7, InstantHealth);
        player.getInventory().setItem(8, InstantHealth);

        player.getInventory().addItem(InstantHealth);
        player.getInventory().addItem(InstantHealth);
        player.getInventory().addItem(InstantHealth);
        player.getInventory().addItem(InstantHealth);
        player.getInventory().addItem(InstantHealth);
        player.getInventory().addItem(InstantHealth);
        player.getInventory().addItem(InstantHealth);
        player.getInventory().addItem(InstantHealth);
        player.getInventory().addItem(InstantHealth);

        player.getInventory().addItem(InstantHealth);
        player.getInventory().addItem(InstantHealth);
        player.getInventory().addItem(InstantHealth);
        player.getInventory().addItem(speed2);
        player.getInventory().addItem(regen);
        player.getInventory().addItem(strength2);
        player.getInventory().addItem(InstantHealth);
        player.getInventory().addItem(InstantHealth);
        player.getInventory().addItem(InstantHealth);

        player.getInventory().addItem(InstantHealth);
        player.getInventory().addItem(InstantHealth);
        player.getInventory().addItem(InstantHealth);
        player.getInventory().addItem(speed2);
        player.getInventory().addItem(regen);
        player.getInventory().addItem(strength2);
        player.getInventory().addItem(InstantHealth);
        player.getInventory().addItem(InstantHealth);
        player.getInventory().addItem(InstantHealth);


        Msg.send(player, "&fSe te ha dado el Kit &9Loka.");

    }

    public Loka(ArmorStand armorStand) {
        helmet = creators.helmetCreator2(Material.DIAMOND_HELMET, Enchantment.PROTECTION_ENVIRONMENTAL, Enchantment.DURABILITY, 4,3);

        chestplate = creators.chestplateAndLeggingsCreator2(Material.DIAMOND_CHESTPLATE, Enchantment.PROTECTION_ENVIRONMENTAL, Enchantment.DURABILITY, 4, 3);

        leggings = creators.chestplateAndLeggingsCreator2(Material.DIAMOND_LEGGINGS, Enchantment.PROTECTION_ENVIRONMENTAL, Enchantment.DURABILITY,4 ,3);

        boots = creators.bootsCreator2(Material.DIAMOND_BOOTS, Enchantment.PROTECTION_ENVIRONMENTAL, Enchantment.DURABILITY, 4, 3);

        sword = creators.swordCreator3(Material.DIAMOND_SWORD, Enchantment.DAMAGE_ALL, Enchantment.DURABILITY, Enchantment.FIRE_ASPECT, 5,3, 2);

        ItemStack magma = new Creators().itemCreator("Magma", Material.MAGMA_CREAM, ItemFlag.HIDE_ENCHANTS, Enchantment.LUCK, 1);
        armorStand.getEquipment().setHelmet(helmet);
        armorStand.getEquipment().setChestplate(chestplate);
        armorStand.getEquipment().setLeggings(leggings);
        armorStand.getEquipment().setBoots(boots);
        armorStand.setArms(true);
        armorStand.getEquipment().setItemInMainHand(sword);
        armorStand.getEquipment().setItemInOffHand(magma);
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
