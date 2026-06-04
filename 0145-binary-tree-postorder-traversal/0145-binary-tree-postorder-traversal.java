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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        TreeNode cur = root;
        while(cur != null){
            if(cur.right != null){
                TreeNode temp = cur.right;
                while(temp.left!=null && temp.left != cur) 
                temp = temp.left;
                if(temp.left == null){
                    temp.left = cur;
                    ans.add(cur.val);
                    cur = cur.right;
                }
                else{
                    temp.left = null;
                    cur = cur.left;
                }
            }
            else{
                ans.add(cur.val);
                cur = cur.left;
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}