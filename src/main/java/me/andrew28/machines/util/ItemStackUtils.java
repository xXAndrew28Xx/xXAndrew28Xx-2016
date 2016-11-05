package me.andrew28.machines.util;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

/**
 * @author Andrew Tran
 */
public class ItemStackUtils {
    public static ItemStack glow(ItemStack is){
        ItemMeta im = is.getItemMeta();
        im.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
        im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        is.setItemMeta(im);
        return is;
    }
    public static ItemStack name(ItemStack is, String s){
        ItemMeta im = is.getItemMeta();
        im.setDisplayName(s);
        is.setItemMeta(im);
        return is;
    }
}
