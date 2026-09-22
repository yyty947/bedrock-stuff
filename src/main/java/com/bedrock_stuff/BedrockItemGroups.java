package com.bedrock_stuff;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class BedrockItemGroups {

    public static final RegistryKey<ItemGroup> BEDROCK_STUFF_GROUP_KEY = RegistryKey.of(
            RegistryKeys.ITEM_GROUP,
            Identifier.of(BedrockStuff.MOD_ID, "bedrock_stuff")
    );

    public static final ItemGroup BEDROCK_STUFF_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(BedrockBlocks.GLOWING_OBSIDIAN))
            .displayName(Text.translatable("itemGroup.bedrock_stuff"))
            .entries((displayContext, entries) -> {
                // Original blocks
                entries.add(BedrockBlocks.GLOWING_OBSIDIAN);
                entries.add(BedrockBlocks.NETHER_REACTOR_CORE);

                // Hardened Glass
                entries.add(BedrockBlocks.HARDENED_GLASS);

                // Hardened Stained Glass - 16 colors
                entries.add(BedrockBlocks.HARD_WHITE_STAINED_GLASS);
                entries.add(BedrockBlocks.HARD_ORANGE_STAINED_GLASS);
                entries.add(BedrockBlocks.HARD_MAGENTA_STAINED_GLASS);
                entries.add(BedrockBlocks.HARD_LIGHT_BLUE_STAINED_GLASS);
                entries.add(BedrockBlocks.HARD_YELLOW_STAINED_GLASS);
                entries.add(BedrockBlocks.HARD_LIME_STAINED_GLASS);
                entries.add(BedrockBlocks.HARD_PINK_STAINED_GLASS);
                entries.add(BedrockBlocks.HARD_GRAY_STAINED_GLASS);
                entries.add(BedrockBlocks.HARD_SILVER_STAINED_GLASS);
                entries.add(BedrockBlocks.HARD_CYAN_STAINED_GLASS);
                entries.add(BedrockBlocks.HARD_PURPLE_STAINED_GLASS);
                entries.add(BedrockBlocks.HARD_BLUE_STAINED_GLASS);
                entries.add(BedrockBlocks.HARD_BROWN_STAINED_GLASS);
                entries.add(BedrockBlocks.HARD_GREEN_STAINED_GLASS);
                entries.add(BedrockBlocks.HARD_RED_STAINED_GLASS);
                entries.add(BedrockBlocks.HARD_BLACK_STAINED_GLASS);

                // Hardened Glass Pane
                entries.add(BedrockBlocks.HARDENED_GLASS_PANE);

                // Hardened Stained Glass Panes - 16 colors
                entries.add(BedrockBlocks.HARD_WHITE_STAINED_GLASS_PANE);
                entries.add(BedrockBlocks.HARD_ORANGE_STAINED_GLASS_PANE);
                entries.add(BedrockBlocks.HARD_MAGENTA_STAINED_GLASS_PANE);
                entries.add(BedrockBlocks.HARD_LIGHT_BLUE_STAINED_GLASS_PANE);
                entries.add(BedrockBlocks.HARD_YELLOW_STAINED_GLASS_PANE);
                entries.add(BedrockBlocks.HARD_LIME_STAINED_GLASS_PANE);
                entries.add(BedrockBlocks.HARD_PINK_STAINED_GLASS_PANE);
                entries.add(BedrockBlocks.HARD_GRAY_STAINED_GLASS_PANE);
                entries.add(BedrockBlocks.HARD_SILVER_STAINED_GLASS_PANE);
                entries.add(BedrockBlocks.HARD_CYAN_STAINED_GLASS_PANE);
                entries.add(BedrockBlocks.HARD_PURPLE_STAINED_GLASS_PANE);
                entries.add(BedrockBlocks.HARD_BLUE_STAINED_GLASS_PANE);
                entries.add(BedrockBlocks.HARD_BROWN_STAINED_GLASS_PANE);
                entries.add(BedrockBlocks.HARD_GREEN_STAINED_GLASS_PANE);
                entries.add(BedrockBlocks.HARD_RED_STAINED_GLASS_PANE);
                entries.add(BedrockBlocks.HARD_BLACK_STAINED_GLASS_PANE);
            })
            .build();

    public static void register() {
        Registry.register(Registries.ITEM_GROUP, BEDROCK_STUFF_GROUP_KEY, BEDROCK_STUFF_GROUP);
    }
}
