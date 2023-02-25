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
   public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            boolean xx=false;
            boolean yy=false;
            for(int i=0;i<size;i++){
            TreeNode curr=q.poll();
            if(curr.val==x) xx=true;
            if(curr.val==y) yy=true;
            if(curr.left!=null && curr.right!=null){
                if((curr.left.val==x && curr.right.val==y)||(curr.left.val==y && curr.right.val==x)) return false;
            }
            if(curr.left!=null) q.offer(curr.left);
            if(curr.right!=null) q.offer(curr.right);

        }
        if(xx && yy) return true;
        }
        return false;
}}
