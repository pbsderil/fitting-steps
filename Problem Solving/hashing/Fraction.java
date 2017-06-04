package hashing;

import java.util.HashMap;

/*Given two integers representing the numerator and denominator of a fraction, 
return the fraction in string format.

If the fractional part is repeating, enclose the repeating part in parentheses*/

// A great catch --- storing the reminder in hashmap :)

public class Fraction {

	public String fractionToDecimal(int num, int den) {

		long numerator = num;
		long denominator = den;

		if (denominator == 0 || numerator == 0) {
			return "0";
		}
		String sign = "";
		if (numerator < 0 && denominator < 0) {

		} else if (numerator >= 0 && denominator > 0) {

		} else {
			sign = "-";
		}

		numerator = Math.abs(numerator);
		denominator = Math.abs(denominator);

		long intPart = (numerator / denominator);
		long remainder = (numerator % denominator);

		String decimal = "";

		if (remainder == 0) {
			return sign + "" + intPart + "";
		}

		HashMap<Long, Integer> hm = new HashMap<Long, Integer>();
		int i = 0;
		while (remainder > 0) {
			remainder *= 10;
			if (remainder >= denominator) {
				long temp = remainder / denominator;

				if (hm.containsKey(remainder)) {

					decimal = decimal.substring(0, hm.get(remainder)) + "("
							+ decimal.substring(hm.get(remainder), decimal.length()) + ")";
					break;
				} else {
					decimal += (temp);
					hm.put(remainder, i);
				}

			} else {
				if (hm.containsKey(remainder)) {

					decimal = decimal.substring(0, hm.get(remainder)) + "("
							+ decimal.substring(hm.get(remainder), decimal.length()) + ")";
					break;
				}else{
				hm.put(remainder, i);
				decimal += "0";}
			}
			remainder = remainder % denominator;
			i++;
		}

		return sign + "" + intPart + "." + decimal;
	}

	public static void main(String[] args) {

		Fraction obj = new Fraction();
		System.out.println(obj.fractionToDecimal(857, 413));

	}

}

/*
 * test cases A : -1 B : -2147483648
 * 
 * EXPECTED : 0.0000000004656612873077392578125
 * 
 * A : 593 B : 88
 * 
 * ans : 6.738(63)
 * 
 * 
 * A : 857 B : 413
 * 
 * ans: 2.(
 * 075060532687651331719128329297820823244552058111380145278450363196125907990314769975786924939467312348668280871670702179176755447941888619854721549636803874092009685230024213)
 *
 *
 *
 */
