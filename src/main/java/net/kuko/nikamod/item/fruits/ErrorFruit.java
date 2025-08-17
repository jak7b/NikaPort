package net.kuko.nikamod.item.fruits;

import net.kuko.nikamod.NikaMod;
import net.kuko.nikamod.OwnerHolder;
import net.kuko.nikamod.item.FruitItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageSources;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.Map;
import java.util.UUID;

public class ErrorFruit extends FruitItem {
    OwnerHolder ownerHolder = new OwnerHolder();

    public ErrorFruit(Settings settings) {
        super(settings, FoodComponents.APPLE);
    }


    //* Create new ownerHolder, when the player finishes using it
    //* then it will record the player's uuid. If anyone BUT the recorded uuid eats it again, they will die.

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        UUID player = user.getUuid();
        Item item = stack.getItem(); // Get the Item from the ItemStack
        Map<UUID, Item> ownerMap = ownerHolder.get();

        // Check if the UUID already exists
        if (ownerMap.containsKey(player)) {
            System.out.println("UUID " + player + " already has an item: " + ownerMap.get(player));
            return super.finishUsing(stack, world, user);
        }

        // Check if the item is already owned by another UUID
        if (ownerMap.containsValue(item)) {
            // Find which UUID has this item
            UUID existingOwner = null;
            for (Map.Entry<UUID, Item> entry : ownerMap.entrySet()) {
                if (entry.getValue().equals(item)) {
                    existingOwner = entry.getKey();
                    break;
                }
            }
            System.out.println("Item " + item + " is already assigned to UUID " + existingOwner);
            user.kill();
            return stack;
        }

        // If both checks passed, append to map
        ownerHolder.append(player, item);
        System.out.println("Assigned item " + item + " to UUID " + player);
        return super.finishUsing(stack, world, user);
    }
}
