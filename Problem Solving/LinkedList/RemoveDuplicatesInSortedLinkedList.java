package interviewbit.linkedList;

import java.util.Scanner;

public class RemoveDuplicatesInSortedLinkedList {
	
	public ListNode removeDuplicatesInSortedLinkedList(ListNode li){
		
		ListNode out = new ListNode(li.val);
		ListNode outHead = out;
		
		li = li.next;
		
		
		
		boolean duplicateFound = false;
		
		
		while(li != null){
			
			if(out.val != li.val){
				if(duplicateFound){
				
				out.val = li.val;
				
				}else{
					
				out.next = new ListNode(li.val);
				out = out.next;
					
				}
				
				duplicateFound = false;
			}else{
				duplicateFound = true;
			}
			
			
			li = li.next;
		}
		
		
		// tweak if the last elements are duplicates....PLEASE CHANGE THE LOGIC IF POSSIBLE...it's working but not satisfactory  :(
		if(outHead.next == null){
			if(duplicateFound){
				return null;
			}
		}
		ListNode out2 = new ListNode(outHead.val);
		
		ListNode outHead2 = out2;
		
	if(duplicateFound){
		while(outHead.next != null){
			if(outHead.next.next == null){
				break;
			}
			out2.next = new ListNode(outHead.next.val);
			out2 = out2.next;
			outHead = outHead.next;
			
		}
	}
	
		
		return duplicateFound ? outHead2:outHead;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ListNode li = new ListNode(scan.nextInt());
		ListNode head = li;
		while(n>1){
			li.next = new ListNode(scan.nextInt());
			li = li.next;
			n--;
		}
		
		RemoveDuplicatesInSortedLinkedList obj = new RemoveDuplicatesInSortedLinkedList();
		
		ListNode out = obj.removeDuplicatesInSortedLinkedList(head);
		
		while (out != null){
			System.out.println(out.val);
			out = out.next;
		}
		
		
	}

}
