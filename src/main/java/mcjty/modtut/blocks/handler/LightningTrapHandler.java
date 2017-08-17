package mcjty.modtut.blocks.handler;

import com.mojang.realmsclient.gui.ChatFormatting;

import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


public class LightningTrapHandler {

	@SubscribeEvent
	public void onEntityGetHurt(AttackEntityEvent event) {

		if (event.getEntityPlayer().getEntityWorld().isRemote)
			return;
		Entity entity = event.getTarget();
		World world = event.getEntityPlayer().world;
		world.addWeatherEffect(new EntityLightningBolt(world, entity.posX, entity.posY, entity.posZ, false));

		event.getEntityPlayer().sendMessage(new TextComponentString(ChatFormatting.GOLD + event.toString()));

	}



	@SubscribeEvent
	public void sendMessage(BreakEvent event) {
		event.getPlayer().sendMessage(new TextComponentString(ChatFormatting.GOLD + "You broke a block!"));

	}

}
