package array;

import java.util.ArrayList;

public class MaxAbsDifference {

	public static void main(String[] args) {
		
		ArrayList<Integer> li =  new ArrayList<>();
		li.add(1);
		li.add(3);
		li.add(-1);
		
		ArrayList<Integer> liSum =  new ArrayList<>();
		ArrayList<Integer> liDiff =  new ArrayList<>();
		
		int sumMax = 0;
				
		int maxSumArr = Integer.MIN_VALUE;;
		int minSumArr = Integer.MAX_VALUE;
		
		int maxDiffArr = Integer.MIN_VALUE;;
		int minDiffArr = Integer.MAX_VALUE;
		
		for(int i=0;i<li.size();i++){		
			liSum.add(li.get(i)+i);
			liDiff.add(li.get(i)-i);
			
			if(liSum.get(i)>maxSumArr){
				maxSumArr = liSum.get(i);
			}
			if(liSum.get(i)<minSumArr){
				minSumArr = liSum.get(i);
			}
			if(liDiff.get(i)>maxDiffArr){
				maxDiffArr = liDiff.get(i);
			}
			if(liDiff.get(i)<minDiffArr){
				minDiffArr = liDiff.get(i);
			}
		}
System.out.println(Math.abs(maxSumArr-minSumArr)>Math.abs(maxDiffArr-minDiffArr)?Math.abs(maxSumArr-minSumArr):Math.abs(maxDiffArr-minDiffArr));
	}

}
