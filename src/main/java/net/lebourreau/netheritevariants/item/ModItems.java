package net.lebourreau.netheritevariants.item;

import net.lebourreau.netheritevariants.NetheriteVariants;
import net.lebourreau.netheritevariants.item.custom.BlazedStaffItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(NetheriteVariants.MODID);

    public static final DeferredItem<Item> BLAZED_NETHERITE_INGOT = ITEMS.register("blazed_netherite_ingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> FROZEN_NETHERITE_INGOT = ITEMS.register("frozen_netherite_ingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> BLAZED_NETHERITE_STAFF = ITEMS.register("blazed_netherite_staff",
            () -> new BlazedStaffItem(new Item.Properties().durability(10)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
