package com.yunori2011.oddsends.item;

import com.yunori2011.oddsends.handler.ConfigurationHandler;
import com.yunori2011.oddsends.utility.LogHelper;

public class ItemPureCertusDust extends ItemOddType
{
    public ItemPureCertusDust()
    {
        super();
        this.setUnlocalizedName("pureCertusDust");
        this.setMaxStackSize(64);

        if(ConfigurationHandler.OEDebug == true)
        {
            LogHelper.info("Register O&E Pure Certus Dust.");
        }

    }
}
