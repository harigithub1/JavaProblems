package notes.treeDFS;

public class PreorderTraversal {

    public void preorder(TreeNode root) {
        if (root == null) return;

        System.out.print(root.val + " "); // Root
        preorder(root.left);              // Left
        preorder(root.right);             // Right
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        PreorderTraversal obj = new PreorderTraversal();
        obj.preorder(root);
    }
}
/**
 *         1
 *        / \
 *       2   3
 *      / \
 *     4   5
 *     Preorder traversal result:
 * 1 → 2 → 4 → 5 → 3
 */