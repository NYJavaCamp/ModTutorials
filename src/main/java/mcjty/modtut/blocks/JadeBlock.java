package mcjty.modtut.blocks;

import mcjty.modtut.ModTut;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class JadeBlock extends Block {
public JadeBlock() {
	super(Material.CLOTH);
    setUnlocalizedName(ModTut.MODID + ".jadeblock");
    setRegistryName("jadeblock");
}@SideOnly(Side.CLIENT)
public void initModel() {
    ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
}
}
