package tree;

import java.util.ArrayList;

public class ConstructCartesianTree {

	public TreeNode buildTree(ArrayList<Integer> a) {
		
			
		return build(a,0,a.size()-1);
		
	}
public TreeNode build(ArrayList<Integer> a,int start,int end){
	if(start>end){
		return null;
	}
	int i = findMax(a,start,end);
	
	TreeNode root = new TreeNode(a.get(i));
	
	if(start == end){
		return root;
	}
	
	root.left = build(a,start,i-1);
	root.right = build(a,i+1,end);
	
	return root;
}
private int findMax(ArrayList<Integer> a,int start,int end) {
	int index = start;
	int max = a.get(start);
	for(int i=start+1;i<=end;i++){
		if(a.get(i)>max){
			max = a.get(i);
			index =i;
		}
	}
	return index;
			
}

	public static void main(String[] args) {

	}

}
