class ValidPalindrome {

    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","");
        s = s.toLowerCase();
        int l = 0, r = s.length()-1;
        boolean palindrome = true;
        while (l<r && s.length()>1){
            if (s.charAt(l)!=s.charAt(r)){
                palindrome = false;
                return palindrome;
            }
            else {
                l++;
                r--;
            }
        }
        return palindrome;
    }
}