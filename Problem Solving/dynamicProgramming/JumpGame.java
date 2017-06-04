package dynamicProgramming;

import java.util.ArrayList;

public class JumpGame {
	
	public int canJump(ArrayList<Integer> A) {
		
		   if(A.size() <= 1)
		        return 1;
		 
		    int max = A.get(0); 
		    
		 
		    for(int i=0; i<A.size(); i++){
		 
		        if(max <= i && A.get(i) == 0) 
		            return 0;
		   //
		        if(i + A.get(i) > max){
		        	
		            max = i + A.get(i);
		        }
		 
		        if(max >= A.size()-1) 
		            return 1;
		    }
		 
		    return 0;
	}

	public static void main(String[] args) {
		
		JumpGame obj = new JumpGame();
	
		
	}

}
