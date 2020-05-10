package me.staycrackin.playersworkshop.init;

import me.staycrackin.playersworkshop.PlayersWorkshop;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = PlayersWorkshop.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(PlayersWorkshop.MOD_ID)
public class BlockInit {
    public static final Block jade_block = null;

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event){
        event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).harvestLevel(3).sound(SoundType.METAL)).setRegistryName("jade_block"));
    }
    @SubscribeEvent
    public static void registerBlockItems(final RegistryEvent.Register<Item> event){
        event.getRegistry().register(new BlockItem(jade_block, new Item.Properties()).setRegistryName("jade_block"));
    }
}
