package me.com_boy.minecraft.classictrampling;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class Trampler implements Listener
{
	public static ClassicTrampling plugin;
	
	public Trampler(ClassicTrampling plugin)
	{
		this.plugin = plugin;
	}
	
	@EventHandler(priority = EventPriority.NORMAL)
	public void onPlayerMove(PlayerMoveEvent event)
	{
		org.bukkit.entity.Player player = event.getPlayer();
		
		if ( ! player.isSneaking() )
		{
			Location to = event.getTo();
			Location blockLoc = to; blockLoc.setY(to.getY() - 1);
			Block block = blockLoc.getBlock();
	
			if (block.getTypeId() == 60) // If the block under the moved player is farmland
			{
				block.setTypeId(3); // Make it dirt
			}
		}
	}
}
