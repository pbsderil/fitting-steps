package trie;

import java.util.ArrayList;
import java.util.HashMap;


class Trie{
	char val ;
	int count=0;
	HashMap<Character,Integer> hm = new HashMap<>();
	ArrayList<Trie> children = new ArrayList<>();
	Trie(char c){
		val = c;
	}
}

public class ShortestUniquePrefix {
	
	public ArrayList<String> prefix(ArrayList<String> a) {
		Trie root = new Trie(' ');
		
		ArrayList<String> output = new ArrayList<>();
		
		for(int i = 0;i<a.size();i++){
			insert(a.get(i),root,0);
		}
		for(int i = 0;i<a.size();i++){
			String prefix = "";
			getUniquePrefix(a.get(i),root,0,output,prefix);
		}
		return output;
	}

	private void getUniquePrefix(String string, Trie root, int i, ArrayList<String> output,String prefix) {
		if(i >= string.length()){
			return;
		}
		char temp = string.charAt(i);
		prefix+=temp;
		if(root.children.get(root.hm.get(temp)).count ==1){
			output.add(prefix);
			return;
		}else{
			getUniquePrefix(string,root.children.get(root.hm.get(temp)),++i,output,prefix);
		}
				
	}

	private void insert(String string,Trie trie,int index) {
		if(index >= string.length()){
			return;
		}
		char temp = string.charAt(index);
		if(!trie.hm.containsKey(temp)){
			Trie child = new Trie(temp);
			trie.children.add(child);
			trie.hm.put(temp,trie.children.size()-1);
			trie.children.get(trie.hm.get(temp)).count++;
			insert(string,trie.children.get(trie.hm.get(temp)),++index);
		}else{
			trie.children.get(trie.hm.get(temp)).count++;
			insert(string,trie.children.get(trie.hm.get(temp)),++index);
		}
		
	}

	public static void main(String[] args) {
		

	}

}
