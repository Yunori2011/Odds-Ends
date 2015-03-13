package com.yunori2011.oddsends.block;

import com.yunori2011.oddsends.creativetab.CreativeTabOddsEnds;
import com.yunori2011.oddsends.reference.Reference;
import com.yunori2011.oddsends.utility.LogHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;


//Basic block class that is easy to extend to other blocks with
//whatever changes that specific block may need.
public class BlockOddType extends Block {
    //A constructor with takes an argument to set the material.
    public BlockOddType(Material material) {
        super(material);

        //Sets creative tab to custom one so that all blocks extending this
        //class show up there unless changed at the specific block.
        this.setCreativeTab(CreativeTabOddsEnds.OddTab);
    }

    //A default constructor to call when setting a block that will just default to the rock material type.
    public BlockOddType() {
        this(Material.rock);
    }

    //A method that obtains the unlocalized name of any blocks constucted from this base class
    //Format it tile.*string1*:*string2*.name, which this constructs using a mixture of hardcoding and
    //referencing from the block
    @Override
    public String getUnlocalizedName() {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    //Uses the previously obtained unlocalized name and find the index of the '.' character
    //after tile (ex tile.***:**.name), adds 1 to said string index and obtains all characters
    //after that point in the string to obtain the name without its 'tile.' heading
    //ex. (***:**.name). Further instances of this string will be called unwrapped
    //localizations.
    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

    //Extrapolates off the previous two methods to use the unwrapped localization
    //to register the block a texture from the assets file of the same name as
    //from the assets folder
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }
}