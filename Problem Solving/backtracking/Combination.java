package interviewbit.backtracking;

import java.util.ArrayList;

public class Combination {
	
	 int[] helper ;
     
	
    private void mergesort(int low, int high,int[] arr) {
    	helper = new int[arr.length];
    // check if low is smaller then high, if not then the array is sorted
    if (low < high) {
      // Get the index of the element which is in the middle
      int middle = low + (high - low) / 2;
      // Sort the left side of the array
      mergesort(low, middle,arr);
      // Sort the right side of the array
      mergesort(middle + 1, high,arr);
      // Combine them both
      merge(low, middle, high,arr);
    }
  }
    
      private void merge(int low, int middle, int high,int[] arr) {

    // Copy both parts into the helper array
    for (int i = low; i <= high; i++) {
      helper[i] = arr[i];
   
    }

    int i = low;
    int j = middle + 1;
    int k = low;
    // Copy the smallest values from either the left or the right side back
    // to the original array
    while (i <= middle && j <= high) {
      if (helper[i] <= helper[j]) {
        arr[k] = helper[i];
     
        i++;
      } else {
         arr[k] = helper[j];
      
        j++;
      }
      k++;
    }
    // Copy the rest of the left side of the array into the target array
    while (i <= middle) {
      arr[k] = helper[i];
 
      k++;
      i++;
    }

  }
	
	private void combine(int[] arr, int[] temp,int start,int end,int index,int r){
		if(index == r){
			System.out.println(temp.toString());
			return;
		}
		for(int i=start;i<end && end-i>= r-index;i++){
			temp[index] = arr[i];
			combine(arr,temp,i+1,end,index+1,r);
		}
		
	}

	public static void main(String[] args) {
		
		int[] input = {4,3,2,1};
		
		new Combination().mergesort(0, input.length-1, input);
		
		int[] temp = new int[2];
		new Combination().combine(input, temp, 0, input.length, 0, 2);

	}

}
