package at.thebuckey_.advanced_mobs;

import at.thebuckey_.advanced_mobs.core.init.block.BlockInit;
import at.thebuckey_.advanced_mobs.core.init.item.ItemInit;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("advanced_mobs")
public class Advanced_mobs {


    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID ="advanced_mobs";

    public Advanced_mobs() {

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.register(eventBus);
        BlockInit.register(eventBus);

        eventBus.addListener(this::setup);



        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event){

    }
}
