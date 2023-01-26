import java.util.*;

public class NonConstructibleChange {

    public int nonConstructibleChange(int[] coins) {
        if (coins.length == 0) {
            return 1;
        }

        Arrays.sort(coins);

        int change = 0;
        for (int coin : coins) {
            if (coin > change + 1) {
                break;
            }
            change += coin;
        }

        return change + 1;
    }
}