package hashing;

import java.util.HashMap;

/*Given a string S and a string T, 
find the minimum window in S which will contain all the characters in T in linear time complexity.
Note that when the count of a character C in T is N, 
then the count of C in minimum window in S should be atleast N.*/

public class WindowString {
	public String minWindow(String S, String T) {

		if (S.length() == 0 || T.length() == 0) {
			return "";
		}

		HashMap<Character, Integer> hm = new HashMap();
		HashMap<Character, Integer> hmTemp = new HashMap();

		int checkStringLength = T.length();

		for (int i = 0; i < checkStringLength; i++) {
			if (hm.containsKey(T.charAt(i))) {
				hm.put(T.charAt(i), hm.get(T.charAt(i)) + 1);
			} else
				hm.put(T.charAt(i), 1);

		}
		int count = 0;
		int nextStart = 0;

		int start = 0;

		String result = "";
		for (int i = 0; i < S.length(); i++) {
			char temp = S.charAt(i);

			if (hm.containsKey(temp)) {
				if (count == 0) {
					start = i;
				}
				if (hmTemp.containsKey(temp)) {
					if (hmTemp.get(temp).intValue() < hm.get(temp).intValue()) {
						hmTemp.put(temp, hmTemp.get(temp) + 1);
						count++;
					}
				} else {
					hmTemp.put(temp, 1);
					count++;
				}
			}
			if (count == checkStringLength) {
				if (result.length() > S.substring(start, i + 1).length() || result.length() == 0) {
					result = S.substring(start, i + 1);
				}
				hmTemp.clear();
			
			
				count = 0;

			}
		}

		return result;
	}

	public static void main(String[] args) {
		WindowString obj = new WindowString();
		obj.minWindow("AAAAAA", "AA");

	}

}
