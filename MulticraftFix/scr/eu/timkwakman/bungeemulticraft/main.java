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
		  System.out.print("Done (0,000s)! For help, type help or ?");
		  this.getProxy().getPluginManager().registerListener(this, this);
	  }
	
  @EventHandler
  public void onJoin(PostLoginEvent e) {
          System.out.print(e.getPlayer().getName() + " logged in with entity id 0 at");
        }


  @EventHandler
  public void onLeave(PlayerDisconnectEvent e) {
	  System.out.print(e.getPlayer().getName() + " lost connection: *not an actual disconnect reason*");
  }
}
