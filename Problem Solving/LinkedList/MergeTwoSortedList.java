package interviewbit.linkedList;

import java.util.Scanner;

public class MergeTwoSortedList {
	
	public ListNode mergeTwoSortedList(ListNode a , ListNode b){
		if(a == null){
			return b;
		}
		if(b==null){
			return a;
		}
		
		
		ListNode out ;	
		ListNode outHead ;
		if(a.val <b.val){
			out = new ListNode(a.val);
			a = a.next;
		}else{
			out = new ListNode(b.val);
			b = b.next;
		}
		outHead = out;
		while(a != null && b!=null){
			if(a.val <b.val){
				out.next = new ListNode(a.val);
				a = a.next;
			}else{
				out.next = new ListNode(b.val);
				b = b.next;
			}
			out = out.next;
		}
		
		while(a!= null){
			out.next = new ListNode(a.val);
			a = a.next;
			out = out.next;
		}
		while(b!= null){
			out.next = new ListNode(b.val);
			b = b.next;
			out = out.next;
		}
		
		return outHead;
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
		
		int m = scan.nextInt();
		ListNode li2 = new ListNode(scan.nextInt());
		ListNode head2 = li2;
		while(m>1){
			li2.next = new ListNode(scan.nextInt());
			li2 = li2.next;
			m--;
		}
		
		MergeTwoSortedList obj = new MergeTwoSortedList();
		
		obj.mergeTwoSortedList(head, head2);

	}

}
