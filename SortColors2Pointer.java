public class SortColors2Pointer {

	public void sortColors(int[] nums) {
        	int n = nums.length-1;		
		int i=0, j=i+1;
		while(i<n){
			if (nums[i]>nums[j]){
				int temp = nums[i];
				nums[i]=nums[j];
				nums[j]=temp;
			}
			else {
				j++;
			}
	
			if(j>n){
				i++;
				j = i+1;
			}
		}
  	}
}