package dynamicProgramming;

import java.util.Scanner;

public class IntersectingChords {
	
	public int compute(int N,int[] dp){
	
		if(dp[N] !=0){
			return dp[N];
		}
		long sum = 0;
		for(int i = 0 ;i<N;i++){
			
			long temp = ((long)compute(i,dp)*(long)compute(N-i-1,dp))%1000000007;	
			sum = ((sum +temp)%1000000007);
			
		}
		dp[N] = (int)sum;
		return 	dp[N];
		
	}

	public static void main(String[] args) {
		
		IntersectingChords obj = new IntersectingChords();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] dp = new int[N+1];
		dp[0] = 1;
		dp[1] = 1;
		System.out.println(obj.compute(N, dp));
	}
	
	// 22 - 482563003
	// 1000 - 110961515
}
