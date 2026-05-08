package net.lebourreau.netheritevariants.block;

import net.lebourreau.netheritevariants.NetheriteVariants;
import net.lebourreau.netheritevariants.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(NetheriteVariants.MODID);

    public static final DeferredBlock<Block> BLAZED_NETHERITE_BLOCK = registerBlock("blazed_netherite_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(50f, 1200f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));

    public static final DeferredBlock<Block> FROZEN_NETHERITE_BLOCK = registerBlock("frozen_netherite_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(50f, 1200f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK).friction(0.989f)));


    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
