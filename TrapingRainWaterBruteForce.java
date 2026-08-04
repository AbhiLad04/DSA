public class TrapingRainWaterBruteForce {

	public static void main(String[] args){

		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		
		int result = 0;
		for (int i=0;i<height.length;i++){
			int rightMax = 0, leftMax = 0;
			for (int j=0;j<=i;j++){
				leftMax = Math.max(leftMax,height[j]);
			}

			for (int k=i;k<height.length;k++){
				rightMax = Math.max(rightMax,height[k]);
			}		
			result += Math.min(leftMax,rightMax) - height[i];
		}
		System.out.println(result);
	}
}