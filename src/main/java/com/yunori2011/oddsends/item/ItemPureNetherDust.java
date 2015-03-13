package com.yunori2011.oddsends.item;

import com.yunori2011.oddsends.handler.ConfigurationHandler;
import com.yunori2011.oddsends.utility.LogHelper;

public class ItemPureNetherDust extends ItemOddType
{
    public ItemPureNetherDust()
    {
        super();
        this.setUnlocalizedName("pureNetherDust");
        this.setMaxStackSize(64);

        if(ConfigurationHandler.OEDebug == true)
        {
            LogHelper.info("Register O&E Pure Nether Dust.");
        }
    }
}
