package array;

import java.util.ArrayList;
import java.util.Scanner;

public class RepeatAndMissingNumber {
	
	public String repeatAndMissingNumber(ArrayList<Integer> li){
			ArrayList<Integer > b =new ArrayList<>();
			
		b.addAll(li);
		int size = li.size();
		
		if(size <2 ){
			return "";
		}
		
		long sum = 0;
		long originalSum =0;
		
		int culprit = 0;
		int index = li.get(0);
		
		int i=1;
		
		int maxIntValCount = 0;
		
		while(i<=size){
		
			int temp = Math.abs(li.get(i-1));
			
			if(li.get(temp-1)<0){
				culprit = temp;
				
				
			}
			
			
			li.set(temp-1, -li.get(temp-1));
						
			sum+=temp;
	
			originalSum+=i;
		
			i++;
		}
			long deceased = sum>originalSum? culprit-(sum-originalSum):culprit+(originalSum-sum);
		
		
		return culprit+" "+ deceased;
	}

	public static void main(String[] args) {
	 Scanner scan =new Scanner(System.in);
	 int n = scan.nextInt();
	 
	 ArrayList<Integer> li = new ArrayList<>(n);
	 
	 for(int i=0;i<n;i++){
		 li.add(scan.nextInt());
	 }

	 RepeatAndMissingNumber obj = new RepeatAndMissingNumber();
	 System.out.println(obj.repeatAndMissingNumber(li));

	}

}
