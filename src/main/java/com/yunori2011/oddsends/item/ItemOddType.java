package com.yunori2011.oddsends.item;

import com.yunori2011.oddsends.creativetab.CreativeTabOddsEnds;
import com.yunori2011.oddsends.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

//Basic item class that is easy to extend to other items with
//whatever changes that specific item may need.
public class ItemOddType extends Item
{
    public ItemOddType()
    {
        super();

        //Sets creative tab to custom one so that all items extending this
        //class show up there unless changed at the specific item.
        this.setCreativeTab(CreativeTabOddsEnds.OddTab);

    }
    //These methods work similarily to those listed in BlockOddType, except
    //arguments substituted for their item variants. Defer to BlockOddType if
    //you wish to be explained better how they work.
    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }
}