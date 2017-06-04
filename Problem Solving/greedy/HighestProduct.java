package greedy;

import java.util.ArrayList;
import java.util.Collections;

public class HighestProduct {

	public int compute(ArrayList<Integer> li) {
		int negative1 = 0;
		int negative2 = 0;

		int positive1 = 0;
		int positive2 = 0;
		int positive3 = 0;

		for (int i = 0; i < li.size(); i++) {
			int temp = li.get(i);
			if (temp < 0) {
				temp = Math.abs(temp);
				if (temp > Math.abs(negative2)) {
					if (temp > Math.abs(negative1)) {
						negative2 = negative1;
						negative1 = -temp;
						continue;
					}
					negative2 = -temp;
				}

			} else {

				if (temp > positive3) {
					if (temp > positive2) {
						if (temp > positive1) {
							positive3 = positive2;
							positive2 = positive1;
							positive1 = temp;
							continue;
						}
						positive3 = positive2;
						positive2 = temp;
						continue;
					}
					positive3 = temp;
				}

			}

		}

		return Math.max(positive1 * positive2 * positive3, negative2 * negative1 * positive1);
	}

	public static void main(String[] args) {

	}

}
