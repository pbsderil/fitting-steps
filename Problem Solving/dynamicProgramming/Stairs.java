package dynamicProgramming;

public class Stairs {

    int[] count ;
	public int climbStairs(int a) {
	    count = new int[a+2];
	    if(a==0){
	        return a;
	    }
	   return compute(a+1);
	}
	
	public int compute(int a){
	     
	    int currCount = 0;
	    if(a<2){
	        return 1;
	    }
	    if(count[a] != 0 ){
	        return count[a];
	    }
	        count[a]= compute(a-1)+compute(a-2);
	    	    
	    return count[a];
	}

	public static void main(String[] args) {
		Stairs obj = new Stairs();
		obj.climbStairs(3);

	}

}
