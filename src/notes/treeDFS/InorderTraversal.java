package notes.treeDFS;

public class InorderTraversal {

    public void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);     // Left
        System.out.print(root.val + " "); // Root
        inorder(root.right);    // Right
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        InorderTraversal obj = new InorderTraversal();
        obj.inorder(root);
    }
}
/**
 *         1
 *        / \
 *       2   3
 *      / \
 *     4   5
 *     Inorder traversal result:
 *      4 → 2 → 5 → 1 → 3
 */