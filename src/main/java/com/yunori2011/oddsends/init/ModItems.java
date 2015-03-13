package com.yunori2011.oddsends.init;

import com.yunori2011.oddsends.item.ItemOddType;
import com.yunori2011.oddsends.item.ItemPureCertusDust;
import com.yunori2011.oddsends.item.ItemPureFluixDust;
import com.yunori2011.oddsends.item.ItemPureNetherDust;
import com.yunori2011.oddsends.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemOddType pureCertusDust = new ItemPureCertusDust();
    public static final ItemOddType pureNetherDust = new ItemPureNetherDust();
    public static final ItemOddType pureFluixDust = new ItemPureFluixDust();

    public static void init()
    {
        GameRegistry.registerItem(pureCertusDust, "pureCertusDust");
        GameRegistry.registerItem(pureNetherDust, "pureNetherDust");
        GameRegistry.registerItem(pureFluixDust, "pureFluixDust");
    }
}