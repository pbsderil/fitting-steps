package dynamicProgramming;

import java.util.ArrayList;

import java.util.HashSet;

// From Geeks for Geeks
public class WordBreakOptimized {

	public boolean wordBreak(String a, ArrayList<String> b) {

		HashSet<String> hs = new HashSet<>();

		for (int i = 0; i < b.size(); i++) {
			hs.add(b.get(i));
		}

		/*
		 * HashMap<String, String> dp = new HashMap<String, String>();
		 */

		String[] dp = new String[a.length() + 1];
		boolean result = compute(a, hs, dp, 0);
				
		return result;
	}
	
	public boolean check (String a, HashSet<String> hs){
	    if(hs.contains(a)){
	        return true;
	    }else{
	        return false;
	    }
	}

	private boolean compute(String a, HashSet<String> hs, String[] dp, int index) {

		int size = a.length();

		if (size - index == 0) {
			return true;
		}
		if (dp[index] == "true") {
			return true;
		}
		if (dp[index] == "false") {
			return false;
		}
		for (int i = index + 1; i <= size; i++) {

			if (check(a.substring(index, i),hs)) {

				if (check(a.substring(i),hs)) {
					dp[i] = "true";
					dp[index] = "true";
					return true;
				}
				if (dp[i] == "false") {
					continue;
				}
				if (dp[i] == "true") {
					return true;
				}

				dp[i] = compute(a, hs, dp, i) ? "true" : "false";
				if (dp[i] == "true") {
					dp[index] = "true";
					return true;

				}
			}
		}

		return false;
	}

	/*
	 * //Bottom up approach ''.... TLE :(:(
	 * 
	 * private boolean compute(String a, HashSet<String> hs, boolean[] dp) {
	 * 
	 * if(a.length() == 0 ){ return true; }
	 * 
	 * int size = a.length(); for(int i = 1 ; i<=size;i++){ if(dp[i] == false){
	 * if(hs.contains(a.substring(0,i))){ dp[i] = true; } }
	 * 
	 * if(dp[i] ){
	 * 
	 * if(i == size){ return true; }
	 * 
	 * 
	 * for(int j=i+1;j<=size;j++){ if(dp[j]==false &&
	 * hs.contains(a.substring(i,j))){ dp[j] = true;
	 * 
	 * } if(j == size && dp[j] == true){ return true; } }
	 * 
	 * 
	 * } }
	 * 
	 * return false; }
	 */

	// memoized version.....failed because of stackoverflow exception coz of the
	// large two dimensional array size
	/*
	 * public boolean compute (String input,HashSet<String>
	 * hs,HashMap<String,String> dp ,int start ,int end){ int size =
	 * input.length(); if(size == 0 ){ return true; } if(dp.get((start+","+end))
	 * == "true"){ return true; } if(dp.get((start+","+end)) == "false"){ return
	 * false; }
	 * 
	 * for(int i = 1 ;i<=size;i++){ dp.put((start+0)+","+(start+i-1),
	 * hs.contains(input.substring(0,i))?"true":"false");
	 * dp.put((start+i)+","+(start+size-1) ,compute(input.substring(i,size),hs,
	 * dp ,start+i,start+size-1)?"true":"false");
	 * 
	 * if((dp.get((start+0)+","+(start+i-1)) == "true" &&
	 * dp.get((start+i)+","+(start+size-1))=="true")){ return true; } }
	 * 
	 * return false; }
	 */

	public static void main(String[] args) {

		WordBreakOptimized obj = new WordBreakOptimized();
		ArrayList<String> b = new ArrayList<>();
		b.add("ab");
		b.add("der");
		b.add("d");
		b.add("il");

		b.add("a");
		String c = "aderil";

		System.out.println(obj.wordBreak(c, b));
		/*
		 * HashSet<String> hs = new HashSet<>(); hs.add("deril123");
		 * if(hs.contains("deril"+(100+23))){ System.out.println("hi"); }
		 */

	}

}
