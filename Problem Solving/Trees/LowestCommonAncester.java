package tree;

import java.util.Stack;

public class LowestCommonAncester {
	int count = 0;
	Stack<TreeNode> st = new Stack<>();
	public int lca(TreeNode a, int val1, int val2) {
		
		inOrder(a,val1,val2);
		if(count ==2){
			count = 0;
			st.push(a);
			
		}else{
			return -1;
		}
		inOrderManager(a,val1,val2);
		return st.isEmpty() ? -1:st.pop().val;
	}
	public void inOrderManager(TreeNode a, int val1, int val2){
		if(a == null){
			return;
		}
		inOrder(a.left, val1, val2);
		if(count ==2){
			st.push(a);
		}
		count = 0;
		inOrder(a.right, val1, val2);
		if(count ==2){
			st.push(a);
		}
		count = 0;
		inOrderManager(a.left, val1, val2);
		inOrderManager(a.right, val1, val2);
		
	}
	
	void inOrder(TreeNode a ,int val1,int val2){
		if(a==null){
			return;
		}
		inOrder(a.left, val1, val2);
		if(a.val == val1 || a.val == val2){
			count ++;
		}
		inOrder(a.right,val1, val2);
	}

}
