public class PalindromeNumber {

	public boolean isPalindrome(int x) {
	        String str = String.valueOf(x);
	        int i = 0;
	        int j = str.length()-1;
	        boolean result = true;

	        while (i<j){
        	    if (str.charAt(i) != str.charAt(j)){
   	    	         result = false;
   		         break;
        	    }else {
        	        i++;
        	        j--;
        	    }
        	}
       		return result;
    	}
}