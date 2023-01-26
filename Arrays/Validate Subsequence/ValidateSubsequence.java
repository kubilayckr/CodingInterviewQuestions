import java.util.*;

public class ValidateSubsequence {

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        Iterator<Integer> it = array.iterator();
        int count = 0;
        for (Integer sub: sequence) {
            while (it.hasNext()) {
                if(sub.equals(it.next())) {
                    count++;
                    break;
                }
            }
        }
        return count == sequence.size() ? true : false;
    }
}