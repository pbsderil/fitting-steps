package array;

import java.util.ArrayList;
import java.util.Collections;

public class HotelBookingPossible {
	  public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
		    Collections.sort(arrive);
		    Collections.sort(depart);
		    int start = arrive.get(0);
		    int end = depart.get(depart.size()-1);
		    int j=0;
		    int k=0;
		    for(int i= start ;i<=end;i++){
		    	while(j<arrive.size() && arrive.get(j) == i){
		    		K--;
		    		j++;
		    	}
		    	while(k<depart.size() && depart.get(k) == i){
		    		K++;
		    		k++;
		    	}
		    	if(K<0){
		    		return false;
		    	}
		    }
		        return true;
		    }
	  
	  public static void main(String[] args){
		  
		  ArrayList<Integer> li = new ArrayList<>();
			li.add(1);
			li.add(2);
			li.add(3);
			
			li.add(4);
			
			ArrayList<Integer> li2 = new ArrayList<>();
			li2.add(10);
			li2.add(2);
			li2.add(5+1);
			
			li2.add(14);
			HotelBookingPossible obj = new HotelBookingPossible();
		System.out.println(	obj.hotel(li, li2, 4));
	  }
}
