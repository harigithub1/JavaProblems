package easy.LC104_MaximumDepthofBinaryTree;

public class Main {
    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return 1 + Math.max(left, right);
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
 */