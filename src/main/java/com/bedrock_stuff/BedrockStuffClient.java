package com.bedrock_stuff;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.minecraft.client.render.BlockRenderLayer;

public class BedrockStuffClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        // Register translucent render layer for hardened glass blocks
        // BlockRenderLayer.TRANSLUCENT is used for semi-transparent blocks like glass
        BlockRenderLayer translucent = BlockRenderLayer.TRANSLUCENT;

        // Clear hardened glass
        BlockRenderLayerMap.putBlock(BedrockBlocks.HARDENED_GLASS, translucent);

        // All 16 stained hardened glass variants
        BlockRenderLayerMap.putBlocks(translucent,
                BedrockBlocks.HARD_WHITE_STAINED_GLASS,
                BedrockBlocks.HARD_ORANGE_STAINED_GLASS,
                BedrockBlocks.HARD_MAGENTA_STAINED_GLASS,
                BedrockBlocks.HARD_LIGHT_BLUE_STAINED_GLASS,
                BedrockBlocks.HARD_YELLOW_STAINED_GLASS,
                BedrockBlocks.HARD_LIME_STAINED_GLASS,
                BedrockBlocks.HARD_PINK_STAINED_GLASS,
                BedrockBlocks.HARD_GRAY_STAINED_GLASS,
                BedrockBlocks.HARD_SILVER_STAINED_GLASS,
                BedrockBlocks.HARD_CYAN_STAINED_GLASS,
                BedrockBlocks.HARD_PURPLE_STAINED_GLASS,
                BedrockBlocks.HARD_BLUE_STAINED_GLASS,
                BedrockBlocks.HARD_BROWN_STAINED_GLASS,
                BedrockBlocks.HARD_GREEN_STAINED_GLASS,
                BedrockBlocks.HARD_RED_STAINED_GLASS,
                BedrockBlocks.HARD_BLACK_STAINED_GLASS
        );

        // Clear hardened glass pane
        BlockRenderLayerMap.putBlock(BedrockBlocks.HARDENED_GLASS_PANE, translucent);

        // All 16 stained hardened glass pane variants
        BlockRenderLayerMap.putBlocks(translucent,
                BedrockBlocks.HARD_WHITE_STAINED_GLASS_PANE,
                BedrockBlocks.HARD_ORANGE_STAINED_GLASS_PANE,
                BedrockBlocks.HARD_MAGENTA_STAINED_GLASS_PANE,
                BedrockBlocks.HARD_LIGHT_BLUE_STAINED_GLASS_PANE,
                BedrockBlocks.HARD_YELLOW_STAINED_GLASS_PANE,
                BedrockBlocks.HARD_LIME_STAINED_GLASS_PANE,
                BedrockBlocks.HARD_PINK_STAINED_GLASS_PANE,
                BedrockBlocks.HARD_GRAY_STAINED_GLASS_PANE,
                BedrockBlocks.HARD_SILVER_STAINED_GLASS_PANE,
                BedrockBlocks.HARD_CYAN_STAINED_GLASS_PANE,
                BedrockBlocks.HARD_PURPLE_STAINED_GLASS_PANE,
                BedrockBlocks.HARD_BLUE_STAINED_GLASS_PANE,
                BedrockBlocks.HARD_BROWN_STAINED_GLASS_PANE,
                BedrockBlocks.HARD_GREEN_STAINED_GLASS_PANE,
                BedrockBlocks.HARD_RED_STAINED_GLASS_PANE,
                BedrockBlocks.HARD_BLACK_STAINED_GLASS_PANE
        );
    }
}
