public class CheckBST {
	public int isValidBST(TreeNode a) {
	    
		return check(a,Integer.MIN_VALUE,Integer.MAX_VALUE);
		
	}
	
	public int check(TreeNode a,int min,int max){
	    if(a==null){
	        return 1;
	    }else if(a.val< min || a.val>max){
	        return 0;
	    }else{
	        return ((check(a.left,min,a.val)==1) &&  (check(a.right,a.val,max)==1))?1:0;
	    }
	}

}