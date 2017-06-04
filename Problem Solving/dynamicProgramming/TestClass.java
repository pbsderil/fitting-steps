package dynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class TestClass {

	public int kanyaAndArray(int[] arr, int size, int k) {

		int[] fVal = new int[size];
		int val = 0;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arr[j] > arr[i]) {
					val++;
				}
			}
			fVal[i] = val;
			val = 0;
		}
		int pairs = 0;
		Arrays.sort(fVal);
		int j = 0;
		for (int i = size - 1; i >= 0; i--) {

			for (; j < i; j++) {
				if (fVal[i] + fVal[j] >= k) {
					pairs += (i-j);
					break;
				}
				if(j>i){
					return pairs;
				}
			}
		}
		return pairs;
	}

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		int size = scan.nextInt();
		int k = scan.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}
		TestClass obj = new TestClass();

		System.out.println(obj.kanyaAndArray(arr, size, k));

	}
}