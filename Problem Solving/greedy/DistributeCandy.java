package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DistributeCandy {
	
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<Integer> rating = new ArrayList<>(n);
		for(int i=0;i<n;i++){
			rating.add(scan.nextInt());
		}
		
		DistributeCandy obj =new DistributeCandy();
		
		System.out.println(obj.compute(rating));
		scan.close();
	}

	private int compute(ArrayList<Integer> rating) {
		if(rating.size() == 0 ){
			return 0;
		}
						
		int[] candies = new int[rating.size()]; 
		
		for(int i= 0 ;i<rating.size();i++){
		candies[i] = 1;
		}
		//Forward traverse
		for(int i= 1 ;i<rating.size();i++){
			
			if(rating.get(i)>rating.get(i-1)){
				candies[i] = candies[i-1]+1;
			}
			
			}
		
		//Reverse traverse
		for(int i=rating.size()-2 ;i>=0;i--){
			
			if(rating.get(i)>rating.get(i+1)){
				if(candies[i] <= candies[i+1]){
					candies[i] = candies[i+1]+1;
				}
			
			}
			
			}
		
		int totalCandies = 0 ;
		//count
	for(int i= 0 ;i<candies.length;i++){
		
		totalCandies+=candies[i];
			}
		
		return totalCandies;
	}

}
