package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

//let me try tweaking merge sort
//it failed..!!!!

public class LargestNumber {

	public String LargestNumber(ArrayList<Integer> A){ 
		
		String[] arr = new String[A.size()];
    for(int i=0; i<A.size(); i++){
        arr[i]=String.valueOf(A.get(i));
    }
 
    Arrays.sort(arr, new Comparator<String>(){
        public int compare(String a, String b){
            return (b+a).compareTo(a+b);
        }
    });
 
    StringBuilder sb = new StringBuilder();
    for(String s: arr){
        sb.append(s);
    }
 
    while(sb.charAt(0)=='0'&&sb.length()>1)
        sb.deleteCharAt(0);
 
    return sb.toString();}

		
	

	public static void main(String[] args){
		ArrayList<Integer> li = new ArrayList<>();
		li.add(3);
		li.add(30);
		li.add(34);
		
		li.add(5);
		li.add(9);
		LargestNumber obj = new LargestNumber();
		obj.LargestNumber(li);
		System.out.println(li.toString());
	}
	
}
