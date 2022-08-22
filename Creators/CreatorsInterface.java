package customkits.customkits.Creators;

import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffectType;

public interface CreatorsInterface {
    ItemStack potionCreatorRGB(Material material, String name, PotionEffectType Effect, int effectLevel, int duration, int red, int green, int blue, ItemFlag flag);

    ItemStack potionCreator(Material material, String name, PotionEffectType Effect, int effectLevel, int duration ,Color color, ItemFlag flag);

    ItemStack itemCreator(String name, Material material, ItemFlag flag, Enchantment enchantment, int enchantmentLevel);


    ItemStack helmetCreator2(Material helmetType, Enchantment firstEnchantment, Enchantment secondEnchantment, int firstEnchantmentLevel, int secondEnchantmentLevel);

    ItemStack helmetCreator3(Material helmetType, Enchantment firstEnchantment, Enchantment secondEnchantment, Enchantment thirdEnchantment, int firstEnchantmentLevel, int secondEnchantmentLevel, int thirdEnchantmentLevel);

    ItemStack helmetCreator4(Material helmetType, Enchantment firstEnchantment, Enchantment secondEnchantment, Enchantment thirdEnchantment, Enchantment fourthEnchantment, int firstEnchantmentLevel, int secondEnchantmentLevel, int thirdEnchantmentLevel, int fourthEnchantmentLevel);

    ItemStack helmetCreator5(Material helmetType, Enchantment firstEnchantment, Enchantment secondEnchantment, Enchantment thirdEnchantment, Enchantment fourthEnchantment, Enchantment fifthEnchantment, int firstEnchantmentLevel, int secondEnchantmentLevel, int thirdEnchantmentLevel, int fourthEnchantmentLevel, int fifthEnchantmentLevel);

    ItemStack chestplateAndLeggingsCreator2(Material type, Enchantment firstEnchantment, Enchantment secondEnchantment, int firstEnchantmentLevel, int secondEnchantmentLevel);

    ItemStack chestplateAndLeggingsCreator3(Material type, Enchantment firstEnchantment, Enchantment secondEnchantment, Enchantment thirdEnchantment, int firstEnchantmentLevel, int secondEnchantmentLevel, int thirdEnchantmentLevel);

    ItemStack bootsCreator2(Material bootsType, Enchantment firstEnchantment, Enchantment secondEnchantment, int firstEnchantmentLevel, int secondEnchantmentLevel);

    ItemStack bootsCreator3(Material bootsType, Enchantment firstEnchantment, Enchantment secondEnchantment, Enchantment thirdEnchantment, int firstEnchantmentLevel, int secondEnchantmentLevel, int thirdEnchantmentLevel);

    ItemStack bootsCreator4(Material bootsType, Enchantment firstEnchantment, Enchantment secondEnchantment, Enchantment thirdEnchantment, Enchantment fourthEnchantment, int firstEnchantmentLevel, int secondEnchantmentLevel, int thirdEnchantmentLevel, int fourthEnchantmentLevel);

    ItemStack bootsCreator5(Material bootsType, Enchantment firstEnchantment, Enchantment secondEnchantment, Enchantment thirdEnchantment, Enchantment fourthEnchantment, Enchantment fifthEnchantment,int firstEnchantmentLevel, int secondEnchantmentLevel, int thirdEnchantmentLevel, int fourthEnchantmentLevel, int fifthEnchantmentLevel);

    ItemStack swordCreator2(Material swordType, Enchantment firstEnchantment, Enchantment secondEnchantment, int firstEnchantmentLevel, int secondEnchantmentLevel);

    ItemStack swordCreator3(Material bootsType, Enchantment firstEnchantment, Enchantment secondEnchantment, Enchantment thirdEnchantment, int firstEnchantmentLevel, int secondEnchantmentLevel, int thirdEnchantmentLevel);

    ItemStack swordCreator4(Material bootsType, Enchantment firstEnchantment, Enchantment secondEnchantment, Enchantment thirdEnchantment, Enchantment fourthEnchantment, int firstEnchantmentLevel, int secondEnchantmentLevel, int thirdEnchantmentLevel, int fourthEnchantmentLevel);

    ItemStack swordCreator5(Material bootsType, Enchantment firstEnchantment, Enchantment secondEnchantment, Enchantment thirdEnchantment, Enchantment fourthEnchantment, Enchantment fifthEnchantment,int firstEnchantmentLevel, int secondEnchantmentLevel, int thirdEnchantmentLevel, int fourthEnchantmentLevel, int fifthEnchantmentLevel);

    ItemStack swordCreator6(Material bootsType, Enchantment firstEnchantment, Enchantment secondEnchantment, Enchantment thirdEnchantment, Enchantment fourthEnchantment, Enchantment fifthEnchantment, Enchantment sixthEnchantment, int firstEnchantmentLevel, int secondEnchantmentLevel, int thirdEnchantmentLevel, int fourthEnchantmentLevel, int fifthEnchantmentLevel, int sixthEnchantmentLevel);

    ItemStack swordCreator7(Material bootsType, Enchantment firstEnchantment, Enchantment secondEnchantment, Enchantment thirdEnchantment, Enchantment fourthEnchantment, Enchantment fifthEnchantment, Enchantment sixthEnchantment, Enchantment seventhEnchantment, int firstEnchantmentLevel, int secondEnchantmentLevel, int thirdEnchantmentLevel, int fourthEnchantmentLevel, int fifthEnchantmentLevel, int sixthEnchantmentLevel, int seventhEnchantmentLevel);

    ArmorStand hologramCreator(String customName, boolean gravity, double x, double y, double z, float yaw, float pitch);
}
