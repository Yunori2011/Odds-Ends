package com.yunori2011.oddsends.creativetab;

import com.yunori2011.oddsends.init.ModItems;
import com.yunori2011.oddsends.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabOddsEnds
{
    //Creates a basic creative tab, not sure if actually basic and barebones,
    //or simple to implement
    //Provides creative tab variable as per constructor. When initialising
    //a CreativeTabs variable, you have to provide a MOD_ID
    public static final CreativeTabs OddTab = new CreativeTabs(Reference.MOD_ID)
    {
        //Provides item with texture to assign to the creative tab's texture.
        @Override
        public Item getTabIconItem()
        {
            return ModItems.pureCertusDust;
        }

        //Sets tooltip for creative tab. This method is currently
        //incorrect in its labeling, due to the hardcoded nature of the
        //string within. Might fix at some point, for good practice's sake.
        @Override
        public String getTranslatedTabLabel()
        {
            return "Odds&Ends";
        }
    };
}
