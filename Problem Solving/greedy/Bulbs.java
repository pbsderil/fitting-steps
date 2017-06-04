package greedy;

import java.util.ArrayList;

public class Bulbs {
	
	public int compute(ArrayList<Integer> li){
		int count=0;
		int position = 0 ;
		
		for(int i=0;i<li.size();i++){
			
			if(li.get(i) == position){
				count++;
				position = 1-position;
			}
			
		}
		
		return count;
	}

	public static void main(String[] args) {
		
	Bulbs obj = new Bulbs();
	
	ArrayList<Integer> li = new ArrayList<>();
	System.out.println(obj.compute( li ));

	}

}
