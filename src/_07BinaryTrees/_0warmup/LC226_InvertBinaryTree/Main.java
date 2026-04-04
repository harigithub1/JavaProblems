package _07BinaryTrees._0warmup.LC226_InvertBinaryTree;

public class Main {
    public static TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        // Swap left and right
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        // Recurse on children
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    // Helper method to print DFS (inorder traversal)
    public static void printInorder(TreeNode root) {
        if (root == null) return;
        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }

    public static void main(String[] args) {
        /*
                4
              /   \
             2     7
            / \   / \
           1   3 6   9
        */  
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        System.out.print("Original Tree (Inorder): ");
        printInorder(root);

        root = invertTree(root);

        System.out.print("\nInverted Tree (Inorder): ");
        printInorder(root);
    }
}

/**
 * 🧠 Pattern Name
 *
 * 👉 Preorder DFS (Top-Down Recursion)
 */
