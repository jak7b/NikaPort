package net.kuko.nikamod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class OwnerHolder {
    private static Map<UUID, Item> owner_item = new HashMap<>();

    public Map<UUID, Item> get() {
        return owner_item;
    }

    public void append(UUID uuid, Item item){
            owner_item.put(uuid, item);
    }
}
