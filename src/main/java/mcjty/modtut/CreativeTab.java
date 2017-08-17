package mcjty.modtut;

import net.minecraft.creativetab.CreativeTabs; 
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;



public class CreativeTab {
    public static final CreativeTabs tabMODTAB = new CreativeTabs ("Teehee!") {
	   @Override public ItemStack getTabIconItem() {
	      return new ItemStack(Items.WRITTEN_BOOK);
       }
    };
}
