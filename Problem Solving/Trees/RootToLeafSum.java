package tree;

import java.util.ArrayList;

public class RootToLeafSum {
	
	public void compute(TreeNode a ,int sum,int currSum ,ArrayList<Integer> path,ArrayList<ArrayList<Integer>> out,int level){
		if(a.left ==null && a.right == null){
			if(sum == currSum){
				ArrayList<Integer> temp = new ArrayList<>(path);
				out.add(temp);
				
			}else{
		
			}
			return;
		}
		if(a.left!=null){
			path.add(a.left.val);
			compute(a.left,sum,currSum+a.left.val,path,out,level+1);
			path.remove(path.size()-1);}
		if(a.right!=null){
			path.add(a.right.val);
			compute(a.right,sum,currSum+a.right.val,path,out,level+1);
			path.remove(path.size()-1);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RootToLeafSum obj = new RootToLeafSum();
		
	    ArrayList<ArrayList<Integer>> out = new ArrayList<>();
	    ArrayList<Integer> path = new ArrayList<>();
	    
		TreeNode tree = new TreeNode(1);
		tree.left = new TreeNode(2);
		tree.right = new TreeNode(3);
		tree.left.left = new TreeNode(4);
		tree.left.right = new TreeNode(5);
		tree.right.left = new TreeNode(5+1);
		tree.right.right = new TreeNode(7);
		
		path.add(1);
		obj.compute(tree, 11, 1, path, out,1);
		
		System.out.println();

	}

}
