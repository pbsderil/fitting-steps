package math;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortedPermutationRank {
	
	public int factorial(int n){
		if(n<2){
			return 1;
		} 
		
		return (n*factorial(n-1))%1000003;
	}
	
	public int findRank(String a) {
		char[] arr = new char[a.length()];
		
		for(int i= 0 ;i<arr.length;i++){
			arr[i] = a.charAt(i);
		}
		Arrays.sort(arr);
		
		int rank = 0;
		
		for(int i= 0 ;i<a.length();i++){
			char temp = a.charAt(i);
			
					int position = Arrays.binarySearch(arr, temp);	
			int minCount = 0 ;
			int j=i-1;
			while(j>=0){
				if(a.charAt(j)<a.charAt(i)){
					minCount++;
				}
				j--;
			}
			
			rank = (rank + (position-minCount)*factorial(a.length()-1-i))%1000003;
		}
		return rank+1;
		
	}

	public static void main(String[] args) {
		
		SortedPermutationRank obj = new SortedPermutationRank();
		System.out.println(obj.findRank("VIEW"));
	}

}
