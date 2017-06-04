package tree;

import java.util.Stack;

public class BinaryTreeToLinkedList {

	public TreeNode flatten(TreeNode a) {
		
		Stack<TreeNode> st = new Stack<TreeNode>();
		
		while(a != null || !st.isEmpty()){
			if(a.right !=null){
				st.push(a.right);
			}
			if(a.left != null){
				a.right = a.left;
				a.left = null;
			}else if(!st.isEmpty()){
				TreeNode temp = st.pop();
				a.right = temp;
			}
			a = a.right;
		}
		
		return a;
	}
	
	public static void main(String[] args) {
		

	}

}
