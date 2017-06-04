package interviewbit.backtracking;

import java.util.ArrayList;
import java.util.Scanner;

public class SudokuSolver {

	public int solve(ArrayList<ArrayList<Character>> board, int row, int col) {
		if (row == 9) {
			return 1;
		}

		if (board.get(row).get(col) != '.') {
			if (col == 8) {
				if (solve(board, row + 1, 0) == 1)
					return 1;
			} else {
				if (solve(board, row, col + 1) == 1)
					return 1;
			}
			return 0;
		}

		int check = 1;
		for (; check <= 9; check++) {
			if (isValid(check, board, row, col)) {
				board.get(row).set(col, (char) (check + 48));
				if (col == 8) {
					if (solve(board, row + 1, 0) == 1)
						return 1;
				} else {
					if (solve(board, row, col + 1) == 1)
						return 1;
				}
			}
			
			board.get(row).set(col, '.');
		}

		return 0;
	}

	private boolean isValid(int check, ArrayList<ArrayList<Character>> board, int row, int col) {

		// check for clash in row nd column
		for (int i = 0; i < 9; i++) {
			if (board.get(row).get(i) - 48 == check) { // -48 to convert char to
														// int.... Ascii of '0'
														// is 48
				return false;
			}
			if (board.get(i).get(col) - 48 == check) {
				return false;
			}
		}

		// check for clash in sector

		int sectorRow = 3 * (row / 3);
		int sectorCol = 3 * (col / 3);
		int relativeRow1 = (row + 2) % 3;
		int relativeRow2 = (row + 4) % 3;
		int relativeColumn1 = (col + 2) % 3;
		int relativeColumn2 = (col + 4) % 3;

		if (board.get(sectorRow + relativeRow1).get(sectorCol + relativeColumn1) - 48 == check)
			return false;
		if (board.get(sectorRow + relativeRow1).get(sectorCol + relativeColumn2) - 48 == check)
			return false;
		if (board.get(sectorRow + relativeRow2).get(sectorCol + relativeColumn1) - 48 == check)
			return false;
		if (board.get(sectorRow + relativeRow2).get(sectorCol + relativeColumn2) - 48 == check)
			return false;

		return true;
	}

	public static void main(String[] args) {
		ArrayList<Character> temp = null;
		ArrayList<ArrayList<Character>> board = new ArrayList<>();

		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 9; i++) {
			temp = new ArrayList<>();
			for (int j = 0; j < 9; j++) {
				temp.add(scan.next().charAt(0));
			}
			board.add(temp);
		}
		SudokuSolver obj = new SudokuSolver();

		obj.solve(board, 0, 0);
		System.out.println(board.toString());

	}

}
