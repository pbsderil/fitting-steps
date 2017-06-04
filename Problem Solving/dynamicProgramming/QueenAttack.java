package dynamicProgramming;

import java.util.ArrayList;
import java.util.Scanner;

public class QueenAttack {
	
	public ArrayList<ArrayList<Integer>> compute (ArrayList<ArrayList<Integer>> board,int n,int m){
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		
		for(int i=0;i<n;i++){
			ArrayList<Integer> li = new ArrayList<>();
			for(int j=0;j<m;j++){
				int attacks = testCell (board,i,j,n,m);
				li.add(attacks);
				
			}
			result.add(li);
		}
		return result;
	}

	private int testCell(ArrayList<ArrayList<Integer>> board, int i, int j, int n, int m) {
		int count = 0;
		// check east
			for(int k = j+1;k<m;k++){
				if(board.get(i).get(k)==1){
					count++;
					break;
				}
			}
			// check west
			for(int k = j-1;k>=0;k--){
				if(board.get(i).get(k)==1){
					count++;
					break;
				}
			}
			// check north
			for(int k =i-1 ;k>=0;k--){
				if(board.get(k).get(j)==1){
					count++;
					break;
				}
			}
			// check south
			for(int k = i+1;k<n;k++){
				if(board.get(k).get(j)==1){
					count++;
					break;
				}
			}
			//check north east
			for(int k = i-1,l=j+1;k>=0&& l<m;k--,l++){
				if(board.get(k).get(l)==1){
					count++;
					break;
				}
			}
			//check south west
			for(int k = i+1,l=j-1;k<n&& l>=0;k++,l--){
				if(board.get(k).get(l)==1){
					count++;
					break;
				}
			}
			//check north west
			for(int k = i-1,l=j-1;k>=0&& l>=0;k--,l--){
				if(board.get(k).get(l)==1){
					count++;
					break;
				}
			}
			//check south east
			for(int k = i+1,l=j+1;k<n&& l<m;k++,l++){
				if(board.get(k).get(l)==1){
					count++;
					break;
				}
			}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		ArrayList<ArrayList<Integer>> board = new ArrayList<>(n);
		
		for(int i=0;i<n;i++){
			ArrayList<Integer> li = new ArrayList<>(m);
			for(int j=0;j<m;j++){
				li.add(scan.nextInt());
				
			}
			board.add(li);
		}

		QueenAttack obj = new QueenAttack();
		
		obj.compute(board,n,m);
		
	}

}
