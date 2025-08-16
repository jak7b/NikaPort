package net.kuko.nikamod;

import com.mojang.blaze3d.systems.RenderSystem;
import io.wispforest.owo.registration.reflect.FieldRegistrationHandler;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BuiltinItemRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kuko.nikamod.init.ModItemInit;
import net.minecraft.client.MinecraftClient;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class NikaModClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {


	}

}
