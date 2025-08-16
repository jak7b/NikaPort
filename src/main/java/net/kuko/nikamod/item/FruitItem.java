package net.kuko.nikamod.item;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public abstract class FruitItem extends Item {
    public FruitItem(Settings settings, FoodComponent foodComponent) {
        super(settings.food(foodComponent));
    }
}
