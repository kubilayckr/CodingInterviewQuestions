import java.util.*;

public class BranchSums {

    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer> branchSums(BinaryTree root) {
        List<Integer> result = new ArrayList<Integer>();
        calculateSum(root, 0, result);
        return result;
    }

    private static void calculateSum(BinaryTree tree, int sum, List<Integer> result) {
        if (tree == null) {
            return;
        }
        if (tree.left == null && tree.right == null) {
            result.add(sum + tree.value);
            return;
        }
        calculateSum(tree.left, sum + tree.value, result);
        calculateSum(tree.right, sum + tree.value, result);
    }
}
