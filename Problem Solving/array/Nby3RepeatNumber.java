package array;
//Great Logic

import java.util.ArrayList;
import java.util.Scanner;

public class Nby3RepeatNumber {

	public Integer compute(ArrayList<Integer> li) {

		int holder1 = 0, holder2 = 0;
		int counter1 = 0, counter2 = 0;

		for (int i = 0; i < li.size(); i++) {
			if (holder1 == li.get(i)) {
				counter1++;
				continue;
			} else if (holder2 == li.get(i)) {
				counter2++;
				continue;
			} else {
				if (counter1 == 0) {
					holder1 = li.get(i);
					counter1 = 1;
				} else if (counter2 == 0) {
					holder2 = li.get(i);
					counter2 = 1;
				} else {
					counter1--;
					counter2--;
				}			
				
				
			}
		
		}

		if (counter1 == 0 && counter2 == 0) {
			return -1;
		}
		counter1 = counter2 = 0;
		for (int i = 0; i < li.size(); i++) {
			if (li.get(i) == holder1) {
				counter1++;
			} else if (li.get(i) == holder2) {
				counter2++;
			}

		}
		
		if(counter1 >  li.size()/3 ){
			return holder1;
		}else if  (counter2 >  li.size()/3){
			return holder2;
		}else{
			return -1;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<Integer> li = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			li.add(scan.nextInt());
		}

		Nby3RepeatNumber obj = new Nby3RepeatNumber();
		System.out.println(obj.compute(li));

	}

}
