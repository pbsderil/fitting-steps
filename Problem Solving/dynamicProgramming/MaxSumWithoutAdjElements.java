package dynamicProgramming;

import java.util.ArrayList;

public class MaxSumWithoutAdjElements {
	public int maxSumWithoutAdjElements(ArrayList<ArrayList<Integer>> a) {
		int[] sum = new int[a.get(0).size()];
		
		for(int i=0;i<a.get(0).size();i++){
			int max = 0 ;
			for(int j=0;j<a.size();j++){
				if(a.get(j).get(i) > max){
					max = a.get(j).get(i);
				}
			}
			sum[i] = max;
		}
		int maxValue = 0;
		for(int i=0;i<sum.length;i++){
			if(i-2>=0){
				if(sum[i]+sum[i-2] > sum[i] ){
					sum[i] = sum[i]+sum[i-2];
					
				}
			}
			if(sum[i] >maxValue){
				maxValue = sum[i];
			}
		}
		
		return maxValue;
	}
	
	public static void main(String[] args){
		MaxSumWithoutAdjElements obj = new MaxSumWithoutAdjElements();
		ArrayList<ArrayList<Integer>> li = new ArrayList<>();
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();
		
		li.add(a);
		li.add(b);
		
		a.add(1);	b.add(2);
		a.add(2);	b.add(3);
		a.add(3);	b.add(4);
		a.add(4);	b.add(5);
		
		System.out.println(obj.maxSumWithoutAdjElements(li));
	}
}
