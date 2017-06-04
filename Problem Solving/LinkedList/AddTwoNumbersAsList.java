package interviewbit.linkedList;

public class AddTwoNumbersAsList {
	
	private ListNode AddNumbers(ListNode a, ListNode b){
		
		   int count =0;
		   int count2 = 0;
		   
		   ListNode temp = a;

		   
			do{
		    	count ++;
		    	temp = temp.next;
		    }while (temp != null);
			
			   ListNode temp2 = b;
			 
			
			do{
		    	count2 ++;
		    	temp2 = temp2.next;
		    }while (temp2 != null);
			
			ListNode result = new ListNode(0);
			
			int carry=0;
			int sum =0;
			ListNode prev =new ListNode(0);
			 result.next = prev;
			while(count >0 && count2 >0){
				sum = (a.val+b.val +carry)%10; 
				carry = (a.val+b.val +carry)/10;
				
			
			prev.val = sum;
			if(count ==1 && count2 ==1){
				prev.next = null;
				
				
			}else{
			prev.next = new ListNode(0);;
			
			prev = prev.next;
		
			}
				a = a.next;
				b=b.next;
			
				count--;
				count2--;
			
			}
			
			while(count>0){
				sum = (a.val +carry)%10; 
				carry = (a.val +carry)/10;
				
			
			prev.val = sum;
			
			if(count ==1 ){
				prev.next = null;
			
			}else{
			
			prev.next = new ListNode(0);;
			
			prev = prev.next;
		
			}a = a.next;
				
				count--;
			
			}
			
	while(count2>0){
		sum = (b.val +carry)%10; 
		carry = (b.val +carry)/10;
		
	
	prev.val = sum;
	
	if(count2 ==1){
		prev.next = null;
	
	}else{
	
	prev.next = new ListNode(0);;
	
	prev = prev.next;
	}
	
	b = b.next;
		count2--;
	
			}
	
		prev = null;
		result = result.next;
		return result;
	}

	public static void main(String[] args) {
	
		
		   ListNode a = new ListNode(2);
		   a.next = new ListNode(4);
		   a.next.next = new ListNode(3);
		
		  
		   
		   
		   ListNode b = new ListNode(5);
		   b.next = new ListNode(5+1);  // no.six not working in keyboard :P
		   b.next.next = new ListNode(4);

		   AddTwoNumbersAsList obj = new AddTwoNumbersAsList();
		   obj.AddNumbers(a, b);
		   
	}

}
