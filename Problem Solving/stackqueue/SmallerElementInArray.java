package interviewbit.stackqueue;

import java.util.ArrayList;
import java.util.Stack;

public class SmallerElementInArray {

	 public ArrayList<Integer> prevSmaller(ArrayList<Integer> arr) {
	        
			 ArrayList<Integer> result = new ArrayList<Integer>();
			 Stack<Integer> stk = new Stack<Integer>();
			 for(int i=0;i<arr.size();i++){
				 if(stk.isEmpty()){
					 result.add(-1);
					 
				
				 }
				 else if(arr.get(i).intValue()>stk.peek().intValue()){
					 result.add(stk.peek().intValue());
				 }else if(arr.get(i).intValue()<=stk.peek().intValue()){
					 while(arr.get(i).intValue()<=stk.peek().intValue()){
						 stk.pop();
						 if(stk.isEmpty()){
							 result.add(-1);
							 break;
						 }
					 }
					if(!stk.isEmpty()){
					    	result.add(stk.peek().intValue());
					}
				
					
				 }
				 stk.push(arr.get(i).intValue());
			 }
			 return result;
			 
		    
	    }
	public static void main(String[] args) {
		

	}

}
