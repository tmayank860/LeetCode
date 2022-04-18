/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        if(root==null){
            return -1;
        }
        ArrayList<Integer> ls=new ArrayList<>();
        inOrder(root,ls);
        if(ls.size()<k){
            return -1;
        }
        return ls.get(k-1);
    }
    static void inOrder(TreeNode root,ArrayList<Integer> ls){
        if(root==null){
            return;
        }
        inOrder(root.left,ls);
        ls.add(root.val);
        inOrder(root.right,ls);
    }
}