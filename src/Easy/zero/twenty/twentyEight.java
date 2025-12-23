package Easy.zero.twenty;

public class twentyEight {
    public int strStr(String haystack, String needle) {
        if(!haystack.contains(needle))
            return -1;
        return haystack.indexOf(needle);
    }
}
