package tree;

import java.util.ArrayList;

public class MaxDepth {

	public int compute(TreeNode a ,int currHeight ){

		if(a.left==null && a.right == null){

			return currHeight;
		}

		int leftHeight = 0;
		int rightHeight = 0;

		if(a.left != null){
			leftHeight = compute(a.left,currHeight+1);
		}

		if(a.right != null){
			rightHeight = compute(a.right,currHeight+1);
		}

		return Math.max(leftHeight, rightHeight);

	}
	
	public static void main(String[] args) {}

}
