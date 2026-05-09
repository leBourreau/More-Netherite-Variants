package net.lebourreau.netheritevariants.datagen;

import net.lebourreau.netheritevariants.NetheriteVariants;
import net.lebourreau.netheritevariants.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, NetheriteVariants.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.BLAZED_NETHERITE_BLOCK.get())
                .add(ModBlocks.FROZEN_NETHERITE_BLOCK.get());

        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.BLAZED_NETHERITE_BLOCK.get())
                .add(ModBlocks.FROZEN_NETHERITE_BLOCK.get());
    }
}
