package me.staycrackin.playersworkshop.init;

import me.staycrackin.playersworkshop.PlayersWorkshop;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = PlayersWorkshop.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(PlayersWorkshop.MOD_ID)
public class ItemInit
{
    public static final Item gold_dollar = null;
    public static final Item gold_coin = null;
    public static final Item silver_dollar = null;
    public static final Item silver_coin = null;
    public static final Item copper_dollar = null;
    public static final Item copper_coin = null;

    @SubscribeEvent
    public static void registerItem(final RegistryEvent.Register<Item> event){
        event.getRegistry().register(new Item(new Item.Properties().group(PlayersWorkshop.MONEY)).setRegistryName("gold_dollar"));
        event.getRegistry().register(new Item(new Item.Properties().group(PlayersWorkshop.MONEY)).setRegistryName("gold_coin"));
        event.getRegistry().register(new Item(new Item.Properties().group(PlayersWorkshop.MONEY)).setRegistryName("silver_dollar"));
        event.getRegistry().register(new Item(new Item.Properties().group(PlayersWorkshop.MONEY)).setRegistryName("silver_coin"));
        event.getRegistry().register(new Item(new Item.Properties().group(PlayersWorkshop.MONEY)).setRegistryName("copper_dollar"));
        event.getRegistry().register(new Item(new Item.Properties().group(PlayersWorkshop.MONEY)).setRegistryName("copper_coin"));
    }
}
