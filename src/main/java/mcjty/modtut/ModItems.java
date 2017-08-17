package mcjty.modtut;


import mcjty.modtut.items.FirstItem;
import mcjty.modtut.items.ItemNew;
import mcjty.modtut.items.MultiModelItem;
import mcjty.modtut.items.SimpleTexturedItem;
import mcjty.modtut.items.Wand1;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {


    @GameRegistry.ObjectHolder("modtut:itemnew")
    public static ItemNew itemNew;
    
    @GameRegistry.ObjectHolder("modtut:firstitem")
    public static FirstItem firstItem;

    @GameRegistry.ObjectHolder("modtut:simpletextureditem")
    public static SimpleTexturedItem simpleTexturedItem;

    @GameRegistry.ObjectHolder("modtut:multimodelitem")
    public static MultiModelItem multiModelItem;
    
    @GameRegistry.ObjectHolder("modtut:Wand1")
    public static Wand1 wand1;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        simpleTexturedItem.initModel();
        multiModelItem.initModel();
        wand1.initModel();
        itemNew.initModel();
    }
	
}
