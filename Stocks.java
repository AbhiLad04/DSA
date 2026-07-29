public class Stocks {

    public int maxProfit(int[] prices) {
        int profit=0;
	int min=prices[0];
	for (int i=1;i<prices.length;i++){
		int result = prices[i]-min;
		if (profit<result){
                	profit=result;
          	}
            	if (prices[i]<min){
			min=prices[i];
		}
	}
    return profit;
    }
}