package dynamicProgramming;

import java.util.ArrayList;

public class UniquPathsInGrid {
	
	public int compute (ArrayList<ArrayList<Integer>> input){
		
		input.removeAll(input);
		
		int rows = input.size();
		int cols = input.get(0).size();
		
		int[][] dp = new int[rows][cols];
		//Fill the first row and column of dp table with 1....if a block is encountered in grid fill the rest 
		// with 0;
		for(int j = 0 ;j<cols;j++){
			if(input.get(0).get(j).intValue() == 0){
				dp[0][j] = 1;
			}else{
				break;
			}
		}
		
		for(int i = 0 ;i<rows;i++){
			if(input.get(i).get(0).intValue() == 0){
				dp[i][0] = 1;
			}else{
				break;
			}
		}
			
		//traverse through the dp table and dp[i][j] =  dp[i-1][j]+dp[i][j-1] 
		
		
		for(int i = 1 ;i<rows;i++){
			for(int j = 1 ;j<cols;j++){
				if(input.get(i).get(j).intValue() == 1){
					dp[i][j] = 0 ;
				}else{
					dp[i][j] = dp[i-1][j]+dp[i][j-1] ;
				}
				 
			}
		}
		
		return dp[rows-1][cols-1];
	}

	public static void main(String[] args) {
	
		
		
	}

}
