package dynamicProgramming;

import java.util.Stack;

public class LongestValidParanthesis {
	public int longestValidParanthesis(String s) {
		int len = s.length(), maxLen = 0, last = -1;
		if (len == 0 || len == 1)
			return 0;

		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < len; i++) {
			if (s.charAt(i) == '(')
				stack.push(i);
			else {

				if (stack.isEmpty()) {
					last = i;
				} else {
					stack.pop();

					if (stack.isEmpty())
						maxLen = Math.max(maxLen, i - last);
					else

						maxLen = Math.max(maxLen, i - stack.peek());
				}
			}
		}

		return maxLen;
	}

	public static void main(String[] args) {

		LongestValidParanthesis obj = new LongestValidParanthesis();
		System.out.println(obj.longestValidParanthesis("((()"));

	}
}
