package easy.LC094_BinaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Main {

    // 🔹 Inorder (L → Root → R)
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    private static void inorder(TreeNode node, List<Integer> result) {
        if (node == null) return;

        inorder(node.left, result);
        result.add(node.val);
        inorder(node.right, result);
    }

    public static void main(String[] args) {

        /*
              Example Tree:
                  1
                   \
                    2
                   /
                  3

            Inorder   : [1, 3, 2]
            Preorder  : [1, 2, 3]
            Postorder : [3, 2, 1]
            LevelOrder: [[1], [2], [3]]
        */

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println("Inorder: " + inorderTraversal(root));
    }
}