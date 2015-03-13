package com.yunori2011.oddsends.handler;

import com.yunori2011.oddsends.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;
import java.io.File;

public class ConfigurationHandler
{
    //Register config file object as variable
    public static Configuration configuration;

    //Register config file values as variables at default settings
    public static boolean eioRecipes = true;
    public static boolean ic2MacRecipes = true;
    public static boolean teRecipes = true;
    public static boolean OEDebug = true;

    public static void init(File configFile)
    {
    // Create the configuration object from the given configuration file
    // if file does not exist already

        if (configuration == null)
        {
            configuration = new Configuration(configFile);

            //After config creation/init, load values from file into memory, even though first run
            //will have the same as the default values already in memory
            loadConfiguration();
        }
    }

    private static void loadConfiguration()
    {
        //Load the current config file settings into memory
        eioRecipes = configuration.getBoolean("EIO recipes", Configuration.CATEGORY_GENERAL, true, "Enabled crafting of pure crystal dusts using the EIO SAG Mill. Does nothing without EIO installed.");
        ic2MacRecipes = configuration.getBoolean("IC2 Recipes", Configuration.CATEGORY_GENERAL, true, "Enabled crafting of pure crystal dusts using the IC2 Macerator. Does nothing without IC2 installed.");
        teRecipes = configuration.getBoolean("TE Recipes", Configuration.CATEGORY_GENERAL, true, "Enabled crafting of pure crystal dusts using the TE Pulverizer. Does nothing without TE installed.");
        OEDebug = configuration.getBoolean("Enable Debug", Configuration.CATEGORY_GENERAL, false, "Enable debugging. Will spam log, reccommended to be false.");

        //If the config has changed, save changes to file, for GUI config
        if (configuration.hasChanged())
        {
            configuration.save();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        //Checks if config has changed from FML Event
        //if it has, reloads config options from file to memory
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            loadConfiguration();
        }
    }
}