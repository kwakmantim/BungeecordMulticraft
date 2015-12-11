# BungeecordMulticraft
Fixes the playercount &amp; online status when using multicraft with bungeecord &lt;3

https://www.spigotmc.org/resources/multicraft-bungeecord-playercount-fix.15531/

Hello, I'have made this simpel plugin for my bungeecord server that uses the multicraft panel, because it didn't show the correct playercount in this panel.

Features:
- Show the correct playercount on multicraft if you're using bungeecord.
- The server is displayed as "Online" in multicraft and not "Offline"

What does the plugin do?
Basically it just prints some things to the console on some events, like an join. Multicraft works by checking what happens in the console, and waits for things like "xxx logged in with entity id x at world...." so this plugin emulates that, if someone connects to the server, the console prints an message (read below) and multicraft will see the message, and adds the player to the "connected players" list.

Join:
player logged in with entity id 0 at

Leave:
player lost connection: *not an actual disconnect reason*

OnEnable:
Done (0,000s)! For help, type help or ?


-----
Its an very basic plugin, but I found it annoying when the bungee didin't show the correct playercount & online status. I just want to help others that have the same "problem" :)

Note: This plugin will add extra lines in your console for example when someone joins, keep this in mind because its extra spam :p

---
Tested on:
beastnode.com

(Its possible that it doesn't work on all hosting company's but it should on the most)

Source: https://github.com/kwakmantim/BungeecordMulticraft
