class TwoSumOptimized {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            int a = nums[i];
            int b = target-a;
            if (map.containsKey(b)){
                int j = map.get(b);
                return new int[] {j,i};
            }
            map.put(a,i);
        }
    return null;
    }
}