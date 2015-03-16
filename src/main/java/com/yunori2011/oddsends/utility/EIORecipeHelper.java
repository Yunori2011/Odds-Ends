package com.yunori2011.oddsends.utility;

import cpw.mods.fml.common.event.FMLInterModComms;
import net.minecraftforge.oredict.OreDictionary;

public class EIORecipeHelper extends TERecipeHelper
{
    //@formatter:off
    public static final String xmlMessage = "<recipeGroup name=\"OddsEnds\">" +
            "<recipe name='CertusQuartzOre'" +
            "energyCost='2400'>" +
            "<input>" +
            "<itemStack oreDictionary='oreCertusQuartz'' />" +
            "</input>" +
            "<output>" +
            "<itemStack oreDictionary='crystalCertusQuartz' />" +
            "<itemStack oreDictionary='dustCertusQuartz' />" +
            "</output>" +
            "</recipe>";
    //@formatter:on

    public static void addSAGMillRecipe(String input, int energy, String extra)
    {
        FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", String.format(xmlMessage, input, energy, input, input, extra));


    }
}

