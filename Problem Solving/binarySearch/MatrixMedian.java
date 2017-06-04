package binarySearch;

import java.util.ArrayList;

public class MatrixMedian {
	
	public int compute(ArrayList<ArrayList<Integer>> arr){
		
		int row = arr.size();
		int col = arr.get(0).size();
		
		int i = 0 ;
		int j = 0 ;
		int k = 0;
		
		for(i= 0 ;i<row-1;){
			for(j= 0, k=0 ;j<col&&k<col;){
				if(arr.get(i).get(j).intValue() > arr.get(i+1).get(k).intValue() ){
					int temp = arr.get(i).get(j).intValue();
					arr.get(i).set(j,arr.get(i+1).get(k).intValue());
					arr.get(i).set(k,temp);
					j++;
				}else if(arr.get(i).get(j).intValue() < arr.get(i+1).get(k).intValue()){
				k++;
				}
			}
			
			
		}
		
		return 0;
	}

	public static void main(String[] args) {
		
float a = 0f;
a = (float)11/2;
System.out.println(a);
	}

}
