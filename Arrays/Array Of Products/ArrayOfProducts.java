import java.util.*;

public class ArrayOfProducts {

    public int[] arrayOfProducts(int[] array) {
        int multiplication = 1;
        boolean isContainZero = false, isContainMultiZero = false;
        for (int i: array) {
            if (isContainMultiZero) break;
            if (i == 0) {
                isContainMultiZero = isContainZero;
                isContainZero = true;
                continue;
            }
            multiplication *= i;
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = isContainMultiZero ? 0 : isContainZero && array[i] != 0 ? 0 : array[i] == 0 ? multiplication : multiplication / array[i];
        }
        return array;
    }
}
