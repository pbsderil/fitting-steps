package dynamicProgramming;

import java.util.HashMap;
import java.util.Scanner;

public class MonnFrogTree {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int N =  scan.nextInt();
		HashMap<Integer,Integer> hm = new HashMap<>();
		int minOpr = 0;
		for(int i=1;i<N;i++){
			int temp = scan.nextInt();
			int dummy = scan.nextInt();
			if(!hm.containsKey(temp) ){
				hm.put(temp, 1);
				minOpr ++;
			}else{
				if(temp !=1){
					minOpr ++;
				}else if(hm.get(1) ==1){
					hm.put(1,2);
				}else{
					minOpr ++;
				}
			
			}
			
		}
		System.out.println(minOpr);
	}

}
