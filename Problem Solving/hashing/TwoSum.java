package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class TwoSum {
	
	public ArrayList<Integer> compute(final List<Integer> input, int target) {
		
		 int n =  input.size();
		 HashMap<Integer,Integer> hm = new HashMap<>();
		 
		
		 ArrayList<Integer> out = new ArrayList<>();
		 for(int i=0;i<n;i++){
			 if(hm.containsKey(target-input.get(i))){
				 out.add(hm.get(target-input.get(i))+1);
				 out.add(i+1);
				 return out;
			 }
			 if(!hm.containsKey(input.get(i).intValue()))
				 hm.put(input.get(i).intValue(),i);
		 }
			return out;
		}
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		ArrayList<Integer> input = new ArrayList<>();
	
		for (int i = 0; i < n - 1; i++) {
		input.add(scan.nextInt());
		}
	
		TwoSum obj = new TwoSum();
		obj.compute(input,10);
		
	}

	

}
