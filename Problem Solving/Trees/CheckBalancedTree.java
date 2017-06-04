package tree;

public class CheckBalancedTree {
	int balanced = 1;
	public int isBalanced(TreeNode a) {
		heightDiff( a);
		return balanced;
	}
	public void heightDiff(TreeNode a){
		if(a==null){
			return ;
		}
		if(Math.abs(height(a.left) - height(a.right)) >1){
			balanced = 0;
		}
		
		heightDiff(a.left);
		heightDiff(a.right);
	}
	
	int height(TreeNode a){
		if(a == null){
			return 0;
		}
		int leftHeight = height(a.left);
		int rightHeight = height(a.right);
		if(leftHeight>rightHeight){
			return leftHeight+1;
		}else{
			return rightHeight+1;
		}
		

	}

	public static void main(String[] args) {
		

	}

}
