package mod.ethane.norsemodology;

import mod.ethane.norsemodology.block.ModBlocks;
import mod.ethane.norsemodology.item.ModItems;
import mod.ethane.norsemodology.world.OreGenerator;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(NorseModology.MODID)
public final class NorseModology
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "norsemodology";

    public NorseModology()
    {
        LOGGER.debug("sup BITCHHHHHH");
        //final ModLoadingContext modLoadingContext = ModLoadingContext.get();
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::onCommonSetup);
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
    }

    private void onCommonSetup(final FMLCommonSetupEvent event)
    {
        //DeferredWorkQueue.runLater( ()-> {
        //    OreGenerator.setupOreGen();
        //});
        DeferredWorkQueue.runLater(OreGenerator::setupOreGen);
        LOGGER.debug("Common oregen setup done");
    } // end onCommonSetup


}
