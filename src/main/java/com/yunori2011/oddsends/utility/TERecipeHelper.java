package com.yunori2011.oddsends.utility;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.event.FMLInterModComms;

public class TERecipeHelper
{
    public static void addPulveriserRecipe(int energy, ItemStack input, ItemStack output, ItemStack bonus, int chance)
    {
        NBTTagCompound data = new NBTTagCompound();
        NBTTagCompound inputCompound = new NBTTagCompound();
        NBTTagCompound outputCompound = new NBTTagCompound();

        data.setInteger("energy", energy);
        data.setTag("input", inputCompound);
        data.setTag("primaryOutput", outputCompound);

        input.writeToNBT(inputCompound);

        output.writeToNBT(outputCompound);

        if (bonus != null) {
            NBTTagCompound outputCompound2 = new NBTTagCompound();
            bonus.writeToNBT(outputCompound2);
            data.setTag("secondaryOutput", outputCompound2);
            data.setInteger("secondaryChance", chance);
        }

        FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", data);
    }
}
