package dynamicProgramming;

import java.util.ArrayList;

public class DungeonPrincess {

	public int dungeonPrincess(ArrayList<ArrayList<Integer>> a) {
	if(a.size() == 0){
		return 0;
	}
	

	
int	m = a.size();
int n= 	a.get(0).size();
		
		int[][] sum = new int[m][n];
		
		sum[m-1][n-1] = a.get(m-1).get(n-1) > 0 ? 1:Math.abs(a.get(m-1).get(n-1)+1);
		
		
		
		for(int i=m-2;i>=0;i--){
			sum[i][n-1] = Math.max(sum[i+1][n-1]-a.get(i).get(n-1), 1);
		}
		
		for(int i=n-2;i>=0;i--){
			sum[m-1][i] = Math.max(sum[m-1][i+1]-a.get(m-1).get(i), 1);
		}
		
		for(int i=m-2;i>=0;i--){
			for(int j=n-2;j>=0;j--){
				
				sum[i][j] = Math.min( Math.max(sum[i][j+1]-a.get(i).get(j),1), Math.max(sum[i+1][j]-a.get(i).get(j),1) );
				
			}
		}
		
		return sum[0][0];
		
	}
}
