package interviewbit.linkedList;

import java.util.Scanner;

public class RotateList {
public ListNode compute(ListNode node ,int k){
	ListNode head = node;
	int length = 0 ;
	
	while(node !=null){
		length++;
		node = node.next;
	}
	
	int resultantRotation = k%length;
	
	if(resultantRotation == 0){
		return head;
	}
	
	ListNode headbkp = head;
	
	int firstPartLength = length - resultantRotation;
	
	while(firstPartLength>0){
		head = head.next;
		firstPartLength--;
	}
	
	ListNode out = head;
	
	while(head !=null){
if(head.next ==null){
			head.next = headbkp;
			break;
		}
		head = head.next;
		
	}
	
	ListNode outBkp = out;
	
	while(length>1){
		out = out.next;
		length--;
		
	}
	out.next = null;
	
	return outBkp;
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
		RotateList obj = new RotateList();
		obj.compute(head,2);

	}

}
