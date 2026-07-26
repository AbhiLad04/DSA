class IndexOfFirstOccuranceString {
    public int strStr(String haystack, String needle) {
        int index=0;
        if (haystack.contains(needle)){
            index = haystack.indexOf(needle);
        }else {
            index=-1;
        }
    return index;
    }
}