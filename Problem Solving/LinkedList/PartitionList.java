package interviewbit.linkedList;

public class PartitionList {
	
	private ListNode partition(ListNode a,int b){
		
		if(a==null)
			return null;
		
		ListNode small =new ListNode(0),large = new ListNode(0),temp=new ListNode(0),temp2=new ListNode(0);
		small.next = temp  ;
		large.next = temp2;
		
		int countSmall =0;
		int countLarge=0;
		
		while(a != null){
			if(a.val<b){
				countSmall++;
				temp.next = new ListNode(0);
				temp = temp.next;
				temp.val = (a.val);
				
				
			}else{
				countLarge++;
				temp2.next = new ListNode(0);
				temp2 = temp2.next;
				temp2.val = (a.val);
			
				
			}
			a=a.next;
					}
		
		small = small.next.next;
		
		if(countLarge>0)
		large= large.next.next;
		else{
			large= null;
		}
		if(large !=null){
			if(countSmall>0)
			temp.next = large;
			else{
				return large;
			}
		}
		
		return small;
	}

	public static void main(String[] args) {
		   
		   ListNode a = new ListNode(1);
		
		   
		   a.next = new ListNode(5);
		   a.next.next = new ListNode(2);
		   a.next.next.next = new ListNode(4);
		   a.next.next.next.next = new ListNode(3);
		   a.next.next.next.next.next = new ListNode(1);
		
		   PartitionList obj = new PartitionList();
		   obj.partition(a, 1);
	}

}
