import java.util.* ;
import java.io.*; 
/*
	
	Following is the Binary Tree node structure:

	public class TreeNode {
	    int data;
	    TreeNode left;
	    TreeNode right;
	    TreeNode() {}
	    TreeNode(int val) { this.data = val; }
	    TreeNode(int val, TreeNode left, TreeNode right) {
	       this.data = val;
	        this.left = left;
	        this.right = right;
	    }
	}

*/

public class PreOrder {
    public static List < Integer > getPreOrderTraversal(TreeNode root) {
    	// Write your code here.
		List<Integer> res = new ArrayList<>();
		dfs(root, res);
		return res;
    }
    public static void dfs(TreeNode node, List<Integer> res){
        if (node == null) return;
        res.add(node.data);
        dfs(node.left, res);
        dfs(node.right, res);
    }
}