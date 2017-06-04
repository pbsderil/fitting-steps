package tree;

public class PathSum {
	

	public int hasPathSum(TreeNode a, int b) {
	
		return	findSum(a, b) ? 1:0;
		
		
	}

	boolean findSum(TreeNode a, int sum) {
		
		if(a== null ){
			return (sum == 0);
		}
		boolean hasSum = false;
		int check = sum -a.val;
		if(check == 0 && a.left == null &&a.right == null){
			return true;
		}
		if(a.left !=null){
			hasSum = hasSum || findSum(a.left,check);
			
		}
		if(a.right !=null){
			hasSum = hasSum || findSum(a.right,check);
			
		}
		
		return hasSum;
	}
public static void main(String[] args) {
		
	TreeNode tree = new TreeNode(1000);
	tree.left = new TreeNode(2000);
	tree.left.left = new TreeNode(-3001);
	PathSum obj = new PathSum();
	System.out.println(obj.hasPathSum(tree, -1));
	
	}
}
