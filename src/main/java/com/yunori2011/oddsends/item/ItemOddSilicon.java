package com.yunori2011.oddsends.item;

import com.yunori2011.oddsends.handler.ConfigurationHandler;
import com.yunori2011.oddsends.utility.LogHelper;

public class ItemOddSilicon extends ItemOddType
{
    public ItemOddSilicon()
    {
        super();
        this.setUnlocalizedName("oddSilicon");
        this.setMaxStackSize(64);

        if(ConfigurationHandler.OEDebug == true)
        {
            LogHelper.info("Register O&E Silicon.");
        }
    }
}
