package greedy;

import java.util.ArrayList;
import java.util.Scanner;

/*lkj
 * we can use greedy algorithm, the idea is simple, every time we consider the people groups from left and right sides, pick the group that has less people and move towards center, for example we have the following input:

. . X X . . . X X . . X X . . X X X . . .

there are two people in the far left group and three people in the far right group, so let's merge the people group from left, and we get the following:

. . . . . X X X X . . X X . . X X X . . .

now merge the far right group and we get:

. . . . . X X X X . . X X X X X . . . . .

finally we get:

. . . . . . . X X X X X X X X X . . . . .

Time complexity is O(n + k), where k is the number of group of people initially.
 * */

class Group{
	int start ;
	int end ; 
	int length;
	Group(int start){
		this.start = start;
		
	}
}
public class Seats {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
			
		Seats obj = new Seats();
		
		System.out.println(obj.compute(input));
	}

	private Integer compute(String input) {
			int length = input.length();
			int start = -1;
			
			ArrayList<Group> groups = new ArrayList<>();
			Group gr = null ;
			for(int i=0;i<length;i++){
				char temp = input.charAt(i);
				if(temp == 'x' && start== -1){
					gr = new Group(i);
					start = i;
				}else if(temp == '.'){
					if(start !=-1){
					gr.end = i-1;
					groups.add(gr);
					
					start = -1;
					
					}
				}
			}
			
			if(start != -1){
				gr.end = length-1;
				groups.add(gr);
			}
			int jumps = 0;
			
			for(int i=0,j=groups.size()-1;i<groups.size()&&j>=0 && i<j;){
				if(groups.get(i).end-groups.get(i).start < groups.get(j).end-groups.get(j).start){
					if(i+1<groups.size()){
						jumps = (jumps+ (groups.get(i+1).start - groups.get(i).end-1)*(groups.get(i).end-groups.get(i).start+1))%10000003;
						groups.get(i+1).start = groups.get(i).start+(groups.get(i+1).start - groups.get(i).end-1);
						
						i++;
					}
				}else{
					if(j-1>=0){
					jumps = (jumps + (groups.get(j).start - groups.get(j-1).end-1)*(groups.get(j).end-groups.get(j).start+1))%10000003;
					groups.get(j-1).end = groups.get(j-1).end+(groups.get(j).end - groups.get(j).start+1);
					j--;
					}
					}
			}
			
			
		return jumps;
	}

}
