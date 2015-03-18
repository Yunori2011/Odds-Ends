package com.yunori2011.oddsends.item;

//Basic items made to add new dust variants for AE2 from its pure crystal sources.
//Most methods within these items should be self explanatory for now.

import com.yunori2011.oddsends.handler.ConfigurationHandler;
import com.yunori2011.oddsends.utility.LogHelper;

public class ItemPureChargedCertusCrystal extends ItemOddType
{
    public ItemPureChargedCertusCrystal()
    {
        super();
        this.setUnlocalizedName("pureChargedCertusCrystal");
        this.setMaxStackSize(64);

        if(ConfigurationHandler.OEDebug == true)
        {
            LogHelper.info("Register O&E Pure Charged Certus Quartz Crystal.");
        }
    }
}
