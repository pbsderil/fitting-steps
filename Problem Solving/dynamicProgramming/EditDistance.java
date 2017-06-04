package dynamicProgramming;

public class EditDistance {
	 int min(int a ,int b,int c){
		 if(a<=b){
			 if(a<=c){
				 return a;
			 }else{
				 return c;
			 }
		 }else{
			 if(b<=c){
				 return b;
			 }else{
				 return c;
			 }
		 }
		 
		
		
	}
	public int minDistance(String a, String b) {
		
		int m = a.length(),n=b.length();		
		
		
        int dp[][] = new int[m+1][n+1];
      
       
        for (int i=0; i<=m; i++)
        {
            for (int j=0; j<=n; j++)
            {
           
                if (i==0)
                    dp[i][j] = j;  
                
                else if (j==0)
                    dp[i][j] = i; 
                
                else if (a.charAt(i-1) == b.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1];
      
               
                else
                    dp[i][j] = 1 + min(dp[i][j-1], 
                                       dp[i-1][j],  
                                       dp[i-1][j-1]); 
            }
        }
  
        return dp[m][n];
		
	
	}
	
	public static void main(String[] args) {
		
		EditDistance obj = new EditDistance();
		System.out.println(obj.minDistance("Deril","Devil"));

	}

}
