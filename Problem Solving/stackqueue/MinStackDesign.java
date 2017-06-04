package interviewbit.stackqueue;

import java.util.ArrayList;
import java.util.Stack;

public class MinStackDesign {
	int top =0;


	ArrayList<Integer> li =new ArrayList<Integer>();
	Stack<Integer> stk = new Stack<Integer>();;
    public void push(int x) {
        
        
        if(li.isEmpty()){
        	li.add(x);
        	top ++;
        
        	stk.push(x);
        	
        }else{
        	li.add(x);
        	if(x<stk.peek().intValue()){
        		stk.push(x);
        	}else{
        		int temp = stk.peek();
        		stk.push(temp);
        	}
        }
       
    }

    public void pop() {
    	if(!li.isEmpty()){
        li.remove(top-1);
    	top--;
    	stk.pop();
    	}
    }

    public int top() {
    	if(li.isEmpty())
    		return -1;
		return li.get(top-1);
        
    }

    public int getMin() {
    	if(stk.isEmpty()){
    		return -1;
    	}
		return stk.peek();
        
    }

}
