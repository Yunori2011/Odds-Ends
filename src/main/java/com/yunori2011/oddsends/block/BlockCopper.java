package com.yunori2011.oddsends.block;

import com.yunori2011.oddsends.handler.ConfigurationHandler;
import com.yunori2011.oddsends.utility.LogHelper;

//Basic block proof of concept using BlockOddType wrapper to make to abstact
//out much of the definitions that are required in all blocks.
public class BlockCopper extends BlockOddType
{
    public BlockCopper()
    {
        super();
        this.setBlockName("BlockCopper");

        //Checks debug variable from config and prints to console if true
        //when registering block.
        if(ConfigurationHandler.OEDebug == true)
        {
            LogHelper.info("Registered O&E Copper Block.");
        }


    }
}
