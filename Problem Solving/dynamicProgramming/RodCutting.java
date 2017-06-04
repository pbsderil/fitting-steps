package dynamicProgramming;

import java.util.ArrayList;

public class RodCutting {
	
	int minValue = Integer.MAX_VALUE;
	
	public int compute(ArrayList<Integer> li, int N,ArrayList<Integer> out,int start,int end){
		
		
		
		int value = 0;
		
		for(int i=start+1;i<li.size()-1;i++){
			
			value =N + compute(li,end-1-i,out,i,end-1);
			
		}
		
	
		
	return value;
		
	}

	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<>();
		li.add(1);
		li.add(2);
		li.add(5);
		
		RodCutting obj = new RodCutting();
		
		ArrayList<Integer> out = new ArrayList<>();
		
		obj.compute(li,5+1,out,0,li.size()-1);
		System.out.println();
			
	}

}
