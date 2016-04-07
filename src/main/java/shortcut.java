import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;

/**
 * Created by binda on 07.04.2016.
 */
public class shortcut extends JavaPlugin {
    public void onEnable(){ this.getLogger().info("Shortcutter wurde aktiviert");};
    public void onDisable(){ this.getLogger().info("Shortcutter wurde deaktiviert");};

        public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
            if(cmd.getName().equalsIgnoreCase("pcreate")){ // Wenn /welcome ausgeführt wird wird ein Willkommen in den chat geschrieben
                if(sender instanceof Player) {
                }
                final Player player = (Player) sender;
                //dein countdown
                player.performCommand("npc create"+" "+args+" "+"-- type player" );
            } else {
                sender.sendMessage("Der Befehl ist nur für Spieler!");

                return true;
            } // Wenn das passiert, wird die Funktion abbrechen und true als Wert zurückgeben.
                if (cmd.getName().equalsIgnoreCase("sudo")) {


                    String arg;
                    arg = Arrays.toString(args);
                    final Player player = (Player) sender;
                    player.performCommand(arg);
                }
            return false;
                }
        }





