package dynamicProgramming;

import java.util.ArrayList;
import java.util.Scanner;

public class LongestIncreasingSubSeq {
	
	public void longestIncreasingSubSeq(ArrayList<Integer> li){
		int size = li.size();
		int[] curLen = new int[size];
		int[] curMax = new int[size];
		
		int maxLen = 0;
		
		for(int i=0;i<size;i++){
			curLen [i] = max(curLen,li,i)+1; 
			if(curLen [i]>maxLen){
				maxLen = curLen [i];
			}
		}
		System.out.println(curLen[size-1]);
	}

	private int max(int[] curLen, ArrayList<Integer> li, int i) {
		int maxLength = 0;
	
		for(int j=0;j<i;j++){
			
			if(curLen[j]>maxLength){
				if(li.get(j)<li.get(i)){
					maxLength = curLen[j];
					
				}
			}
			
		}
		
		
		return maxLength;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> li = new ArrayList<>();
		int size = scan.nextInt();
		for(int i=0;i<size;i++){
			li.add(scan.nextInt());
		}
		
	
		
		LongestIncreasingSubSeq obj = new LongestIncreasingSubSeq();
		obj.longestIncreasingSubSeq(li);
	}

}
