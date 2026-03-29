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