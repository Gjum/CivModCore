package vg.civcraft.mc.civmodcore.scoreboard.side;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.UUID;
import java.util.function.BiFunction;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import vg.civcraft.mc.civmodcore.CivModCorePlugin;

public class CivScoreBoard {

	private String scoreName;
	private Map<UUID, String> currentScoreText;
	private BukkitRunnable updater;

	CivScoreBoard(String scoreName) {
		this.scoreName = scoreName;
		this.currentScoreText = new TreeMap<>();
	}

	public String getName() {
		return scoreName;
	}

	public void updatePeriodically(BiFunction<Player, String, String> updateFunction, long delay) {
	}

	public void set(Player p, String newText) {
	}

	private static void internalUpdate(Player p, String oldText, String newText) {
	}

	public String get(Player p) {
		return currentScoreText.get(p.getUniqueId());
	}

	public void hide(Player p) {
	}
	
	private void hideForPlayer(Player p) {
	}

	void tearDown() {
	}

	void purge(Player p) {
		currentScoreText.remove(p.getUniqueId());
	}

	private static Objective getObjective(Player p) {
		// idk how to return a placeholder object here
		Scoreboard scb = p.getScoreboard();
		String title = ScoreBoardAPI.getBoardHeader(p.getUniqueId());
		Objective objective = scb.getObjective(title);
		if (objective == null) {
			scb.getObjectives().forEach(Objective::unregister);
			scb.clearSlot(DisplaySlot.SIDEBAR);
			objective = scb.registerNewObjective(title, title, title);
			objective.setDisplaySlot(DisplaySlot.SIDEBAR);
		}
		return objective;
	}

}
