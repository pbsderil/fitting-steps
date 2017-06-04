package dynamicProgramming;

import java.util.ArrayList;
import java.util.Stack;

public class MaxAreaBinMatrix {
	
	public int maxAreaBinMatrix(ArrayList<ArrayList<Integer>> matrix){
		if(matrix.size() == 0){
			return 0;
		}
		int rows = matrix.size();
		int cols = matrix.get(0).size();
		int maxArea = 0 ;
		int area = 0;
		area = maxHistogramArea(matrix.get(0));
		if(area>maxArea){
			maxArea =area;
		}
		for(int i=1;i<rows;i++){
			for(int j=0;j<cols;j++){
				if(matrix.get(i).get(j) == 1){
					matrix.get(i).set(j,matrix.get(i-1).get(j)+matrix.get(i).get(j));
				}
			}
			area = maxHistogramArea(matrix.get(i));
			if(area>maxArea){
				maxArea =area;
			}
		}
		
		return maxArea;
	}

	private int maxHistogramArea(ArrayList<Integer> row) {
		
		Stack<Integer> result = new Stack<>();
		
		int C = row.size();
 
    int top_val;     
 
    int max_area = 0; 
 
    int area = 0;   
    int i = 0;
    while (i < C)
    {

        if (result.empty() || row.get(result.peek()) <= row.get(i))
            result.push(i++);
 
        else
        {
           
            top_val = row.get(result.peek());
            result.pop();
            area = top_val * i;
 
            if (!result.empty())
                area = top_val * (i - result.peek() - 1 );
            max_area = Math.max(area, max_area);
        }
    }
 

    while (!result.empty())
    {
        top_val = row.get(result.peek());
        result.pop();
        area = top_val * i;
        if (!result.empty())
            area = top_val * (i - result.peek() - 1 );
 
        max_area = Math.max(area, max_area);
    }
    return max_area;}

	public static void main(String[] args) {
		

	}

}
