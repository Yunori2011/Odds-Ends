package com.yunori2011.oddsends.client.gui;

import com.yunori2011.oddsends.handler.ConfigurationHandler;
import com.yunori2011.oddsends.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

//Extends GuiConfig so a constructor can be called to provide the Forge GUI
//config screen with all the options from a specific category which it parses
//into a dynamically generated GUI. Easy on the end-user, not too difficult to
//implement.

public class ModGuiConfig extends GuiConfig
{
    public ModGuiConfig(GuiScreen guiScreen)
    {
        //Uses super() to provide the argument to the constructor method with the method itself
        //Format is Config Catagory, MOD_ID, requires world restart, requires minecraft restart, path to config file.
        super(guiScreen,
                new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }
}