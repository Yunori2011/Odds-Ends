package com.yunori2011.oddsends.item;

import appeng.api.AEApi;
import com.yunori2011.oddsends.handler.ConfigurationHandler;
import com.yunori2011.oddsends.init.ModItems;
import com.yunori2011.oddsends.utility.LogHelper;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraft.item.ItemStack;

//Basic items made to add new dust variants for AE2 from its pure crystal sources.
//Most methods within these items should be self explanatory for now.

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
