package eu.timkwakman.bungeemulticraft;

import net.md_5.bungee.api.event.PlayerDisconnectEvent;
import net.md_5.bungee.api.event.PostLoginEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.event.EventHandler;

public class Main extends Plugin implements Listener
{
  public void onEnable()
      {
          // Send the message that the server is done starting, so it thinks the server is "online"
	System.out.println("Done (0,000s)! For help, type help or ?");
	this.getProxy().getPluginManager().registerListener(this, this);
      }
	
  @EventHandler
  public void onJoin(PostLoginEvent e) 
      {
        // Send fake message to the server that an player joins!
	System.out.println(e.getPlayer().getName() + "[" + e.getPlayer().getAddress() + "] logged in with entity id 0 at");
      }

  @EventHandler
  public void onLeave(PlayerDisconnectEvent e)
      {
      	 // Send fake message to the server that the player is leaving!
	 System.out.println(e.getPlayer().getName() + " lost connection: Disconnected");
      }
}
