package interviewbit.linkedList;

import java.util.Scanner;

public class RemveDuplicatesSortedList1 {

	public ListNode removeDuplicatesInSortedLinkedList(ListNode li) {
		
		if(li == null){
			return li;
		}

		ListNode out = new ListNode(li.val);
		ListNode outHead = out;

		li = li.next;

		while (li != null) {

			if (out.val != li.val) {
				
				out.next = new ListNode(li.val);
				out = out.next;

			} else {

			}

			li = li.next;
		}

		return outHead;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ListNode li = new ListNode(scan.nextInt());
		ListNode head = li;
		while (n > 1) {
			li.next = new ListNode(scan.nextInt());
			li = li.next;
			n--;
		}

		RemveDuplicatesSortedList1 obj = new RemveDuplicatesSortedList1();

		ListNode out = obj.removeDuplicatesInSortedLinkedList(head);

		while (out != null) {
			System.out.println(out.val);
			out = out.next;
		}

	}

}
