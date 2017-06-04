package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubstringConcatenation {
	HashMap<String, Integer> hm = new HashMap<String, Integer>();

	HashMap<String, Integer> reference = new HashMap<String, Integer>();

	public boolean check(String a, final List<String> b, int startPoint) {

		if(startPoint == 5+1){
			System.out.println("HI");
		}
		
		int length = a.length();
		int wordLength = b.get(0).length();
		int count = 0;
		int start = 0;
		int nextStart = 0;
		boolean continuity = false;

		for (int i = startPoint; i < length; ) {
			String temp = "";
			if (i + wordLength <= length)
				temp = a.substring(i, i + wordLength);
			if (hm.containsKey(temp)) {

				if (hm.get(temp) < reference.get(temp)) {
					continuity = true;
					hm.put(temp, hm.get(temp) + 1);
					count++;
					if (count == 1) {
						start = i;
					}
					if (count == 2) {
						nextStart = i;
					}
					i = i + wordLength;
				} else {
					continuity = false;
					for (int j = 0; j < b.size(); j++) {
						hm.put(b.get(j), 0);
					}
					return false;

				}
			
				if (count == b.size()) {
				/*	res.add(start);
					count = 0;
					continuity = false;
					for (int j = 0; j < b.size(); j++) {
						hm.put(b.get(j), 0);
					}
					i = nextStart;*/
					for (int j = 0; j < b.size(); j++) {
						hm.put(b.get(j), 0);
					}
					return true;
				}
			} else {

					for (int j = 0; j < b.size(); j++) {
						hm.put(b.get(j), 0);
					}

					return false;
					
				
			}
		}
		for (int j = 0; j < b.size(); j++) {
			hm.put(b.get(j), 0);
		}
		return false;
	}

	public ArrayList<Integer> findSubstring(String a, final List<String> b) {

		if (a.length() == 0 || b.size() == 0) {
			return null;
		}

		int length = a.length();
		int wordLength = b.get(0).length();

		for (int i = 0; i < b.size(); i++) {
			if (reference.containsKey(b.get(i))) {
				reference.put(b.get(i), reference.get(b.get(i)) + 1);
			} else {
				reference.put(b.get(i), 1);
			}

			hm.put(b.get(i), 0);
		}
		ArrayList<Integer> res = new ArrayList<Integer>();
		for (int i = 0; i < length; i++) {
			String temp="";
			if(i + wordLength<=length)
			temp = a.substring(i, i + wordLength);
			if(hm.containsKey(temp)){
				boolean flag = check(a,b,i);
				if(flag){
					res.add(i);
				}
			}
		}

		

		return res;
	}

	public static void main(String[] args) {

		SubstringConcatenation obj = new SubstringConcatenation();
		ArrayList<String> li = new ArrayList<String>();
		
		
		li.add("c");
		li.add("b");
		li.add("a");
		li.add("c");
		li.add("a");
		li.add("a");
		li.add("a");
		li.add("b");
		li.add("c");
		
		obj.findSubstring("bcabbcaabbccacacbabccacaababcbb", li);

	}

}
