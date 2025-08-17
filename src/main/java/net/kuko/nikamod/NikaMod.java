package net.kuko.nikamod;

import io.wispforest.owo.registration.reflect.FieldRegistrationHandler;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kuko.nikamod.init.ModItemInit;
import net.kuko.nikamod.item.fruits.ErrorFruit;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.UUID;

public class NikaMod implements ModInitializer {
	public static final String MOD_ID = "nikamod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	private OwnerHolder ownerHolder = new OwnerHolder();

	@Override
	public void onInitialize() {
		UUID fake0 = UUID.randomUUID();
		UUID fake1 = UUID.randomUUID();

		LOGGER.info("Hello Fabric world!");

		FieldRegistrationHandler.register(ModItemInit.class, MOD_ID, false);


		ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
			entries.add(new ItemStack(ModItemInit.ERROR_FRUIT));
		});

	}

}