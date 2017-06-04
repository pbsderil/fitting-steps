package tree;

public class IdenticalBinaryTree {
	int valid = 1;
	public void checkViaInorderTraversal(TreeNode a,TreeNode b){
	    
		
		if(a == null || b==null){
			if(b==null && a==null){
				return;
			}else{
				valid = 0;
				return;
			}
			
		}else{
			checkViaInorderTraversal(a.left,b.left);

			if(a.val != b.val){
				valid = 0;
			}
		
			checkViaInorderTraversal(a.right,b.right);
		}
    
	}

}

