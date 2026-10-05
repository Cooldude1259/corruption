package com.cooldude1259.corruption;

import java.util.function.Function;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

import com.cooldude12.unnoficialtadc.CostumeItem;

public class ModItems {
    public static final String MOD_ID = "corruption";

    //public static final Item TEST_COSTUME = register("test_costume", CostumeItem::new, new Item.Properties().rarity(Rarity.EPIC));
    public static final Item CORRUPTION_SKIN = register("corruption_skin", CostumeItem::new, new Item.Properties().rarity(Rarity.EPIC));

    private static Item register(String name, Function<Item.Properties, Item> factory, Item.Properties properties) {
        // corruption:test_costume etc.
        ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, name));

        // Stamp the ID onto the properties BEFORE constructing, then register
        Item item = factory.apply(properties.setId(key));
        return Registry.register(BuiltInRegistries.ITEM, key, item);
    }

    // Empty on purpose: calling it forces the class to load, which runs the static fields above
    public static void initialize() {}
}