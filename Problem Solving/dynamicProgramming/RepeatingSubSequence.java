package dynamicProgramming;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

// I solved this using hashmap.....
//scroll down for DP answer....DP is not a must for this problem but there are few questions based on this question which use DP

public class RepeatingSubSequence {
	
	public Integer compute(String input){
		Map<Character , Integer> hm = new LinkedHashMap<>();

		
	
		
		int length = input.length();
		
		ArrayList<Integer> li = new ArrayList<>();
		
		for(int i= 0 ;i<length;i++){
			char temp = input.charAt(i);
			
			if(hm.containsKey(temp)){
				li.add(hm.get(temp));
			}else{
				hm.put(temp, i);
				li.add(-1);
			}
		}
		
		Iterator itr = li.iterator();
		int minValue = -1;
		while(itr.hasNext()){
			int temp = (int) itr.next();
			if(temp>minValue){
				if(minValue>-1){
					return 1;
				}
				minValue = temp;
			}
			
		}
		
		return 0;
	}

	public static void main(String[] args) {
		
		RepeatingSubSequence obj = new RepeatingSubSequence();
		
		System.out.println(obj.compute("aba"));
	}
	
	// find the longest repeating subsequence...and if length>1 ..return 1
	
	public Integer DPSolution(String input){
		Map<Character , Integer> hm = new LinkedHashMap<>();
	
		int length = input.length();
		
		ArrayList<Integer> li = new ArrayList<>();
		
		for(int i= 0 ;i<length;i++){
			char temp = input.charAt(i);
			
			if(hm.containsKey(temp)){
				li.add(hm.get(temp));
			}else{
				hm.put(temp, i);
				li.add(-1);
			}
		}
		
		Iterator itr = li.iterator();
		int minValue = -1;
		while(itr.hasNext()){
			int temp = (int) itr.next();
			if(temp>minValue){
				if(minValue>-1){
					return 1;
				}
				minValue = temp;
			}
			
		}
		
		return 0;
	}

}
