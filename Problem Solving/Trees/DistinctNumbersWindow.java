//Heaps and Maps

package tree;

import java.util.ArrayList;
import java.util.HashMap;

public class DistinctNumbersWindow {
	
	 public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
		 
		 HashMap<Integer,Integer> hm = new HashMap<>();
		 
		 ArrayList<Integer> output = new ArrayList<>();
		 
	
		 
		 int distinctNumbers = 0;
		 
		 for(int i=1;i<=A.size();i++){
			 
			 if(i>B){
			
					 
				 if(hm.get(A.get(i-B-1)) == 1){
					 hm.remove(A.get(i-B-1));
					 distinctNumbers --;
				 }else{
					 hm.put(A.get(i-B-1),hm.get(A.get(i-B-1))-1);
					 
				 }
				 
				
				 
			 }
			 
			 int temp = A.get(i-1);
			 
			 if(!hm.containsKey(temp)){
				 distinctNumbers++;
				 hm.put(temp, 1);
			 }
			 else{
				 hm.put(temp ,hm.get(temp)+1); 
			 }
			 
			 if(i%B == 0 || i>B){
				
				 output.add(distinctNumbers);
			 }
		 }
		 
		 
		 return output;
	    }

	public static void main(String[] args) {
		
		DistinctNumbersWindow obj = new DistinctNumbersWindow();
		ArrayList<Integer> input = new ArrayList<>();
		input.add(1);
		input.add(2);
		input.add(1);
		input.add(3);
		input.add(4);
		input.add(3);
		
		
		obj.dNums(input, 3);
	}

}
