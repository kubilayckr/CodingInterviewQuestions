import java.util.*;

public class ThreeNumberSum {

    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        List<Integer[]> result = new ArrayList<Integer[]>();
        Arrays.sort(array);

        int left, right, sum;
        for (int i = 0; i < array.length; i++) {
            left = i+1;
            right = array.length - 1;
            while (left < right) {
                sum = array[i] + array[left] + array[right];
                if (sum < targetSum) {
                    left++;
                } else if (sum > targetSum) {
                    right--;
                } else {
                    result.add(new Integer[]{array[i], array[left], array[right]});
                    left++;
                }
            }
        }

        return result;
    }
}
