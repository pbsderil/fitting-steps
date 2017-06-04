package interviewbit.stackqueue;

import java.util.ArrayList;
import java.util.Stack;

public class RPNreverse {

	public int evalRPN(ArrayList<String> a) {
		
		Stack<String> stk = new Stack<String>();
		int length = a.size();
		for(int i=0;i<length ;i++){
			String temp = a.get(i);
			if(temp.equals("+")|| temp.equals("-") || temp.equals("*") || temp.equals("/")){
			String operand2 =	stk.peek();
			stk.pop();
			String operand1 =	stk.peek();
			stk.pop();
			
			String temp1 = "("+operand1+temp+operand2+")";
			
			if(temp.equals("+")){
				temp1 = (Integer.parseInt(operand1)+Integer.parseInt(operand2))+"";
			}
			if(temp.equals("-")){
				temp1 = (Integer.parseInt(operand1)-Integer.parseInt(operand2))+"";
			}
			if(temp.equals("*")){
				temp1 = (Integer.parseInt(operand1)*Integer.parseInt(operand2))+"";
			}
			if(temp.equals("/")){
				temp1 = (Integer.parseInt(operand1)/Integer.parseInt(operand2))+"";
			}
			
			stk.push(temp1);
			}else{
				stk.push(temp);
			}
		}
		
		
		return Integer.parseInt(stk.elementAt(0));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RPNreverse obj = new RPNreverse();
		ArrayList<String> li = new ArrayList<String>();
	
		li.add("4");
		li.add("13");
		li.add("5");
		li.add("/");
		li.add("+");
	/*	li.add("d");
		li.add("e");
		li.add("-");
		li.add("f");
		li.add("g");
		li.add("-");
		li.add("h");
		li.add("+");
		li.add("/");
		li.add("*");*/
obj.evalRPN(li);
	}

}
