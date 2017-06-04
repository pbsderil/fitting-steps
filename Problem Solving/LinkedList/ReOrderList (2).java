package interviewbit.linkedList;

import java.util.List;
import java.util.Scanner;

public class ReOrderList {

	public ListNode reorder(ListNode input) {

		ListNode input2 = input;
		ListNode head = input;

		int tortoise = 0;
		int hare = 0;

		while (input != null) {
			tortoise++;
			input = input.next;
			if (input2 != null) {

				if (input2.next != null) {
					hare++;
					input2 = input2.next.next;
				}

			}
		}

		if (hare == 0 || tortoise == 0) {
			return head;
		}

		ListNode bckup = head;
		for (int i = 0; i < hare; i++) {
			head = head.next;
		}

		ListNode prev = null;
		ListNode temp2 = null;
		ListNode temp3 = null;

		while (head != null) {
			temp2 = head.next;
			head.next = prev;
			prev = head;

			head = temp2;
		}
		ListNode out = null;
		ListNode outbkp = null;

		out = new ListNode(bckup.val);
		bckup = bckup.next;
		out.next = new ListNode(prev.val);
		prev = prev.next;
		outbkp = out;
		out = out.next;

		for (int i = 0; i < 2 * hare - 2; i++) {
			if (i % 2 == 0) {
				out.next = new ListNode(bckup.val);
				bckup = bckup.next;
			} else {
				out.next = new ListNode(prev.val);
				prev = prev.next;
			}

			out = out.next;

		}
		while (prev != null) {
			out.next = new ListNode(prev.val);
			;
			out = out.next;
			prev = prev.next;
		}

		return outbkp;

	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		ListNode input = new ListNode(scan.nextInt());
		ListNode head = input;
		for (int i = 0; i < n - 1; i++) {
			ListNode temp = new ListNode(scan.nextInt());
			input.next = temp;
			input = input.next;
		}
		ReOrderList obj = new ReOrderList();
		obj.reorder(head);
		
	}

}
