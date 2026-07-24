public class RemoveDuplicateSortedArray {

    public int removeDuplicates(int[] nums) {
        int count=0;
        int j = 0;
        for (int i=0;i<nums.length;i++){
                j = i+1;
                if (i<nums.length-1 && nums[i]==nums[j]){
                    continue;
                }
                else {
                    nums[count]=nums[i];
                    count++;
                }
        }
        return count;
    }
}
