package net.lebourreau.netheritevariants.item;

import net.lebourreau.netheritevariants.NetheriteVariants;
import net.lebourreau.netheritevariants.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NetheriteVariants.MODID);

    public static final Supplier<CreativeModeTab> NETHERITE_VARIANTS_ITEMS_TAB =
            CREATIVE_MODE_TAB.register("netherite_variants_items_tab",
                    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BLAZED_NETHERITE_INGOT.get()))
                            .title(Component.translatable("creativetab.netheritevariants.netherite_variants_items"))
                            .displayItems((itemDisplayParameters, output) -> {
                                output.accept(ModItems.BLAZED_NETHERITE_INGOT);
                                output.accept(ModBlocks.BLAZED_NETHERITE_BLOCK);
                                output.accept(ModItems.FROZEN_NETHERITE_INGOT);
                                output.accept(ModBlocks.FROZEN_NETHERITE_BLOCK);
                                output.accept(ModItems.BLAZED_NETHERITE_STAFF);
                            }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }

}
