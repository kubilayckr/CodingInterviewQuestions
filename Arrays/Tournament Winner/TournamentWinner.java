import java.util.*;

public class TournamentWinner {

    //Solution 1;
    public String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        Map<String, Integer> points = new HashMap<>();
        for (int i = 0; i < results.size(); i++) {
            points.putIfAbsent(competitions.get(i).get(results.get(i) ^ 1), 3);
            points.computeIfPresent(competitions.get(i).get(results.get(i) ^ 1), (k, v) -> v + 3);
        }

        return Collections.max(points.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();
    }

    //Solution 2;
    public String tournamentWinner2(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        Map<String, Integer> points = new HashMap<>();
        for (int i = 0; i < results.size(); i++) {
            points.merge(competitions.get(i).get(results.get(i) ^ 1), 3, (v1, v2) -> v1 + v2);
        }

        return Collections.max(points.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();
    }
}