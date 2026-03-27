package easy.LC094_BinaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.List;

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
          /*
          Example 2 Tree:
                  1
                /   \
               2     3
              / \     \
             4   5     8
                / \    /
               6   7  9

        Expected Inorder: [4,2,6,5,7,1,3,9,8]
    */
//        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(6);
        root.left.right.right = new TreeNode(7);
        root.right.right = new TreeNode(8);
        root.right.right.left = new TreeNode(9);
        System.out.println("Inorder: " + inorderTraversal(root));
    }
}