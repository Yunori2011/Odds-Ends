package com.yunori2011.oddsends.item;

import com.yunori2011.oddsends.handler.ConfigurationHandler;
import com.yunori2011.oddsends.utility.LogHelper;

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