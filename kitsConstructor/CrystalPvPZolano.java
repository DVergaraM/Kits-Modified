package customkits.customkits.kitsConstructor;

import customkits.customkits.Creators.Creators;
import customkits.customkits.Utils.Msg;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;

public class CrystalPvPZolano {
    Creators creators = new Creators();

    ItemStack helmet;
    ItemStack chestplate;
    ItemStack leggings;
    ItemStack boots;
    ItemStack sword;
    public CrystalPvPZolano(Player player) {
        helmet = creators.helmetCreator5(Material.NETHERITE_HELMET, Enchantment.PROTECTION_ENVIRONMENTAL, Enchantment.DURABILITY, Enchantment.MENDING, Enchantment.OXYGEN, Enchantment.WATER_WORKER, 4, 3,1,3,1);

        chestplate = creators.chestplateAndLeggingsCreator3(Material.NETHERITE_CHESTPLATE, Enchantment.PROTECTION_ENVIRONMENTAL, Enchantment.DURABILITY, Enchantment.MENDING, 4,3,1);

        leggings = creators.chestplateAndLeggingsCreator3(Material.NETHERITE_LEGGINGS, Enchantment.PROTECTION_EXPLOSIONS, Enchantment.DURABILITY, Enchantment.MENDING, 4,3, 1);

        boots = creators.bootsCreator5(Material.NETHERITE_BOOTS, Enchantment.PROTECTION_ENVIRONMENTAL, Enchantment.DURABILITY, Enchantment.PROTECTION_FALL, Enchantment.DEPTH_STRIDER, Enchantment.MENDING,4,3,4,3,1);

        sword = creators.swordCreator4(Material.NETHERITE_SWORD, Enchantment.DAMAGE_ALL, Enchantment.DURABILITY, Enchantment.FIRE_ASPECT, Enchantment.KNOCKBACK, 5,3,2,1);

        ItemStack Gapps = new ItemStack(Material.GOLDEN_APPLE, 64);
        ItemStack Obsidian = new ItemStack(Material.OBSIDIAN, 64);
        ItemStack Crystal = new ItemStack(Material.END_CRYSTAL, 64);
        ItemStack Anchor = new ItemStack(Material.RESPAWN_ANCHOR, 64);
        ItemStack GlowStone = new ItemStack(Material.GLOWSTONE, 64);
        ItemStack pickaxe = new ItemStack(Material.NETHERITE_PICKAXE);
        pickaxe.addEnchantment(Enchantment.DIG_SPEED, 5);
        ItemStack shovel = new ItemStack(Material.NETHERITE_SHOVEL);
        shovel.addEnchantment(Enchantment.DIG_SPEED, 5);
        ItemStack perlas = new ItemStack(Material.ENDER_PEARL, 16);
        ItemStack totem = new ItemStack(Material.TOTEM_OF_UNDYING);
        ItemStack xp = new ItemStack(Material.EXPERIENCE_BOTTLE, 64);

        player.getInventory().clear();

        player.getEquipment().setHelmet(helmet);
        player.getEquipment().setChestplate(chestplate);
        player.getEquipment().setLeggings(leggings);
        player.getEquipment().setBoots(boots);
        player.getInventory().setItem(0, sword);
        player.getInventory().setItem(1, Obsidian);
        player.getInventory().setItem(2, Crystal);
        player.getInventory().setItem(3, Anchor);
        player.getInventory().setItem(4, GlowStone);
        player.getInventory().setItem(5, Gapps);
        player.getInventory().setItem(6, pickaxe);
        player.getInventory().setItem(7, shovel);
        player.getInventory().setItem(8, perlas);
        player.getInventory().setItemInOffHand(totem);
        player.getInventory().addItem(xp);
        player.getInventory().addItem(totem);
        player.getInventory().addItem(totem);
        player.getInventory().addItem(totem);
        player.getInventory().addItem(totem);
        player.getInventory().addItem(totem);
        player.getInventory().addItem(totem);
        player.getInventory().addItem(perlas);
        player.getInventory().addItem(perlas);
        player.getInventory().addItem(xp);
        player.getInventory().addItem(totem);
        player.getInventory().addItem(totem);
        player.getInventory().addItem(totem);
        player.getInventory().addItem(totem);
        player.getInventory().addItem(totem);
        player.getInventory().addItem(totem);
        player.getInventory().addItem(perlas);
        player.getInventory().addItem(perlas);
        player.getInventory().addItem(xp);
        player.getInventory().addItem(Obsidian);
        player.getInventory().addItem(Crystal);
        player.getInventory().addItem(Anchor);
        player.getInventory().addItem(GlowStone);
        player.getInventory().addItem(totem);
        player.getInventory().addItem(totem);
        player.getInventory().addItem(totem);
        player.getInventory().addItem(totem);

        Msg.send(player, "&fSe te ha dado el Kit &9Crystal PvP.");
    }
    public CrystalPvPZolano(ArmorStand armorStand) {
        helmet = creators.helmetCreator5(Material.NETHERITE_HELMET, Enchantment.PROTECTION_ENVIRONMENTAL, Enchantment.DURABILITY, Enchantment.MENDING, Enchantment.OXYGEN, Enchantment.WATER_WORKER, 4, 3,1,3,1);

        chestplate = creators.chestplateAndLeggingsCreator3(Material.NETHERITE_CHESTPLATE, Enchantment.PROTECTION_ENVIRONMENTAL, Enchantment.DURABILITY, Enchantment.MENDING, 4,3,1);

        leggings = creators.chestplateAndLeggingsCreator3(Material.NETHERITE_LEGGINGS, Enchantment.PROTECTION_EXPLOSIONS, Enchantment.DURABILITY, Enchantment.MENDING, 4,3, 1);

        boots = creators.bootsCreator5(Material.NETHERITE_BOOTS, Enchantment.PROTECTION_ENVIRONMENTAL, Enchantment.DURABILITY, Enchantment.PROTECTION_FALL, Enchantment.DEPTH_STRIDER, Enchantment.MENDING,4,3,4,3,1);

        sword = creators.swordCreator4(Material.NETHERITE_SWORD, Enchantment.DAMAGE_ALL, Enchantment.DURABILITY, Enchantment.FIRE_ASPECT, Enchantment.KNOCKBACK, 5,3,2,1);

        ItemStack totem = new ItemStack(Material.TOTEM_OF_UNDYING);

        armorStand.getEquipment().setHelmet(helmet);
        armorStand.getEquipment().setChestplate(chestplate);
        armorStand.getEquipment().setLeggings(leggings);
        armorStand.getEquipment().setBoots(boots);
        armorStand.setArms(true);
        armorStand.getEquipment().setItemInMainHand(sword);
        armorStand.getEquipment().setItemInOffHand(totem);
        armorStand.setInvulnerable(true);
        //Asegurar
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
