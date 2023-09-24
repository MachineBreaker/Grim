package ac.grim.grimac.commands;

import ac.grim.grimac.GrimAPI;
import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.CommandPermission;
import co.aikar.commands.annotation.Subcommand;
import org.bukkit.entity.Player;

@CommandAlias("blade")
public class GrimAlerts extends BaseCommand {
    @Subcommand("alerts")
    @CommandPermission("blade.alerts")
    public void onAlerts(Player player) {
        GrimAPI.INSTANCE.getAlertManager().toggleAlerts(player);
    }
}
