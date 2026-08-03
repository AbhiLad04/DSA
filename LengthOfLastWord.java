class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        String st = str[str.length-1];
        int length = st.length();
        return length;
    }
}