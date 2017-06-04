package dynamicProgramming;

public class Ways2Decode {
	
	public int decode(){
		
		String input ="2611055971756562";
		int len = input.length();
		
	    if(len == 0 ){
	        return 0;
	    }
	     if(len == 2 ){
	       if(input.charAt(1) =='0' && (input.charAt(0) =='1' || input.charAt(0) =='2')){
				return 1;
			}
	    }
	 	if(input.charAt(0) =='0' ){
			return 0;
		}
	 	
	 	
		int count[] = new int[len+1];
		count[0] = 1 ; // starting reference ...
		count[1] = 1;  // for first character ..
	
		for(int i= 2 ;i<=len;i++){
			count[i] = 0;			
			// if the current character is > 0 ... 
			
			if(input.charAt(i-1) =='0'){
				if(input.charAt(i-2)>'2' || input.charAt(i-2)=='0'){
					return 0;
				}
			}
			if(input.charAt(i-1) >'0'){
				
				count [i] = count[i-1];     // count [i+1] corresponds to input[i] ..
			}
			// when there is a 
			if(input.charAt(i-2)=='1' || (input.charAt(i-2)=='2' && input.charAt(i-1)<'7')){ 
				count [i] += count [i-2];
			}
			
		}
		
		return count[len];
	}

	public static void main(String[] args) {

		Ways2Decode obj = new Ways2Decode();
		System.out.println(obj.decode());
	}

}
