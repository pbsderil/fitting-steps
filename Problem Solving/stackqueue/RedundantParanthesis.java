package interviewbit.stackqueue;

import java.util.Stack;

public class RedundantParanthesis {

	public int redundantCheck(String a){
		int length = a.length();
		Stack<Character> stk = new Stack<Character>();
		for(int i=0;i<length;i++){
			char temp = a.charAt(i);
			if(temp==')'){
				int count=0;
				while(stk.peek() != '('){
					stk.pop();
					count++;
				}
				stk.pop();
				if(count<2){  //check if the set has more than one character
					return 1;
				}
			}else
			{
				stk.push(temp);
			}
		}
		while(!stk.isEmpty()){
			if(stk.peek() == '(' || stk.peek() == ')'){
				return 1;
				
			}
			stk.pop();
		}
		return 0;
	}
	
	public static void main(String[] args) {
	

	}

}
