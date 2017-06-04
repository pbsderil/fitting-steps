package dynamicProgramming;

import java.util.ArrayList;

/// whoooo........!!!!!!!!!!!!1

public class MaxProductSubArray {

	public int maxProductSubArray(ArrayList<Integer> arr ){
		
		int max_so_far = Integer.MIN_VALUE;
	int maxEndingHere = arr.get(0);
	int minEndingHere = arr.get(0);
	
	max_so_far = maxEndingHere > max_so_far ? maxEndingHere : max_so_far;

	for ( int i = 1; i < arr.size() ; i++)	
	{
		if(arr.get(i) == 0) 
		{
			max_so_far = Math.max(max_so_far, 0);
			continue;
		}
		if(arr.get(i-1) == 0) 
		{
			maxEndingHere = minEndingHere = arr.get(i);
			max_so_far = maxEndingHere > max_so_far ? maxEndingHere : max_so_far;
			continue;
		}

		int temp = maxEndingHere;
		maxEndingHere = Math.max(Math.max(maxEndingHere * arr.get(i), minEndingHere * arr.get(i)), arr.get(i));
		minEndingHere = Math.min(Math.min( temp * arr.get(i) , minEndingHere * arr.get(i)), arr.get(i));

		max_so_far = maxEndingHere > max_so_far ? maxEndingHere : max_so_far;
	}

	
	return max_so_far;
	}
	
}
