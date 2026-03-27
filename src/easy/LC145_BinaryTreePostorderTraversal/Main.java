package easy.LC145_BinaryTreePostorderTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Main {
    // 🔹 Postorder (L → R → Root)
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorder(root, result);
        return result;
    }

    private static void postorder(TreeNode node, List<Integer> result) {
        if (node == null) return;

        postorder(node.left, result);
        postorder(node.right, result);
        result.add(node.val);
    }

    public static void main(String[] args) {

        /*
              Example Tree:
                  1
                   \
                    2
                   /
                  3

            Postorder : [3, 2, 1]
        */

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println("Postorder: " + postorderTraversal(root));
    }
}