package interviewbit.linkedList;

public class LinkedListIntersection {

	public ListNode getIntersectionNode(ListNode a, ListNode b) {
		  if((a==null) || (b==null)){
		       return null;
		   }
		
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
		
		
		
		int i=0;
		
		temp = a;
		
		temp2 = b;
		
		
		if(count > count2){
			i = count-count2;
		
			while(i>0){
				temp=temp.next;
				i--;
			}
			i= count2;
		}else{
			i = count2-count;
		
			while(i>0){
				temp2=temp2.next;
				i--;
			}
			i= count;
		}
	
		for(;i>0;i--){
		    
		    if(i==1){
		        	if((temp.next)==(temp2.next) && (temp).equals(temp2) ){ 
		        	                                                          
		
				return temp;
			}
		    }else
	
			if((temp.next).equals(temp2.next) && (temp).equals(temp2)){
		
				return temp;
			}
			else{
				temp = temp.next;
				temp2 = temp2.next;
			}
		}
	
	
		
		return null;
	}
	
	public static void main(String[] args) {
	   
	   ListNode a = new ListNode(1);
	
	   
	   a.next = new ListNode(5);
	   a.next.next = new ListNode(2);
	   a.next.next.next = new ListNode(3);
	  /* a.next.next.next.next = new ListNode(3);*/
	  /* a.next.next.next.next.next = new ListNode(3);*/
	   
	   ListNode b = a.next;
	
	
	   
	   LinkedListIntersection obj = new LinkedListIntersection();
	   System.out.println(obj.getIntersectionNode(a, b).val);
	   
	   
	}

}
