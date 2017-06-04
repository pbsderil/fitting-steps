package dynamicProgramming;

public class EqualSumPartition {
	
	//recursive Solution
	
	public boolean compute (int[] arr,int sum,int index){
		
		if(sum == 0 ){
			return true;
		}

		if(index ==arr.length){
			return false;
		}
		
		return compute (arr, sum, index+1) || compute (arr, sum-arr[index], index+1);
	}

	public static void main(String[] args) {
		EqualSumPartition obj = new EqualSumPartition();
		int[] arr = {10,2,13,1};
		
		int sum  = 0;
		for(int i=0;i<arr.length;i++){
			sum += arr[i];
		}
		if(sum%2 !=0){System.out.println(false);}
		
		System.out.println(obj.compute(arr,sum/2,0));

	}

}
