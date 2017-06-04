package dynamicProgramming;

import java.util.ArrayList;

public class MinJumpGame {
	
	public int canJump(ArrayList<Integer> A) {
	    
	    if (A == null || (A.size() > 1 && A.get(0) == 0))
	        return -1;
	        
	    if (A.size() == 1)
	        return 0;
	        
	    int count = A.get(0);
	    int n;
	    int max = 0;
	    int steps = 0;
	    
	    n = A.size();
	    
	    for (int i = 1; i < n; i++) {
	        
	        count--;
	        max--;
	        max = Math.max(max, A.get(i));
	        
	        if (i == n - 1) {
	            return steps + 1;
	        }
	        
	        if (count == 0) {
	            if (max < 0)
	                return -1;
	            
	            count = max;
	            max = 0;
	            steps++;
	        }
	        
	    }
        
        
	    
	    return steps;}

	public static void main(String[] args) {
	ArrayList<Integer> li = new ArrayList<>();
	li.add(2);
	li.add(1);
	li.add(3);
	li.add(4);
	li.add(5);
		
	MinJumpGame obj = new MinJumpGame();
	obj.canJump(li);
	
	}

}
