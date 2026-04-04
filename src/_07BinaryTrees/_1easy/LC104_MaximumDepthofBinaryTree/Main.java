package _07BinaryTrees._1easy.LC104_MaximumDepthofBinaryTree;

public class Main {
    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return 1 + Math.max(leftDepth, rightDepth);
    }

    public static void main(String[] args) {
        // Create nodes
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        int depth = maxDepth(root);
        System.out.println("Max Depth: " + depth);
    }
}
/**
 *     3
 *    / \
 *   9  20
 *      / \
 *     15  7
 *
 *  🧠 Pattern Name:
 *  Divide and Conquer (Top-Down / Bottom-Up DFS on Trees)
 *  🧠 Pattern Name
 * 👉 Postorder DFS (Bottom-Up Recursion)
 */
