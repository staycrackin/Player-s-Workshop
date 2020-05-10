package me.staycrackin.playersworkshop.objects.items;

import me.staycrackin.playersworkshop.PlayersWorkshop;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class debit_card extends Item {
    public debit_card(){
        super(new Item.Properties().group(PlayersWorkshop.MONEY).maxStackSize(1));
    }
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add(new StringTextComponent("\u00A77" + "\u00A7o" + "Mo' Money, Mo' Problems"));
    }
}

