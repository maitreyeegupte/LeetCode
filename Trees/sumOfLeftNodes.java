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
    static int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
		 return dfs(root,false);
	        
}

	private static int dfs(TreeNode root,Boolean isLeft) {
		if(root==null) {
			 return 0;
		 }
		 if(isLeft && root.right==null && root.left==null) {
			 return root.val;
		 }
		 int left= dfs(root.left,true);
		 int right=dfs(root.right,false);
		 
		return left+right;
    }
}
