package mcjty.modtut.handlers;

import com.mojang.realmsclient.gui.ChatFormatting;

import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CommonHandlers {
	@SubscribeEvent
	public void onEntityGetHurt(AttackEntityEvent event) {

		if (event.getEntityPlayer().getEntityWorld().isRemote)
			return;
		Entity entity = event.getTarget();
		World world = event.getEntityPlayer().world;
		world.addWeatherEffect(new EntityLightningBolt(world, entity.posX, entity.posY, entity.posZ, false));

		event.getEntityPlayer().sendMessage(new TextComponentString(ChatFormatting.GOLD + event.toString()));

	}

}
