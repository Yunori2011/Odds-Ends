package com.yunori2011.oddsends;

import com.yunori2011.oddsends.handler.ConfigurationHandler;
import com.yunori2011.oddsends.init.ModBlocks;
import com.yunori2011.oddsends.init.ModItems;
import com.yunori2011.oddsends.proxy.IProxy;
import com.yunori2011.oddsends.reference.Reference;
import com.yunori2011.oddsends.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

//Base class file that references and has access to all other public methods within the mod.
//Also registers base required functionality with forge make it run.
//@Mod annotation syntax
//MOD_ID, MOD_NAME, Version, custom GUI Factory Class
@Mod(modid = Reference.MOD_ID,name=Reference.MOD_NAME,version=Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class OddsEnds
{
    //Registers mod as an object that can be called later from other areas as needed.
    @Mod.Instance(Reference.MOD_ID)
    public static OddsEnds instance;

    //Registers proxy related classes for any actions that needed Sided-ness.
    //Currently unused.
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    //Listens to Forge's startup initialization event. Waits for specifically the Pre-Init event to
    //preform actions then.
    @Mod.EventHandler
    public void earlyOdd(FMLPreInitializationEvent event)
    {
        //Registers config file from config folder. If no file is there, the method will generate one to place there.
        com.yunori2011.oddsends.handler.ConfigurationHandler.init(event.getSuggestedConfigurationFile());

        //Gives the ConfigurationHandler method the ability to be informed by FML when the config
        //is changed by the GUI Config
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        //Initializes items
        ModItems.init();

        //Initializes blocks
        ModBlocks.init();

        //Debug code for proof of concept.
        if(ConfigurationHandler.OEDebug == true)
        {
            LogHelper.info("Preinit finalized.");
        }
    }

    //Listens to Forge's startup initialization event. Waits for specifically the Init event to
    //preform actions then.
    @Mod.EventHandler
    public void beginOdd(FMLInitializationEvent event)
    {
        //Debug code for proof of concept.
        if(ConfigurationHandler.OEDebug == true)
        {
            LogHelper.info("Init finalized.");
        }
    }

    //Listens to Forge's startup initialization event. Waits for specifically the Post-Init event to
    //preform actions then.
    @Mod.EventHandler
    public void lateOdd(FMLPostInitializationEvent event)
    {
        //Debug code for proof of concept.
        if(ConfigurationHandler.OEDebug == true)
        {
            LogHelper.info("Post-Init finalized.");
        }
    }
}