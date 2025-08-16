package net.kuko.nikamod;

import io.wispforest.owo.registration.reflect.FieldRegistrationHandler;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kuko.nikamod.init.ModItemInit;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NikaMod implements ModInitializer {
	public static final String MOD_ID = "nikamod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		FieldRegistrationHandler.register(ModItemInit.class, MOD_ID, false);


		ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
			entries.add(new ItemStack(ModItemInit.ERROR_FRUIT));
		});
	}
}