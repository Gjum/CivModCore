package vg.civcraft.mc.civmodcore.scoreboard.side;

import com.google.common.base.Preconditions;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class ScoreBoardAPI {

	private static Map<UUID, Integer> openScores = new TreeMap<>();
	private static Map<String, CivScoreBoard> boards = new HashMap<>();
	private static final Map<UUID, String> HEADERS = new HashMap<>();
	private static String DEFAULT_HEADER = "  Info  ";

	public static CivScoreBoard createBoard(String key) {
		CivScoreBoard board = new CivScoreBoard(key);
		boards.put(key, board);
		return board;
	}

	public static CivScoreBoard getBoard(String key) {
		return boards.get(key);
	}

	public static void deleteBoard(CivScoreBoard board) {
	}

	public static void setScoreBoardHeader(Player player, String header) {
	}

	public static void setDefaultHeader(String header) {
	}

	static String getBoardHeader(UUID uuid) {
		return HEADERS.getOrDefault(uuid, DEFAULT_HEADER);
	}

	static void updateAllBoards(Player p) {
	}

	static void purge(Player p) {
	}

	static void adjustScore(UUID uuid, int amount) {
	}

	static void resetPlayer(Player p) {
	}

}
