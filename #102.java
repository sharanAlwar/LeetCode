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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> l = new ArrayList<>(); 
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode ptr = q.poll();
                if(ptr.left != null) q.offer(ptr.left);
                if(ptr.right != null) q.offer(ptr.right);
                l.add(ptr.val);
            }
            ans.add(l);
        }
        return ans;
    }
}
