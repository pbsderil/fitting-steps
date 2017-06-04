package dynamicProgramming;



public class MaxSumPathBinTree {
	int maxSum=Integer.MIN_VALUE;

	public int maxSumPathBinTree(TreeNode node,int sum){
		
		if(node == null){
			return 0;
		}
		
		int leftSum = maxSumPathBinTree(node.left,sum);
		int rightSum = maxSumPathBinTree(node.right,sum);
		
		int maxLeftRightNode = Math.max(Math.max(leftSum ,rightSum)+node.val,node.val);
		
		 maxSum = Math.max(leftSum+rightSum + node.val,maxLeftRightNode);
		
		sum = Math.max(sum, maxSum);
		
		return maxLeftRightNode;
	}
}
