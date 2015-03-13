package com.yunori2011.oddsends.block;

import com.yunori2011.oddsends.handler.ConfigurationHandler;
import com.yunori2011.oddsends.utility.LogHelper;

public class BlockCopper extends BlockOddType
{
    public BlockCopper()
    {
        super();
        this.setBlockName("BlockCopper");

        if(ConfigurationHandler.OEDebug == true)
        {
            LogHelper.info("Registered O&E Copper Block.");
        }


    }
}
