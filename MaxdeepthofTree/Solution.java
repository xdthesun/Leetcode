
//Definition for a binary tree node.
/**
 * 给定一个二叉树，找出其最大深度。
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * 说明: 叶子节点是指没有子节点的节点。
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }

public class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null)
        return 0;

        if(root.left == null && root.right == null){
            return 1;
        }
        else if(root.left == null && root.right != null){
            return maxDepth(root.right)+1;
        }
        else if(root.left != null && root.right == null){
            return maxDepth(root.left)+1;
        }
        else{
            int tempLeft = maxDepth(root.left);
            int tempRight = maxDepth(root.right);
            if(tempLeft >= tempRight){
                return tempLeft+1;
            }
            else{
                return tempRight+1;
            }
        }
    }
}