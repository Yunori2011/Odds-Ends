package com.yunori2011.oddsends.init;

import appeng.api.AEApi;
import com.yunori2011.oddsends.handler.ConfigurationHandler;
import com.yunori2011.oddsends.utility.TERecipeHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Optional;
import cpw.mods.fml.common.event.FMLInterModComms;
import cpw.mods.fml.common.registry.GameRegistry;
import appeng.api.IAppEngApi;
import extracells.api.ECApi;
import ic2.api.recipe.RecipeInputOreDict;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

//Extends TERecipeHelper so I can have access to its addPulverizerRecipe method.
//Credit to ganymedes01's AOBD repo for that one. I just changed the whitespace layout of its
//method and reused it here since it works so well.
public class Recipes extends TERecipeHelper
{
    //Registers items to oredictionary even if this mod is the only one loaded in a runtime.
    public static void init()
    {
        OreDictionary.registerOre("pureCertusDust", new ItemStack(ModItems.pureCertusDust));
        OreDictionary.registerOre("pureNetherDust", new ItemStack(ModItems.pureNetherDust));
        OreDictionary.registerOre("pureFluixDust", new ItemStack(ModItems.pureFluixDust));
        OreDictionary.registerOre("pureChargedCertus", new ItemStack(ModItems.pureChargedCertusCrystal));
        OreDictionary.registerOre("quartzDusts", ModItems.pureCertusDust);
        OreDictionary.registerOre("quartzDusts", ModItems.pureNetherDust);
        OreDictionary.registerOre("fluixDusts", ModItems.pureFluixDust);
        OreDictionary.registerOre("itemSilicon", ModItems.oddSilicon);

        GameRegistry.addSmelting(new ItemStack(ModItems.pureCertusDust), new ItemStack(ModItems.oddSilicon), 0.5F);
        GameRegistry.addSmelting(new ItemStack(ModItems.pureNetherDust), new ItemStack(ModItems.oddSilicon), 0.5F);
    }

