package dynamicProgramming;

import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.midi.Synthesizer;

public class BuyAndSellStocksKTransaction {
	
	public Integer compute( ArrayList<Integer> li , int k){
		
		int T[][] =  new int[k+1][li.size()];
		
		int n = li.size();
		
		for(int i=0;i<=k;i++){
			int maxDiff = - li.get(0);
			for(int j=0;j<n;j++){
				T[i][j] = Math.max(T[i][j-1], li.get(j)+maxDiff);
				maxDiff = Math.max(T[i-1][j]-li.get(j),maxDiff);
			}
		}
		
		return T[k][n-1];
	}
	

	public static void main(String[] args) {
		ArrayList<Integer> li =  new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		
		int k = scan.nextInt();
		
int n = scan.nextInt();

for(int i=0;i<n;i++){
	li.add(scan.nextInt());
}


BuyAndSellStocksKTransaction obj = new BuyAndSellStocksKTransaction();
System.out.println(obj.compute(li,k));	
	}

}
