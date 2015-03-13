package com.yunori2011.oddsends.item;

import com.yunori2011.oddsends.handler.ConfigurationHandler;
import com.yunori2011.oddsends.utility.LogHelper;

//Basic items made to add new dust variants for AE2 from its pure crystal sources.
//Currently no recipes have been registered through this mod, but I will change that
//when I figure out how to use AE2's, IC2's, TE's, and EIO's APIs to define recipes
//using their items/machines to make them :P.
public class ItemPureFluixDust extends ItemOddType
{
    public ItemPureFluixDust()
    {
        super();
        this.setUnlocalizedName("pureFluixDust");
        this.setMaxStackSize(64);

        if(ConfigurationHandler.OEDebug == true)
        {
            LogHelper.info("Register O&E Pure Fluix Dust.");
        }
    }
}