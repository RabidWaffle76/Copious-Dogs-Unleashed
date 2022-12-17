package net.rabidwaffle76.copiousdogsremake;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.ModContainer;

@Mod(modid = CopiousDogsRemake.MOD_ID)
public class CopiousDogsRemake {
    
    public static final String MOD_ID = "copiousdogsremake";
    public static final Logger LOGGER = LogManager.getLogger("Copious Dogs Unleashed");
    
    public ExampleMod() {
        
    	final ModContainer container = Loader.instance().getIndexedModList().get(MOD_ID);
    	LOGGER.info("Loaded {} v{}", container.getName(), container.getDisplayVersion());
    }
}
