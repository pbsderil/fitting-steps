package interviewbit.backtracking;

public class GrayCode {
    // append reverse of order n gray code to prefix string, and print
    public static void yarg(String prefix, int n) {
        if (n == 0) System.out.println(Integer.parseInt(prefix,2));
        else {
            gray(prefix + "1", n - 1);
            yarg(prefix + "0", n - 1);
        }
    }  

    // append order n gray code to end of prefix string, and print
    public static void gray(String prefix, int n) {
        if (n == 0) System.out.println(Integer.parseInt(prefix,2));
        else {
            gray(prefix + "0", n - 1);
            yarg(prefix + "1", n - 1);
        }
    }  
    
	public static void main(String[] args) {
		
		gray("",10);
		
	}

}
