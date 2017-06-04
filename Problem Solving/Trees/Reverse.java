package tree;

public class Reverse {
    
    public void invert(TreeNode a) {
       
	if(a.right == null && a.left == null){
		return ;
	}
	TreeNode temp = a.left;
	a.left = a.right;
	a.right = temp;
	if(a.left !=null)
	invert(a.left);
	if(a.right !=null)
	invert(a.right);

   }
   
   
   
   public TreeNode invertTree(TreeNode root) {
       

   invert(root);
   return root;
   }
}
