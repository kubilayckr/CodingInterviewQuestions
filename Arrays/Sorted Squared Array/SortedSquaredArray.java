import java.util.*;

public class SortedSquaredArray {

    public int[] sortedSquaredArray(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int i : array) {
            list.add(i*i);
        }
        return list.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}