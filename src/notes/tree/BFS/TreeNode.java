package notes.tree.BFS;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    // Constructor
    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}