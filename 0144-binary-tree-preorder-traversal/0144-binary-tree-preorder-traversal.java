
class Solution {
    public void Preorder(TreeNode root, List<Integer> ans){
        // base case
        if(root == null) return ;
        // rec case
         ans.add(root.val);
        Preorder(root.left, ans);
        Preorder(root.right, ans);

    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Preorder(root, ans);
        return ans;
    }
}