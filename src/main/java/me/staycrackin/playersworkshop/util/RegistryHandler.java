package me.staycrackin.playersworkshop.util;

import me.staycrackin.playersworkshop.PlayersWorkshop;
import me.staycrackin.playersworkshop.objects.blocks.piggy_bank_block;
import me.staycrackin.playersworkshop.objects.blocks.piggy_bank_item;
import me.staycrackin.playersworkshop.objects.items.checkbook;
import me.staycrackin.playersworkshop.objects.items.debit_card;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, PlayersWorkshop.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, PlayersWorkshop.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //ITEMS ONLY
    public static final RegistryObject<Item> CHECKBOOK = ITEMS.register("checkbook", checkbook::new);
    public static final RegistryObject<Item> DEBIT_CARD = ITEMS.register("debit_card", debit_card::new);

    //BLOCKS ONLY
    public static final RegistryObject<Block> PIGGY_BANK_BLOCK = BLOCKS.register("piggy_bank_block", piggy_bank_block::new);

    //BLOCK ITEMS ONLY
    public static final RegistryObject<Item> PIGGY_BANK_ITEM = ITEMS.register("piggy_bank_block",() -> new piggy_bank_item(PIGGY_BANK_BLOCK.get()));

}
