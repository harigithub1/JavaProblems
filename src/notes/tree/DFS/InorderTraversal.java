package notes.tree.DFS;

public class InorderTraversal {

    public static void inorder(TreeNode root) {
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
        inorder(root);
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
/**
 * inorder(1)
 * root = 1
 *
 * inorder(2)
 * root = 2
 *
 * inorder(4)
 * root = 4
 *
 * inorder(null)   // 4.left → returns immediately
 *
 * print 4
 *
 * inorder(null)   // 4.right → returns immediately
 *
 * // back to root = 2
 *
 * print 2
 *
 * inorder(5)
 * root = 5
 *
 * inorder(null)   // 5.left → returns immediately
 *
 * print 5
 *
 * inorder(null)   // 5.right → returns immediately
 *
 * // back to root = 1
 *
 * print 1
 *
 * inorder(3)
 * root = 3
 *
 * inorder(null)   // 3.left → returns immediately
 *
 * print 3
 *
 * inorder(null)   // 3.right → returns immediately
 */