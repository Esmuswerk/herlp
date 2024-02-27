package de.esmuuu.vandusblocks.core.init;

import de.esmuuu.vandusblocks.Vandusblocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Vandusblocks.MOD_ID);

    public static final RegistryObject<CreativeModeTab> Vandus_TAB = CREATIVE_MODE_TABS.register("Vandusblocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TEER.get()))
                    .title(Component.translatable("creativetab.Vandus_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.TEER.get());

                        pOutput.accept(Items.DIAMOND);

                        pOutput.accept(ModBlocks.ASPHALT.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}