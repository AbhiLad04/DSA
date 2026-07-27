class MajorityElement {
    public int majorityElement(int[] nums) {
        int majority=0,max=0;
        if (nums.length<=1){
            return nums[0];
        }else {
        for (int i=0;i<nums.length;i++){
            int n = nums[i];
            int count=1;
            for (int j=i+1;j<nums.length;j++){
                if (n==nums[j]){
                    count++;
                }
            }
            if (count>max){
                majority=n;
                max=count;
            }
        }
        }
    return majority;
    }
}