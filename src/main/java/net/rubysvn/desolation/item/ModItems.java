package net.rubysvn.desolation.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.rubysvn.desolation.RubysDesolation;
import net.rubysvn.desolation.block.ModBlocks;

public class ModItems {
    // Our mod items
    // -- test items, remove these later
    public static final Item PINK_GARNET = registerItem("pink_garnet",
            new Item(new FabricItemSettings()));
    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet",
            new Item(new FabricItemSettings()));

    // -- actual mod items


    // For registering items into the game
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(RubysDesolation.MOD_ID, name), item);
    }

    private static void itemGroupIngredients(FabricItemGroupEntries entries) {
        entries.add(PINK_GARNET);
        entries.add(RAW_PINK_GARNET);
        entries.add(ModBlocks.END_ROCK);
    }

    public static void registerModItems() {
        RubysDesolation.LOGGER.info("Registering Mod Items for " + RubysDesolation.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::itemGroupIngredients);
    }
}
