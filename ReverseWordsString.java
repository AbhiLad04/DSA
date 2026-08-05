public class ReverseWordsString {

	public String reverseWords(String s) {
	        s = s.trim();
		s = s.replaceAll(" +"," ");
        	StringBuilder sb = new StringBuilder();

		String[] arr = s.split(" ");
		System.out.println(arr.length);	
		for (int i=arr.length-1;i>=0;i--){
			sb.append(arr[i]);
		        if (i!=0){
	               		sb.append(" ");
       			}
		}
	        String S = sb.toString();
		return S;
    	}
}