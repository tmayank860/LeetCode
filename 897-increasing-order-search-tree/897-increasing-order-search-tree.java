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
    public TreeNode increasingBST(TreeNode root) {
        if(root==null){
            return null;
        }
        ArrayList<Integer> ls=new ArrayList<>();
        inOrder(root,ls);
        TreeNode newRoot=new TreeNode(ls.get(0));
        TreeNode current=newRoot;
        for(int i=1;i<ls.size();i++){
            TreeNode node=new TreeNode(ls.get(i));
            current.right=node;
            current=current.right;
        }
        return newRoot;
    }
    static void inOrder(TreeNode root, ArrayList<Integer> ls){
        if(root==null){
            return;
        }
        inOrder(root.left,ls);
        ls.add(root.val);
        inOrder(root.right,ls);
    }
}