    //Strips method at load time if not loaded alongside AE2. I am probably doubling up on the logic
    //on if this is loaded with the main class, but it won't hurt to do it here too.
    @Optional.Method(modid = "appliedenergistics2")
    public static void initAE()
    {
        //Saves ItemStack calls of AE2 Items as variables for future use. Not currently used for more that
        //smaller oneliner calls to register them to the oredictionary for future use, will be used when
        //I get around to making oredictionary version of the respective AE2 recipes here with my items as well.
        ItemStack AECertusDust = AEApi.instance().materials().materialCertusQuartzDust.stack(1).copy();
        ItemStack AENetherDust = AEApi.instance().materials().materialNetherQuartzDust.stack(1).copy();
        ItemStack AEFluixDust = AEApi.instance().materials().materialFluixDust.stack(1).copy();

        ItemStack AECertusCrystal = AEApi.instance().materials().materialCertusQuartzCrystal.stack(1).copy();
        ItemStack pureAECertus = AEApi.instance().materials().materialPurifiedCertusQuartzCrystal.stack(1).copy();
        ItemStack AECCertusCrystal = AEApi.instance().materials().materialCertusQuartzCrystalCharged.stack(1).copy();
        ItemStack pureCCertusCrystal = new ItemStack(ModItems.pureChargedCertusCrystal);
        ItemStack NetherCrystal = new ItemStack(Items.quartz);
        ItemStack pureAENether = AEApi.instance().materials().materialPurifiedNetherQuartzCrystal.stack(1).copy();
        ItemStack FluixCrystal = AEApi.instance().materials().materialFluixCrystal.stack(1).copy();
        ItemStack pureAEFluix = AEApi.instance().materials().materialPurifiedFluixCrystal.stack(1).copy();
        ItemStack pureAEFluix4 = AEApi.instance().materials().materialPurifiedFluixCrystal.stack(4);

        ItemStack AEQuartzGlass = AEApi.instance().blocks().blockQuartzGlass.stack(1).copy();
        ItemStack AEQuartzFiber = AEApi.instance().parts().partQuartzFiber.stack(1).copy();
        ItemStack AEQuartzFiber3 = AEApi.instance().parts().partQuartzFiber.stack(3);
        ItemStack AEQuartzGrindstone = AEApi.instance().blocks().blockGrindStone.stack(1).copy();
        ItemStack AETinyTNT = AEApi.instance().blocks().blockTinyTNT.stack(1).copy();
        ItemStack AEFluixPearl = AEApi.instance().materials().materialFluixPearl.stack(1).copy();
        ItemStack AEMatterCon = AEApi.instance().blocks().blockCondenser.stack(1).copy();
        ItemStack AEEnergyCell = AEApi.instance().blocks().blockEnergyCell.stack(1).copy();
        ItemStack AEWirelessCard = AEApi.instance().materials().materialWirelessBooster.stack(2);
        ItemStack AEGoldCPU = AEApi.instance().materials().materialLogicProcessor.stack(1).copy();
        ItemStack AEAnnCore = AEApi.instance().materials().materialAnnihilationCore.stack(2);
        ItemStack AEFormCore = AEApi.instance().materials().materialFormationCore.stack(2);
        ItemStack AEViewCell = AEApi.instance().items().itemViewCell.stack(1).copy();
        ItemStack AE1k = AEApi.instance().materials().materialCell1kPart.stack(1).copy();
        ItemStack AEChargedStaff = AEApi.instance().items().itemChargedStaff.stack(1).copy();
        ItemStack AEBlankPattern = AEApi.instance().materials().materialBlankPattern.stack(1).copy();
        ItemStack AEChargedFixture = AEApi.instance().blocks().blockQuartzTorch.stack(2);
        ItemStack AECompass = AEApi.instance().blocks().blockSkyCompass.stack(1).copy();
        ItemStack AEEmptyCell = AEApi.instance().materials().materialEmptyStorageCell.stack(1).copy();
        ItemStack AECapacityCard = AEApi.instance().materials().materialCardCapacity.stack(1).copy();
        ItemStack AEBasicCard = AEApi.instance().materials().materialBasicCard.stack(1).copy();

        OreDictionary.registerOre("pureAECertus", pureAECertus);
        OreDictionary.registerOre("pureAENether", pureAENether);
        OreDictionary.registerOre("pureAEFluix", pureAEFluix);
        OreDictionary.registerOre("quartzDusts", AECertusDust);
        OreDictionary.registerOre("quartzDusts", AENetherDust);
        OreDictionary.registerOre("quartzCrystals", AECertusCrystal);
        OreDictionary.registerOre("quartzCrystals", pureAECertus);
        OreDictionary.registerOre("quartzCrystals", NetherCrystal);
        OreDictionary.registerOre("quartzCrystals", pureAENether);
        OreDictionary.registerOre("quartzCrystals", AECCertusCrystal);
        OreDictionary.registerOre("quartzCrystals", pureCCertusCrystal);
        OreDictionary.registerOre("fluixDusts", AEFluixDust);
        OreDictionary.registerOre("fluixCrystals", FluixCrystal);
        OreDictionary.registerOre("fluixCrystals", pureAEFluix);
        OreDictionary.registerOre("crystalCertuses", AECertusCrystal);
        OreDictionary.registerOre("crystalCertuses", pureAECertus);
        OreDictionary.registerOre("crystalCertuses", AECCertusCrystal);
        OreDictionary.registerOre("crystalCertuses", pureCCertusCrystal);
        OreDictionary.registerOre("crystalCCertuses", AECCertusCrystal);
        OreDictionary.registerOre("crystalCCertuses", pureCCertusCrystal);
        OreDictionary.registerOre("crystalNethers", NetherCrystal);
        OreDictionary.registerOre("crystalNethers", pureAENether);

        GameRegistry.addSmelting(AECertusDust, new ItemStack(ModItems.oddSilicon), 0.5F);
        GameRegistry.addSmelting(AENetherDust, new ItemStack(ModItems.oddSilicon), 0.5F);

        //Pure Charged Quartz
        GameRegistry.addRecipe(new ShapelessOreRecipe(pureAEFluix4, "crystalCCertuses", "crystalCCertuses", "crystalNethers", "dustRedstone" , "sand"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.pureChargedCertusCrystal, 2), AECCertusCrystal, "sand"));

        //Quartz Glass recipe
        GameRegistry.addRecipe(new ShapelessOreRecipe(AEQuartzGlass, "blockGlass", "quartzDusts", "quartzDusts"));

