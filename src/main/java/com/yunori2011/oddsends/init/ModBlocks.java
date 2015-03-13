package com.yunori2011.oddsends.init;

import com.yunori2011.oddsends.block.BlockCopper;
import com.yunori2011.oddsends.block.BlockOddType;
import com.yunori2011.oddsends.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockOddType BlockCopper = new BlockCopper();

    public static void init()
    {
        GameRegistry.registerBlock(BlockCopper, "BlockCopper");
    }
}
