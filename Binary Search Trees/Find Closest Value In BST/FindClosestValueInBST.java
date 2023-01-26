import java.util.*;

public class FindClosestValueInBST {

    public static int findClosestValueInBst(BST tree, int target) {
        int closestValue = 0;
        int diff = Integer.MAX_VALUE;
        int currentDiff;

        while (tree != null) {
            currentDiff = Math.abs(target - tree.value);
            if (currentDiff < diff) {
                diff = currentDiff;
                closestValue = tree.value;
            }
            if (tree.value < target) {
                tree = tree.right;
            } else if (tree.value > target) {
                tree = tree.left;
            } else {
                break;
            }
        }

        return closestValue;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}
