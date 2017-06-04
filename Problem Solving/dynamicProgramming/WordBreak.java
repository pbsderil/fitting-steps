package dynamicProgramming;

import java.util.ArrayList;
import java.util.HashSet;

public class WordBreak {
	
	public boolean wordBreak(ArrayList<String> dic ,String input){
		
		int dicLength = dic.size();
		int minLength =dic.get(0).length();
		int inputLength = input.length();
		
		HashSet<String> dictionary = new HashSet<>();
		
		for(int i=0;i<dicLength ;i++){
			if(dic.get(i).length() < minLength){
				minLength = dic.get(i).length();
			}
			dictionary.add(dic.get(i));
		}
		
		boolean[][] dpMatrix = new boolean[inputLength][inputLength];
		int m = 0; int n=0,index = 0;
		while(index<minLength-1){
			for(;m<inputLength && n<inputLength;m++,n++){
				dpMatrix[m][n] = false;
			}
			index++;
			}
		
		int i = 0, j=minLength-1;
				
		while( j<inputLength){
			for(; j<inputLength;i++,j++){
				if(dictionary.contains(input.substring(i,j+1))){
					dpMatrix[i][j] = true;
				}else{
					dpMatrix[i][j] = false;
					int k=i;
					
					while(k<=j){
						if(dpMatrix[i][k] && dpMatrix[k+1][j]){
							dpMatrix[i][j] = true;
							break;
						}
						k++;
					}
				}
			}
			i=0; j = ++minLength -1;
		}
		
		return dpMatrix[0][inputLength-1];
		
	}

	public static void main(String[] args) {
		
	
		WordBreak obj = new WordBreak();
		ArrayList<String> dic = new ArrayList<>();
		dic.add("trainer");
		dic.add("my");
		dic.add("interview");
		/*dic.add("interview");*/
		
		
		System.out.println(obj.wordBreak(dic, "myinterviewtrainer"));

	}

}
