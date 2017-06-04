package dynamicProgramming;

import java.util.ArrayList;

public class MinSumPathMatrix {
	public int minPathSum(ArrayList<ArrayList<Integer>> a) {
	if(a.size() == 0){
		return 0;
	}
		
		int[][] sum = new int[a.size()][a.get(0).size()];
		
		sum[0][0] = a.get(0).get(0);
		
		for(int i=1;i<a.size();i++){
			sum[i][0] = sum[i-1][0]+a.get(i).get(0);
		}
		
		for(int i=1;i<a.get(0).size();i++){
			sum[0][i] = sum[0][i-1]+a.get(0).get(i);
		}
		
		for(int i=1;i<a.size();i++){
			for(int j=1;j<a.get(0).size();j++){
				sum[i][j] = Math.min(sum[i-1][j], sum[i][j-1])+a.get(i).get(j);
			}
		}
		
		return sum[a.size()-1][a.get(0).size()-1];
	}
}
