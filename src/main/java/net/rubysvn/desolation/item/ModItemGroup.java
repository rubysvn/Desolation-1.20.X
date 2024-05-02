package net.rubysvn.desolation.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.rubysvn.desolation.RubysDesolation;
import net.rubysvn.desolation.block.ModBlocks;

public class ModItemGroup {
    public static final ItemGroup DESOLATION_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(RubysDesolation.MOD_ID, "desolation_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.desolation_group"))
                    .icon(() -> new ItemStack(ModBlocks.END_ROCK)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.END_ROCK);

                    }).build());

    public static void registerItemGroups() {

    }
}
