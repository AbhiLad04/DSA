import java.util.Arrays;
public class MajorityElement2Pointer {

	public static void main(String[] args){
		int[] nums = {2,2,1,1,1,2,2};
	//	int[] nums = {3,2,3};
	//	int[] nums = {1};
		int n = nums.length;
		int count=1;

		Arrays.sort(nums);
		int majElement = nums[0];
	
		for (int i=0;i<nums.length-1;i++){
			int j =i+1;
			if(nums[i]==nums[j]){
				count++;	
			}else {
				count=1;
				majElement=nums[j];
			}

			if (count>n/2){
				System.out.println(majElement);
			}
		}
		System.out.println(majElement);
	}
}