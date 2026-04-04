package _07BinaryTrees.medium.LC102_BinaryTreeLevelOrderTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Main {

    // 🔹 Level Order (BFS)
    public static List<List<Integer>> levelOrderTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root); //offer(e) Inserts element (returns false if fails)

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll(); //poll() Removes head (returns null if empty)
                level.add(current.val); //add(e) Inserts element (throws exception if fails)

                if (current.left != null) queue.offer(current.left);
                if (current.right != null) queue.offer(current.right);
            }

            result.add(level);
        }

        return result;
    }

    public static void main(String[] args) {
          /*
            Build this DFS:
                  3
                 / \
                9  20
                   / \
                  15  7
        */

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        List<List<Integer>> result = levelOrderTraversal(root);
        System.out.println(result);
        System.out.println("Level Order: " + levelOrderTraversal(root));
    }
}