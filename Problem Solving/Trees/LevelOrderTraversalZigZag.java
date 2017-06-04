package tree;

import java.util.ArrayList;

public class LevelOrderTraversalZigZag {
ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
ArrayList<Integer> li = null;

public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode a) {
	
	int height = height(a);
	for(int i=1;i<=height;i++){
		li = new ArrayList<Integer>();
		if(i%2 ==1){
		zigzag(a,i);
		arr.add(li);
		}
		else
			{zigzagRev(a, i);
			arr.add(li);
			}
	}
	return arr;
}
int height(TreeNode a){
	if(a == null){
		return 0;
	}
	int leftHeight = height(a.left);
	int rightHeight = height(a.right);
	if(leftHeight>rightHeight){
		return leftHeight+1;
	}else{
		return rightHeight+1;
	}
	

}
	public void zigzag(TreeNode a,int level){
		if(a == null){
			return;
		}
		if(level == 1){
			li.add(a.val);
		}else if(level>1){
			zigzag(a.left,level-1);
			zigzag(a.right,level-1);
		}
		
		
	}
	public void zigzagRev(TreeNode a,int level){
		if(a == null){
			return;
		}
		if(level == 1){
			li.add(a.val);
		}else if(level>1){
			zigzagRev(a.right,level-1);
			zigzagRev(a.left,level-1);
			
		}
		
		
	}
	public static void main(String[] args) {
		TreeNode tree = new TreeNode(1);
		 
	       tree.left= new TreeNode(2);
	       tree.right= new TreeNode(3);
	       tree.left.left= new TreeNode(4);
	       tree.left.right= new TreeNode(5);
	       
	       LevelOrderTraversalZigZag obj = new LevelOrderTraversalZigZag();
	       obj.zigzagLevelOrder(tree);
	      
	       System.out.println(obj.arr.toString());
	}

}
