package greedy;

import java.util.ArrayList;
import java.util.Scanner;

public class GasStation {		
	

	public static void main(String[] args) {
		
	
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<Integer> gas = new ArrayList<>(n);
		ArrayList<Integer> cost = new ArrayList<>(n);
		for(int i=0;i<n;i++){
			gas.add(scan.nextInt());
		}
		
		for(int i=0;i<n;i++){
			cost.add(scan.nextInt());
		}
		
		
		GasStation obj = new GasStation();
		System.out.println(obj.compute(gas,cost));

	}

	private int compute(ArrayList<Integer> gas, ArrayList<Integer> cost) {
		
		int sumGas = 0;
		int sumCost = 0; 
		
		int size = gas.size();
		
		for(int i=0;i<size;i++){
			sumGas+=gas.get(i);	
			sumCost+=cost.get(i);	
		}
		
		if(sumGas<sumCost){
			return -1;
		}
		int i = 0 ;
		sumGas = 0;sumCost = 0;
		
		int startingStation = 0;
		while(true){
			sumGas += gas.get(i%size);
			sumCost += cost.get(i%size);
			if(sumGas<sumCost){
				startingStation = i+1;
				sumGas = 0 ;	
				sumCost = 0;
			}
			
			if(i == size+1){
				break;
			}
			
			i++;
		}
		
		return startingStation;
	}

}
