package me.nozembr.events;



import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.inventory.ItemStack;


public class drop implements Listener {

    @EventHandler
    public void playerDropItem(PlayerDropItemEvent event) {
        if (event.getItemDrop().getItemStack().getType() == Material.CHEST
                || (event.getItemDrop().getItemStack().getType() == Material.BLAZE_ROD || (event.getItemDrop().getItemStack().getType() == Material.ANVIL || (event
                .getItemDrop().getItemStack().getType() == Material.SKULL || (event
                .getItemDrop().getItemStack().getType() == Material.IRON_BLOCK || (event
                .getItemDrop().getItemStack().getType() == Material.ENCHANTED_BOOK || (event
                .getItemDrop().getItemStack().getType() == Material.BOOK || (event
                .getItemDrop().getItemStack().getType() == Material.DIAMOND_SWORD || (event
                .getItemDrop().getItemStack().getType() == Material.IRON_SWORD || (event
                .getItemDrop().getItemStack().getType() == Material.DIAMOND_AXE || (event
                .getItemDrop().getItemStack().getType() == Material.ENDER_CHEST || (event
                .getItemDrop().getItemStack().getType() == Material.STONE_SWORD || (event
                .getItemDrop().getItemStack().getType() == Material.WOOD_SWORD || (event
                .getItemDrop().getItemStack().getType() == Material.BOW || (event
                .getItemDrop().getItemStack().getType() == Material.ARROW || (event
                .getItemDrop().getItemStack().getType() == Material.PAPER || (event
                .getItemDrop().getItemStack().getType() == Material.FIREWORK || (event
                .getItemDrop().getItemStack().getType() == Material.FLINT_AND_STEEL || (event
                .getItemDrop().getItemStack().getType() == Material.WATCH || (event
                .getItemDrop().getItemStack().getType() == Material.BONE || (event
                .getItemDrop().getItemStack().getType() == Material.SLIME_BALL || (event
                .getItemDrop().getItemStack().getType() == Material.WOOD_AXE || (event
                .getItemDrop().getItemStack().getType() == Material.TRIPWIRE_HOOK || (event
                .getItemDrop().getItemStack().getType() == Material.DISPENSER || (event
                .getItemDrop().getItemStack().getType() == Material.GOLD_HOE || (event
                .getItemDrop().getItemStack().getType() == Material.PISTON_STICKY_BASE || (event
                .getItemDrop().getItemStack().getType() == Material.REDSTONE_TORCH_OFF || (event
                .getItemDrop().getItemStack().getType() == Material.REDSTONE_TORCH_ON || (event
                .getItemDrop().getItemStack().getType() == Material.STICK || (event
                .getItemDrop().getItemStack().getType() == Material.DIAMOND_HOE || (event
                .getItemDrop().getItemStack().getType() == Material.FISHING_ROD || (event
                .getItemDrop().getItemStack().getType() == Material.BRICK || (event
                .getItemDrop().getItemStack().getType() == Material.GOLD_AXE || (event
                .getItemDrop().getItemStack().getType() == Material.GOLD_SWORD || (event
                .getItemDrop().getItemStack().getType() == Material.BEACON))))))))))))))))))))))))))))))))))) {
            event.setCancelled(true);
        } else {
            event.getItemDrop().remove();
        }
    }

    @EventHandler
    public void invCloseEvent(InventoryCloseEvent event) {

        if (event.getPlayer().getItemOnCursor() != null) {
            event.getPlayer().getInventory().addItem(event.getPlayer().getItemOnCursor());
            event.getPlayer().setItemOnCursor(new ItemStack(Material.AIR));
        }


    }
}