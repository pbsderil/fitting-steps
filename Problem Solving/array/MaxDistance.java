package array;

import java.util.ArrayList;

public class MaxDistance {

	public static void main(String[] args) {
		ArrayList<Integer> li =  new ArrayList<>();
		li.add(3);
		li.add(5);
		li.add(4);
		li.add(2);
		
		int n = li.size();
	
		int[] min = new int[n];
		int[] max = new int[n];
		
		min[0] = li.get(0);
		max[n-1] = li.get(n-1);
		for(int i=1;i<n;i++){
			min[i] = Math.min(min[i-1], li.get(i));
			max[n-i-1] = Math.max(max[n-i], li.get(n-i-1));
		}
		
		int i=0,j=0;
		int maxDistance = -1;
		while(i<n&&j<n){
			if(min[i]<=max[j]){
				maxDistance = Math.max(maxDistance, j-i);
				j++;
			}else{
				i++;
			}
		}
		System.out.println(maxDistance);
	}

}
	
