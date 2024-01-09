package argent_matter.gtec;

import argent_matter.gtec.api.recipes.PlatinumLineRecipes;
import argent_matter.gtec.api.common.data.GTECMaterials;
import argent_matter.gtec.api.common.data.GTECRecipes;
import com.gregtechceu.gtceu.api.addon.GTAddon;
import com.gregtechceu.gtceu.api.addon.IGTAddon;
import com.gregtechceu.gtceu.api.addon.events.MaterialCasingCollectionEvent;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

@GTAddon
public class GTExtendedChemGTAddon implements IGTAddon {
    @Override
    public void initializeAddon() {

    }

    @Override
    public String addonModId() {
        return GTExtendedChem.MOD_ID;
    }

    @Override
    public void registerTagPrefixes() {
    }

    @Override
    public void registerElements() {
        IGTAddon.super.registerElements();
    }

    @Override
    public void registerMaterials() {
        GTECMaterials.init();
    }

    @Override
    public void registerCovers() {
        IGTAddon.super.registerCovers();
    }


    @Override
    public boolean requiresHighTier() {
        return false;
    }

    @Override
    public void registerVeinGenerators() {
        IGTAddon.super.registerVeinGenerators();
    }

    @Override
    public void collectMaterialCasings(MaterialCasingCollectionEvent event) {
        IGTAddon.super.collectMaterialCasings(event);
    }

    @Override
    public void addRecipes(Consumer<FinishedRecipe> provider) {
        GTECRecipes.init(provider);
        PlatinumLineRecipes.init(provider);
    }
}