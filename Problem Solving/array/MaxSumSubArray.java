package array;

import java.util.ArrayList;
import java.util.List;


//Kadane's Algo
// This algorithm requires atleast one positive number in the array



public class MaxSumSubArray {
	
	public int maxSubArray(final List<Integer> a) {
		if(a.size() ==0 ){
			return 0;
		}
		if(a.size() ==0 ){
			return 0;
		}
				
		boolean allNegative = true;
		int bigNegative = Integer.MIN_VALUE;
		
		int maxSum = 0;
		int sum =  0;
		for(int i=0;i<a.size();i++){
			// if all numbers are negative
			if(a.get(i)>=0){
				allNegative = false;
			}else{
			if(a.get(i)>bigNegative){
				bigNegative = a.get(i);
			}
				
			}
		sum += a.get(i);
		if(sum<0){
			sum=0;
		}
		if(sum>maxSum){
			maxSum = sum;
		}
					
		}
		if(allNegative){
			return bigNegative;
		}
		return maxSum;
	}

	public static void main(String[] args) {
		  List<Integer> li = new ArrayList<Integer>();
			li.add(-2);
			li.add(1);
			li.add(-3);
			li.add(4);
		
			li.add(-1);
			li.add(2);
			li.add(1);
			li.add(-5);
			li.add(4);
			
			MaxSumSubArray obj = new MaxSumSubArray();
			System.out.println(obj.maxSubArray(li));

	}

}
