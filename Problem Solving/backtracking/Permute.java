package interviewbit.backtracking;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class Permute {

	public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> a) {
	    
	     ArrayList<ArrayList<Integer>> result = new  ArrayList<ArrayList<Integer>>();
	     arrange(a,a.size(),result);
	     return result;
	    
	}
	
	private void arrange(ArrayList<Integer> a,int n,ArrayList<ArrayList<Integer>> result){
	    if(n==1){
	        System.out.println(a.toString());
	        ArrayList<Integer> temp = new ArrayList<>(a);
	        result.add(temp);
	    }
	    else{
	        for(int i=0;i<n;i++){
	            arrange(a,n-1,result);
	            if(n%2==0){
	                swap(i,n-1,a);
	            }else{
	                swap(0,n-1,a);
	            }
	          
	        }
	    }
	    
	}
		private void swap(int a,int b,ArrayList<Integer> arr){
		    int temp = arr.get(a);
		    arr.set(a,arr.get(b));
		    arr.set(b,temp);
		}
		
		public static void main(String[] args){
			HashSet<Integer> hs = new HashSet<>();
			
			Permute obj = new Permute();
			ArrayList<Integer> input = new ArrayList<Integer>();
			input.add(1);
			input.add(2);
			input.add(3);
			input.add(4);
			obj.permute(input);
		}
	

}
