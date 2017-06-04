package interviewbit.stackqueue;

import java.util.ArrayList;
import java.util.Stack;

public class AbsolutePath {

	public String simplifyPath(String a) {
		int length = a.length();
		if (a.charAt(a.length() - 1) != '/') {
			a += '/';
		}
		if (a.charAt(0) != '/') {
			a = '/' + a;
		}
		length = a.length();
		String newPath = "";
		String temp = "";
		ArrayList<String> li = new ArrayList<String>();
		boolean breakstart = false;
		for (int i = 0; i < length; i++) {
			if (a.charAt(i) == '/') {

				li.add(temp);
				temp = "";

			} else {
				temp += a.charAt(i);
			}
		}
		int skipcount = 0;
		for (int i = li.size()-1; i >=0; i--) {
			if(li.get(i)== ""){
				continue;
			}else{
				if(li.get(i).equals("."))
					continue;
				if(li.get(i).equals("..")){
					skipcount ++;
					continue;
				}else{ 
					if(skipcount>0){
						skipcount--;
						continue;
					}
				
					newPath = li.get(i).trim()+newPath;
				 newPath = '/'+newPath;}
					
			
			}
		}
		return newPath;
	}

	public static void main(String[] args) {

		AbsolutePath obj = new AbsolutePath();
		System.out.println(obj.simplifyPath("/home/"));

	}

}
