package greedy;

import java.util.ArrayList;

public class MiceAndHoles {
	
	public int compute(ArrayList<Integer> mice, ArrayList<Integer> hole){
		int jump =0;
		
		for(int i=0;i<mice.size();i++){
			if(jump<Math.abs(hole.get(i)-mice.get(i))){
				jump = Math.abs(hole.get(i)-mice.get(i));
			}
		}
		
		return jump;
	}

	public static void main(String[] args) {
		
		ArrayList<Integer> mice = new ArrayList<>();
		ArrayList<Integer> hole = new ArrayList<>();
		
		MiceAndHoles obj = new MiceAndHoles();
		System.out.println(obj.compute(mice,hole));

	}

}
