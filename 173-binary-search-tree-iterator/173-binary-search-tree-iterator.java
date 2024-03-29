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
class BSTIterator {
//O(n) Space
    // ArrayList<Integer> ls=new ArrayList<>();
    Stack<TreeNode> ls=new Stack<>();
    
    public BSTIterator(TreeNode root) {
        // inOrder(root);
        pushLeft(root);
        
    }
    // public void inOrder(TreeNode root){
    //     if(root==null){
    //         return;
    //     }
    //     inOrder(root.left);
    //     ls.add(root.val);
    //     inOrder(root.right);
    // }
    public void pushLeft(TreeNode root){
        while(root!=null){
            ls.push(root);
            root=root.left;
        }
    }
    
    public int next() {
        // return ls.remove(0);
        TreeNode res=ls.pop();
        pushLeft(res.right);
        return res.val;
    }
    
    public boolean hasNext() {
        return !ls.isEmpty();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */