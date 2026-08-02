class MaximumCapacityContainer2 {
 // Solution for ContainerWithMostWater Problem on LeetCode using Brute Force Approach. 
    public int maxArea(int[] height) {
        int max = 0;
        int i=0, j=1;
        while (i<height.length-1){
                if (j>height.length-1){
                    i++;
                    j = i+1;
                }
                else {
                    int minHeight = Math.min(height[i],height[j]);
                    int capacity = (j-i)*minHeight;
                    max = Math.max(max,capacity);
                    j++;
                }
        }
    return max;
    }
}