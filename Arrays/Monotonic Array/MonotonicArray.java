import java.util.*;

public class MonotonicArray {

    public static boolean isMonotonic(int[] array) {
        if (array.length < 2) {
            return true;
        }

        boolean isInc = array[0] < array[array.length - 1];
        for (int i = 0; i < array.length-1; i++) {
            if (isInc && array[i] > array[i+1]) {
                return false;
            } if (!isInc && array[i] < array[i+1]) {
                return false;
            }
        }
        return true;
    }
}
