package com.bedrock_stuff;

import net.fabricmc.api.ModInitializer;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BedrockStuff implements ModInitializer {

    public static final String MOD_ID = "bedrock_stuff";

    @Override
    public void onInitialize() {
        System.out.println(MOD_ID + " Registration Started");

        BedrockBlocks.register();
        BedrockItemGroups.register();

        System.out.println(MOD_ID + " Registration Completed!");
    }

    public static Identifier id(String path) {
        return Identifier.of(MOD_ID, path);
    }
}
