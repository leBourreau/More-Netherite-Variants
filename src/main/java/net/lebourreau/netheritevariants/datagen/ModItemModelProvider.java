package net.lebourreau.netheritevariants.datagen;

import net.lebourreau.netheritevariants.NetheriteVariants;
import net.lebourreau.netheritevariants.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, NetheriteVariants.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.BLAZED_NETHERITE_INGOT.get());
        basicItem(ModItems.FROZEN_NETHERITE_INGOT.get());

        basicItem(ModItems.BLAZED_NETHERITE_STAFF.get());
    }
}