        //Quartz Fiber recipe
        GameRegistry.addRecipe(new ShapedOreRecipe(AEQuartzFiber, "g  ", "q  ", "g  ", 'q', "quartzDusts", 'g', "blockGlass"));
        GameRegistry.addRecipe(new ShapedOreRecipe(AEQuartzFiber, " g ", " q ", " g ", 'q', "quartzDusts", 'g', "blockGlass"));
        GameRegistry.addRecipe(new ShapedOreRecipe(AEQuartzFiber, "  g", "  q", "  g", 'q', "quartzDusts", 'g', "blockGlass"));
        GameRegistry.addRecipe(new ShapedOreRecipe(AEQuartzFiber3, "ggg", "qqq", "ggg", 'q', "quartzDusts", 'g', "blockGlass"));

        //Quartz Grindstone recipe
        GameRegistry.addRecipe(new ShapedOreRecipe(AEQuartzGrindstone, "sgs", "qsq", "cqc", 's', "stone", 'c', "cobblestone", 'q', "quartzCrystals", 'g', "gearWood"));

        //Tint TNT recipe
        GameRegistry.addRecipe(new ShapedOreRecipe(AETinyTNT, "qg ", "gq ", "   ", 'q', "quartzDusts", 'g', new ItemStack(Items.gunpowder)));

        //Fluix Pearl recipe
        GameRegistry.addRecipe(new ShapedOreRecipe(AEFluixPearl, "dcd", "cpc", "dcd", 'c', "fluixCrystals", 'd', "fluixDusts", 'p', new ItemStack(Items.ender_pearl)));

        //Matter Condenser recipe
        GameRegistry.addRecipe(new ShapedOreRecipe(AEMatterCon, "igi", "gdg", "igi", 'd', "fluixDusts", 'i', "ingotIron", 'g', "blockGlass"));

        //Energy Cell recipe
        GameRegistry.addRecipe(new ShapedOreRecipe(AEEnergyCell, "cdc", "dgd", "cdc", 'g', AEQuartzGlass, 'c', "crystalCertuses", 'd', "fluixDusts"));

        //Wireless Booster Card recipe
        GameRegistry.addRecipe(new ShapedOreRecipe(AEWirelessCard, "dce", "iii", "   ", 'i', "ingotIron", 'c', "quartzCrystals", 'd', "fluixDusts", 'e', "dustEnder"));
        GameRegistry.addRecipe(new ShapedOreRecipe(AEWirelessCard, "dce", "iii", "   ", 'i', "ingotIron", 'c', "quartzCrystals", 'd', "fluixDusts", 'e', "dustEnderPearl"));

        //Annihilation Core recipe
        GameRegistry.addRecipe(new ShapelessOreRecipe(AEAnnCore, "crystalNethers", "fluixDusts", AEGoldCPU));

        //Annihilation Core recipe
        GameRegistry.addRecipe(new ShapelessOreRecipe(AEFormCore, "crystalCertuses", "fluixDusts", AEGoldCPU));

        //View Cell recipe
        GameRegistry.addRecipe(new ShapedOreRecipe(AEViewCell, "grg", "rcr", "iii", 'g', AEQuartzGlass, 'r', "dustRedstone", 'c', "crystalCertuses", 'i', "ingotIron"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(AEViewCell, AEEmptyCell, pureCCertusCrystal));

        //1k Storage recipe
        GameRegistry.addRecipe(new ShapedOreRecipe(AE1k, "rcr", "cgc", "rcr", 'g', AEGoldCPU, 'r', "dustRedstone", 'c', "crystalCertuses"));

        //Charged Staff recipe
        GameRegistry.addRecipe(new ShapedOreRecipe(AEChargedStaff, "c  ", " i ", "  i", 'i', "ingotIron", 'c', AECCertusCrystal));
        GameRegistry.addRecipe(new ShapedOreRecipe(AEChargedStaff, "c  ", " i ", "  i", 'i', "ingotIron", 'c', pureCCertusCrystal));

        //Blank Pattern recipe
        GameRegistry.addRecipe(new ShapedOreRecipe(AEBlankPattern, "gsg", "scs", "iii", 'g', AEQuartzGlass, 's', "dustGlowstone", 'c', "crystalCertuses", 'i', "ingotIron"));

        //Quartz Fixture recipe
        GameRegistry.addRecipe(new ShapelessOreRecipe(AEChargedFixture, "ingotIron", pureCCertusCrystal));

        //AE Compass recipe
        GameRegistry.addRecipe(new ShapedOreRecipe(AECompass, " i ", "ici", " i ", 'c', pureCCertusCrystal, 'i', "ingotIron"));

        //Capacity Card recipe
        GameRegistry.addRecipe(new ShapelessOreRecipe(AECapacityCard, AEBasicCard, pureCCertusCrystal));

        //GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.pureCertusDust), pureFluix));
    }

