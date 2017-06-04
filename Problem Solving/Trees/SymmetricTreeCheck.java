package tree;

public class SymmetricTreeCheck {
	public boolean check(TreeNode a,TreeNode b){
		if((a == null && b == null)){
			return true;
		}
		if(a != null && b != null && a.val == b.val){
			return check(a.left,b.right) && check(a.right,b.left);
		}
		
		return false;
	}
	public boolean symmetry (TreeNode a){
		return check(a,a);
	}
	public static void main(String[] args){
		SymmetricTreeCheck obj = new SymmetricTreeCheck();
		TreeNode tree = new TreeNode(1);
		tree.left = new TreeNode(2);
		tree.right = new TreeNode(2);
		tree.left.right = new TreeNode(3);
		tree.right.right = new TreeNode(3);
;
		System.out.println(		obj.symmetry(tree));
	}

}
