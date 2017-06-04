package dynamicProgramming;

import java.util.ArrayList;
import java.util.Scanner;

public class BuyAndSellStocksNtransaction {

public int buyAndSellStocks(ArrayList<Integer> li){
		
		int n =  li.size();
		
		int profit  = 0 ;
		int buyingPrice = Integer.MAX_VALUE;
		
		for(int i=0;i<n-1;i++){
			if(li.get(i)<li.get(i+1)){
				profit += 	li.get(i+1)-li.get(i);			
			}
			profit = Math.max(profit, li.get(i)-buyingPrice);
		}
			
		return profit;
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
