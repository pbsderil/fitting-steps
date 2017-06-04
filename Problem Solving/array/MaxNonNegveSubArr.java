package array;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxNonNegveSubArr {

	public ArrayList<Integer> maxNonNegveSubArr(ArrayList<Integer> input) {
	    
		int n = input.size();

		if (n == 0) {
			return new ArrayList<Integer>();
		}

		ArrayList<ArrayList<Integer>> li = new ArrayList<ArrayList<Integer>>();

		ArrayList<Integer> temp = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int dummy = input.get(i);
			if (dummy < 0) {
				if (temp.size() != 0) {
					li.add(temp);
					temp = new ArrayList<>();
				}
			} else {
				temp.add(dummy);
			}
		}
		if(temp.size()>0){
			li.add(temp);
		}
		
		long maxSum = 0;
		int maxArrayIndex = 0;
		for (int i = 0; i < li.size(); i++) {
			long sum = 0;
			for (int j = 0; j < li.get(i).size(); j++) {
				sum += li.get(i).get(j);
			}
		
			if (sum > maxSum) {
				maxArrayIndex = i;
			} else if (sum == maxSum) {
				if (li.get(i).size() > li.get(maxArrayIndex).size()) {
					maxArrayIndex = i;
				} else if (li.get(i).size() == li.get(maxArrayIndex).size()) {
					if (li.get(i).get(0) < li.get(maxArrayIndex).get(0)) {
						maxArrayIndex = i;
					}

				}
			}

		}
		
		
		if(li.size()==0){
		    return new ArrayList<Integer>();
		}
		return li.get(maxArrayIndex);
	
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Integer> li = new ArrayList<>();
		int count = scan.nextInt();
		while(count>0){
			li.add(scan.nextInt());
			count--;
		}

		MaxNonNegveSubArr obj = new MaxNonNegveSubArr();
		System.out.println(obj.maxNonNegveSubArr(li).toString());
		
	}

}
