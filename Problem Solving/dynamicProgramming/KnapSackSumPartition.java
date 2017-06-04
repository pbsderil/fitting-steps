package dynamicProgramming;

import java.lang.reflect.Array;
import java.util.ArrayList;

// Testing
public class KnapSackSumPartition {

	public ArrayList<ArrayList<Integer>> knapSack(ArrayList<Integer> li, int index ){
		long sum = 0;
		ArrayList<ArrayList<Integer>> output =  new ArrayList<>(2);
		for(int i=0;i<li.size();i++){
			sum+=li.get(i);
		}
		
		sum = sum *index/li.size();
		if(sum%2 !=0){
			return output;
		}
		
		boolean[][] table = new boolean[(int) (sum/2+1)][li.size()+1];
		
		for(int i=0;i<=li.size();i++){
			table[0][i] = true;
		}
		
		for(int i=1;i<=sum/2;i++){
			table[i][0] = false;
		}
		
		for(int i=1;i<=sum/2;i++){
			for(int j=1;j<=li.size();j++){
				table[i][j] = table[i][j-1];
				if(i>=li.get(j-1)){
					table[i][j] = table[i][j] || table[i-li.get(j-1)][j-1];
				}
			}
		
		}
		
		if(!table[(int)sum/2][li.size()]){
			
					
			return output;
		}
		
		
		
		ArrayList<Integer> A = new ArrayList<Integer>(li.size());
		ArrayList<Integer> B = new ArrayList<Integer>(li.size());
		ArrayList<Integer> temp1 = new ArrayList<Integer>(li.size());
		ArrayList<Integer> temp2 = new ArrayList<Integer>(li.size());
		
		int i = (int)sum/2;
		int j = li.size();
		while (i > 0 && j > 0) {

			if (table[i][j - 1]) j--;

			else if (table[i - li.get(j - 1)][j - 1]) {
				   temp1.add(li.get(j-1));
					i -= li.get(j-1);
				    j--;
			}
			else break;
		}
//reversing array for getting the exact order
	for(int k=temp1.size()-1;k>=0;k--){
		A.add(temp1.get(k));
	}
		i = (int)sum/2;  j = li.size();

		while (i > 0 && j > 0) {

			if (i >= li.get(j-1)) {

				if (table[i -li.get(j-1)][j - 1]) {
					temp2.add(li.get(j-1));
					i -= li.get(j-1);
					
				}
			}
			j--;
		}
		
		for(int k=temp2.size()-1;k>=0;k--){
			B.add(temp2.get(k));
		}
	if(A.size()>B.size()){
		output.add(A);
		output.add(B);
	}else if(A.size()<B.size()){
		output.add(B);
		output.add(A);
	}else{
		for(int k=0;k<A.size();k++){
			if(A.get(k)<B.get(k)){
				output.add(A);
				output.add(B);
				break;
			}else if(A.get(k)>B.get(k)){
				output.add(B);
				output.add(A);
				break;
			}else{
				if(k==A.size()-1){
					output.add(A);
					output.add(B);
					break;
				}
				continue;
			}
			
		}
	}
		
		return output;
	}
	
	public static void main(String[] args){
		KnapSackSumPartition obj = new KnapSackSumPartition();
		
		ArrayList<Integer> li = new ArrayList<>();
		li.add(3);
		li.add(1);
		li.add(1);
		li.add(2);
		li.add(2);
		li.add(1);
		System.out.println(obj.knapSack(li,1).toString());
	} 
}
