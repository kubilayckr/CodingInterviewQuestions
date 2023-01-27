import java.util.*;

public class SpiralTraverse {

    public static List<Integer> spiralTraverse(int[][] array) {
        List<Integer> result = new ArrayList<>();
        if (array.length == 0) {
            return result;
        }

        int n = array.length, m = array[0].length;
        int startRow = 0, endRow = n - 1;
        int startCol = 0, endCol = m - 1;
        int count = 0, size = n * m;

        while (count < size) {
            for (int i = startCol; i <= endCol; i++) {
                result.add(array[startRow][i]);
                count++;
            }

            for (int i = startRow + 1; i <= endRow; i++) {
                result.add(array[i][endCol]);
                count++;
            }

            for (int i = endCol - 1; i >= startCol; i--) {
                if (count == size) {
                    break;
                }
                result.add(array[endRow][i]);
                count++;
            }

            for (int i = endRow - 1; i > startRow; i--) {
                if (count >= size) {
                    break;
                }
                result.add(array[i][startCol]);
                count++;
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }

        return result;
    }
}
