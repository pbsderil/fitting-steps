package tree;

import java.util.ArrayList;

public class PostOrderTraversal {
    ArrayList<Integer> li = new ArrayList<Integer>();
	public ArrayList<Integer> postorderTraversal(TreeNode a) {
	     postOrder( a);
	    return li;
	}
		public void postOrder(TreeNode a){
	    
		
		if(a == null){
			return;
		}else{
			postOrder(a.left);
	postOrder(a.right);
			li.add(a.val);
		
		
		}
   
	}

}
