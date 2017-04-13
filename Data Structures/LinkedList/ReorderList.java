/*
Given a singly linked list

    L: L0 ? L1 ? … ? Ln-1 ? Ln,
reorder it to:

    L0 ? Ln ? L1 ? Ln-1 ? L2 ? Ln-2 ? …
You must do this in-place without altering the nodes’ values.

For example,
Given {1,2,3,4}, reorder it to {1,4,2,3}.

*/

public class ReorderList {
	public ListNode reorderList(ListNode input) {

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
}