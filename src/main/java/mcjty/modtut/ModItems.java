package mcjty.modtut;

import mcjty.modtut.items.ItemNew;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {

    @GameRegistry.ObjectHolder("modtut:itemnew")
    public static ItemNew itemNew;
    

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        itemNew.initModel();
    }
	
}
