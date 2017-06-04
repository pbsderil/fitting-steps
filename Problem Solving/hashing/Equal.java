package hashing;

import java.util.ArrayList;
import java.util.HashMap;

/*Given an array A of integers,
find the index of values that satisfy A + B = C + D, 
where A,B,C & D are integers values in the array*/

public class Equal {

	public ArrayList<Integer> equal(ArrayList<Integer> arr) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		ArrayList<Integer> li = new ArrayList<Integer>();

	
		int a, b, c, d, size = arr.size();
		for (a = 0; a < size; a++) {
			for (b = a + 1; b < size; b++) {
				int temp = arr.get(a) + arr.get(b);
				if (hm.containsKey(temp)) {
					String check = hm.get(temp);
					String[] checky = check.split(",");
					 
					
					if (!checky[1].equals(a + "") && !checky[1].equals( b + "") && Integer.parseInt(checky[0])<a) {
					
						if(li.isEmpty()){
						li.add(Integer.parseInt(checky[0]));
						li.add(Integer.parseInt(checky[1]));
						li.add(a);
						li.add(b);
						}else{
							if(Integer.parseInt(checky[0])<li.get(0)){
								li.set(0,Integer.parseInt(hm.get(temp).split(",")[0]));
								
								li.set(1,Integer.parseInt(checky[1]));
								li.set(2,a);
								li.set(3,b);
								continue;
							}
							else if(Integer.parseInt(checky[0])==li.get(0)){
								if(Integer.parseInt(checky[1])<li.get(1)){
									li.set(1,Integer.parseInt(checky[1]));
									li.set(2,a);
									li.set(3,b);
									continue;
								}else if(Integer.parseInt(checky[1])==li.get(1)){
									if(a<li.get(2)){
										li.set(2,a);
										li.set(3,b);
										continue;
									}else if(a==li.get(2)){
										if(b<li.get(3)){
											li.set(3,b);
											continue;
										}
									}
								}
								
							}
							
						}
																
					}
				
				}else{
					hm.put(arr.get(a)+arr.get(b), a+","+b);
				}
			}
		}

		/*
		 * 
		 * //This is a basic solution without hashing
		 * 
		 * ArrayList<Integer> li = new ArrayList<Integer>(); int a,b,c,d,size =
		 * arr.size();
		 * 
		 * for(a=0;a<size;a++){ for(b=a+1;b<size;b++){ for(c=a+1;c<size;c++){
		 * 
		 * for(d=c+1;d<size;d++){ if(arr.get(a)+arr.get(b) ==
		 * arr.get(c)+arr.get(d)){ if(b != d && b !=c){ li.add(a); li.add(b);
		 * li.add(c); li.add(d); return li; } } } } } }
		 * 
		 */
		
	
			return li;
	
	}

	public static void main(String[] args) {

		Equal obj = new Equal();
		ArrayList<Integer> li = new ArrayList<Integer>();
	
		li.add(1);
		li.add(1);
		li.add(1);
		li.add(1);
	/*	li.add(3);
		li.add(2);
		li.add(2);*/
		obj.equal(li);
	}

}
