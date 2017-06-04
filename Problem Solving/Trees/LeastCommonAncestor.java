package tree;


import java.util.Stack;

public class LeastCommonAncestor {
	
	public boolean findPath(TreeNode tree,Stack<Integer> stk,int val){
	
		
		if(tree == null){
			return false;
		}
		stk.push(tree.val);
		if(val == tree.val){
			return true;
		}
		
		if(findPath(tree.left,stk,val) || findPath(tree.right,stk,val)){
			return true;
		}
		stk.pop();
		return false;
	}

	public static void main(String[] args) {
		
		
		
	}

}
