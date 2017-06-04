package dynamicProgramming;

import java.util.ArrayList;
import java.util.Scanner;

public class CoinsInLine {

	public int compute(ArrayList<Integer> input, int i, int j,int[][] dpTable) {
		if(input.size()==0){
			return 0;
		}		
		if(i==j){
			return input.get(i);
		}
		if(j-i==1){
			return Math.max(input.get(i),input.get(j));
		}


		if(dpTable[i][j] !=0){
			return dpTable[i][j];
		}

		
		
		dpTable[i][j] = Math.max(input.get(i) + Math.min(compute(input, i + 2, j,dpTable), compute(input, i + 1, j - 1,dpTable)),
				input.get(j) + Math.min(compute(input, i , j-2,dpTable), compute(input, i + 1, j - 1,dpTable)));

		return dpTable[i][j];
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		ArrayList<Integer> li = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			li.add(scan.nextInt());
		}
		int[][] dpTable = new int[n][n];
		
		CoinsInLine obj = new CoinsInLine();
		System.out.println(obj.compute(li, 0, li.size()-1,dpTable));
	}

}
