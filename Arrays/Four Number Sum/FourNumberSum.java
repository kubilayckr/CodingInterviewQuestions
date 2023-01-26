import java.util.*;

public class FourNumberSum {

    public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
        List<Integer[]> result = new ArrayList<Integer[]>();
        Arrays.sort(array);

        int left, right, sum;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                left = j+1;
                right = array.length - 1;
                while (left < right) {
                    sum = array[i] + array[j] + array[left] + array[right];
                    if (sum < targetSum) {
                        left++;
                    } else if (sum > targetSum) {
                        right--;
                    } else {
                        result.add(new Integer[]{array[i], array[j], array[left], array[right]});
                        left++;
                    }
                }
            }
        }

        return result;
    }
}
