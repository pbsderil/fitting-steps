package interviewbit.backtracking;


/*  (a*b)%c == (a%c * b%c)%c  extending the above property
 * 
 * pow(a,b)%c = (pow(a,b/2)%c * pow(a,b/2)%c) %c   if b is even
 * 
 * pow(a,b)%c = (a%c * pow(a,b-1)%c) %c   if b is odd
 * 
 * */


public class ModularExponentiation {
	
	public int Mod(int a, int b, int c) {
	    if(b==0){
	        if(a==0)return 0;
	          return 1;
	    }
	    else if(b%2==0){
	        int y = Mod(a,b/2,c);
	        int temp = (y*y)%c;
	        return (temp)<0?temp+c:temp;
	    }else{
	      int temp =  ((a%c) *Mod(a,b-1,c))%c;
	       return (temp)<0?temp+c:temp;
	    }
	}
	
	public static void main(String args[]){
		ModularExponentiation obj = new ModularExponentiation();
		System.out.println(obj.Mod(1394,2011,3127));
	}
	
}
