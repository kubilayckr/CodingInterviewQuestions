import java.util.*;

public class TwoNumberSum {

    //Solution 1;
    public static int[] twoNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);
        int left = 0, right = array.length - 1, sum;
        while (left < right) {
            sum = array[left] + array[right];
            if (sum < targetSum) {
                left++;
            } else if (sum > targetSum) {
                right--;
            } else {
                return new int[]{array[left], array[right]};
            }
        }
        return new int[0];
    }

    //Solution 2;
    public static int[] twoNumberSum2(int[] array, int targetSum) {
        Set<Integer> map = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            int diff = targetSum - array[i];
            if (map.contains(diff)) {
                return new int[]{array[i], diff};
            }
            map.add(array[i]);
        }
        return new int[0];
    }
}