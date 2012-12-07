package me.com_boy.minecraft.classictrampling;

public class ClassicTrampling extends org.bukkit.plugin.java.JavaPlugin
{
	private final Trampler trampler = new Trampler(this);
	
	public void onEnable()
	{
		getServer().getPluginManager().registerEvents(trampler, this);
	}
}