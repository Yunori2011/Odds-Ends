package com.yunori2011.oddsends.item;

import com.yunori2011.oddsends.handler.ConfigurationHandler;
import com.yunori2011.oddsends.utility.LogHelper;

//Basic items made to add new dust variants for AE2 from its pure crystal sources.
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