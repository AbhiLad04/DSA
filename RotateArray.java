public class RotateArray {

	public void rotate(int[] nums, int k) {
	        int n = nums.length;
    	    	k = k%n;
       		int start=0;
      		int end=n-1;
        	Reverse(nums,start,end);
        	Reverse(nums,start,k-1);
        	Reverse(nums,k,end);
    	}

    	public static void Reverse(int[] nums,int start,int end){
        	while(start<end){
        	    int temp = nums[start];
        	    nums[start]=nums[end];
        	    nums[end]=temp;
        	    end--;
        	    start++;
        	}
    	}
}