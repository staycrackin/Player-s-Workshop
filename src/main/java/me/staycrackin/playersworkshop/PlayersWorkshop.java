package me.staycrackin.playersworkshop;

import me.staycrackin.playersworkshop.util.RegistryHandler;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod("playersworkshop")
public class PlayersWorkshop
{

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "playersworkshop";
    public static PlayersWorkshop instance;

    public PlayersWorkshop() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        instance = this;

        RegistryHandler.init();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) { }

    private void doClientStuff(final FMLClientSetupEvent event) { }

    public static final ItemGroup MONEY = new ItemGroup("money") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.CHECKBOOK.get());
        }
    };

    public static final ItemGroup JADE = new ItemGroup("jade") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.DEBIT_CARD.get());
        }
    };
}

