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
    public void Inorder(TreeNode root, List<Integer> ans){
        // base case
        if(root == null) return ;
        // rec case
        Inorder(root.left, ans);
        ans.add(root.val);
        Inorder(root.right, ans);

    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        TreeNode cur =root;
        Stack<TreeNode> st = new Stack<>();
        while(!st.isEmpty()|| cur!=null){
            if(cur!=null){
                st.push(cur);
                cur =cur.left;
        }
        else{
            cur =st.pop();
            ans.add(cur.val);
            cur =cur.right;
        }
      
    }
      return ans;
}

}