    //Strips method at load time if not loaded alongside Extra Cells. I am probably doubling up on the logic
    //on if this is loaded with the main class, but it won't hurt to do it here too.
    @Optional.Method(modid = "extracells")
    public static void initEC()
    {
        ItemStack AEGoldCPU = AEApi.instance().materials().materialLogicProcessor.stack(1).copy();
        ItemStack AEAniCore = AEApi.instance().materials().materialAnnihilationCore.stack(1).copy();
        ItemStack AEFormCore = AEApi.instance().materials().materialFormationCore.stack(1).copy();
        ItemStack AEQuartzGlass = AEApi.instance().blocks().blockQuartzGlass.stack(1).copy();

        ItemStack EC1KFluid = ECApi.instance().items().cell1kPartFluid().stack(1).copy();
        ItemStack ECFluidAni = ECApi.instance().parts().partFluidAnnihilationPlane().stack(1).copy();
        ItemStack ECFluidForm = ECApi.instance().parts().partFluidFormationPlane().stack(1).copy();
        ItemStack ECAdvStorHousing = ECApi.instance().items().physCasing().stack(1).copy();
        ItemStack ECFluidHousing = ECApi.instance().items().fluidCasing().stack(1).copy();
        ItemStack ECQuartzTank = ECApi.instance().blocks().certusTank().stack(1).copy();

        ItemStack EC256kCell = ECApi.instance().items().physCell256k().stack(1).copy();
        ItemStack EC256kPart = ECApi.instance().items().cell256kPart().stack(1).copy();
        ItemStack EC1024kCell = ECApi.instance().items().physCell1024k().stack(1).copy();
        ItemStack EC1024kPart = ECApi.instance().items().cell1024kPart().stack(1).copy();
        ItemStack EC4096kCell = ECApi.instance().items().physCell4096k().stack(1).copy();
        ItemStack EC4096kPart = ECApi.instance().items().cell4096kPart().stack(1).copy();
        ItemStack EC16384kCell = ECApi.instance().items().physCell16384k().stack(1).copy();
        ItemStack EC16384kPart = ECApi.instance().items().cell16384kPart().stack(1).copy();

        ItemStack ECFluid1kCell = ECApi.instance().items().fluidCell1k().stack(1).copy();
        ItemStack ECFluid1kPart = ECApi.instance().items().cell1kPartFluid().stack(1).copy();
        ItemStack ECFluid4kCell = ECApi.instance().items().fluidCell4k().stack(1).copy();
        ItemStack ECFluid4kPart = ECApi.instance().items().cell4kPartFluid().stack(1).copy();
        ItemStack ECFluid16kCell = ECApi.instance().items().fluidCell16k().stack(1).copy();
        ItemStack ECFluid16kPart = ECApi.instance().items().cell16kPartFluid().stack(1).copy();
        ItemStack ECFluid64kCell = ECApi.instance().items().fluidCell64k().stack(1).copy();
        ItemStack ECFluid64kPart = ECApi.instance().items().cell64kPartFluid().stack(1).copy();
        ItemStack ECFluid256kCell = ECApi.instance().items().fluidCell256k().stack(1).copy();
        ItemStack ECFluid256kPart = ECApi.instance().items().cell256kPartFluid().stack(1).copy();
        ItemStack ECFluid1024kCell = ECApi.instance().items().fluidCell1024k().stack(1).copy();
        ItemStack ECFluid1024kPart = ECApi.instance().items().cell1024kPartFluid().stack(1).copy();
        ItemStack ECFluid4096kCell = ECApi.instance().items().fluidCell4096k().stack(1).copy();
        ItemStack ECFluid4096kPart = ECApi.instance().items().cell4096kPartFluid().stack(1).copy();

        //EC 1k Fluid Storage Segment
        GameRegistry.addRecipe(new ShapedOreRecipe(EC1KFluid, "bqb", "qcq", "bqb", 'b', "dyeBlue", 'c', AEGoldCPU, 'q', "crystalCertuses"));

        //EC Fluid Annihilation Plane
        GameRegistry.addRecipe(new ShapedOreRecipe(ECFluidAni, "ibf", "abf", "ibf", 'b', "dyeBlue", 'i', "ingotIron", 'f', "fluixDusts", 'a', AEAniCore));

        //EC Fluid Formation Plane
        GameRegistry.addRecipe(new ShapedOreRecipe(ECFluidForm, "ibf", "abf", "ibf", 'b', "dyeBlue", 'i', "ingotIron", 'f', "fluixDusts", 'a', AEFormCore));

        //EC Advanced Storage Housing
        GameRegistry.addRecipe(new ShapedOreRecipe(ECAdvStorHousing, "qfq", "f f", "ddd", 'q', AEQuartzGlass, 'f', "fluixDusts", 'd', "gemDiamond"));

        //EC Advanced Fluid Storage Housing
        GameRegistry.addRecipe(new ShapedOreRecipe(ECFluidHousing, "qfq", "f f", "ttt", 'q', AEQuartzGlass, 'f', "fluixDusts", 't', ECQuartzTank));

        //EC 256k Cell
        GameRegistry.addRecipe(new ShapedOreRecipe(EC256kCell, "qfq", "fsf", "ddd", 'q', AEQuartzGlass, 'f', "fluixDusts", 'd', "gemDiamond", 's', EC256kPart));

        //EC 1024k Cell
        GameRegistry.addRecipe(new ShapedOreRecipe(EC1024kCell, "qfq", "fsf", "ddd", 'q', AEQuartzGlass, 'f', "fluixDusts", 'd', "gemDiamond", 's', EC1024kPart));

        //EC 4096k Cell
        GameRegistry.addRecipe(new ShapedOreRecipe(EC4096kCell, "qfq", "fsf", "ddd", 'q', AEQuartzGlass, 'f', "fluixDusts", 'd', "gemDiamond", 's', EC4096kPart));

        //EC 16384k Cell
        GameRegistry.addRecipe(new ShapedOreRecipe(EC16384kCell, "qfq", "fsf", "ddd", 'q', AEQuartzGlass, 'f', "fluixDusts", 'd', "gemDiamond", 's', EC16384kPart));

        //EC 1k Fluid Cell
        GameRegistry.addRecipe(new ShapedOreRecipe(ECFluid1kCell, "qfq", "fsf", "ttt", 'q', AEQuartzGlass, 'f', "fluixDusts", 't', ECQuartzTank, 's', ECFluid1kPart));

        //EC 4k Fluid Cell
        GameRegistry.addRecipe(new ShapedOreRecipe(ECFluid4kCell, "qfq", "fsf", "ttt", 'q', AEQuartzGlass, 'f', "fluixDusts", 't', ECQuartzTank, 's', ECFluid4kPart));

        //EC 16k Fluid Cell
        GameRegistry.addRecipe(new ShapedOreRecipe(ECFluid16kCell, "qfq", "fsf", "ttt", 'q', AEQuartzGlass, 'f', "fluixDusts", 't', ECQuartzTank, 's', ECFluid16kPart));

        //EC 64k Fluid Cell
        GameRegistry.addRecipe(new ShapedOreRecipe(ECFluid64kCell, "qfq", "fsf", "ttt", 'q', AEQuartzGlass, 'f', "fluixDusts", 't', ECQuartzTank, 's', ECFluid64kPart));

        //EC 256k Fluid Cell
        GameRegistry.addRecipe(new ShapedOreRecipe(ECFluid256kCell, "qfq", "fsf", "ttt", 'q', AEQuartzGlass, 'f', "fluixDusts", 't', ECQuartzTank, 's', ECFluid256kPart));

        //EC 1024k Fluid Cell
        GameRegistry.addRecipe(new ShapedOreRecipe(ECFluid1024kCell, "qfq", "fsf", "ttt", 'q', AEQuartzGlass, 'f', "fluixDusts", 't', ECQuartzTank, 's', ECFluid1024kPart));

        //EC 4096k Fluid Cell
        GameRegistry.addRecipe(new ShapedOreRecipe(ECFluid4096kCell, "qfq", "fsf", "ttt", 'q', AEQuartzGlass, 'f', "fluixDusts", 't', ECQuartzTank, 's', ECFluid4096kPart));
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

    //Strips method at load time if not loaded alongside IC2. I am probably doubling up on the logic
    //on if this is loaded with the main class, but it won't hurt to do it here too.
    @Optional.Method(modid = "IC2")
    public static void initIC2()
    {
        //Saves ItemStack calls of AE2 Items as variables for future use.
        ItemStack pureAECertus = AEApi.instance().materials().materialPurifiedCertusQuartzCrystal.stack(1).copy();
        ItemStack pureAENether = AEApi.instance().materials().materialPurifiedNetherQuartzCrystal.stack(1).copy();
        ItemStack pureAEFluix = AEApi.instance().materials().materialPurifiedFluixCrystal.stack(1).copy();

        if (ConfigurationHandler.ic2MacRecipes == true) {
            //Macerator recipe; input:AE Pure Certus Crystal, output: OddsEnds Pure Certus Dust
            ic2.api.recipe.Recipes.macerator.addRecipe(new RecipeInputOreDict("pureAECertus"), null, new ItemStack(ModItems.pureCertusDust));
            //Macerator recipe; input:AE Pure Nether Quartz Crystal, output: OddsEnds Pure Nether Quartz Dust
            ic2.api.recipe.Recipes.macerator.addRecipe(new RecipeInputOreDict("pureAENether"), null, new ItemStack(ModItems.pureNetherDust));
            //Macerator recipe; input:AE Pure Fluix Crystal, output: OddsEnds Pure Fluix Dust
            ic2.api.recipe.Recipes.macerator.addRecipe(new RecipeInputOreDict("pureAEFluix"), null, new ItemStack(ModItems.pureFluixDust));
            //Macerator recipe; input:OddsEnds Pure Charged Certus Quartz Crystal, output: OddsEnds Pure Certus Dust
            ic2.api.recipe.Recipes.macerator.addRecipe(new RecipeInputOreDict("pureChargedCertus"), null, new ItemStack(ModItems.pureCertusDust));

            //input:
            //Compressor recipe; input:OddsEnds Pure Certus Dust, output: AE Pure Certus Crystal
            ic2.api.recipe.Recipes.compressor.addRecipe(new RecipeInputOreDict("pureCertusDust"), null, pureAECertus);
            //Compressor recipe; input:OddsEnds Pure Nether Quartz Dust, output: AE Pure Nether Quartz Crystal
            ic2.api.recipe.Recipes.compressor.addRecipe(new RecipeInputOreDict("pureNetherDust"), null, pureAENether);
            //Compressor recipe; input:OddsEnds Pure Fluix Dust, output: AE Pure Fluix Crystal
            ic2.api.recipe.Recipes.compressor.addRecipe(new RecipeInputOreDict("pureFluixDust"), null, pureAEFluix);
        }
    }

    //Strips method at load time if not loaded alongside TE. I am probably doubling up on the logic
    //on if this is loaded with the main class, but it won't hurt to do it here too.
    @Optional.Method(modid = "ThermalExpansion")
    public static void initTE()
    {
        //Saves ItemStack calls of AE2 Items as variables for future use.
        ItemStack pureAECertus = AEApi.instance().materials().materialPurifiedCertusQuartzCrystal.stack(1).copy();
        ItemStack pureAENether = AEApi.instance().materials().materialPurifiedNetherQuartzCrystal.stack(1).copy();
        ItemStack pureAEFluix = AEApi.instance().materials().materialPurifiedFluixCrystal.stack(1).copy();

        //Registers pulverizer recipes for pure dusts
        //power:800RF, input:AE Pure Certus Crystal, output:OddsEnds Pure Certus Dust
        addPulveriserRecipe(800, pureAECertus, new ItemStack(ModItems.pureCertusDust), null, 0);
        //power:800RF, input:AE Pure Nether Quartz Crystal, output:OddsEnds Pure Nether Dust
        addPulveriserRecipe(800, pureAENether, new ItemStack(ModItems.pureNetherDust), null, 0);
        //power:800RF, input:AE Pure Fluix Crystal, output:OddsEnds Pure Fluix Dust
        addPulveriserRecipe(800, pureAEFluix, new ItemStack(ModItems.pureFluixDust), null, 0);
    }
}
