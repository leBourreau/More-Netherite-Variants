package net.lebourreau.netheritevariants.datagen;

import net.lebourreau.netheritevariants.block.ModBlocks;
import net.lebourreau.netheritevariants.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLAZED_NETHERITE_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.BLAZED_NETHERITE_INGOT.get())
                .unlockedBy("has_blazed_netherite", has(ModItems.BLAZED_NETHERITE_INGOT)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BLAZED_NETHERITE_INGOT.get(), 9)
                .requires(ModBlocks.BLAZED_NETHERITE_BLOCK)
                .unlockedBy("has_blazed_netherite_block", has(ModBlocks.BLAZED_NETHERITE_BLOCK)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.FROZEN_NETHERITE_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.FROZEN_NETHERITE_INGOT.get())
                .unlockedBy("has_blazed_netherite", has(ModItems.FROZEN_NETHERITE_INGOT)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FROZEN_NETHERITE_INGOT.get(), 9)
                .requires(ModBlocks.FROZEN_NETHERITE_BLOCK)
                .unlockedBy("has_blazed_netherite_block", has(ModBlocks.FROZEN_NETHERITE_BLOCK)).save(recipeOutput);

    }
}
