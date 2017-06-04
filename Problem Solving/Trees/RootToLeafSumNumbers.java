package tree;

import java.math.BigInteger;
import java.util.ArrayList;

public class RootToLeafSumNumbers {
	
	public void compute(TreeNode a ,String path,ArrayList<String> out){
		if(a.left ==null && a.right == null){
		
			
				out.add(path);
				
			
			return;
		}
		if(a.left!=null){
			path+=(a.left.val);
			compute(a.left,path,out);
			path = path.substring(0,path.length()-1);}
		if(a.right!=null){
			path+=(a.right.val);
			compute(a.right,path,out);
			path = path.substring(0,path.length()-1);
		}

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RootToLeafSumNumbers obj = new RootToLeafSumNumbers();
		
	/*   
	    ArrayList<Integer> path = new ArrayList<>();
	    */
		
		 ArrayList<String> out = new ArrayList<>();
		TreeNode tree = new TreeNode(1);
		tree.left = new TreeNode(2);
		tree.right = new TreeNode(3);
		tree.left.left = new TreeNode(4);
		tree.left.right = new TreeNode(5);
		tree.right.left = new TreeNode(5+1);
		tree.right.right = new TreeNode(7);
/*		
		path.add(1);*/
		
		String path=tree.val+"";
		obj.compute(tree,  path, out);
		long output = 0;
		BigInteger a = new BigInteger("");
	for(int i=0;i<out.size();i++){
		BigInteger temp = new BigInteger(out.get(i));
		a.add(temp);
		}


	BigInteger div = new BigInteger("1003");

	int q =a.mod(div).intValue();	
	
		System.out.println();

	}

}
