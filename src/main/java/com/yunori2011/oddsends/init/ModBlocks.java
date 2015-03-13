package com.yunori2011.oddsends.init;

import com.yunori2011.oddsends.block.BlockCopper;
import com.yunori2011.oddsends.block.BlockOddType;
import com.yunori2011.oddsends.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

//Has game registry hold onto a unique version of the blocks provided through this class
//so that if any changes are made to them in outside mods, a unique version that is what
//was provided, and not what was changed is still what is accessed. May only be accessible
//from the mod that provided it? Not sure.
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    //Functional block registry, but as no blocks were needed in this mod, commented
    //out to keep from showing up in NEI in a normal user installation. Defer to ModItems
    //for a similar setup.

    //public static final BlockOddType BlockCopper = new BlockCopper();

    //A constructor method to actually provide FML with the blocks made by this mod to
    //be added and accessible in game.
    public static void init()
    {
        //GameRegistry.registerBlock(BlockCopper, "BlockCopper");
    }
}
