package dynamicProgramming;

import java.util.ArrayList;

public class NumberOfCoins {
	
	 public int coinchange2(ArrayList<Integer> A, int N) {	        
			
			
		 long[] num_ways = new long[N+1];
			int i, j, m = A.size();

			

			// Base case (If required sum is 0)
			num_ways[0] = 1;

			// Pick all coins one by one and update the num_ways[] values
			for(i = 0; i < m; i++) {
				for(j = A.get(i); j <= N; j++) {
					num_ways[j] += num_ways[j - A.get(i)];
				}
			}
			
			return (int)(num_ways[N]%1000007); 
		 
			 /*int size = coinArray.size();
			 
			int i, j;
			long  x, y;			 
			    
			    long[][] table = new long[sum+1][size];			    
			  
			    for (i=0; i<size; i++)
			        table[0][i] = 1;			 
		
			    for (i = 1; i < sum+1; i++)
			    {
			        for (j = 0; j < size; j++)
			        {
		
			            x =  ((i-coinArray.get(j) >= 0)? table[i - coinArray.get(j)][j]: 0);
			 
			          
			            y = (j >= 1)? table[i][j-1]: 0;
		
			            table[i][j] = x + y;
			        }
			    }
			    System.out.println(table[sum][size-1]%1000007);
			    return (int)(table[sum][size-1]%1000007);			
		    */
	    }	 
	 
	 public static void main(String[] args){
		 
		 NumberOfCoins obj = new NumberOfCoins();
		 
		 ArrayList<Integer> a = new ArrayList<>();
		 a.add(1);
		 a.add(2);
		 a.add(3);
		 
		 obj.coinchange2(a, 4);				 
		 
	 }

}
