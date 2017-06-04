package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MergeOverlappingInterval {
	
	public ArrayList<Interval> mergeOverlappingInterval(ArrayList<Interval> input){
		
		Collections.sort(input,new Comparator<Interval>() {

			
			public int compare(Interval o1, Interval o2) {
				// TODO Auto-generated method stub
				return (o1.start>=o2.start)?1:-1;
			}
		});
		
		ArrayList<Integer> output = new ArrayList<>();
		output.add(input.get(0).start);
		int last = input.get(1).end;
		output.add(input.get(1).end);
		for(int i=1;i<input.size();i++){
		
			if(last>=input.get(i).start && last<input.get(i).end){
				output.set(output.size()-1,input.get(i).end);
				last = input.get(i).end;
			}
			if((last<input.get(i).start && last<input.get(i).end)){
				output.add(input.get(i).start);
				output.add(input.get(i).end);
				last = input.get(i).end;
				
			}
		}
		
		ArrayList<Interval> li = new ArrayList<Interval>(output.size()/2);
		for(int i = 0 ; i<output.size();i=i+2){
		    Interval temp = new Interval(output.get(i),output.get(i+1));
		    li.add(temp);
		}
		
		return li;
	}

	public static void main(String[] args) {
		
		MergeOverlappingInterval obj = new MergeOverlappingInterval();
		ArrayList<Integer> input = new ArrayList<>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(5);
		input.add(4);
		input.add(9);
		input.add(8);
		input.add(10);
		input.add(12);
		input.add(11+5);
	/*	System.out.println(obj.mergeOverlappingInterval(input).toString());*/
	}

}
