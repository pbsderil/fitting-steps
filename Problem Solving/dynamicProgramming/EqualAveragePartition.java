package dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class EqualAveragePartition {
	
public boolean compute (Integer[] arr,float average,int index,int currSize,int sum,ArrayList<Integer> set,ArrayList<Integer> output){
	if(index ==arr.length){
		return false;
	}	
	
	if(currSize !=0)
		if((float)sum/currSize == average ){
			output.addAll(set);
			return true;
		}
		if(currSize == arr.length -2 ){
			return false;
		}

		
		
	
		set.add(arr[index]);
		boolean b = compute (arr, average, index+1,currSize+1,sum+arr[index],set,output);
		set.remove(set.size()-1);
		boolean a = compute (arr, average, index+1,currSize,sum,set,output);
		
		return  a||b; 
	}


	public static void main(String[] args) {	
	

		EqualAveragePartition obj = new EqualAveragePartition();
		Integer[] arr = {9, 2, 8, 13, 27, 43, 1, 15, 6, 23, 19, 49, 9, 2, 4, 22, 36, 5, 46, 5, 44, 46, 13, 46, 17 };
		
		   Arrays.sort(arr);
		   
		int sum  = 0;
		for(int i=0;i<arr.length;i++){
			sum += arr[i];
		}
		
		float average = (float)sum/arr.length;
		
		ArrayList<Integer> set=  new ArrayList<>();
		ArrayList<Integer> output=  new ArrayList<>();
		
		
		
		System.out.println(obj.compute(arr,average,0,0,0,set,output));
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		
		ArrayList<Integer> output2=  new ArrayList<>();
		for(int i = 0 ;i <output.size();i++){
			//reverse the list
			output2 .add(output.get(output.size()-1-i).intValue());
			
			if(hm.containsKey(output.get(i).intValue())){
				hm.put(output.get(i) , hm.get(output.get(i).intValue())+1);
			}else{
				hm.put(output.get(i), 1);
			}
			
		}
		ArrayList<Integer> output3=  new ArrayList<>();
		for(int i = 0 ;i <arr.length;i++){
			if(hm.containsKey(arr[i].intValue())){
				if(hm.get(arr[i]) == 1){
					hm.remove(arr[i]);
				}else{
					hm.put(arr[i], hm.get(arr[i])-1);
				}
			}else{
				output3.add(arr[i]);
			}
		}

	}

}
