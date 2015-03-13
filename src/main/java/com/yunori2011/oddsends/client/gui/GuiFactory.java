package com.yunori2011.oddsends.client.gui;

import java.util.Set;

import com.yunori2011.oddsends.handler.ConfigurationHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import cpw.mods.fml.client.IModGuiFactory;

public class GuiFactory implements IModGuiFactory
{

    @Override
    public void initialize(Minecraft minecraftInstance) {
        // TODO Auto-generated method stub
        // Method currently placeholder, non-functional

    }

    @Override
    public Class<? extends GuiScreen> mainConfigGuiClass() {
        // TODO Auto-generated method stub
        //Returns custom config screen class to forge's GUI config wrapper
        //Adds a option to change configs from the mods tab.

        return ModGuiConfig.class;
    }

    @Override
    public Set<RuntimeOptionCategoryElement> runtimeGuiCategories() {
        // TODO Auto-generated method stub
        // Method currently placeholder, non-functional

        return null;
    }

    @Override
    public RuntimeOptionGuiHandler getHandlerFor(
            RuntimeOptionCategoryElement element) {
        // TODO Auto-generated method stub
        // Method currently placeholder, non-functional

        return null;
    }

}