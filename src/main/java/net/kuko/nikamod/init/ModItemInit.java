package net.kuko.nikamod.init;

import io.wispforest.owo.registration.annotations.AssignedName;
import io.wispforest.owo.registration.reflect.ItemRegistryContainer;
import net.kuko.nikamod.item.fruits.ErrorFruit;
import net.minecraft.item.Item;

public class ModItemInit implements ItemRegistryContainer {

//    @AssignedName("dark_fruit") // nikamod:dark_fruit .food(FoodComponents.APPLE))
//    public static final Item DARK_FRUIT_ITEM = new DarkFruitItem(new Item.Settings().maxCount(1).food(FoodComponents.));


    @AssignedName("error_apple")
    public static final Item ERROR_FRUIT = new ErrorFruit(new Item.Settings().maxCount(1));

}
