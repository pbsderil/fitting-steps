package tree;

// No duplicate values

public class BSTCheck {

	public int isValidBST(TreeNode a) {
		
		if(a.val == -1){
			return 1;
		} else if (isLesser(a.left, a.val) && isGreater(a.right, a.val) && isValidBST(a.left) ==1 && isValidBST(a.right) ==1){
			return 1 ;
		}
		
		return 0;
		
	}
	
	
	private boolean isGreater(TreeNode right, int val) {
		
		if(right.val == -1){
			return true;
		}else if(right.val > val && isGreater(right.left,right.val) && isGreater(right.right,right.val)){
			return true;
		}
		
		return false;
	}


	private boolean isLesser(TreeNode left, int val) {

		if(left.val == -1){
			return true;
		}else if(left.val < val &&isLesser(left.left,left.val) && isLesser(left.right,left.val)){
			return true;
		}
		return false;
	}


	public static void main(String[] args) {
		

	}

}
