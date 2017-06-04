package interviewbit.linkedList;

import java.util.Scanner;

public class RemoveNthNodeFromListEnd {
	
	public ListNode removeNthNodeFromListEnd(ListNode a,int n){
		
		
		ListNode head = a;
		int size = 0;
		while(a != null){
			a = a.next;
			size++;
		}
		
		if(size==0 || n==0){
			return head;
		}
		
		if(size-n+1<=0){
			return head.next;
		}
		
		head = 	remove(head,size-n+1);
		
	
		
		return head;
	}

	public ListNode remove(ListNode a, int n) {

		ListNode out = a;

		if (n == 1) {
			return out.next;
		}

		int count = 0;

		while (a != null) {
			count++;
			if (count == n - 1) {

				a.next = a.next.next;
				continue;
			}
			a = a.next;
		}
		return out;
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

		RemoveNthNodeFromListEnd obj = new RemoveNthNodeFromListEnd();

		ListNode out = obj.removeNthNodeFromListEnd(head,4);
		while (out != null) {
			System.out.println(out.val);
			out = out.next;
		}

	}

}
