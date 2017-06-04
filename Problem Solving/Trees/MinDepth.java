package tree;

public class MinDepth {
	
	
	public int compute(TreeNode a ,int currHeight ,int[] out){

		if(a.left==null && a.right == null){

			if(currHeight<out[0]){
				out[0] = currHeight;
			}
			return currHeight;
		}

		int leftHeight = 0;
		int rightHeight = 0;

		if(a.left != null){
			leftHeight = compute(a.left,currHeight+1,out);
		}

		if(a.right != null){
			rightHeight = compute(a.right,currHeight+1,out);
		}

		return out[0];

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
