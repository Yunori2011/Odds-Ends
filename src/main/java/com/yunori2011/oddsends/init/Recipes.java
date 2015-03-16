package com.yunori2011.oddsends.init;

import appeng.api.AEApi;
import com.yunori2011.oddsends.handler.ConfigurationHandler;
import com.yunori2011.oddsends.utility.TERecipeHelper;
import com.yunori2011.oddsends.utility.EIORecipeHelper;
import cpw.mods.fml.common.Optional;
import cpw.mods.fml.common.event.FMLInterModComms;
import cpw.mods.fml.common.registry.GameRegistry;
import appeng.api.IAppEngApi;
import ic2.api.recipe.RecipeInputOreDict;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes extends EIORecipeHelper
{
    public static void init()
    {
        OreDictionary.registerOre("pureCertusDust", new ItemStack(ModItems.pureCertusDust));
        OreDictionary.registerOre("pureNetherDust", new ItemStack(ModItems.pureNetherDust));
        OreDictionary.registerOre("pureFluixDust", new ItemStack(ModItems.pureFluixDust));
    }

    @Optional.Method(modid = "appliedenergistics2")
    public static void initAE()
    {
        ItemStack pureAECertus = AEApi.instance().materials().materialPurifiedCertusQuartzCrystal.stack(1).copy();
        ItemStack pureAENether = AEApi.instance().materials().materialPurifiedNetherQuartzCrystal.stack(1).copy();
        ItemStack pureAEFluix = AEApi.instance().materials().materialPurifiedFluixCrystal.stack(1).copy();

        OreDictionary.registerOre("pureAECertus", pureAECertus);
        OreDictionary.registerOre("pureAENether", pureAENether);
        OreDictionary.registerOre("pureAEFluix", pureAEFluix);
        //GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.pureCertusDust), pureFluix));
    }

    /*@Optional.Method(modid = "EnderIO")
    public static void initEIO()
    {
        String EIOCertus;
        String EIONether;
        String EIOFluix;

        ItemStack pureAECertus = AEApi.instance().materials().materialPurifiedCertusQuartzCrystal.stack(1).copy();
        ItemStack pureAENether = AEApi.instance().materials().materialPurifiedNetherQuartzCrystal.stack(1).copy();
        ItemStack pureAEFluix = AEApi.instance().materials().materialPurifiedFluixCrystal.stack(1).copy();

        FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", EIOCertus =
                "<recipeGroup name=\"OddsEnds\">" +
                "<recipe name='pureCertusDust'" +
                "energyCost=" +
                "2400" +
                ">" +
                "<input>" +
                "<itemStack oreDictionary=" +
                "pureAECertus" +
                "/>" +
                "</input>" +
                "<output>" +
                "<itemStack oreDictionary=" +
                "pureCertusDust" +
                "/>" +
                "</output>" +
                "</recipe>");
    }*/

    @Optional.Method(modid = "IC2")
    public static void initIC2()
    {
        ItemStack pureAECertus = AEApi.instance().materials().materialPurifiedCertusQuartzCrystal.stack(1).copy();
        ItemStack pureAENether = AEApi.instance().materials().materialPurifiedNetherQuartzCrystal.stack(1).copy();
        ItemStack pureAEFluix = AEApi.instance().materials().materialPurifiedFluixCrystal.stack(1).copy();

        if (ConfigurationHandler.ic2MacRecipes == true) {
            ic2.api.recipe.Recipes.macerator.addRecipe(new RecipeInputOreDict("pureAECertus"), null, new ItemStack(ModItems.pureCertusDust));
            ic2.api.recipe.Recipes.macerator.addRecipe(new RecipeInputOreDict("pureAENether"), null, new ItemStack(ModItems.pureNetherDust));
            ic2.api.recipe.Recipes.macerator.addRecipe(new RecipeInputOreDict("pureAEFluix"), null, new ItemStack(ModItems.pureFluixDust));

            ic2.api.recipe.Recipes.compressor.addRecipe(new RecipeInputOreDict("pureCertusDust"), null, pureAECertus);
            ic2.api.recipe.Recipes.compressor.addRecipe(new RecipeInputOreDict("pureNetherDust"), null, pureAENether);
            ic2.api.recipe.Recipes.compressor.addRecipe(new RecipeInputOreDict("pureFluixDust"), null, pureAEFluix);
        }
    }

    @Optional.Method(modid = "ThermalExpansion")
    public static void initTE()
    {
        ItemStack pureAECertus = AEApi.instance().materials().materialPurifiedCertusQuartzCrystal.stack(1).copy();
        ItemStack pureAENether = AEApi.instance().materials().materialPurifiedNetherQuartzCrystal.stack(1).copy();
        ItemStack pureAEFluix = AEApi.instance().materials().materialPurifiedFluixCrystal.stack(1).copy();

        addPulveriserRecipe(800, pureAECertus, new ItemStack(ModItems.pureCertusDust), null, 0);
        addPulveriserRecipe(800, pureAENether, new ItemStack(ModItems.pureNetherDust), null, 0);
        addPulveriserRecipe(800, pureAEFluix, new ItemStack(ModItems.pureFluixDust), null, 0);
    }
}
