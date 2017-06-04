package interviewbit.backtracking;

import java.util.ArrayList;
import java.util.List;

public class NQueens {

	class Position {
		int row;
		int column;

		Position(int a, int b) {
			this.row = a;
			this.column = b;
		}
	}

	public void solveNQueensAllSolution(int N) {

		Position[] positions = new Position[N];
		List<List<String>> result = new ArrayList<>();
		solve(N, 0, positions, result);
		System.out.println(result.toString());

	}

	public void solve(int n, int current, Position[] positions, List<List<String>> result) {
		
		if(n==current){
			
			List<String> li = new ArrayList<>();
			for(Position position :positions){
				StringBuffer temp = new StringBuffer();
				for(int i=0;i<n;i++){
					if(i==position.column){
						temp.append("Q");
					}else{
						temp.append(".");
					}
				}
				li.add(temp.toString());
			}
			result.add(li);
			return;
		}

		for (int i = 0; i < n; i++) {
			boolean positionFound = true;
			for (int j = 0; j < current; j++) {
				if (positions[j].column == i || positions[j].row - positions[j].column == current - i
						|| positions[j].row + positions[j].column == current + i) {
					positionFound = false;
					break;
					
				}
			}
			if(positionFound){
				positions[current] = new Position(current, i);
				solve(n,current+1,positions,result);
			}
		}

	}

	public static void main(String[] args) {

		NQueens obj = new NQueens();
		obj.solveNQueensAllSolution(8);

	}

}
