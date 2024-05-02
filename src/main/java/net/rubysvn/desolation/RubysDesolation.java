package net.rubysvn.desolation;

import net.fabricmc.api.ModInitializer;

import net.rubysvn.desolation.block.ModBlocks;
import net.rubysvn.desolation.item.ModItemGroup;
import net.rubysvn.desolation.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RubysDesolation implements ModInitializer {
	public static final String MOD_ID = "desolation";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		LOGGER.info("Hello Fabric world!");
	}
}