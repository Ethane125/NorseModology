package mod.ethane.norsemodology;

import net.minecraftforge.fml.common.Mod;
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
    }

}
