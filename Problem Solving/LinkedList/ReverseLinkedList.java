package interviewbit.linkedList;

public class ReverseLinkedList {
	private ListNode reverse(ListNode a){
		ListNode dummy ,prev,temp;
		dummy=a;
		prev = null;
		if(dummy==null){
			return null;
		}
		
		while(dummy != null){
		
	temp = dummy.next;
	dummy.next = prev;
	prev = dummy;
	dummy = temp;
		}
		
		
		
		return prev;
	}

	public static void main(String[] args) {
		
		 ListNode a = new ListNode(1);
		   a.next = new ListNode(2);
		   a.next.next = new ListNode(3);
	
		   
		   ReverseLinkedList obj = new ReverseLinkedList();
		   obj.reverse(a);
	}

}
