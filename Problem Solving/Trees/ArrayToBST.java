package tree;

import java.util.ArrayList;

public class ArrayToBST {
	
	public void compute(ArrayList<Integer> li,int start,int end,TreeNode tree){
		
		if(start == end){
			tree.val = li.get(start);
			return;
		}
	
		
		
		int middle =start+ (end-start)/2;
		
		if( (end-start)%2 ==1){
			middle += 1;
		}
		
	
		
		tree.val = li.get(middle);
	
		
		
		if(start<=middle-1){
			tree.left = new TreeNode(-1);
		compute(li,start,middle-1,tree.left);
		}
		
		if(middle+1<=end){
			tree.right = new TreeNode(-1);
		compute(li,middle+1,end,tree.right);
		}
		
	
		
	}
	
	

	public static void main(String[] args) {
		
		ArrayList<Integer> li = new ArrayList<>();
		
		li.add(1);
		li.add(2);
	

	
		
		TreeNode tree =  new  TreeNode(-1);
		
		ArrayToBST obj = new ArrayToBST();
		obj.compute(li, 0, li.size()-1,tree);
		
		System.out.println(tree.val);
	}

}
