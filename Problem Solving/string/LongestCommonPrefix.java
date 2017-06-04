package string;

import java.util.ArrayList;

public class LongestCommonPrefix {
	
	public String longestCommonPrefix(ArrayList<String> a) {
	    
	    int size = a.size();
	    if(size==0){
	        return "";
	    }
	    if(size==1){
	        return a.get(0);
	    }
	    String longPrefix =  a.get(0);;
	    for(int i=1;i<size;i++){
	       int j=0;
	       if(a.get(i).length()< longPrefix.length()){
	           longPrefix = longPrefix.substring(0,a.get(i).length());
	       }
	        while(j<a.get(i).length() && j<longPrefix.length()){
	            if(a.get(i).charAt(j) != longPrefix.charAt(j)){
	               longPrefix = longPrefix.substring(0,j);
	               break;
	            }
	            j++;
	        }
	    }
	  return  longPrefix;
	}

}
