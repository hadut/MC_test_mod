package net.hadut.testmod.item;

import net.hadut.testmod.TestMod;
import net.hadut.testmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> creativeModeTabs =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TestMod.MODID);

    public static final RegistryObject<CreativeModeTab> testTab = creativeModeTabs.register("test_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.sapphire.get()))
                    .title(Component.translatable("creativetab.test_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.sapphire.get());
                        pOutput.accept(ModItems.rawSapphire.get());
                        pOutput.accept(ModBlocks.sapphireBlock.get());
                        pOutput.accept(ModBlocks.rawSapphireBlock.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        creativeModeTabs.register(eventBus);
    }
}
