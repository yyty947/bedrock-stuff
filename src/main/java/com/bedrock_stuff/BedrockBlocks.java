package com.bedrock_stuff;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class BedrockBlocks {

    // Existing blocks
    public static final Block GLOWING_OBSIDIAN = registerBlock("glowing_obsidian",
            new Block(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.STONE)
                    .strength(35.0F, 1200.0F)
                    .luminance(state -> 15)
                    .mapColor(MapColor.RED)
                    .pistonBehavior(PistonBehavior.BLOCK)
                    .registryKey(getBlockRegistryKey("glowing_obsidian"))
                    .requiresTool()), true);

    public static final Block NETHER_REACTOR_CORE = registerBlock("nether_reactor_core",
            new Block(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.STONE)
                    .strength(1.5F, 6.0F)
                    .mapColor(MapColor.DARK_AQUA)
                    .registryKey(getBlockRegistryKey("nether_reactor_core"))), true);

    // Hardened Glass (clear)
    public static final Block HARDENED_GLASS = registerBlock("hard_glass",
            new HardenedGlassBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.GLASS)
                    .strength(10.0F, 10.0F)
                    .pistonBehavior(PistonBehavior.NORMAL)
                    .nonOpaque()
                    .registryKey(getBlockRegistryKey("hard_glass"))), true);

    // Hardened Stained Glass - 16 color variants
    public static final Block HARD_WHITE_STAINED_GLASS = registerBlock("hard_white_stained_glass",
            new HardenedGlassBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.GLASS)
                    .strength(10.0F, 10.0F)
                    .pistonBehavior(PistonBehavior.NORMAL)
                    .nonOpaque()
                    .mapColor(MapColor.WHITE)
                    .registryKey(getBlockRegistryKey("hard_white_stained_glass"))), true);

    public static final Block HARD_ORANGE_STAINED_GLASS = registerBlock("hard_orange_stained_glass",
            new HardenedGlassBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.GLASS)
                    .strength(10.0F, 10.0F)
                    .pistonBehavior(PistonBehavior.NORMAL)
                    .nonOpaque()
                    .mapColor(MapColor.ORANGE)
                    .registryKey(getBlockRegistryKey("hard_orange_stained_glass"))), true);

    public static final Block HARD_MAGENTA_STAINED_GLASS = registerBlock("hard_magenta_stained_glass",
            new HardenedGlassBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.GLASS)
                    .strength(10.0F, 10.0F)
                    .pistonBehavior(PistonBehavior.NORMAL)
                    .nonOpaque()
                    .mapColor(MapColor.MAGENTA)
                    .registryKey(getBlockRegistryKey("hard_magenta_stained_glass"))), true);

    public static final Block HARD_LIGHT_BLUE_STAINED_GLASS = registerBlock("hard_light_blue_stained_glass",
            new HardenedGlassBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.GLASS)
                    .strength(10.0F, 10.0F)
                    .pistonBehavior(PistonBehavior.NORMAL)
                    .nonOpaque()
                    .mapColor(MapColor.LIGHT_BLUE)
                    .registryKey(getBlockRegistryKey("hard_light_blue_stained_glass"))), true);

    public static final Block HARD_YELLOW_STAINED_GLASS = registerBlock("hard_yellow_stained_glass",
            new HardenedGlassBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.GLASS)
                    .strength(10.0F, 10.0F)
                    .pistonBehavior(PistonBehavior.NORMAL)
                    .nonOpaque()
                    .mapColor(MapColor.YELLOW)
                    .registryKey(getBlockRegistryKey("hard_yellow_stained_glass"))), true);

    public static final Block HARD_LIME_STAINED_GLASS = registerBlock("hard_lime_stained_glass",
            new HardenedGlassBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.GLASS)
                    .strength(10.0F, 10.0F)
                    .pistonBehavior(PistonBehavior.NORMAL)
                    .nonOpaque()
                    .mapColor(MapColor.LIME)
                    .registryKey(getBlockRegistryKey("hard_lime_stained_glass"))), true);

    public static final Block HARD_PINK_STAINED_GLASS = registerBlock("hard_pink_stained_glass",
            new HardenedGlassBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.GLASS)
                    .strength(10.0F, 10.0F)
                    .pistonBehavior(PistonBehavior.NORMAL)
                    .nonOpaque()
                    .mapColor(MapColor.PINK)
                    .registryKey(getBlockRegistryKey("hard_pink_stained_glass"))), true);

    public static final Block HARD_GRAY_STAINED_GLASS = registerBlock("hard_gray_stained_glass",
            new HardenedGlassBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.GLASS)
                    .strength(10.0F, 10.0F)
                    .pistonBehavior(PistonBehavior.NORMAL)
                    .nonOpaque()
                    .mapColor(MapColor.GRAY)
                    .registryKey(getBlockRegistryKey("hard_gray_stained_glass"))), true);

    public static final Block HARD_SILVER_STAINED_GLASS = registerBlock("hard_silver_stained_glass",
            new HardenedGlassBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.GLASS)
                    .strength(10.0F, 10.0F)
                    .pistonBehavior(PistonBehavior.NORMAL)
                    .nonOpaque()
                    .mapColor(MapColor.LIGHT_GRAY)
                    .registryKey(getBlockRegistryKey("hard_silver_stained_glass"))), true);

    public static final Block HARD_CYAN_STAINED_GLASS = registerBlock("hard_cyan_stained_glass",
            new HardenedGlassBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.GLASS)
                    .strength(10.0F, 10.0F)
                    .pistonBehavior(PistonBehavior.NORMAL)
                    .nonOpaque()
                    .mapColor(MapColor.CYAN)
                    .registryKey(getBlockRegistryKey("hard_cyan_stained_glass"))), true);

    public static final Block HARD_PURPLE_STAINED_GLASS = registerBlock("hard_purple_stained_glass",
            new HardenedGlassBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.GLASS)
                    .strength(10.0F, 10.0F)
                    .pistonBehavior(PistonBehavior.NORMAL)
                    .nonOpaque()
                    .mapColor(MapColor.PURPLE)
                    .registryKey(getBlockRegistryKey("hard_purple_stained_glass"))), true);

    public static final Block HARD_BLUE_STAINED_GLASS = registerBlock("hard_blue_stained_glass",
            new HardenedGlassBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.GLASS)
                    .strength(10.0F, 10.0F)
                    .pistonBehavior(PistonBehavior.NORMAL)
                    .nonOpaque()
                    .mapColor(MapColor.BLUE)
                    .registryKey(getBlockRegistryKey("hard_blue_stained_glass"))), true);

    public static final Block HARD_BROWN_STAINED_GLASS = registerBlock("hard_brown_stained_glass",
            new HardenedGlassBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.GLASS)
                    .strength(10.0F, 10.0F)
                    .pistonBehavior(PistonBehavior.NORMAL)
                    .nonOpaque()
                    .mapColor(MapColor.BROWN)
                    .registryKey(getBlockRegistryKey("hard_brown_stained_glass"))), true);

    public static final Block HARD_GREEN_STAINED_GLASS = registerBlock("hard_green_stained_glass",
            new HardenedGlassBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.GLASS)
                    .strength(10.0F, 10.0F)
                    .pistonBehavior(PistonBehavior.NORMAL)
                    .nonOpaque()
                    .mapColor(MapColor.GREEN)
                    .registryKey(getBlockRegistryKey("hard_green_stained_glass"))), true);

    public static final Block HARD_RED_STAINED_GLASS = registerBlock("hard_red_stained_glass",
            new HardenedGlassBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.GLASS)
                    .strength(10.0F, 10.0F)
                    .pistonBehavior(PistonBehavior.NORMAL)
                    .nonOpaque()
                    .mapColor(MapColor.RED)
                    .registryKey(getBlockRegistryKey("hard_red_stained_glass"))), true);

    public static final Block HARD_BLACK_STAINED_GLASS = registerBlock("hard_black_stained_glass",
            new HardenedGlassBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.GLASS)
                    .strength(10.0F, 10.0F)
                    .pistonBehavior(PistonBehavior.NORMAL)
                    .nonOpaque()
                    .mapColor(MapColor.BLACK)
                    .registryKey(getBlockRegistryKey("hard_black_stained_glass"))), true);

    // Hardened Glass Pane (clear)
    public static final Block HARDENED_GLASS_PANE = registerBlock("hard_glass_pane",
            new HardenedGlassPaneBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.GLASS)
                    .strength(10.0F, 10.0F)
                    .pistonBehavior(PistonBehavior.NORMAL)
                    .nonOpaque()
                    .registryKey(getBlockRegistryKey("hard_glass_pane"))), true);

    // Hardened Stained Glass Panes - 16 color variants
    public static final Block HARD_WHITE_STAINED_GLASS_PANE = registerBlock("hard_white_stained_glass_pane",
            new HardenedGlassPaneBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.GLASS)
                    .strength(10.0F, 10.0F)
                    .pistonBehavior(PistonBehavior.NORMAL)
                    .nonOpaque()
                    .mapColor(MapColor.WHITE)
                    .registryKey(getBlockRegistryKey("hard_white_stained_glass_pane"))), true);

    public static final Block HARD_ORANGE_STAINED_GLASS_PANE = registerBlock("hard_orange_stained_glass_pane",
            new HardenedGlassPaneBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.GLASS)
                    .strength(10.0F, 10.0F)
                    .pistonBehavior(PistonBehavior.NORMAL)
                    .nonOpaque()
                    .mapColor(MapColor.ORANGE)
                    .registryKey(getBlockRegistryKey("hard_orange_stained_glass_pane"))), true);

    public static final Block HARD_MAGENTA_STAINED_GLASS_PANE = registerBlock("hard_magenta_stained_glass_pane",
            new HardenedGlassPaneBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.GLASS)
                    .strength(10.0F, 10.0F)
                    .pistonBehavior(PistonBehavior.NORMAL)
                    .nonOpaque()
                    .mapColor(MapColor.MAGENTA)
                    .registryKey(getBlockRegistryKey("hard_magenta_stained_glass_pane"))), true);

    public static final Block HARD_LIGHT_BLUE_STAINED_GLASS_PANE = registerBlock("hard_light_blue_stained_glass_pane",
            new HardenedGlassPaneBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.GLASS)
                    .strength(10.0F, 10.0F)
                    .pistonBehavior(PistonBehavior.NORMAL)
                    .nonOpaque()
                    .mapColor(MapColor.LIGHT_BLUE)
                    .registryKey(getBlockRegistryKey("hard_light_blue_stained_glass_pane"))), true);

    public static final Block HARD_YELLOW_STAINED_GLASS_PANE = registerBlock("hard_yellow_stained_glass_pane",
            new HardenedGlassPaneBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.GLASS)
                    .strength(10.0F, 10.0F)
                    .pistonBehavior(PistonBehavior.NORMAL)
                    .nonOpaque()
                    .mapColor(MapColor.YELLOW)
                    .registryKey(getBlockRegistryKey("hard_yellow_stained_glass_pane"))), true);

    public static final Block HARD_LIME_STAINED_GLASS_PANE = registerBlock("hard_lime_stained_glass_pane",
            new HardenedGlassPaneBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.GLASS)
                    .strength(10.0F, 10.0F)
                    .pistonBehavior(PistonBehavior.NORMAL)
                    .nonOpaque()
                    .mapColor(MapColor.LIME)
                    .registryKey(getBlockRegistryKey("hard_lime_stained_glass_pane"))), true);

    public static final Block HARD_PINK_STAINED_GLASS_PANE = registerBlock("hard_pink_stained_glass_pane",
            new HardenedGlassPaneBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.GLASS)
                    .strength(10.0F, 10.0F)
                    .pistonBehavior(PistonBehavior.NORMAL)
                    .nonOpaque()
                    .mapColor(MapColor.PINK)
                    .registryKey(getBlockRegistryKey("hard_pink_stained_glass_pane"))), true);

    public static final Block HARD_GRAY_STAINED_GLASS_PANE = registerBlock("hard_gray_stained_glass_pane",
            new HardenedGlassPaneBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.GLASS)
                    .strength(10.0F, 10.0F)
                    .pistonBehavior(PistonBehavior.NORMAL)
                    .nonOpaque()
                    .mapColor(MapColor.GRAY)
                    .registryKey(getBlockRegistryKey("hard_gray_stained_glass_pane"))), true);

    public static final Block HARD_SILVER_STAINED_GLASS_PANE = registerBlock("hard_silver_stained_glass_pane",
            new HardenedGlassPaneBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.GLASS)
                    .strength(10.0F, 10.0F)
                    .pistonBehavior(PistonBehavior.NORMAL)
                    .nonOpaque()
                    .mapColor(MapColor.LIGHT_GRAY)
                    .registryKey(getBlockRegistryKey("hard_silver_stained_glass_pane"))), true);

    public static final Block HARD_CYAN_STAINED_GLASS_PANE = registerBlock("hard_cyan_stained_glass_pane",
            new HardenedGlassPaneBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.GLASS)
                    .strength(10.0F, 10.0F)
                    .pistonBehavior(PistonBehavior.NORMAL)
                    .nonOpaque()
                    .mapColor(MapColor.CYAN)
                    .registryKey(getBlockRegistryKey("hard_cyan_stained_glass_pane"))), true);

    public static final Block HARD_PURPLE_STAINED_GLASS_PANE = registerBlock("hard_purple_stained_glass_pane",
            new HardenedGlassPaneBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.GLASS)
                    .strength(10.0F, 10.0F)
                    .pistonBehavior(PistonBehavior.NORMAL)
                    .nonOpaque()
                    .mapColor(MapColor.PURPLE)
                    .registryKey(getBlockRegistryKey("hard_purple_stained_glass_pane"))), true);

    public static final Block HARD_BLUE_STAINED_GLASS_PANE = registerBlock("hard_blue_stained_glass_pane",
            new HardenedGlassPaneBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.GLASS)
                    .strength(10.0F, 10.0F)
                    .pistonBehavior(PistonBehavior.NORMAL)
                    .nonOpaque()
                    .mapColor(MapColor.BLUE)
                    .registryKey(getBlockRegistryKey("hard_blue_stained_glass_pane"))), true);

    public static final Block HARD_BROWN_STAINED_GLASS_PANE = registerBlock("hard_brown_stained_glass_pane",
            new HardenedGlassPaneBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.GLASS)
                    .strength(10.0F, 10.0F)
                    .pistonBehavior(PistonBehavior.NORMAL)
                    .nonOpaque()
                    .mapColor(MapColor.BROWN)
                    .registryKey(getBlockRegistryKey("hard_brown_stained_glass_pane"))), true);

    public static final Block HARD_GREEN_STAINED_GLASS_PANE = registerBlock("hard_green_stained_glass_pane",
            new HardenedGlassPaneBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.GLASS)
                    .strength(10.0F, 10.0F)
                    .pistonBehavior(PistonBehavior.NORMAL)
                    .nonOpaque()
                    .mapColor(MapColor.GREEN)
                    .registryKey(getBlockRegistryKey("hard_green_stained_glass_pane"))), true);

    public static final Block HARD_RED_STAINED_GLASS_PANE = registerBlock("hard_red_stained_glass_pane",
            new HardenedGlassPaneBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.GLASS)
                    .strength(10.0F, 10.0F)
                    .pistonBehavior(PistonBehavior.NORMAL)
                    .nonOpaque()
                    .mapColor(MapColor.RED)
                    .registryKey(getBlockRegistryKey("hard_red_stained_glass_pane"))), true);

    public static final Block HARD_BLACK_STAINED_GLASS_PANE = registerBlock("hard_black_stained_glass_pane",
            new HardenedGlassPaneBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.GLASS)
                    .strength(10.0F, 10.0F)
                    .pistonBehavior(PistonBehavior.NORMAL)
                    .nonOpaque()
                    .mapColor(MapColor.BLACK)
                    .registryKey(getBlockRegistryKey("hard_black_stained_glass_pane"))), true);

    private static RegistryKey<Block> getBlockRegistryKey(String blockName) {
        Identifier id = Identifier.of(BedrockStuff.MOD_ID, blockName);
        return RegistryKey.of(RegistryKeys.BLOCK, id);
    }

    private static RegistryKey<Item> getItemRegistryKey(String itemName) {
        Identifier id = Identifier.of(BedrockStuff.MOD_ID, itemName);
        return RegistryKey.of(RegistryKeys.ITEM, id);
    }

    private static Block registerBlock(String name, Block block, boolean shouldRegisterItem) {
        // Register the block
        Registry.register(Registries.BLOCK, getBlockRegistryKey(name), block);

        // Register the block item so it appears in inventory
        if (shouldRegisterItem) {
            RegistryKey<Item> itemKey = getItemRegistryKey(name);
            BlockItem blockItem = new BlockItem(block, new Item.Settings()
                    .useBlockPrefixedTranslationKey()
                    .registryKey(itemKey));
            Registry.register(Registries.ITEM, itemKey, blockItem);
        }

        return block;
    }

    public static void register() {
        // Blocks are registered via static initializer
    }
}
