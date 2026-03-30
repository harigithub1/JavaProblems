package practice;

/**
 *           1
 *          / \
 *         2   3
 *        / \
 *       4   5
 */

public class Main{
    public static void preOrder(TreeNode root){
        if(root==null) return;
        preOrder(root.left);
        System.out.println(root.val);
        preOrder(root.right);
    }
    public static void main(String args[]){
        TreeNode root = new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right=new TreeNode(5);
        preOrder(root);
    }
}