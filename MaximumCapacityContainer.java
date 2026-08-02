class MaximumCapacityContainer {
 // Solution for ContainerWithMostWater Problem on LeetCode using Brute Force Approach. 
   public int maxArea(int[] height) {
        int max = 0;
        for (int i=0;i<height.length-1;i++){
            for (int j=i+1;j<height.length;j++){
                int minHeight = Math.min(height[i],height[j]);
                int capacity = (j-i)*minHeight;
                max = Math.max(max,capacity);
            }
        }
    return max;
    }
}