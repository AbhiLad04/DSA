public class TwoSumOfSortedArr2Pointer {

	public static void main(String[] args){
		int[] arr = {2,7,11,15};
	//	int[] arr = {2,3,4};
	//	int target = 6;
		int target = 9;
		int left = 0;
		int right = arr.length-1;

		while (left<right){
			int sum = arr[left]+arr[right];
			if (sum == target){
				System.out.println((left+1)+","+(right+1));
				break;
			}
			else if (sum>target){
				right--;
			}
			else {
				left++;
			}
		}
	}
}