package me.staycrackin.playersworkshop.objects.items;

import me.staycrackin.playersworkshop.PlayersWorkshop;
import net.minecraft.item.Item;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties().group(PlayersWorkshop.MONEY));
    }
}
