package com.yunori2011.oddsends.init;

import com.yunori2011.oddsends.item.ItemOddType;
import com.yunori2011.oddsends.item.ItemPureCertusDust;
import com.yunori2011.oddsends.item.ItemPureFluixDust;
import com.yunori2011.oddsends.item.ItemPureNetherDust;
import com.yunori2011.oddsends.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

//Has game registry hold onto a unique version of the items provided through this class
//so that if any changes are made to them in outside mods, a unique version that is what
//was provided, and not what was changed is still what is accessed. May only be accessible
//from the mod that provided it? Not sure.
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    //Initializes three objects to item classes to be added to game registry.
    public static final ItemOddType pureCertusDust = new ItemPureCertusDust();
    public static final ItemOddType pureNetherDust = new ItemPureNetherDust();
    public static final ItemOddType pureFluixDust = new ItemPureFluixDust();

    //Constructor to add previously made objects to game
    public static void init()
    {
        //Gameregistry.registerItem() constructor format
        //object, unlocalized name.
        GameRegistry.registerItem(pureCertusDust, "pureCertusDust");
        GameRegistry.registerItem(pureNetherDust, "pureNetherDust");
        GameRegistry.registerItem(pureFluixDust, "pureFluixDust");
    }
}