package string;

public class CountAndSay {
	
	public String compute(int n){
	
		String current = "1";
		
		for(int i=1 ;i<n;i++){
			int j= 0 ;
			String tempCurrent = "";
			char temp = current.charAt(0);
			int count= 0 ;
			while(j<current.length()){
				if(temp == current.charAt(j)){
					count++;
					 
				}else{
					tempCurrent += count+""+temp;
					count=1;
					temp = current.charAt(j);
				}
				j++;
			
			}
			if(count>0){
				tempCurrent += count+""+temp;
				count=0;
			}
			current = tempCurrent;
		}
		
		return current;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CountAndSay obj = new CountAndSay();
		System.out.println(obj.compute(5));

	}

}
