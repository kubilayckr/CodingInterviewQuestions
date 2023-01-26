import java.util.*;

public class SmallestDifference {

    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);

        int iOne = 0, iTwo = 0;

        int[] result = new int[] {arrayOne[0], arrayTwo[0]};
        int smallestDiff = Math.abs(arrayOne[0] - arrayTwo[0]);
        while (iOne < arrayOne.length && iTwo < arrayTwo.length) {
            int diff = Math.abs(arrayOne[iOne] - arrayTwo[iTwo]);
            if (diff < smallestDiff) {
                smallestDiff = diff;
                result[0] = arrayOne[iOne];
                result[1] = arrayTwo[iTwo];
            }

            if (arrayOne[iOne] < arrayTwo[iTwo]) {
                iOne++;
            } else {
                iTwo++;
            }
        }

        return result;
    }
}
