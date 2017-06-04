package interviewbit.linkedList;

public class SwapListNodesInPairs {
	
	private ListNode swap (ListNode a){
		
		ListNode dummy = new ListNode(0);
		
		ListNode temp = new ListNode(0);
		
		ListNode prev = new ListNode(0);
		dummy.next = prev;
		
		while(a != null){
		temp.val = 0;
		temp.next = null;
			temp = a.next;
			a.next = a.next.next;
			temp.next = a;
			prev.val = temp.val;
			prev.next = temp.next;
			prev.next.val = temp.next.val;
			
			prev = prev.next.next;
			
			if(a.next !=null){
				
					a = a.next;
				}else{
					break;
				}
				
			
			
		}
		
		return null;
	}

	public static void main(String[] args) {
		
		   ListNode a = new ListNode(1);
		
		  a.next = new ListNode(2);
		   a.next.next = new ListNode(3);
		   a.next.next.next = new ListNode(4);
		   a.next.next.next.next = new ListNode(5);
		   a.next.next.next.next.next = new ListNode(6);
		   
		   SwapListNodesInPairs obj = new SwapListNodesInPairs();
		   obj.swap(a);

	}

}
