import java.util.*;

public class MoveElementToEnd {

    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        array.sort(Comparator.comparing(i -> i == toMove));
        return array;
    }
}
