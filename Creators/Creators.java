package customkits.customkits.Creators;

import org.bukkit.*;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Set;

public class Creators implements CreatorsInterface {
    @Override
    public ItemStack potionCreatorRGB(Material material, String name, PotionEffectType Effect, int effectLevel, int duration, int red, int green, int blue, ItemFlag flag) {

        ItemStack potion = new ItemStack(material);
        PotionMeta meta = (PotionMeta) potion.getItemMeta();
        meta.setColor(Color.fromRGB(red, green, blue));
        meta.setDisplayName(name);
        meta.addCustomEffect(new PotionEffect(Effect, duration, effectLevel - 1), true);
        meta.addItemFlags(flag);
        potion.setItemMeta(meta);
        return potion;
    }

    @Override
    public ItemStack potionCreator(Material material, String name, PotionEffectType Effect, int effectLevel, int duration, Color color, ItemFlag flag) {

        ItemStack potion = new ItemStack(material);
        PotionMeta meta = (PotionMeta) potion.getItemMeta();
        meta.setColor(color);
        meta.setDisplayName(name);
        meta.addCustomEffect(new PotionEffect(Effect, duration, effectLevel - 1), true);
        meta.addItemFlags(flag);
        potion.setItemMeta(meta);
        return potion;
    }

    @Override
    public ItemStack itemCreator(String name, Material material, ItemFlag flag, Enchantment enchantment, int enchantmentLevel) {
        ItemStack item = new ItemStack(material, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName(name);
        meta.addEnchant(enchantment, enchantmentLevel, false);
        meta.addItemFlags(flag);
        item.setItemMeta(meta);
        return item;
    }

    @Override
    public ItemStack helmetCreator2(Material helmetType, Enchantment firstEnchantment, Enchantment secondEnchantment, int firstEnchantmentLevel, int secondEnchantmentLevel) {

        ItemStack helmet = new ItemStack(helmetType, 1);
        helmet.addUnsafeEnchantment(firstEnchantment, firstEnchantmentLevel);
        helmet.addEnchantment(secondEnchantment, secondEnchantmentLevel);

        return helmet;
    }

    @Override
    public ItemStack helmetCreator3(Material helmetType, Enchantment firstEnchantment, Enchantment secondEnchantment, Enchantment thirdEnchantment, int firstEnchantmentLevel, int secondEnchantmentLevel, int thirdEnchantmentLevel) {

        ItemStack helmet = new ItemStack(helmetType, 1);
        helmet.addEnchantment(firstEnchantment, firstEnchantmentLevel);
        helmet.addEnchantment(secondEnchantment, secondEnchantmentLevel);
        helmet.addEnchantment(thirdEnchantment, thirdEnchantmentLevel);

        return helmet;
    }

    @Override
    public ItemStack helmetCreator4(Material helmetType, Enchantment firstEnchantment, Enchantment secondEnchantment, Enchantment thirdEnchantment, Enchantment fourthEnchantment, int firstEnchantmentLevel, int secondEnchantmentLevel, int thirdEnchantmentLevel, int fourthEnchantmentLevel) {

        ItemStack helmet = new ItemStack(helmetType, 1);
        helmet.addEnchantment(firstEnchantment, firstEnchantmentLevel);
        helmet.addEnchantment(secondEnchantment, secondEnchantmentLevel);
        helmet.addEnchantment(thirdEnchantment, thirdEnchantmentLevel);
        helmet.addEnchantment(fourthEnchantment, fourthEnchantmentLevel);

        return helmet;
    }

    @Override
    public ItemStack helmetCreator5(Material helmetType, Enchantment firstEnchantment, Enchantment secondEnchantment, Enchantment thirdEnchantment, Enchantment fourthEnchantment, Enchantment fifthEnchantment, int firstEnchantmentLevel, int secondEnchantmentLevel, int thirdEnchantmentLevel, int fourthEnchantmentLevel, int fifthEnchantmentLevel) {

        ItemStack helmet = new ItemStack(helmetType, 1);
        helmet.addEnchantment(firstEnchantment, firstEnchantmentLevel);
        helmet.addEnchantment(secondEnchantment, secondEnchantmentLevel);
        helmet.addEnchantment(thirdEnchantment, thirdEnchantmentLevel);
        helmet.addEnchantment(fourthEnchantment, fourthEnchantmentLevel);
        helmet.addEnchantment(fifthEnchantment, fifthEnchantmentLevel);

        return helmet;
    }

    @Override
    public ItemStack chestplateAndLeggingsCreator2(Material type, Enchantment firstEnchantment, Enchantment secondEnchantment, int firstEnchantmentLevel, int secondEnchantmentLevel) {
        ItemStack chestplateOrLeggings = new ItemStack(type, 1);
        chestplateOrLeggings.addEnchantment(firstEnchantment, firstEnchantmentLevel);
        chestplateOrLeggings.addEnchantment(secondEnchantment, secondEnchantmentLevel);

        return chestplateOrLeggings;
    }

    @Override
    public ItemStack chestplateAndLeggingsCreator3(Material type, Enchantment firstEnchantment, Enchantment secondEnchantment, Enchantment thirdEnchantment, int firstEnchantmentLevel, int secondEnchantmentLevel, int thirdEnchantmentLevel) {
        ItemStack chestplateOrLeggings = new ItemStack(type, 1);
        chestplateOrLeggings.addEnchantment(firstEnchantment, firstEnchantmentLevel);
        chestplateOrLeggings.addEnchantment(secondEnchantment, secondEnchantmentLevel);
        chestplateOrLeggings.addEnchantment(thirdEnchantment, thirdEnchantmentLevel);

        return chestplateOrLeggings;
    }

    @Override
    public ItemStack bootsCreator2(Material bootsType, Enchantment firstEnchantment, Enchantment secondEnchantment, int firstEnchantmentLevel, int secondEnchantmentLevel) {

        ItemStack boots = new ItemStack(bootsType, 1);
        boots.addEnchantment(firstEnchantment, firstEnchantmentLevel);
        boots.addEnchantment(secondEnchantment, secondEnchantmentLevel);

        return boots;
    }

    @Override
    public ItemStack bootsCreator3(Material bootsType, Enchantment firstEnchantment, Enchantment secondEnchantment, Enchantment thirdEnchantment, int firstEnchantmentLevel, int secondEnchantmentLevel, int thirdEnchantmentLevel) {

        ItemStack boots = new ItemStack(bootsType, 1);
        boots.addEnchantment(firstEnchantment, firstEnchantmentLevel);
        boots.addEnchantment(secondEnchantment, secondEnchantmentLevel);
        boots.addEnchantment(thirdEnchantment, thirdEnchantmentLevel);

        return boots;
    }

    @Override
    public ItemStack bootsCreator4(Material bootsType, Enchantment firstEnchantment, Enchantment secondEnchantment, Enchantment thirdEnchantment, Enchantment fourthEnchantment, int firstEnchantmentLevel, int secondEnchantmentLevel, int thirdEnchantmentLevel, int fourthEnchantmentLevel) {
        ItemStack boots = new ItemStack(bootsType, 1);
        boots.addEnchantment(firstEnchantment, firstEnchantmentLevel);
        boots.addEnchantment(secondEnchantment, secondEnchantmentLevel);
        boots.addEnchantment(thirdEnchantment, thirdEnchantmentLevel);
        boots.addEnchantment(fourthEnchantment, fourthEnchantmentLevel);

        return boots;
    }

    @Override
    public ItemStack bootsCreator5(Material bootsType, Enchantment firstEnchantment, Enchantment secondEnchantment, Enchantment thirdEnchantment, Enchantment fourthEnchantment, Enchantment fifthEnchantment, int firstEnchantmentLevel, int secondEnchantmentLevel, int thirdEnchantmentLevel, int fourthEnchantmentLevel, int fifthEnchantmentLevel) {
        ItemStack boots = new ItemStack(bootsType, 1);
        boots.addEnchantment(firstEnchantment, firstEnchantmentLevel);
        boots.addEnchantment(secondEnchantment, secondEnchantmentLevel);
        boots.addEnchantment(thirdEnchantment, thirdEnchantmentLevel);
        boots.addEnchantment(fourthEnchantment, fourthEnchantmentLevel);
        boots.addEnchantment(fifthEnchantment, fifthEnchantmentLevel);

        return boots;
    }

    @Override
    public ItemStack swordCreator2(Material swordType, Enchantment firstEnchantment, Enchantment secondEnchantment, int firstEnchantmentLevel, int secondEnchantmentLevel) {

        ItemStack sword = new ItemStack(swordType, 1);
        sword.addEnchantment(firstEnchantment, firstEnchantmentLevel);
        sword.addEnchantment(secondEnchantment, secondEnchantmentLevel);

        return sword;
    }

    @Override
    public ItemStack swordCreator3(Material swordType, Enchantment firstEnchantment, Enchantment secondEnchantment, Enchantment thirdEnchantment, int firstEnchantmentLevel, int secondEnchantmentLevel, int thirdEnchantmentLevel) {

        ItemStack sword = new ItemStack(swordType, 1);
        sword.addEnchantment(firstEnchantment, firstEnchantmentLevel);
        sword.addEnchantment(secondEnchantment, secondEnchantmentLevel);
        sword.addEnchantment(thirdEnchantment, thirdEnchantmentLevel);

        return sword;
    }

    @Override
    public ItemStack swordCreator4(Material swordType, Enchantment firstEnchantment, Enchantment secondEnchantment, Enchantment thirdEnchantment, Enchantment fourthEnchantment, int firstEnchantmentLevel, int secondEnchantmentLevel, int thirdEnchantmentLevel, int fourthEnchantmentLevel) {
        ItemStack sword = new ItemStack(swordType, 1);
        sword.addEnchantment(firstEnchantment, firstEnchantmentLevel);
        sword.addEnchantment(secondEnchantment, secondEnchantmentLevel);
        sword.addEnchantment(thirdEnchantment, thirdEnchantmentLevel);
        sword.addEnchantment(fourthEnchantment, fourthEnchantmentLevel);

        return sword;
    }

    @Override
    public ItemStack swordCreator5(Material swordType, Enchantment firstEnchantment, Enchantment secondEnchantment, Enchantment thirdEnchantment, Enchantment fourthEnchantment, Enchantment fifthEnchantment, int firstEnchantmentLevel, int secondEnchantmentLevel, int thirdEnchantmentLevel, int fourthEnchantmentLevel, int fifthEnchantmentLevel) {
        ItemStack sword = new ItemStack(swordType, 1);
        sword.addEnchantment(firstEnchantment, firstEnchantmentLevel);
        sword.addEnchantment(secondEnchantment, secondEnchantmentLevel);
        sword.addEnchantment(thirdEnchantment, thirdEnchantmentLevel);
        sword.addEnchantment(fourthEnchantment, fourthEnchantmentLevel);
        sword.addEnchantment(fifthEnchantment, fifthEnchantmentLevel);

        return sword;
    }

    @Override
    public ItemStack swordCreator6(Material swordType, Enchantment firstEnchantment, Enchantment secondEnchantment, Enchantment thirdEnchantment, Enchantment fourthEnchantment, Enchantment fifthEnchantment, Enchantment sixthEnchantment, int firstEnchantmentLevel, int secondEnchantmentLevel, int thirdEnchantmentLevel, int fourthEnchantmentLevel, int fifthEnchantmentLevel, int sixthEnchantmentLevel) {
        ItemStack sword = new ItemStack(swordType, 1);
        sword.addEnchantment(firstEnchantment, firstEnchantmentLevel);
        sword.addEnchantment(secondEnchantment, secondEnchantmentLevel);
        sword.addEnchantment(thirdEnchantment, thirdEnchantmentLevel);
        sword.addEnchantment(fourthEnchantment, fourthEnchantmentLevel);
        sword.addEnchantment(fifthEnchantment, fifthEnchantmentLevel);
        sword.addEnchantment(sixthEnchantment, sixthEnchantmentLevel);

        return sword;
    }

    @Override
    public ItemStack swordCreator7(Material swordType, Enchantment firstEnchantment, Enchantment secondEnchantment, Enchantment thirdEnchantment, Enchantment fourthEnchantment, Enchantment fifthEnchantment, Enchantment sixthEnchantment, Enchantment seventhEnchantment, int firstEnchantmentLevel, int secondEnchantmentLevel, int thirdEnchantmentLevel, int fourthEnchantmentLevel, int fifthEnchantmentLevel, int sixthEnchantmentLevel, int seventhEnchantmentLevel) {
        ItemStack sword = new ItemStack(swordType, 1);
        sword.addEnchantment(firstEnchantment, firstEnchantmentLevel);
        sword.addEnchantment(secondEnchantment, secondEnchantmentLevel);
        sword.addEnchantment(thirdEnchantment, thirdEnchantmentLevel);
        sword.addEnchantment(fourthEnchantment, fourthEnchantmentLevel);
        sword.addEnchantment(fifthEnchantment, fifthEnchantmentLevel);
        sword.addEnchantment(sixthEnchantment, sixthEnchantmentLevel);
        sword.addEnchantment(seventhEnchantment, seventhEnchantmentLevel);

        return sword;
    }

    @Override
    public ArmorStand hologramCreator(String customName, boolean gravity, double x, double y, double z, float yaw, float pitch) {
        World world = Bukkit.getWorld("world");
        assert world != null;
        Location location = new Location(world, x, y, z, yaw, pitch);
        ArmorStand hologram = (ArmorStand) world.spawnEntity(location, EntityType.ARMOR_STAND);
        hologram.setVisible(false);
        hologram.setCustomNameVisible(true);
        hologram.setCustomName(customName);
        hologram.setGravity(gravity);
        return hologram;
    }

}
