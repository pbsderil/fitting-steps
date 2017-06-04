package dynamicProgramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

// From Geeks for Geeks
public class WordBreakII {
	
	public boolean wordBreak(String a, ArrayList<String> b) {
		
		HashSet<String> hs  = new HashSet<>();
		
		for(int i= 0 ;i<b.size();i++){
			hs.add(b.get(i));
		}
		
		
		HashMap<String, String> dp = new HashMap<String, String>();
		
	/*	boolean[] dp = new boolean[a.length()+1];*/
		
	    return /*compute(a,hs,dp, 0, a.length()-1)*/ true;
	}
	

	
	//memoized version.....failed because of stackoverflow exception 
	/*public boolean compute (String input,HashSet<String> hs,HashMap<String,String> dp ,int start ,int end){
		int size = input.length();
		if(size == 0 ){
			return true;
		}
		if(dp.get((start+","+end)) == "true"){
			return true;
		}
		if(dp.get((start+","+end)) == "false"){
			return false;
		}
		
		for(int i = 1 ;i<=size;i++){
			dp.put((start+0)+","+(start+i-1), hs.contains(input.substring(0,i))?"true":"false");
			dp.put((start+i)+","+(start+size-1) ,compute(input.substring(i,size),hs, dp ,start+i,start+size-1)?"true":"false");
			
			if((dp.get((start+0)+","+(start+i-1)) == "true" && dp.get((start+i)+","+(start+size-1))=="true")){
				return true;
			}
		}
		
		return false;
	}
	*/


	public static void main(String[] args){
		
		WordBreakII obj = new WordBreakII();
		ArrayList<String> b = new ArrayList<>();
		b.add("a");
		b.add("deril");
		b.add("pbs");
		b.add("in");
		b.add("a");
	String c = "aderilpbsin";
	
		System.out.println(obj.wordBreak(c,b));

	}
	
}
