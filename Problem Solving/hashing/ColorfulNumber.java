package hashing;

import java.util.HashMap;
import java.util.Hashtable;

public class ColorfulNumber {

	HashMap<Integer, String> hm = new HashMap<Integer, String>();
	int check = 1;
	Hashtable resultSet = new Hashtable();
	int i = 0;
	String toBeAdded = "";

	public void genSS(String s)

	{
		int length = s.length();

		for (int c = 0; c < length; c++) {
			for (int i = 1; i <= length - c; i++) {
				String temp = s.substring(c, c + i);
				int hash = 1;
				for (int k = 0; k < temp.length(); k++) {
					hash *= Character.getNumericValue(temp.charAt(k));
				}

				if (hm.containsKey(hash)) {
					check = 0;
					return;
				}
				hm.put(hash, temp);

			}
		}
	}

	public int colorful(int a) {
		String input = a + "";
		genSS(input);

		return check;
	}

	public static void main(String[] args) {

		ColorfulNumber obj = new ColorfulNumber();
		System.out.println(obj.colorful(111));

	}

}
