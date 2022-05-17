/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode res;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        res = null;
        preOrder(original, cloned, target);
        return res;
    }
    
    public void preOrder(TreeNode  root, TreeNode copy, TreeNode target){
        if(root == null || copy == null)
            return;
        if(root == target && root.val == copy.val){
            res = copy;
            return;
        }
        preOrder(root.left, copy.left, target);
        preOrder(root.right, copy.right, target);
    }
}