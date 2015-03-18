package com.yunori2011.oddsends.handler;

import com.yunori2011.oddsends.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;
import java.io.File;

public class ConfigurationHandler
{
    //Register config object as variable
    public static Configuration configuration;

    //Register config file values as variables at default settings
    public static boolean eioRecipes = false;
    public static boolean ic2MacRecipes = true;
    public static boolean teRecipes = true;
    public static boolean OEDebug = false;

    //Initial constructor method to be provided with the physical config file.
    //If it is empty/doesn't exist, it will create it, and link to the next method.
    //It should always be == null when loading in preinit, as I don't register to object
    //to the file until when this init method is called and passed the config file
    //in preinit.
    public static void init(File configFile)
    {
        if (configuration == null) {
            configuration = new Configuration(configFile);

            //After config creation/init, load values from file into memory, even though first run
            //will have the same as the default values already in memory
            loadConfiguration();
        }
    }

    //Writes config options to file to file, or if they already exists, loads settings from file into memory.
    private static void loadConfiguration()
    {
        //EIO option removed from config until I can figure out how to pass EIO Recipes easily.

        //eioRecipes = configuration.getBoolean("EIO recipes", Configuration.CATEGORY_GENERAL, true, "Enabled crafting of pure crystal dusts using the EIO SAG Mill. Does nothing without EIO installed.");
        ic2MacRecipes = configuration.getBoolean("IC2 Recipes", Configuration.CATEGORY_GENERAL, true, "Enabled crafting of pure crystal dusts using the IC2 Macerator. Does nothing without IC2 installed.");
        teRecipes = configuration.getBoolean("TE Recipes", Configuration.CATEGORY_GENERAL, true, "Enabled crafting of pure crystal dusts using the TE Pulverizer. Does nothing without TE installed.");
        OEDebug = configuration.getBoolean("Enable Debug", Configuration.CATEGORY_GENERAL, false, "Enable debugging. Will spam log, reccommended to be false.");

        //If the config has changed, for example from a blank file to with information,
        //writes the changes to the file. Also useful for GUI Config Editor during runtime.
        if (configuration.hasChanged())
        {
            configuration.save();
        }
    }

    //Listens for Forge event detailing that a config file has changes, whether its from
    //the GUI config changing something, or a difference in values from last load time.
    // If the returned value is this mod's MOD_ID...
    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        //...then reload the config file into memory.
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            loadConfiguration();
        }
    }
}