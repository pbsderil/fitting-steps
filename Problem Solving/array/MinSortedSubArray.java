package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinSortedSubArray {
	
	
/*	1) Find the candidate unsorted subarray 
	a) Scan from left to right and find the first element which is greater than the next element. Let s be the index of such an element. In the above example 1, s is 3 (index of 30).
	b) Scan from right to left and find the first element (first in right to left order) which is smaller than the next element (next in right to left order). Let e be the index of such an element. In the above example 1, e is 7 (index of 31).

	2) Check whether sorting the candidate unsorted subarray makes the complete array sorted or not. If not, then include more elements in the subarray.
	a) Find the minimum and maximum values in arr[s..e]. Let minimum and maximum values be min and max. min and max for [30, 25, 40, 32, 31] are 25 and 40 respectively.
	b) Find the first element (if there is any) in arr[0..s-1] which is greater than min, change s to index of this element. There is no such element in above example 1.
	c) Find the last element (if there is any) in arr[e+1..n-1] which is smaller than max, change e to index of this element. In the above example 1, e is changed to 8 (index of 35)*/
	
	
	public ArrayList<Integer> find (ArrayList<Integer> li){
		
		int kalavaramStart = -1 ;
		int kalavaramEnd = li.size()-1;
		
		for(int i=0;i<li.size()-1;i++){
			if(li.get(i)<=li.get(i+1)){
				
			}else{
				if(kalavaramStart == -1 )
				kalavaramStart = i;
				
				kalavaramEnd = i+1;
			}
		}
		ArrayList<Integer> output = new ArrayList<>();
		if(kalavaramStart == -1){
			
			output.add(-1);
			return output;
		}
		int min = Integer.MAX_VALUE;
		int max = -1;
		for(int i=kalavaramStart;i<=kalavaramEnd;i++ ){
			if(li.get(i)<min){
				min = li.get(i);
			}
			if(li.get(i)>max){
				max = li.get(i);
			}
		}
		
		for(int i=0;i<kalavaramStart;i++){
			if(li.get(i) > min){
				kalavaramStart = i;
				break;
			}
		}
		
		for(int i=li.size()-1;i>kalavaramEnd;i--){
			if(li.get(i) < max){
				kalavaramEnd = i;
				break;
			}
		}
		
		output.add(kalavaramStart);
		output.add(kalavaramEnd);
		return output;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<Integer> li = new ArrayList<Integer>();
		
		for(int i=0;i<n;i++){
			li.add(scan.nextInt());
		}
		
		MinSortedSubArray obj = new MinSortedSubArray();
		obj.find(li);

	}

}
