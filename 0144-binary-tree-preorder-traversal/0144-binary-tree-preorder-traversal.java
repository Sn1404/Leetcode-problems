
class Solution {
    public void Preorder(TreeNode root, List<Integer> ans){
   

    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root ==null) return ans;

        Stack<TreeNode> st = new Stack<>();

        st.push(root);
        while(!st.isEmpty()){
            TreeNode cur = st.pop();
            ans.add(cur.val);
            if(cur.right!=null) st.push(cur.right);
             if(cur.left!=null) st.push(cur.left);

        }
      return ans;  
}
}