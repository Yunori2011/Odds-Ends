package com.yunori2011.oddsends.creativetab;

import com.yunori2011.oddsends.init.ModItems;
import com.yunori2011.oddsends.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabOddsEnds
{
    public static final CreativeTabs OddTab = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.pureCertusDust;
        }

        @Override
        public String getTranslatedTabLabel()
        {
            return "Odds&Ends";
        }
    };
}
