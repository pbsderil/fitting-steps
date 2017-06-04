package dynamicProgramming;

import java.util.ArrayList;
import java.util.Scanner;

public class BuyAndSellStocks {
	
	public int buyAndSellStocks(ArrayList<Integer> li){
		
		int n =  li.size();
		
		int maxProfit  = 0 ;
		int buyingPrice = Integer.MAX_VALUE;
		
		for(int i=0;i<n;i++){
			if(li.get(i)<buyingPrice){
				buyingPrice = li.get(i);				
			}
			maxProfit = Math.max(maxProfit, li.get(i)-buyingPrice);
		}
	
		
		
		
				
		return maxProfit;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		ArrayList<Integer> li = new ArrayList<>();
		
		for(int i=0;i<n;i++){
			li.add(scan.nextInt());
		}
		
		BuyAndSellStocks obj = new BuyAndSellStocks();
		
		System.out.println(obj.buyAndSellStocks(li));
	}

}
