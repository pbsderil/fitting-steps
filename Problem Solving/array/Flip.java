package array;

import java.util.Scanner;

public class Flip {

	public void compute(String binaryString) {

		int length = binaryString.length();

		int MaxContZerosStart = -1;
		int MaxContZerosEnd = -1;

		int tempContZerosStart = -1;
		
		
		
		int countZero = 0 ;
		int start = -1;
		

		for (int i = 0; i < length; i++) {
			char temp = binaryString.charAt(i);

			if (temp == '0') {
				if (tempContZerosStart == -1) {
					tempContZerosStart = i;
				}
			}else if(temp == '1'){
				if(tempContZerosStart !=-1){
					if(MaxContZerosStart==-1){
						MaxContZerosStart = tempContZerosStart;
						MaxContZerosEnd = i;
					}
					else if(MaxContZerosEnd-MaxContZerosStart+1 < i-tempContZerosStart+1){
						
						MaxContZerosStart = tempContZerosStart;
						MaxContZerosEnd = i;
					}
				}
				
				tempContZerosStart = -1;
			}
			
			
			if(temp == 0 ){
				countZero++;
				if(countZero == 1){
					start =i;
				}
			}else{
				countZero--;
			}
			
		}

	}

	public static void main(String[] args) {

		Flip obj = new Flip();

		obj.compute(new Scanner(System.in).next());
	}

}
