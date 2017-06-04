package tree;

import java.util.HashSet;

public class T2Sum {
	 int out =0;
	  public void compute(TreeNode A,int B,  HashSet<Integer> hs){
	        
	        if(A == null){
	            return ;
	        }
	        compute(A.left,B,hs);
	        
	        if(hs.contains(B-A.val)){
	        	out=1;
	        }else{
	        	hs.add(A.val);
	        }
	        compute(A.right,B,hs);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
