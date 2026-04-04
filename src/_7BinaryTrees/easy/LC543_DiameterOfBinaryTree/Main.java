package _7BinaryTrees.easy.LC543_DiameterOfBinaryTree;

public class Main {
    static int diameter = 0;

    public static int diameterOfBinaryTree(TreeNode root) {
        diameter = 0; // ✅ reset before calculation
        depth(root);
        return diameter;
    }

    public static int depth(TreeNode node) {
        if (node == null) return 0;

        int left = depth(node.left);
        int right = depth(node.right);

        // update diameter
        diameter = Math.max(diameter, left + right);

        // return height of current node
        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {

        /*
                1
               / \
              2   3
             / \
            4   5

        Expected diameter = 3
        */

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        int result = diameterOfBinaryTree(root);
        System.out.println("Diameter of Binary Tree: " + result);
    }
}
/**
 * Postorder DFS + Height Calculation Pattern
 */