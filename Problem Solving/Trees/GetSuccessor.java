package tree;

//two cases a, node has a right sub tree
//          b, node has no right sub tree


public class GetSuccessor {
	public TreeNode getSuccessor(TreeNode a, int b) {
		TreeNode temp = null;
		while(a != null){
			if(a.val == b){
				if(a.right != null){
					a = a.right;
					temp = a;
					while(a.left !=null){
						temp = a.left;
						a = a.left;
					}
				}
			}
			if(b<a.val){
				temp = a;
				a = a.left;
				
			}else{
				
				a= a.right;
			}
		}
		
		return a;
	}
}
