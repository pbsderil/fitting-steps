package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import interviewbit.linkedList.ListNode;
import interviewbit.linkedList.ReOrderList;

 


public class LargestContinuousSeqZeroSum {
	
	public ArrayList<Integer> compute(ArrayList<Integer> li ){
		
		int n = li.size();
		
		HashMap<Integer,Integer> sumList = new HashMap<Integer,Integer> ();
		
		int sum = 0 ;
		
		int start = 0;
		int end = 0;
		
		int length =  0;
		
		//A : [ 1, 2, -3, 3 ]
				//considering this test case
		sumList.put(0,-1);
		
		for(int i=0;i<n;i++){
			int temp = li.get(i).intValue();
			sum+=temp;
			if(sumList.containsKey(sum)){
				if(i-sumList.get(sum)>length){
					length = i-sumList.get(sum);
					end = i+1;
					start = sumList.get(sum)+1;
				}
								
			}else{
				sumList.put(sum,i);
			}
		}
				
		return new ArrayList(li.subList(start, end)) ;
	}
	public static void main(String[] a){

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		ArrayList<Integer> input = new ArrayList<>();
	
		for (int i = 0; i < n - 1; i++) {
		input.add(scan.nextInt());
		}
	
		LargestContinuousSeqZeroSum obj = new LargestContinuousSeqZeroSum();
		obj.compute(input);
		
	}
}
