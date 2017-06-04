package tree;

public class KthSmallest {
	int count=0;
	int val = 0;
	public int kthsmallest(TreeNode root, int k) {
		smallest(root,k);
		return val;
    }
	public void smallest(TreeNode root, int k) {
		if(count ==-1){
			return;
		}
		
		
		if(root == null){
			return;
		}else{
			smallest(root.left,k);
			if(count !=-1){
				count++;
			}
			
			if(count ==k){
				val = root.val;
				count = -1;
			}
			smallest(root.right,k);
		}
    }
}
