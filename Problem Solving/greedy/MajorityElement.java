package greedy;

import java.util.ArrayList;
import java.util.Scanner;

public class MajorityElement {
	
	public int compute (ArrayList<Integer> input){
		
		int elementIndex =0,count=0;
		
		for(int i=0;i<input.size();i++){
		
			if(input.get(i).intValue() == input.get(elementIndex).intValue() ){
				count++;
			}else{
				count--;
			}
			if(count==0){
				count=1;
				elementIndex = i;
			}
		}
	
		return input.get(elementIndex);
		
	
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<Integer> input = new ArrayList<>(n);
		for(int i=0;i<n;i++){
			input.add(scan.nextInt());
		}
		
		MajorityElement obj = new MajorityElement();
		System.out.println(obj.compute(input));

	}

}
