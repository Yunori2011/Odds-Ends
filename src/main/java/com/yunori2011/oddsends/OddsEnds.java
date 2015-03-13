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

@Mod(modid = Reference.MOD_ID,name=Reference.MOD_NAME,version=Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class OddsEnds
{
    @Mod.Instance(Reference.MOD_ID)
    public static OddsEnds instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void earlyOdd(FMLPreInitializationEvent event)
    {
        //Preinit
        com.yunori2011.oddsends.handler.ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        ModItems.init();
        ModBlocks.init();

        if(ConfigurationHandler.OEDebug == true)
        {
            LogHelper.info("Preinit finalized.");
        }
    }

    @Mod.EventHandler
    public void beginOdd(FMLInitializationEvent event)
    {
        if(ConfigurationHandler.OEDebug == true)
        {
            LogHelper.info("Init finalized.");
        }
    }

    @Mod.EventHandler
    public void lateOdd(FMLPostInitializationEvent event)
    {
        if(ConfigurationHandler.OEDebug == true)
        {
            LogHelper.info("Postinit finalized.");
        }
    }
}