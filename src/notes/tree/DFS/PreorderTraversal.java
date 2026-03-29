package notes.tree.DFS;

public class PreorderTraversal {

    public static void preorder(TreeNode root) {
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

        preorder(root);
    }
}
/**
 *         1
 *        / \
 *       2   3
 *      / \
 *     4   5
 *     Preorder traversal result:
 *      1 → 2 → 4 → 5 → 3
 */
/**
 * preorder(1)
 * root = 1
 * print 1
 *
 * preorder(2)
 * root = 2
 * print 2
 *
 * preorder(4)
 * root = 4
 * print 4
 *
 * preorder(null)   // returns immediately
 * preorder(null)   // returns immediately
 *
 * // back to root = 2
 *
 * preorder(5)
 * root = 5
 * print 5
 *
 * preorder(null)   // returns immediately
 * preorder(null)   // returns immediately
 *
 * // back to root = 1
 *
 * preorder(3)
 * root = 3
 * print 3
 *
 * preorder(null)   // returns immediately
 * preorder(null)   // returns immediately
 */