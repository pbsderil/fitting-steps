package dynamicProgramming;

import java.util.ArrayList;
import java.util.Scanner;

public class MinSumPathTriangle {
	
	public int minSumPathTriangle(ArrayList<ArrayList<Integer>> li ){
		int[] pathSum = new int[li.get(li.size()-1).size()+1];
		
		int height = li.size();
		
		
		for(int i=height-1;i>=0;i--){
			for(int j=0;j<=i;j++){
				pathSum [j] =Math.min(pathSum[j],pathSum[j+1])+li.get(i).get(j);
				
			}
		}
		
		return pathSum[0];
	}
	
	
	// brute force ..pocheee... :P :P
	
	/*int minSum = Integer.MAX_VALUE;
	public void minSumPathTriangle(ArrayList<ArrayList<Integer>> li ,int rowIndex,int colIndex ,int sum){
		if(rowIndex == li.size()-1){
			if(sum<minSum){
				minSum = sum;
			}
			return;
		}
		
		
		minSumPathTriangle(li,rowIndex+1,colIndex,sum+li.get(rowIndex+1).get(colIndex));
		minSumPathTriangle(li,rowIndex+1,colIndex+1,sum+li.get(rowIndex+1).get(colIndex+1));
		
		return;
	}
*/
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int height =  scan.nextInt();
		int j= 0;
		ArrayList<ArrayList<Integer>> li =new ArrayList<>();
		
		for(int i=0;i<height ;i++){
			ArrayList<Integer> temp = new ArrayList<>();
			for(j=0;j<=i;j++){
				temp.add(scan.nextInt());
			}
			li.add(temp);
		}
		
		MinSumPathTriangle obj = new MinSumPathTriangle();
		System.out.println(obj.minSumPathTriangle(li));
	
	}

}
