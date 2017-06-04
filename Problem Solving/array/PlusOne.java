package array;

import java.util.ArrayList;
import java.util.List;

public class PlusOne {
	
	public ArrayList<Integer> plusOne(ArrayList<Integer> a) {
	    if(a.size()==0){
	        return a;
	    }
	    int carry = 0;
	    int i=a.size()-1;
	    if(a.get(i)+1 >9){
	         carry = (a.get(i)+1)/10;
	       a.set(i , (a.get(i)+1)%10);
	       i--;
	    }else{
	         a.set(i , (a.get(i)+1));
	         return a;
	    }
	    
	    while(carry !=0){
	    	  if(i<0 && carry !=0){
	        	  ArrayList<Integer> li = new ArrayList<Integer>();
	        	  li.add(carry);
	        	 
	        		  li.addAll(a);
	        	  return li;
	        }
	        if(a.get(i)+carry >9){
	            carry = (a.get(i)+carry)/10;
	             a.set(i , (a.get(i)+carry)%10);
	             i--;
	            
	        }else{
	             a.set(i , (a.get(i)+carry));
	             carry = 0;
	             i--;
	        }
	      
	    }
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlusOne obj = new PlusOne();
		  ArrayList<Integer> li = new ArrayList<Integer>();
				li.add(9);
				li.add(9);
				li.add(9);
				li.add(9);
			
				
		obj.plusOne(li);
	}

}
