package net.hadut.testmod.item;

import net.hadut.testmod.TestMod;
import net.hadut.testmod.item.custom.MetalDetectorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> items
            = DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MODID);

    public static final RegistryObject<Item> sapphire = items.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> rawSapphire = items.register("raw_sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> metalDetector = items.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(100)));

    public static void register(IEventBus eventBus) {
        items.register(eventBus);
    }
}
