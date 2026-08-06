public class SmallestDivisibleDigit {

 	public int smallestNumber(int n, int t) {
        	boolean run = true;
	        while(run){
        	    if (product(n)%t == 0){
        	        return n;
       		    }else {
        	        n++;
		    }
        	}
	        return -1;
    	}

	public static int product(int n){
        	int product=1;
       		while (n!=0){
        	    int digit = n%10;
		    product *= digit;
        	    n = n/10;
	        }
        	return product;
	}
}