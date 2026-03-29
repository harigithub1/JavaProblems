package notes.tree.DFS;

public class PostorderTraversal {

    public void postorder(TreeNode root) {
        if (root == null) return;
        postorder(root.left);   // Left
        postorder(root.right);  // Right
        System.out.print(root.val + " "); // Root
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        PostorderTraversal obj = new PostorderTraversal();
        obj.postorder(root);
    }
}

/**
 *         1
 *        / \
 *       2   3
 *      / \
 *     4   5
 *     Post traversal result:
 *      4 → 5 → 2 → 3 → 1
 */
/**
 * postorder(1)
 * root = 1
 *
 * postorder(2)
 * root = 2
 *
 * postorder(4)
 * root = 4
 *
 * postorder(null)   // 4.left → returns immediately
 * postorder(null)   // 4.right → returns immediately
 *
 * print 4
 *
 * // back to root = 2
 *
 * postorder(5)
 * root = 5
 *
 * postorder(null)   // 5.left → returns immediately
 * postorder(null)   // 5.right → returns immediately
 *
 * print 5
 *
 * // back to root = 2
 *
 * print 2
 *
 * // back to root = 1
 *
 * postorder(3)
 * root = 3
 *
 * postorder(null)   // 3.left → returns immediately
 * postorder(null)   // 3.right → returns immediately
 *
 * print 3
 *
 * // back to root = 1
 *
 * print 1
 */