package tree;

import java.util.ArrayList;

public class InOrderTraversal {
	  
    ArrayList<Integer> li = new ArrayList<Integer>();
    
	public ArrayList<Integer> inorderTraversal(TreeNode a) {
	    
	    inOrder( a);
	    return li;
	}
	public void inOrder(TreeNode a){	    
		
		if(a == null){
			return;
		}else{
			inOrder(a.left);

			li.add(a.val);
		
			inOrder(a.right);
		}
    
	}

}
