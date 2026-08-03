class MaximumCapacityContainer2Pointer {

    public int maxArea(int[] height) {
        int max = 0;
        int i=0, j=height.length-1;
        while (i<=j){
                int minHeight = Math.min(height[i],height[j]);
                int capacity = (j-i)*minHeight;
                max = Math.max(max,capacity);
                if (height[i]>=height[j]){
                    j--;
                }else {
                    i++;
                }
        }
    return max;
    }
}