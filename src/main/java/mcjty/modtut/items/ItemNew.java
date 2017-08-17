package mcjty.modtut.items;

import mcjty.modtut.CreativeTab;
import mcjty.modtut.ModTut;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemNew extends Item {

    public ItemNew() {
        setRegistryName("itemnew");
        setUnlocalizedName(ModTut.MODID + ".itemnew");
        setCreativeTab(CreativeTab.tabMODTAB);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
