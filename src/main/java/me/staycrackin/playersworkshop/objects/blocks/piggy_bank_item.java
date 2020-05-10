package me.staycrackin.playersworkshop.objects.blocks;

import me.staycrackin.playersworkshop.PlayersWorkshop;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class piggy_bank_item extends BlockItem {
    public piggy_bank_item(Block block) {
        super(block,new Item.Properties().group(PlayersWorkshop.MONEY).maxStackSize(1));
    }
}
